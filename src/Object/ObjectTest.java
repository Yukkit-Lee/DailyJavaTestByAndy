package Object;

public class ObjectTest {
    private String name;
    private int num;

    public ObjectTest() {
    }

    public ObjectTest(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof ObjectTest)
        {
            ObjectTest newObj=(ObjectTest)obj;
            return this.name== newObj.name&&this.num== newObj.num;
        }
        return false;//若obj不属于ObjectTest类直接返回false
    }
}
