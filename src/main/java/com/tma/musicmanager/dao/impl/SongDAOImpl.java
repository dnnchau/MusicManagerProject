/*
 * package com.tma.musicmanager.dao.impl;
 * 
 * import java.util.ArrayList; import java.util.Collection; import
 * java.util.HashMap; import java.util.List; import java.util.Map;
 * 
 * import org.springframework.stereotype.Repository;
 * 
 * import com.tma.musicmanager.dao.SongDAO; import
 * com.tma.musicmanager.model.Song;
 * 
 * @Repository public class SongDAOImpl implements SongDAO { private static
 * final Map<Integer, Song> songMap = new HashMap<Integer, Song>(); static {
 * initSong(); }
 * 
 * @Override public List<Song> list() { // TODO Auto-generated method stub
 * return null; }
 * 
 * public static void initSong() {
 * 
 * 
 * songMap.put(song1.getSongId(), song1); songMap.put(song2.getSongId(), song2);
 * songMap.put(song3.getSongId(), song3); }
 * 
 * public static Song getSong(Integer songId) { return songMap.get(songId);
 * 
 * }
 * 
 * public static Song addSong(Song song) { songMap.put(song.getSongId(),song);
 * return song;
 * 
 * }
 * 
 * public void updateSong(Song song) { // TODO Auto-generated method stub
 * 
 * }
 * 
 * public void removeSong(int ID) { // TODO Auto-generated method stub
 * 
 * }
 * 
 * public void removeAllSong() { // TODO Auto-generated method stub
 * 
 * }
 * 
 * public static List<Song> getAllEmployees() { Collection<Song> c =
 * songMap.values(); List<Song> list = new ArrayList<Song>(); list.addAll(c);
 * return list; } }
 */