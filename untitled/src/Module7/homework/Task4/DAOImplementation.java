package Module7.homework.Task4;

/**
 * Created by user on 12.09.2016.
 */
public class DAOImplementation implements DAO {

    @Override
    public Room1 save(Room1 room1) {

        System.out.println("Saving room1 "+ room1);

        return room1;
    }

    @Override
    public boolean delete(Room1 room1) {
        System.out.println("Delete room1 "+ room1);
        return false;
    }

    @Override
    public Room1 upDate(Room1 room1) {
        System.out.println("Update room1 "+ room1);
        return null;
    }

    @Override
    public Room1 findById(Room1 room1) {
        System.out.println("Update room1 "+ room1);

        return null;
    }
}
