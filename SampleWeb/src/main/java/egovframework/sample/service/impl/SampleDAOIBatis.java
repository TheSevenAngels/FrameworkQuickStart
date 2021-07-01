package egovframework.sample.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.sample.service.SampleDAO;
import egovframework.sample.service.SampleVO;

@Repository("daoIBatis")
public class SampleDAOIBatis implements SampleDAO {
	public SampleDAOIBatis() throws Exception  {
		System.out.println("SampleDAOIBatis");
	}

	public void insertSample(SampleVO vo) throws Exception {
		System.out.println("DAOIBatis insertSample");
	}

	public void updateSample(SampleVO vo) throws Exception {
		System.out.println("DAOIBatis updateSample");
	}

	public void deleteSample(SampleVO vo) throws Exception {
		System.out.println("DAOIBatis deleteSample");
	}

	public SampleVO selectSample(SampleVO vo) throws Exception {
		System.out.println("DAOIBatis selectSample");
		return null;
	}

	public List<SampleVO> selectSampleList(SampleVO vo) throws Exception {
		System.out.println("DAOIBatis selectSampleList");
		return null;
	}
}
