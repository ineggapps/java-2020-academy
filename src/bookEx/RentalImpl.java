package bookEx;

import java.util.ArrayList;
import java.util.List;

public class RentalImpl implements Rental {
	private List<RentalVO> list = new ArrayList<RentalVO>();

	@Override
	public void insertRental(RentalVO vo) {
		// 도서 대여
		list.add(vo);
	}

	@Override
	public List<RentalVO> listAllRental() {
		// 전체 대여 도서(대여 및 반납 포함)
		return list;
	}

	@Override
	public List<RentalVO> listRental() {
		// 대여중인 전체 도서
		List<RentalVO> rlist = new ArrayList<RentalVO>();
		
		for(RentalVO vo : list) {
			if(vo.getReturnDate()==null) {
				rlist.add(vo);
			}
		}
		return rlist;
	}

	@Override
	public List<RentalVO> listUserRental(String id) {
		// 유저가 대여중인 도서
		List<RentalVO> rlist = new ArrayList<RentalVO>();
		
		for(RentalVO vo : list) {
			if(vo.getId().equals(id) && vo.getReturnDate()==null) {
				rlist.add(vo);
			}
		}
		return rlist;
	}

	@Override
	public List<RentalVO> listUserAllRental(String id) {
		// 유저가 대여한 전체 목록
		List<RentalVO> rlist = new ArrayList<RentalVO>();
		
		for(RentalVO vo : list) {
			if(vo.getId().equals(id)) {
				rlist.add(vo);
			}
		}
		return rlist;
	}

	@Override
	public RentalVO readRental(String code) {
		// 대여중인 도서 반환
		for(RentalVO vo : list) {
			if(vo.getCode().equals(code) && vo.getReturnDate()==null) {
				return vo;
			}
		}
		return null;
	}
	
}
