// Класс для тестирования кода
class Main {
    public static void main(String[] args) {
        // Создаем несколько треков
        Track track1 = new Track("Bohemian Rhapsody", 355);
        Track track2 = new Track("Don't Stop Me Now", 214);
        Track track3 = new Track("We Will Rock You", 122);
        Track track4 = new Track("We Are The Champions", 181);

        // Создаем альбом, содержащий треки группы Queen
        MusicCollection album = new MusicCollection("Queen Greatest Hits");
        album.addElement(track1);
        album.addElement(track2);
        album.addElement(track3);
        album.addElement(track4);

        // Создаем плейлист, содержащий альбом и еще один трек
        MusicCollection playlist = new MusicCollection("My Playlist");
        playlist.addElement(album);
        playlist.addElement(new Track("Imagine", 183));

        // Воспроизводим плейлист
        playlist.play();
    }
}
