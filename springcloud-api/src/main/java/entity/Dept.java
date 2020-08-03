package entity;

import com.oracle.webservices.internal.api.databinding.DatabindingMode;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;


@Accessors(chain = true)
public class Dept  implements Serializable {

    private Integer deptno;
    private String dname;
    private String db_source;

    public Dept() {
    }

    public Dept(String dname) {
        this.dname = dname;
    }

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getDb_source() {
        return db_source;
    }

    public void setDb_source(String db_source) {
        this.db_source = db_source;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptno=" + deptno +
                ", dname='" + dname + '\'' +
                ", db_source='" + db_source + '\'' +
                '}';
    }
}
