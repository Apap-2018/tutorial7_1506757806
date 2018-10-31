package com.apap.tutorial7.service;

import java.util.List;
import java.util.Optional;

import com.apap.tutorial7.model.DealerModel;
import com.apap.tutorial7.repository.DealerDb;

/**
 * DealerService
 */
public interface DealerService {
	Optional<DealerModel> getDealerDetailById(Long id);
	
	DealerModel addDealer(DealerModel dealer);

	void deleteDealer(DealerModel dealer);

	DealerModel getDealerDb();
	
	List<DealerModel> viewAllDealer();

	void updateDealer(Long id);

	void updateDealer(Long id, DealerModel dealerModel);

}
