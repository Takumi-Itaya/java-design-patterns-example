package facade.example;

public class HomeTheaterFacade {
  private Amplifier amp;
  private Tuner tuner;
  private DvdPlayer dvd;
  private CdPlayer cd;
  private Projector projector;
  private TheaterLights lights;
  private Screen screen;
  private PopcornPopper popper;

  public HomeTheaterFacade(
      Amplifier amp,
      Tuner tuner,
      DvdPlayer dvd,
      CdPlayer cd,
      Projector projector,
      TheaterLights lights,
      Screen screen,
      PopcornPopper popper) {
    this.amp = amp;
    this.tuner = tuner;
    this.dvd = dvd;
    this.cd = cd;
    this.projector = projector;
    this.lights = lights;
    this.screen = screen;
    this.popper = popper;
  }

  public void watchMovie(String movie) {
    System.out.println("映画鑑賞の準備を開始します...");
    popper.on();
    popper.pop();
    tuner.on();
    cd.on();
    lights.dim(10);
    screen.down();
    projector.on();
    projector.wideScreenMode();
    amp.on();
    amp.setDvd(dvd);
    amp.setSurroundSound();
    amp.setVolume(5);
    dvd.on();
    dvd.play(movie);
  }

  public void endMovie() {
    System.out.println("映画鑑賞を終了します...");
    popper.off();
    tuner.off();
    cd.off();
    lights.on();
    screen.up();
    projector.off();
    amp.off();
    dvd.stop();
    dvd.eject();
    dvd.off();
  }
}