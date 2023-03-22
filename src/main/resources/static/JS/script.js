const img = new Image();
img.src = "https://source.unsplash.com/random";
img.crossOrigin = "Anonymous";

img.onload = function () {
  const vibrant = new Vibrant(img);

  vibrant.getPalette((err, palette) => {
    if (err) {
      console.error("Error al obtener la paleta de colores:", err);
      return;
    }

    const backgroundImage = document.getElementById("background-image");
    const lightMutedColor = palette.LightMuted.rgb;
    const lightMutedColorRGBA = `rgba(${lightMutedColor[0]}, ${lightMutedColor[1]}, ${lightMutedColor[2]}, 0.79)`;

    backgroundImage.style.backgroundImage = `linear-gradient(${lightMutedColorRGBA}, ${lightMutedColorRGBA}), url(${img.src})`;
  });
};
