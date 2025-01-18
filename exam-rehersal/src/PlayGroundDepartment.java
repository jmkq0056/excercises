import java.util.HashSet;
import java.util.Set;
// EXTRA CODE JUST TO SEE NOT PART OF EXAM
public class PlayGroundDepartment implements Listener{
    private final Set<PlayGround> playGrounds;
    public PlayGroundDepartment () {
        playGrounds = new HashSet<>();
    }

    public void addPlayGround(PlayGround playGround){
        assert playGround != null;
        playGrounds.add(playGround);
    }

    public Set<PlayGround> getPlayGrounds(){
        return  playGrounds;
    }

    @Override
    public void update(StreetFurniture streetFurniture){
        if(streetFurniture instanceof PlayGround){
            this.addPlayGround((PlayGround) streetFurniture);
        }
    }
}
