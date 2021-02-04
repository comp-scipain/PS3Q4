import java.util.ArrayList;

public class MovieReducerLength implements MediaReducer
{
    @Override
    public String reduce(ArrayList<Media> list, String key)
    {
        ArrayList<String> newlist = new ArrayList<String>();
        int check = Integer.parseInt(key);
        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i).getName().length() == check)
            {
                newlist.add(String.valueOf((list.get(i))));
            }
        }
        return String.valueOf(newlist);
    }
}
