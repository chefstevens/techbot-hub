"""Generates TechBot-branded card art for the hub catalog (512x288 each).

Backdrop = the launcher's hero-castle.jpg (our own asset), darkened.
Per-script accent glow, TechBot crest bottom-right, title bottom-left.
Bryan can swap in real screenshots later — these files just make the
catalog cards never render empty.
"""
from PIL import Image, ImageDraw, ImageFilter, ImageFont, ImageEnhance

ROOT = r"C:\Users\Bryan\IdeaProjects\techbot-hub\images"
HERO = r"C:\Users\Bryan\IdeaProjects\TechBot-Launcher\images\hero-castle.jpg"
LOGO = r"C:\Users\Bryan\IdeaProjects\TechBot-Launcher\images\techbot.png"

W, H = 512, 288
# (title, accent glow RGB, subtitle)
CARDS = [
    ("TechBotZulrahPlugin.png",  "Zulrah",              (184, 247,   4), "Boss script"),
    ("MoonsOfPerilPlugin.png",   "Moons of Peril",      (170, 120, 255), "Boss script"),
    ("TechBotFirecapePlugin.png","Firecape",            (255, 150,  40), "Fight Caves"),
    ("FleetPlugin.png",          "Fleet Control",       ( 90, 200, 255), "Multi-account fleet"),
    ("TechsAioPlugin.png",       "AIO",                 (255,  90,  90), "All-in-one skilling"),
    ("AccountBuilderPlugin.png", "AccountBuilder",      ( 70, 230, 160), "Account creation"),
    ("TechBotChinTickManipulationPlugin.png", "Chin Tick Manipulation", (255, 220, 70), "Chinchompa training"),
    ("TechsMulePlugin.png",      "Mule",                (200, 140, 255), "Gold transfer"),
    ("TechQolPlugin.png",        "QoL",                 (120, 170, 255), "Quality of life"),
    ("TechBotFlipperPlugin.png", "Flipper",             ( 60, 255, 180), "GE flipping"),
]

hero = Image.open(HERO).convert("RGB")
logo = Image.open(LOGO).convert("RGBA")

def title_font(size):
    for cand in (r"C:\Windows\Fonts\impact.ttf", r"C:\Windows\Fonts\arialbd.ttf"):
        try:
            return ImageFont.truetype(cand, size)
        except OSError:
            pass
    return ImageFont.load_default()

def small_font():
    for cand in (r"C:\Windows\Fonts\arialbd.ttf",):
        try:
            return ImageFont.truetype(cand, 18)
        except OSError:
            pass
    return ImageFont.load_default()

def crop_castle():
    # castle tower is right-of-center in the 3811x2601 painting; crop around it
    src_w, src_h = hero.size
    box = (int(src_w * 0.42), int(src_h * 0.16), int(src_w * 0.94), int(src_h * 0.81))
    piece = hero.crop(box)
    return piece.resize((W, H), Image.LANCZOS)

BACKDROP = crop_castle()

for fname, title, accent, tagline in CARDS:
    card = BACKDROP.copy()
    card = ImageEnhance.Brightness(card).enhance(0.52)   # moody dark
    card = ImageEnhance.Color(card).enhance(0.55)       # mute the painting

    glow = Image.new("RGB", (W, H), accent)
    mask = Image.new("L", (W, H), 0)
    md = ImageDraw.Draw(mask)
    md.ellipse((W - 260, -140, W + 140, 200), fill=150)
    mask = mask.filter(ImageFilter.GaussianBlur(70))
    card.paste(glow, (0, 0), mask)

    # bottom vignette so the title reads
    shade = Image.new("L", (W, H), 0)
    sd = ImageDraw.Draw(shade)
    sd.rectangle((0, H - 118, W, H), fill=210)
    shade = shade.filter(ImageFilter.GaussianBlur(18))
    black = Image.new("RGB", (W, H), (8, 9, 14))
    card.paste(black, (0, 0), shade)

    d = ImageDraw.Draw(card)

    # accent top bar
    d.rectangle((0, 0, W, 4), fill=accent)

    # crest watermark, right side
    crest = logo.resize((92, 92), Image.LANCZOS)
    cr = ImageDraw.Draw(crest)
    card.paste(crest, (W - 108, 14), crest)

    # no baked text — the popup overlays the (editable) script name itself;
    # baked titles collided with that overlay on both renders

    card.save(f"{ROOT}\\{fname}", optimize=True)
    print("wrote", fname)