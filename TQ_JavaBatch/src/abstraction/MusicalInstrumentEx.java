package abstraction;

interface MusicalInstrument {
	public void play();

	public static void learnInstrument() {
		System.out.println("Start learning Musical Instrument");
	}
}

abstract class Sound {
	public abstract void listenSound();
}

class PercussionInstrument extends Sound implements MusicalInstrument {
	public void play() {
		System.out.println("Playing Percussion Instrument");
	}

	public void listenSound() {
		System.out.println("Listening Percussion Instrument Sound");
	}
}

class StringedInstrument extends Sound implements MusicalInstrument {
	public void play() {
		System.out.println("Playing Stringed Instrument");
	}

	public void listenSound() {
		System.out.println("Listening Stringed Instrument Sound");
	}
}

public class MusicalInstrumentEx {
	public static void main(String[] args) {
		PercussionInstrument tabla = new PercussionInstrument();
		tabla.play();
		tabla.listenSound();
		MusicalInstrument.learnInstrument();
		StringedInstrument Voilin = new StringedInstrument();
		Voilin.play();
		Voilin.listenSound();
		MusicalInstrument.learnInstrument();
	}
}
