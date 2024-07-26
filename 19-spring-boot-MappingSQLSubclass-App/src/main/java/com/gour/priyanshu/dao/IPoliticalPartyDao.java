package com.gour.priyanshu.dao;

import java.util.List;

import com.gour.priyanshu.beans.PoliticalParty;

public interface IPoliticalPartyDao {
	public PoliticalParty getPoliticalPartyDetailsByPartyId(Integer partyId);
	public List<PoliticalParty> getPoliticalPartiesByNames(String partyName1,String partyName2);
	public int updateFlagColorsByPartyName(String newColor,String partyName);
}
