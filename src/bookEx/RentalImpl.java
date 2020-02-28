package bookEx;

import java.util.ArrayList;
import java.util.List;

public class RentalImpl implements Rental {
	private List<RentalVO> list = new ArrayList<RentalVO>();

	@Override
	public void insertRental(RentalVO vo) {
		// ���� �뿩
		list.add(vo);
	}

	@Override
	public List<RentalVO> listAllRental() {
		// ��ü �뿩 ����(�뿩 �� �ݳ� ����)
		return list;
	}

	@Override
	public List<RentalVO> listRental() {
		// �뿩���� ��ü ����
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
		// ������ �뿩���� ����
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
		// ������ �뿩�� ��ü ���
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
		// �뿩���� ���� ��ȯ
		for(RentalVO vo : list) {
			if(vo.getCode().equals(code) && vo.getReturnDate()==null) {
				return vo;
			}
		}
		return null;
	}
	
}
