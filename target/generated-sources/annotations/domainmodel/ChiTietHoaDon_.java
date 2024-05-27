package domainmodel;

import domainmodel.HoaDonBanHang;
import domainmodel.SanPham;
import java.math.BigDecimal;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-03-20T22:00:10", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(ChiTietHoaDon.class)
public class ChiTietHoaDon_ { 

    public static volatile SingularAttribute<ChiTietHoaDon, HoaDonBanHang> hoaDonKey;
    public static volatile SingularAttribute<ChiTietHoaDon, Integer> soLuongMua;
    public static volatile SingularAttribute<ChiTietHoaDon, SanPham> sanPhamKey;
    public static volatile SingularAttribute<ChiTietHoaDon, BigDecimal> thanhTien;
    public static volatile SingularAttribute<ChiTietHoaDon, BigDecimal> thanhTienSauKm;

}