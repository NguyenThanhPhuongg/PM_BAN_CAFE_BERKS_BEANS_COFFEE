package domainmodel;

import domainmodel.ThuongHieu;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-03-20T22:00:10", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(TaiKhoanAdmin.class)
public class TaiKhoanAdmin_ { 

    public static volatile SingularAttribute<TaiKhoanAdmin, String> matKhau;
    public static volatile SingularAttribute<TaiKhoanAdmin, String> tenTK;
    public static volatile SingularAttribute<TaiKhoanAdmin, String> id;
    public static volatile SingularAttribute<TaiKhoanAdmin, ThuongHieu> thuongHieu;

}