import java.util.*;

public class MoveData{

    private String moveName;
	private String type;
    private List<AttributeData> moveAttributes;

    public MoveData(){
        this.moveAttributes = new ArrayList<>();
    }

    public MoveData(String moveName, String type, List<AttributeData> moveAttributes) {
        this.moveName = moveName;
        this.type = type;
        this.moveAttributes = moveAttributes;
    }

    public String getMoveName(){
        return this.moveName;
    }

    public void setMoveName(String moveName) {
        this.moveName = moveName;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<AttributeData> getMoveAttributes() {
        return this.moveAttributes;
    }

    public void setMoveAttributes(List<AttributeData> moveAttributes) {
        this.moveAttributes = moveAttributes;
    }

    public void addAttribute(AttributeData attribute){
        moveAttributes.add(attribute);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof MoveData)) {
            return false;
        }
        MoveData moveData = (MoveData) o;
        return Objects.equals(moveName, moveData.moveName) && Objects.equals(type, moveData.type) && Objects.equals(moveAttributes, moveData.moveAttributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(moveName, type, moveAttributes);
    }

    @Override
    public String toString() {
        return getMoveName();
    }

}