// Abstract class AudioFile
abstract class AudioFile {
    protected String fileName;
    protected double fileSize;

    // Constructor
    public AudioFile(String fileName, double fileSize) {
        this.fileName = fileName;
        this.fileSize = fileSize;
    }

    // Abstract methods
    public abstract void play();  // Plays the audio file
    public abstract void pause(); // Pauses the audio playback
    public abstract void stop();  // Stops the audio playback
}

// MP3File class
class MP3File extends AudioFile {
    private int bitRate;

    public MP3File(String fileName, double fileSize, int bitRate) {
        super(fileName, fileSize);
        this.bitRate = bitRate;
    }

    @Override
    public void play() {
        System.out.println("Playing MP3 file: " + fileName + " (Bitrate: " + bitRate + " kbps)");
    }

    @Override
    public void pause() {
        System.out.println("Pausing MP3 file: " + fileName);
    }

    @Override
    public void stop() {
        System.out.println("Stopping MP3 file: " + fileName);
    }
}

// WAVFile class
class WAVFile extends AudioFile {
    public WAVFile(String fileName, double fileSize) {
        super(fileName, fileSize);
    }

    @Override
    public void play() {
        System.out.println("Playing WAV file: " + fileName);
    }

    @Override
    public void pause() {
        System.out.println("Pausing WAV file: " + fileName);
    }

    @Override
    public void stop() {
        System.out.println("Stopping WAV file: " + fileName);
    }
}

// FLACFile class
class FLACFile extends AudioFile {
    public FLACFile(String fileName, double fileSize) {
        super(fileName, fileSize);
    }

    @Override
    public void play() {
        System.out.println("Playing FLAC file: " + fileName);
    }

    @Override
    public void pause() {
        System.out.println("Pausing FLAC file: " + fileName);
    }

    @Override
    public void stop() {
        System.out.println("Stopping FLAC file: " + fileName);
    }
}

// Main class to test the implementation
public class AudioPlayer {
    public static void main(String[] args) {
        // Create instances of MP3File, WAVFile, and FLACFile
        AudioFile mp3 = new MP3File("song.mp3", 5.0, 320);
        AudioFile wav = new WAVFile("track.wav", 15.0);
        AudioFile flac = new FLACFile("audio.flac", 25.0);

        // Test MP3File
        System.out.println("Testing MP3File:");
        mp3.play();
        mp3.pause();
        mp3.stop();

        // Test WAVFile
        System.out.println("\nTesting WAVFile:");
        wav.play();
        wav.pause();
        wav.stop();

        // Test FLACFile
        System.out.println("\nTesting FLACFile:");
        flac.play();
        flac.pause();
        flac.stop();
    }
}
