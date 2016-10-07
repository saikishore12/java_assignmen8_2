package cam.acadgild;


class AgeIsNegativeException extends Exception
{
   String errorMessage;

   public AgeIsNegativeException(String errorMessage)
   {
       this.errorMessage = errorMessage;
   }

   //Modifying toString() method to display customized error message

   @Override
   public String toString()
   {
       return errorMessage;
   }
}
