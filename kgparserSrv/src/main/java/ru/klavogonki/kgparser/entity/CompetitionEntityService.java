package ru.klavogonki.kgparser.entity;

import ru.klavogonki.kgparser.Competition;

import javax.ejb.Local;
import java.util.List;

/**
 * Copyright 2014 LLC "Open Code"
 * http://www.o-code.ru
 * $HeadURL$
 * $Author$
 * $Revision$
 * $Date::                      $
 */
@Local
public interface CompetitionEntityService
{
	Long createCompetitionEntity(CompetitionEntity competitionEntity);

	List<CompetitionEntity> getCompetitionEntities(); // todo: filter config

	CompetitionEntity getCompetitionEntity(Long id);

	Competition getCompetition(Long competitionEntityId);
}