package domainmodel;

import domainmodel.NguyenLieu;
import domainmodel.SanPham;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-03-20T22:00:10", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(ChiTietSP.class)
public class ChiTietSP_ { 

    public static volatile SingularAttribute<ChiTietSP, Float> dinhLuong;
    public static volatile SingularAttribute<ChiTietSP, SanPham> sanPhamKey;
    public static volatile SingularAttribute<ChiTietSP, NguyenLieu> nguyenLieukey;

}