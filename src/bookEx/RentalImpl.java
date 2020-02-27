package bookEx;

import java.util.ArrayList;
import java.util.List;

public class RentalImpl implements Rental {
	private List<RentalVO> list = new ArrayList<RentalVO>();
	
	@Override
	public void insertRental(RentalVO vo) {
	}

	@Override
	public List<RentalVO> listRental() {
		return list;
	}

	@Override
	public List<RentalVO> listRental(String id) {
		return null;
	}

	@Override
	public RentalVO readRental(String code) {
		return null;
	}
}
