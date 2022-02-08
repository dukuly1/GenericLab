
/**
 In the code below, the DataSet class has been converted into a 
 generic DataSetGen class, which extends the class Measurable. 
 This means that the DataSetGen class is accessible to classes. 
 that implement Measurable. However, the DataSetGene class's
 attribute, maximum is converted to a generic variable, 
 as well as the add method, and the getMaximum method.
*/
public class DataSetGen<T extends Measurable>
{
	 private T maximum;
   private double sum;
   private int count;

   /**
      Constructs an empty data set.
   */
   public DataSetGen()
   {
      sum = 0;
      count = 0;
      maximum = null;
   }

   /**
      Adds a data value to the data set.
      @param x a data value
   */
   public void add(T x)
   {
      sum = sum + x.getMeasure();
      if (count == 0 || maximum.getMeasure() < x.getMeasure())
         maximum = x;
      count++;
   }

   /**
      Gets the average of the added data.
      @return the average or 0 if no data has been added
   */
   public double getAverage()
   {
      if (count == 0) return 0;
      else return sum / count;
   }

   /**
      Gets the largest of the added data.
      @return the maximum or 0 if no data has been added
   */
   public T getMaximum()
   {
      return maximum;
   }
}