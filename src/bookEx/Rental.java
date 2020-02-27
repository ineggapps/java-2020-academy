package bookEx;

import java.util.List;

public interface Rental {
	public void insertRental(RentalVO vo);
	public List<RentalVO> listRental();
	public List<RentalVO> listRental(String id);
	public RentalVO readRental(String code);
}
