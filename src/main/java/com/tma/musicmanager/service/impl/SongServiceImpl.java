package com.tma.musicmanager.service.impl;

import java.util.List;

import com.tma.musicmanager.dao.SongDAO;
import com.tma.musicmanager.model.Song;
import com.tma.musicmanager.service.SongService;

public class SongServiceImpl implements SongService {

	private SongDAO songDAO;

	public SongDAO getSongDAO() {
		return songDAO;
	}

	public void setSongDAO(SongDAO songDAO) {
		this.songDAO = songDAO;
	}

	@Override
	public List<Song> findAll() {
		return songDAO.findAll();
	}

	@Override
	public Song get(Integer songID) {
		return songDAO.get(songID);
	}

	@Override
	public void add(Song song) {
		songDAO.addSong(song);
	}

	@Override
	public void update(Song song) {
		songDAO.updateSong(song);
	}

	@Override
	public void remove(int songID) {
		songDAO.removeSong(songID);
	}

	@Override
	public void removeAll() {
		songDAO.removeAllSong();
	}

}
