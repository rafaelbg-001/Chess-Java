package BoardGame;

public class BoardException extends RuntimeException
{
    public BoardException(String msg)
    {
        super("Error in Board - " + msg);
    }


}
