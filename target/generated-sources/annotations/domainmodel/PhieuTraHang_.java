package domainmodel;

import domainmodel.ChiTietPhieuTra;
import domainmodel.NhaCungCap;
import domainmodel.NhanVien;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-03-20T22:00:10", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(PhieuTraHang.class)
public class PhieuTraHang_ { 

    public static volatile SingularAttribute<PhieuTraHang, String> ma;
    public static volatile SingularAttribute<PhieuTraHang, NhaCungCap> nhaCungCap;
    public static volatile SingularAttribute<PhieuTraHang, Integer> trangThai;
    public static volatile SingularAttribute<PhieuTraHang, NhanVien> nhanVien;
    public static volatile SetAttribute<PhieuTraHang, ChiTietPhieuTra> chiTietPhieuTra;
    public static volatile SingularAttribute<PhieuTraHang, String> id;
    public static volatile SingularAttribute<PhieuTraHang, Date> ngayTra;

}