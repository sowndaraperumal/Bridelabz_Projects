package com.bridgeit.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bridgeit.model.Note;
import com.bridgeit.model.User;

@Repository
public class NoteDaoImpl implements INoteDao {

	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	public User getUser(Integer id) {
		User user = (User) getCurrentSession().get(User.class, id);
		return user;
	}

	@Override
	public void addNote(Note note) {

		getCurrentSession().save(note);
		System.out.println("added");
	}

	@Override
	public void deleteNote(Note note) {
		// TODO Auto-generated method stub

		getCurrentSession().delete(note);

	}

	@Override
	public boolean updateNote(Note note) {
		// TODO Auto-generated method stub
		System.out.println(note);
		getCurrentSession().update(note);
		return true;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Note> getNotes(int id) {

		List<Note> list = getCurrentSession().createCriteria(Note.class).createCriteria("user")
				.add(Restrictions.eq("id", id)).list();

		System.out.println(list);

		return list;
	}

	@Override
	public void deleteNoteForever(Note note) {
		// TODO Auto-generated method stub
		getCurrentSession().delete(note);

	}

	@Override
	public Note getNoteById(int noteId) {

		Note note = (Note) getCurrentSession().get(Note.class, noteId);
		return note;
	}

}
