package bookEx;

import java.util.List;

public interface Rental {
	public void insertRental(RentalVO vo);
	public List<RentalVO> listAllRental();
	public List<RentalVO> listRental();
	public List<RentalVO> listUserRental(String id);
	public List<RentalVO> listUserAllRental(String id);
	public RentalVO readRental(String code);
}
