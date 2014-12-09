package com.teago.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.teago.model.ModeloGenericoTeste;
import com.teago.util.HibernateUtil;

public class ModeloGenericoTesteDAO {
	
	public Long savenModeloGenerico(ModeloGenericoTeste objetoParaPersistir) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		Long modeGenericoTesteId = null;
		try {
			transaction = session.beginTransaction();
			
			modeGenericoTesteId = (Long) session.save(objetoParaPersistir);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
		} finally {
			session.close();
		}

		return modeGenericoTesteId;
	}

	public void listarModeloGenericoTeste() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			List<ModeloGenericoTeste> cities = session.createQuery("from ModeloGenericoTeste").list();

			for (ModeloGenericoTeste modeloGenericoTeste : cities) {
				System.out.println(modeloGenericoTeste.getCampo1());
				System.out.println(modeloGenericoTeste.getCampo2());
			}

			transaction.commit();

		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	public void updateCity(Long modeGenericoTesteId, ModeloGenericoTeste modeloGenericoTeste) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			ModeloGenericoTeste modeloGenericoTesteAntigo = (ModeloGenericoTeste) session.get(ModeloGenericoTeste.class, modeGenericoTesteId);
			modeloGenericoTesteAntigo.setCampo1(modeloGenericoTeste.getCampo1());
			modeloGenericoTesteAntigo.setCampo2(modeloGenericoTeste.getCampo2());
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	public void deleteCity(Long modeloGenericoTesteId) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			ModeloGenericoTeste modeloGenericoTeste = (ModeloGenericoTeste) session.get(ModeloGenericoTeste.class, modeloGenericoTesteId);
			session.delete(modeloGenericoTeste);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
}
