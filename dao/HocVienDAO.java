package Camel.dao;

import Camel.model.HocVien;
import java.util.List;

public interface HocVienDAO {

    public List<HocVien> getList();
     
    public int createOrUpdate(HocVien hocVien);
}