public class CustomerModel {
    public int mCustomerId;
    public String mNCame, mAddress, mPin,mPhone;

    public String toString() {
        StringBuilder ss = new StringBuilder( "(" );
        ss.append( mCustomerId ).append( "," );
        ss.append( "\"" ).append( mNCame ).append( "\"" ).append( "," );
        ss.append( "\"" ).append( mAddress).append( "\"" ).append( "," );
        ss.append( "\"" ).append( mPin).append( "\"" ).append( "," );
        //ss.append( mPin ).append( "," );
        ss.append( mPhone ).append( ")" );

        return ss.toString();
    }
}

