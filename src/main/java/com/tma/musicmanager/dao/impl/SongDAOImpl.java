
package com.tma.musicmanager.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import com.tma.musicmanager.dao.SongDAO;
import com.tma.musicmanager.model.Song;

@Transactional
public class SongDAOImpl implements SongDAO {

	@PersistenceContext(unitName = "song-hibernate")
	private EntityManager entityManager;

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Transactional(Transactional.TxType.SUPPORTS)
	@Override
	public List<Song> findAll() {
		TypedQuery<Song> query = entityManager.createQuery("SELECT s FROM Song s", Song.class);
		return query.getResultList();
	}

	@Transactional(Transactional.TxType.SUPPORTS)
	@Override
	public Song get(Integer songID) {
		return entityManager.find(Song.class, songID);
	}

	@Transactional(Transactional.TxType.REQUIRES_NEW)
	@Override
	public void addSong(Song song) {
		entityManager.persist(song);
		entityManager.flush();
	}

	@Transactional(Transactional.TxType.REQUIRES_NEW)
	@Override
	public void updateSong(Song song) {
		entityManager.merge(song);
	}

	@Transactional(Transactional.TxType.REQUIRES_NEW)
	@Override
	public void removeSong(int songID) {
		Song song = get(songID);
		entityManager.remove(song);
	}

	@Transactional(Transactional.TxType.REQUIRES_NEW)
	@Override
	public void removeAllSong() {
		entityManager.createQuery("DELETE FROM Song").executeUpdate();

	}

}
