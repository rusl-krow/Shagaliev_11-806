public class PlayList {
    private AudioTrack[] arr;
    int n = 0;

    public PlayList(int size) {
        this.arr = new AudioTrack[size];
    }

    public void add(AudioTrack AudioTrack) {
        int c = 0;
        while (c < n && n != 0 && arr[c].compareTo(AudioTrack) <= 0) {
            c++;
        }
        for(int i = n; i > c; i--){
            arr[i] = arr[i - 1];
        }
        arr[c] = AudioTrack;
        n++;
    }
}