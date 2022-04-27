package Camel.service;

import Camel.dao.HocVienDAO;
import Camel.dao.HocVienDAOImpl;
import Camel.model.HocVien;
import java.util.List;

public class HocVienServiceImpl implements HocVienService {

    private HocVienDAO hocVienDAO = null;

    public HocVienServiceImpl() {
        this.hocVienDAO = new HocVienDAOImpl();
    }

    @Override
    public List<HocVien> getList() {
        return hocVienDAO.getList();
    }

    @Override
    public int createOrUpdate(HocVien hocVien) {
        return hocVienDAO.createOrUpdate(hocVien);
    }

}