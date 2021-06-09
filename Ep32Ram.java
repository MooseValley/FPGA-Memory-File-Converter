
import java.util.ArrayList;

public class Ep32Ram
{
   private ArrayList<String> ep32RamArrayList;
   private ArrayList<String> initLinesArrayList;
   private ArrayList<String> digitsArrayList;


   private char[][] initLines = new char [64][64];

   public Ep32Ram ()
   {
   }

   public void loadRamFromFile (String fileNameStr)
   {
      ep32RamArrayList = new  ArrayList<>();

      Moose_Utils.loadArrayListFromFile (fileNameStr, ep32RamArrayList, false);

      // Remove all lines staring with "#"
      // Remove everything before the ":", inclusive.
      // 0 pad on left to 8 bytes.

      for (int k = ep32RamArrayList.size() - 1; k >= 0; k--)
      {
         String lineStr = ep32RamArrayList.get(k);

         if (lineStr.startsWith ("#") == true)
         {
            ep32RamArrayList.remove(k);
         }
         else
         {
            if (lineStr.indexOf (":") >= 0)
            {
               lineStr = lineStr.substring (lineStr.indexOf (":") + 1, lineStr.length() );
               lineStr = lineStr.trim();

               while (lineStr.length() < 8)
               {
                  lineStr = "0" + lineStr;
               }

               ep32RamArrayList.set (k, lineStr);
            }
         }
      }

      System.out.println (Moose_Utils.arrayListToStr (ep32RamArrayList, "", "\n") );



      // Initialise INIT lines.

      for (int row = 0; row < initLines.length; row++)
      {
         for (int col = 0; col < initLines[row].length; col++)
         {
            initLines[row][col] = '0';
         }
      }


      System.out.println ("Size: " + ep32RamArrayList.size() + " * 8 = " + (ep32RamArrayList.size() * 8) );
      System.out.println ((1.0 * ep32RamArrayList.size() * 8 / 64) );



      // Convert ep32RamArrayList to INIT lines.




      /*
      int ep32LineCount  = 0;
      int ep32CharCount  = 0; //ep32RamArrayList.size() - 1;
      int charIndexCount = 0;
      int initLinesRow   = 0;
      int initLinesCol   = 0;

      while (ep32LineCount < ep32RamArrayList.size() )
      {

         while (ep32CharCount < 8)
         {
            System.out.println ("initLines[" + initLinesRow + "][" + initLinesCol + "] = " +
                                "ep32RamArrayList.get(" + ep32LineCount + ").charAt (" + ep32CharCount + ")" );
            initLines[initLinesRow][initLinesCol] = ep32RamArrayList.get(ep32LineCount).charAt (ep32CharCount);

            ep32LineCount++;
            initLinesCol++;

            if (initLinesCol > 63)
            {
               initLinesRow++;
               initLinesCol = 0;
            }

         }

         ep32LineCount = 0;
         ep32CharCount++;
      }
      */



      /*
      0:68D -->   0000068D
      24:80 -->   00000080
      25:A  -->   0000000A
      26:7C1
      27:7C3
      28:7C1
            INIT_00 => X"0000000000000000000000000000000000000000000000000000000000000000",
            INIT_01 => X"0000000000000000000000000000000000000000000000000000000000000000",
            INIT_02 => X"0000000000000000000000000000000000000000000000000000000000000000",
            INIT_03 => X"0000000000000000000000000000000000000000000000000000000000000000",
      */

      /*
      For each line in ep32RamArrayList get the FIRST (left-most) digit and
      append in onto a line.
      When all lines have bene processed for the FIRST digit, add the line to initLinesArrayList.
      When the processing below is finished, initLinesArrayList will consist of 8 lines of data.
      */

      int numCharsWithFullLinesOfData = 64 * 64;
      int numZeroesToPad              = numCharsWithFullLinesOfData - ep32RamArrayList.size();
      int numFullLinesOfData          = numCharsWithFullLinesOfData / 64;

      System.out.println ("Lines of Data:                        " + (1.0 * ep32RamArrayList.size() / 64) );
      System.out.println ("Zeroes to append to each line:        " + numZeroesToPad );
      System.out.println ("Resulting Full 64 byte lines of data: " + numFullLinesOfData );

      initLinesArrayList = new  ArrayList<>();

      for (int col = 0; col < 8; col++)
      {
         StringBuilder sb    = new StringBuilder();

         for (int row = 0; row < ep32RamArrayList.size(); row++)
         {
            sb.append (ep32RamArrayList.get(row).charAt (col) );
         }

         for (int pad = 0; pad < numZeroesToPad; pad++)
         {
            sb.append ('0');
         }

         initLinesArrayList.add (sb.toString() );

      }

      /*
      When it is 64 chars long, move onto next init line.
      */





/*
      for (int row = 0; row < initLines.length; row++)
      {
         for (int col = 0; col < initLines[row].length; col++)
         {
            System.out.print (initLines[row][col] );
         }

         System.out.println ();
      }
*/
/*
         for (int row = 0; row < initLinesArrayList.size(); row++)
         {
            System.out.println (initLinesArrayList.get(row) );
         }
*/

/*
            INIT_00 => X"0000000000000000000000000000000000000000000000000000000000000000",
            INIT_01 => X"0000000000000000000000000000000000000000000000000000000000000000",
            INIT_02 => X"0000000000000000000000000000000000000000000000000000000000000000",
            INIT_03 => X"0000000000000000000000000000000000000000000000000000000000000000",
*/
         int index = 0;
         StringBuilder sb    = new StringBuilder();


         for (int initRow = 0; initRow < initLinesArrayList.size(); initRow++)
         {
            sb.append ("BRAM_SINGLE_MACRO_inst : BRAM_SINGLE_MACRO" + Moose_Utils.getLineSeparator () );
            sb.append ("generic map (" + Moose_Utils.getLineSeparator () );

            for (int subRow = 0; subRow < 64; subRow++)
            {
               String hexStr = Integer.toHexString(subRow);
               if (hexStr.length() < 2)
               {
                  hexStr = "0" + hexStr;
               }

               hexStr = hexStr.toUpperCase();

               String digitsDataStr = initLinesArrayList.get(initRow).substring(subRow * 64, (subRow + 1) * 64);

               sb.append ("      INIT_" + hexStr + " => X\"" + digitsDataStr + "\"");

               if (subRow < 64 - 1)
                  sb.append ("," );
               else
                  sb.append (" )" );


               sb.append (Moose_Utils.getLineSeparator () );
            }

            sb.append (Moose_Utils.getLineSeparator () );
         }

         //System.out.println (sb.toString() );

         Moose_Utils.writeOrAppendStringToFile ("ram_memory.vhd", sb.toString(), false);

   }

   public static void main (String args[])
   {
      Ep32Ram ep32 = new Ep32Ram ();

      ep32.loadRamFromFile ("ep32q.mem");
   }



}