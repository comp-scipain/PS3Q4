import java.util.ArrayList;

public class MovieReducerLength implements MediaReducer
{
    @Override
    public String reduce(ArrayList<Media> list, String key)
    {
        int check = Integer.parseInt(key);
        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i).getName().length() == check)
            {
                return list.get(i).getName();
            }
        }
        return null;
    }
}
