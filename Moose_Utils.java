/*
Author: Mike O'Malley
Source File: Moose_Utils.java

Ammendment History
Ver   Date        Author    Details
----- ----------- --------- ----------------------------------------------------
1.22  14-Aug-2016  Mike O   Add ammendment history.
                            Add new: fileToString(), promptUserToSelectDirectory().
                            Improve: trimAndMakeSureDirectoryEndsWithSlash ().
1.23  14-Aug-2016  Mike O   Add JFrame currentFrame to promptUserToSelectDirectory()
                            to control whether dialog is displayed centered in GUI or screen.
1.24  27-Aug-2016  Mike O   Add new methods: getAllNumericDigitsFromStrAsString and
                            getAllNumericDigitsFromStrAsDouble.
1.25  27-Aug-2016  Mike O   Add new method: strToDouble.
1.26  27-Aug-2016  Mike O   Add new methods: insertBlankItems, countDelimiters, getFieldValueFromXML.
1.27  04-Sep-2016  Mike O   Add new methods: getFileExtensionFromFile and getFileExtensionFromStr.
                            Vastly improve:  getJavaCompilerBinDirectory.
1.28  05-Sep-2016  Mike O   Add new methods: setItemInDelimitedText, getItemFromDelimitedText, and
                            strToInt.
1.29  14-Sep-2016  Mike O   Add new method: deleteTextBetweenDelimiters.
1.30  17-Oct-2016  Mike O   Add new method: getLineSeparator () and use this when saving files
                            rather than using "\n" which Notepad and MANY government reporting
                            web sites we are using CANNOT accept - all lines are threated as 1
                            long line, which does NOT work.
                            Add new method: addFileNamePrefixBeforeExtensionFromStr
                            Add new method: addFileNamePrefixBeforeExtensionFromFile
1.31  18-Oct-2016  Mike O   Add new method: getAlphabeticCharsFromString
1.32  27-Oct-2016  Mike O   Change method: CopyArrayListToJTextArea
                            to use StringBuffer - don't think this has sped things up.
1.33  29-Oct-2016  Mike O   Add new methods: getCurrentDateTime(), getCurrentDateDDD_DD_MMM_YYYY(),
                            and getCurrentTimeAMPM().
1.34  16-Nov-2016  Mike O   Add new methods: isDateValid_YYYY_MM_DD_Date, and
                            attemptToBuildValid_YYYY_MM_DD_Date.
1.35  17-Nov-2016  Mike O   Add new methods: randomiseArrayList, randomiseJTextArea,
                            and randomiseJTextAreaToAnotherJTextArea
1.36  21-Nov-2016  Mike O   Add new methods: isItemAlreadyInComboBox and addUniqueItemToComboBox.
1.37  15-Dec-2016  Mike O   Add new methods: countAllNumericDigitsFromStr, containsIgnoreCase,
                            replaceIgnoreCase.
1.38  11-Jan-2017  Mike O   Add new methods: getRandomIntBetween2Integers, toDate,
                            dateDiffYears, getAge.
1.39  08-Feb-2017  Mike O   Add new methods: CopyOrAppendArrayListToJTextArea,
                            AppendArrayListToJTextArea, and copyFile.
1.39  08-Feb-2017  Mike O   Add new methods: getFileModifiedDateTime, getDaysSinceFileModified,
                            and getFileSizeBytes.
1.40  11-Feb-2017  Mike O   In displayAboutDialog, if the current Windows user is
                            my real username "STD-User__Mike", then display this as
                            "Moose", just in case a hacker could use it against me.
                            YES, I am *that* paranoid / careful !!
                            Who knows what criminals could use against you !!
1.41  10-Mar-2017  Mike O   Change replaceIgnoreCase to replace ALL occurences -
                            not just the first occurence.
                            Add be method: appendArrayListToArrayList.
1.42  14-Apr-2017  Mike O   Add copyArrayListToArrayList and
                            eraseFileContents.
1.43  15-Apr-2017  Mike O   Add Java Home Folder to displayAboutDialog - it can be
                            useful for users to check which version of Java is running.
                            Also, split Architecture out to be a separate line (item),
                            because when I installed Java x86 under Windows 10 x64,
                            it shows the OS architecture as x86 - so this is clearly
                            referring to Java not Windows.
                            Add new methods: getSystemUsedMemoryBytes, getSystemFreeMemoryBytes,
                            getSystemTotalMemoryBytes, and scaleBytesToKBMBGBTBWithUnitsStr.
                            Add JVM Memory Used, JVM Memory Free, and JVM Memory Total to
                            the displayAboutDialog.
1.50   4-Jul-2017  Mike O   Tons of changes over last few months.
                            Add new methods:
                            * loadArrayListFromFile
                            * getFieldValueBetweenXMLTags
                            * loadJARFileLibrary
                            * getRandomStringFromArrayList
                            * showInputPasswordDialog
                            Revamp loadArrayListFromFile: enable appending, creation, etc.
                            Change getRandomIntBetween2Integers over to use SecureRandom.
                            Change over ALL methods that need random numbers (integers)
                            to use getRandomIntBetween2Integers.
1.60   4-Oct-2017  Mike O   Tons of changes over last few months.
                            Add new methods:
                            * getRandomStringFromArray
                            * copyJTextAreaToClipboard
                            * fileExists
                            * roundToNDecimalPlaces
                            * getJTextAreaSizeInBytes
                            * getJTextAreaSizeToKBMBGBTBWithUnits
                            * Probably other methods ????
                            Check/fix all File I/O (read, write) methods that they release
                            all resources when finished.
1.70   4-Dec-2017  Mike O   Add new methods:
                            * isTextFile
                            * getFileLineCount ()
                            * getArrayListDigits
                            * getArrayListChars
                            * getArrayListWords
                            textFilesExtensionsList contains a comma separated
                            list of text file extensions.
                            Fix replaceIgnoreCase to handle replacing a string
                            with a string that includes the first.
                            e.g. replaceIgnoreCase ("TEST", "TEST 123", "TEST, TEST, TEST");
                            Returns: TEST 123, TEST 123, TEST 123
1.71   5-Dec-2017  Mike O   Add new methods:
                            * getAllFilesInDirecoryAndAllSubDirectories
                            * listFilesAndFoldersInArrayList
1.80   5-Mar-2018  Mike O   Add new methods (over past few months):
                            * getFileAgeDays
                            * getJavaVersionReleaseDate ()
                            * getJavaVersionReleaseDateStr ()
                            * getJavaVersionReleaseDateAgeStr )_
                            * getDateDDD_DD_MMM_YYYY_TimeAMPM ()
                            * isTextFile
                            * isPrintableChar
                            * isNullChar
                            * Add support for multiple monitors / screens to
                            * getScreenHeight () and getScreenWidth ()
                            * getCurrentDateYYYYMMDD_DATE_FORMAT()
                            * appendJTextAreaToFile
                            * getIndexOfStringInArrayList
                            * getArrayListOfUniqueStringsFromArrayList
1.81   ?????-2018  Mike O   Add new methods:
                            * attemptToBuildValid_DD_MM_YYYY_Date
                            * getDisplayAboutDialogStr
1.82  16-Jul-2018  Mike O   Add new methods:
                            * fileToStringArayListFromInsideJAR
                            * getDisplayAboutDialogHTMLStr
                            * sortComboBox
                            * removeBlankItemsFromArrayList
                            * trimAllItemsInArrayList
                            Modify this method:
                            * getRandomIntBetween2Integers: ensure bound > 0
1.83  20-Aug-2018  Mike O   Add a copyrightHolderStr parameter to
                            * getDisplayAboutDialogStr ()
                            * getDisplayAboutDialogHTMLStr ()
                            * displayAboutDialog ()
                            which display a Copyright message for specific entities.
                            e.g. a Copyright (C) Centacare if "Centacare: is passed.
                            Otherwise, for my applications, Freeware is displayed.
                            Add new methods:
                            * getCurrentDateYYYYMMDD_HHMMSS_FILENAME_SAFE_FORMAT
                            * htmlToPlainText
                            Add occurenceToReplace parameter to new overloaded version of
                            * replaceIgnoreCase
                            Moved these methods to "ZipAndJar.java":
                            * loadJARFileLibrary
                            * fileToStringFromInsideJAR
                            * fileToStringArayListFromInsideJAR
1.84  13-Jan-2019  Mike O   Add new methods:
                            * fileToBytesArray
                            * fileToBytesArray
                            * stringToByteArray
                            * byteArrayToString
                            * isItemAlreadyInArrayList
                            * addUniqueItemToArrayList
                            * dateToFormattedDateString
                            * getAge (Date startDate, Date referenceDate)
                            * sortJTextArea
                            * getRandomDateStrDDMMMYYYY
                            Add new class constants:
                            * MONTHS and DAYS arrays
1.85  11-Feb-2019  Mike O   Add new methods:
                            * trimStringToLengthStr
                            * lineWrapAtLocationStr
                            Add Domain Name/Username, Current HostName,
                            Current IP Address, and WAN IP Address to:
                            * getDisplayAboutDialogStr
                            * getDisplayAboutDialogHTMLStr
1.86  15-Feb-2019  Mike O   Add new methods:
                            * startsWithIgnoreCase
                            * endsWithIgnoreCase
                            * getIndexOfSelectedArrayRadioButton ()
                            * getArrayListOfItemsInArrayList1AndNotInArrayList2
                            * arrayListToStr - another version (accepts a prefix as well).
1.87  07-Mar-2019  Mike O   Add new methods:
                            * getTextOfSelectedArrayRadioButton
                            Change strToInt to use strToDouble to easily
                            handle numbers in Scientific Format. eg. 4.343E3.
                            Change all methods that use FileReader to
                            use a BufferedReader wrapper rather than
                            Scanner - much, much faster.

1.88  09-Aug-2019  Mike O   Add new methods:
                            * getUsernameSanitisedStr ()
                            * getIndexOfStringInStringArray ()
                            * replaceCharsThatMightCauseProblemsInFileNameStr
                            * removeStringFromArrayList
                            * getRepeatedText
                            * removeStringFromArrayListStartingWith
                            * getArrayListOfItemsInBothArrayList1AndList2
                            * getArrayListUnionList1AndList2
                            * getAllNumericDigitsAndDecimalPointFromStrAsString
                            * removeAllRows (JTable myTable)
                            * setEnabledOrDisabledArrayRadioButton
                            * removeAllTrailingCharacter
                            * removeAllLeadingCharacter
                            * saveComboBoxToFile
                            * comboBoxToArrayList
                            * isIntegerInArray
                            * arrayListToArrayOfString
                            * setBackgroundComboBox
                            * isDoubleEqualToDoubleWithinGivenTolerance
                            * isStringValidDouble
                            * arrayToComboBox
                            Add new constants:
                            * QUICK_BROWN_FOX_STRING
                            Reinstate:
                            * preserveColumnWidthsToArray
                            * restoreColumnWidthsFromArray

1.90  17-Jan-2020  Mike O   Add new methods:
                            * randomiseArray
                            * sleep
                            * deleteEverythingInStringBeforeString
                            * deleteEverythingInStringFromStringOnwards
                            * getHoursOfDate
                            * getMinsOfDate
                            * getDayOfMonthOfDate
                            * getDayOfYearOfDate
                            * getSecsOfDate
                            * fileToStringArray
                            * getCountCheckBoxedTableItems
                            * saveArrayListToFile ()
                            * equals
                            * equalsIgnoreCase
                            * isOSWindows ()
                            * isOSMac()
                            * isOSUnix()
                            * isOSSolaris()
                            * moveFile ()
                            * renameFile()
                            Streamline code, especially in:
                            * deleteFile() and copyFile() methods.
                            * copyFile now automatically creates destination directory structure if it does not already exist.
                            Add more validation and error checking to
                            * strToDouble()
1.91  27-Feb-2020  Mike O   Add new methods:
                            * getOsSafeFileName
                            * getAllFilesInDirectory (File)
                            * getAllFilesInDirectory (String)
                            * getAllFilesInDirecoryAndAllSubDirectories (String)
                            * spacePadLabelOnRightToLength
                            Add more text samples (these are useful for testing, etc):
                            * LAYS_OF_ANCIENT_ROME_HORATIUS
                            * LOREM_IPSUM
                            Changes:
                            * CopyOrAppendArrayListToJTextArea, move cursor/view to start of data
                              at TOP of textarea at end of method.
                            * getOsSafeFileName: remove European Accented Characters from file names.
1.92  04-Mar-2020  Mike O   Do not display WAN IP Address (do not call Network.getWanIPAddress()
                            in the About dialog methods: getDisplayAboutDialogStr() and
                            getDisplayAboutDialogHTMLStr() - because this takes about 1-2 seconds
                            and just slows down the appearance of the dialog.
1.93




*** Added for next version:

                            Add new methods:
                            * copyArrayListStringToClipboard
                            * setTextJTextArea
                            * copyStringToArrayList
                            * reverseOrderArrayList


setBackgroundComboBox (JComboBox myComboBox, Color enabledColor, Color disabledColor)
setForegroundComboBox (JComboBox myComboBox)
setForegroundComboBox (JComboBox myComboBox, Color enabledColor, Color disabledColor)
truncateDelimittedStringLinesToLengthStr
toTitleCase

Changes:
                            * getRandomIntBetween2Integers()
                              Improved random number generation – don’t recreate the generator every
                              time, because this can cause numbers to not be quite so random.



*** TODO:
For
Dimension scrnSize = Toolkit.getDefaultToolkit().getScreenSize();
Rectangle winSize = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds();

int taskBarHeight = scrnSize.height - winSize.height;


Move useful methods from BackupFileOrganiser.java
to Moose_Utils


*/

/*
Useful Info:
file.toString()   gives the drive, directory path, and file name.
file.getPath ()   gives the drive, directory path, and file name.
file.getName()    gives just the file name (no drive or directory path).

sourceFile:                 D:\RAC\Java - Mike's Explorations\Video SubTitle Tools\VideoSubTitleTools.java
sourceFile.toString():      D:\RAC\Java - Mike's Explorations\Video SubTitle Tools\VideoSubTitleTools.java
sourceFile.getName():       VideoSubTitleTools.java
sourceFile.getParent():     D:\RAC\Java - Mike's Explorations\Video SubTitle Tools
sourceFile.getParentFile(): D:\RAC\Java - Mike's Explorations\Video SubTitle Tools
sourceFile.getPath():       D:\RAC\Java - Mike's Explorations\Video SubTitle Tools\VideoSubTitleTools.java


javax.swing.JScrollPane
setWheelScrollingEnabled (true)
Enables/disables scrolling in response to movement of the mouse wheel. Wheel scrolling is enabled by default.

*/


import java.awt.Dimension;
import java.awt.Toolkit;            // For Copy to Clipboard
import java.awt.Window;             // For isAlwaysOnTopSupported(), setAlwaysOnTop (), etc.
import java.awt.datatransfer.Clipboard;  // For Copy to Clipboard
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;  // For Copy to Clipboard
import java.awt.datatransfer.Transferable;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.Character;
import java.lang.Runtime;
import java.lang.String;
import java.lang.System;
import java.nio.file.Files;
import java.security.SecureRandom;
import java.text.ParseException; // Date Parse excetions.
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;     // For Swing Dialogs
import javax.swing.JTextArea;
import java.net.URL;
import java.net.URLClassLoader;
import java.lang.reflect.Method;
import java.awt.Component;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.KeyEvent;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.DisplayMode;
import java.util.Collections;
import java.nio.file.StandardCopyOption;
import java.nio.file.LinkOption;
import java.io.UnsupportedEncodingException;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import static java.nio.file.LinkOption.NOFOLLOW_LINKS;
import javax.swing.JLabel;
import java.util.Stack;


public class Moose_Utils
{
   // Note:  toPattern() is how you convert these formats back to Strings if you need to.
   // e.g.   DDD_DDMMYYYY_DATE_FORMAT.toPattern()    returns "EEE, dd-MMM-yyyy"
   public static final SimpleDateFormat CENTURY_DATE_FORMAT      = new SimpleDateFormat ("yyyy");
   public static final SimpleDateFormat DDD_DDMMYYYY_DATE_FORMAT = new SimpleDateFormat ("EEE, dd-MMM-yyyy");
   public static final SimpleDateFormat YYYYMMDD_DATE_FORMAT     = new SimpleDateFormat ("yyyy-MM-dd");
   public static final SimpleDateFormat HHMMSSAMPM_TIME_FORMAT   = new SimpleDateFormat ("hh:mm:ss aa");
   public static final SimpleDateFormat HHMMAMPM_TIME_FORMAT     = new SimpleDateFormat ("hh:mm aa");
   public static final SimpleDateFormat YYYYMMDD_HHMMSS_FILENAME_SAFE_FORMAT = new SimpleDateFormat ("yyyy-MM-dd HH,mm,ss"); // kk gives midnight as 24, HH gives 00 = much better (files sorted properly by name). 24 hour time format, want files in YYYY-MM-DD HH:MM:SS order, with hours increasing 00-23, and no am/pm.
   public static final SimpleDateFormat DDD_DDMMYYYY_HHMMSS_DATE_TIME_FORMAT = new SimpleDateFormat ("EEE, dd-MMM-yyyy, hh:mm:ss aa");
   public static final SimpleDateFormat DDD_DDMMYYYY_HHMM_DATE_TIME_FORMAT   = new SimpleDateFormat ("EEE, dd-MMM-yyyy, hh:mm aa");
   public static  final double DAYS_IN_YEAR                      = 365.25;
   public static  final double SECONDS_IN_YEAR                   = DAYS_IN_YEAR * 24.0 * 60.0 * 60.0;
   public static  final double MILLISECONDS_IN_YEAR              = SECONDS_IN_YEAR * 1000.0;
   // No Longer used:  see "isTextFile" below.
   //public static  final String TEXT_FILES_EXTENSIONS_LIST
   //    = ",bat,c,cpp,cs,css,html,ini,java,js,jsp,mf,pas,php,txt,xml,";

   public static final String LINE_SEPARATOR                = System.getProperty("line.separator");


   public static final String QUICK_BROWN_FOX_STRING        = "The quick brown fox jumps over the lazy dog. ";

   // Lays of Ancient Rome - Horatius:  https://en.wikisource.org/wiki/Lays_of_Ancient_Rome/Horatius
   public static final String LAYS_OF_ANCIENT_ROME_HORATIUS = "Then out spake brave Horatius, the Captain of the Gate: to every man upon this earth death cometh soon or late. And how can man die better than facing fearful odds, for the ashes of his fathers, and the temples of his gods. ";

   // Lorem ipsum: https://en.wikipedia.org/wiki/Lorem_ipsum
   public static final String LOREM_IPSUM                   = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum." + "\n" +
                                                              "Curabitur pretium tincidunt lacus. Nulla gravida orci a odio. Nullam varius, turpis et commodo pharetra, est eros bibendum elit, nec luctus magna felis sollicitudin mauris. Integer in mauris eu nibh euismod gravida. Duis ac tellus et risus vulputate vehicula. Donec lobortis risus a elit. Etiam tempor. Ut ullamcorper, ligula eu tempor congue, eros est euismod turpis, id tincidunt sapien risus a quam. Maecenas fermentum consequat mi. Donec fermentum. Pellentesque malesuada nulla a mi. Duis sapien sem, aliquet nec, commodo eget, consequat quis, neque. Aliquam faucibus, elit ut dictum aliquet, felis nisl adipiscing sapien, sed malesuada diam lacus eget erat. Cras mollis scelerisque nunc. Nullam arcu. Aliquam consequat. Curabitur augue lorem, dapibus quis, laoreet et, pretium ac, nisi. Aenean magna nisl, mollis quis, molestie eu, feugiat in, orci. In hac habitasse platea dictumst.";



   public static final String[] MONTHS = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
                                          "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
   public static final int[] DAYS      = {31, 28, 31, 30, 31, 30,
                                          31, 31, 30, 31, 30, 31};

   public static SecureRandom generator = new SecureRandom();




   // *********************************
   // FILE NAMES:
   // *********************************

   // getSafeFileName
   public static String getOsSafeFileName (String fileNameStr, boolean fileNameIncludesDirectoryPath)
   {
      /*
      REF: https://stackoverflow.com/questions/1976007/what-characters-are-forbidden-in-windows-and-linux-directory-names

      This is a complex topic.  The code below takes care of common issues.


      Let's keep it simple and answer the question, first.

          The forbidden printable ASCII characters are:

              Linux/Unix:
              / (forward slash)

              Windows:
              < (less than)
              > (greater than)
              : (colon - sometimes works, but is actually NTFS Alternate Data Streams)
              " (double quote)
              / (forward slash)
              \ (backslash)
              | (vertical bar or pipe)
              ? (question mark)
              * (asterisk)

          Non-printable characters

          If your data comes from a source that would permit non-printable characters then there is more to check for.

              Linux/Unix:
              0 (NULL byte)

              Windows:
              0-31 (ASCII control characters)

          Note: While it is legal under Linux/Unix file systems to create files with control characters in the filename, it might be a nightmare for the users to deal with such files.

          Reserved file names

          The following filenames are reserved:

              Windows:
              CON, PRN, AUX, NUL
              COM1, COM2, COM3, COM4, COM5, COM6, COM7, COM8, COM9
              LPT1, LPT2, LPT3, LPT4, LPT5, LPT6, LPT7, LPT8, LPT9

              (both on their own and with arbitrary file extensions, e.g. LPT1.txt).

          Other rules

              Windows:
              Filenames cannot end in a space or dot.

      */

      // Remove Control Characters - ASCII 0 to 31 inclusive.
      for (int k = 0; k <= 31; k++)
      {
         fileNameStr = fileNameStr.replace ("" + ((char) k),  "");
      }


      // Remove forbidden printable ASCII characters:
      char[] charsToRemove01 = {':', '/', '\\'};
      char[] charsToRemove02 = {'<', '>', '"', '|', '?', '*', '(', ')'};

      if (fileNameIncludesDirectoryPath == false)
      {
         for (int k = 0; k < charsToRemove01.length; k++)
         {
            fileNameStr = fileNameStr.replace ("" + charsToRemove01[k],  "");
         }
      }

      for (int k = 0; k < charsToRemove02.length; k++)
      {
         fileNameStr = fileNameStr.replace ("" + charsToRemove02[k],  "");
      }


      // Illegal on their own and with arbitrary file extensions, e.g. LPT1.txt.
      String[] illegalNames = {"CON",  "PRN",  "AUX",  "NUL",  "COM1", "COM2", "COM3", "COM4", "COM5",
                               "COM6", "COM7", "COM8", "COM9", "LPT1", "LPT2", "LPT3", "LPT4", "LPT5",
                               "LPT6", "LPT7", "LPT8", "LPT9" };
      String fileNameUCStr = fileNameStr.toUpperCase();

      for (int k = 0; k < illegalNames.length; k++)
      {
         if ((fileNameStr.compareToIgnoreCase (illegalNames[k]) == 0)    ||
             (fileNameUCStr.startsWith  (illegalNames[k] + ".") == true) )
            fileNameStr = "";
      }



      // Replace possibly illegal chars:  European accented characters, etc.
      // TODO: there's probably many others ...  need to add them
      String [][] illegalChars =
         {
             {"á", "a"}
            ,{"å", "a"}
            ,{"ç", "c"}
            ,{"é", "e"}
            ,{"è", "e"}
            ,{"É", "E"}
            ,{"ñ", "n"}
            ,{"ò", "o"}
            ,{"ö", "o"}
            ,{"ø", "o"}
            ,{"&", "and"}
         };

      for (int k = 0; k < illegalChars.length; k++)
      {
         fileNameStr = fileNameStr.replace (illegalChars [k][0], illegalChars [k][1]);
      }



      // Filenames cannot end in a dot.
      if (fileNameStr.endsWith (".") == true)
         fileNameStr += "x";  // Cannot end with a dot, so append an "x" (or any other legal char).

      // Filename cannot end with space.  Best not to start with a space as well !

      return fileNameStr.trim();
   }



   // *********************************
   // Date/Time:
   // *********************************

   public static int getCurrentYear()
   {
      Date currentDateTime = new Date ();
      return Integer.parseInt (CENTURY_DATE_FORMAT.format (currentDateTime));
   }

   public static String getCurrentDateDDD_DD_MMM_YYYY()
   {
      Date currentDateTime = new Date ();
      return DDD_DDMMYYYY_DATE_FORMAT.format (currentDateTime);
   }

   public static String getCurrentDateYYYYMMDD_DATE_FORMAT()
   {
      Date currentDateTime = new Date ();
      return YYYYMMDD_DATE_FORMAT.format (currentDateTime);
   }

   public static int getCurrentDateYYYYMMDDAsInt()
   {
      String dateStr = getCurrentDateDDD_DD_MMM_YYYY();

      dateStr = dateStr.replace("/", "");
      dateStr = dateStr.replace("-", "");

      return Moose_Utils.strToInt (dateStr, 0);
   }

   public static String getCurrentDateYYYYMMDD_HHMMSS_FILENAME_SAFE_FORMAT()
   {
      Date currentDateTime = new Date ();
      return YYYYMMDD_HHMMSS_FILENAME_SAFE_FORMAT.format (currentDateTime);
   }

   // Example use:
   //   String dateTimeStr = Moose_Utils.getCurrentDateDDD_DDMMYYYY_HHMM_DATE_TIME_FORMAT();
   public static String getCurrentDateDDD_DDMMYYYY_HHMM_DATE_TIME_FORMAT()
   {
      Date currentDateTime = new Date ();
      return DDD_DDMMYYYY_HHMM_DATE_TIME_FORMAT.format (currentDateTime);
   }

   // Like above - but has seconds as well.
   // Example use:
   //   String dateTimeStr = Moose_Utils.getCurrentDateDDD_DDMMYYYY_HHMMSS_DATE_TIME_FORMAT();
   public static String getCurrentDateDDD_DDMMYYYY_HHMMSS_DATE_TIME_FORMAT()
   {
      Date currentDateTime = new Date ();
      return DDD_DDMMYYYY_HHMMSS_DATE_TIME_FORMAT.format (currentDateTime);
   }

   public static String getCurrentTimeAMPM()
   {
      Date currentDateTime = new Date ();
      return HHMMSSAMPM_TIME_FORMAT.format (currentDateTime);
   }

   // Example use:
   //   int day = Moose_Utils.getDayOfMonthOfDate (new Date() ); // 1..31
   public static int getDayOfMonthOfDate (Date inDateTime)
   {
      SimpleDateFormat dayFormat         = new SimpleDateFormat ("dd");

      return Moose_Utils.strToInt (dayFormat.format (inDateTime), 0);
   }

   // Example use:
   //   int day = Moose_Utils.getDayOfYearOfDate (new Date() ); // 1..365
   public static int getDayOfYearOfDate (Date inDateTime)
   {
      SimpleDateFormat dayFormat         = new SimpleDateFormat ("D");

      return Moose_Utils.strToInt (dayFormat.format (inDateTime), 0);
   }

   // Example use:
   //   int hour  = Moose_Utils.getHoursOfDate (new Date() );  // 0..23
   public static int getHoursOfDate (Date inDateTime)
   {
      SimpleDateFormat hoursFormat         = new SimpleDateFormat ("HH");

      return Moose_Utils.strToInt (hoursFormat.format (inDateTime), 0);
   }

   // Example use:
   //   int mins  = Moose_Utils.getMinsOfDate  (new Date() );  // 0..59
   public static int getMinsOfDate (Date inDateTime)
   {
      SimpleDateFormat minsFormat          = new SimpleDateFormat ("mm");

      return Moose_Utils.strToInt (minsFormat.format (inDateTime), 0);
   }

   // Example use:
   //   int sec   = Moose_Utils.getSecsOfDate  (new Date() );  // 0..59
   public static int getSecsOfDate (Date inDateTime)
   {
      SimpleDateFormat secsFormat         = new SimpleDateFormat ("ss");

      return Moose_Utils.strToInt (secsFormat.format (inDateTime), 0);
   }

   // Example use
   //   String dateTimeStr = Moose_Utils.getCurrentDateTime();
   //   dateTimeLabel.setText (Moose_Utils.getCurrentDateTime() );
   public static String getCurrentDateTime()
   {
      Date currentDateTime = new Date ();
      return getCurrentDateDDD_DD_MMM_YYYY() + " - " + getCurrentTimeAMPM();
   }

   public static boolean isDateValid_YYYY_MM_DD_Date (String InDateStr)
   {
      String yearStr, monthStr, dayStr;
      String OutDateStr = InDateStr;

      boolean isDateValid = true; // Attempt to prove this false.

      // Date must be in YYYY-MM-DD format.
      yearStr  = Moose_Utils.getItemFromDelimitedText (OutDateStr, "-", 1).trim();
      monthStr = Moose_Utils.getItemFromDelimitedText (OutDateStr, "-", 2).trim();
      dayStr   = Moose_Utils.getItemFromDelimitedText (OutDateStr, "-", 3).trim();

      if ((OutDateStr.length () == 0) ||
          (OutDateStr.compareToIgnoreCase ("NULL") == 0) ||
          (OutDateStr.length () < 10) ||
          (dayStr.length     () != 2) ||
          (monthStr.length   () != 2) ||
          (yearStr.length    () != 4))

      {
         isDateValid = false; // Date is NOT valid.
      }

      return isDateValid;
   }

   public static int getMonthNumberFromMonthName (String monthStr)
   {
      int monthNum = -1; // ERROR: No match found.

      monthStr = monthStr.trim();

      if (monthStr.length() > 3)
         monthStr = monthStr.substring (1, 3);

      if (monthStr.length() == 3)
      {
         for (int k = 0; k < MONTHS.length; k++)
         {
            if (monthStr.equalsIgnoreCase (MONTHS [k]) == true)
            {
               monthNum = k + 1; // Array starts at 0, so add 1.
            }
         }
      }

      return monthNum;
   }

   public static String getDateDDD_DD_MMM_YYYY (Date dateTime)
   {
      return DDD_DDMMYYYY_DATE_FORMAT.format (dateTime);
   }

   public static String getDateDDD_DD_MMM_YYYY_TimeAMPM ()
   {
      return getDateDDD_DD_MMM_YYYY_TimeAMPM (new Date () );
  }

   public static String getDateDDD_DD_MMM_YYYY_TimeAMPM (Date dateTime)
   {
      return DDD_DDMMYYYY_DATE_FORMAT.format (dateTime) + " @ " +
             HHMMAMPM_TIME_FORMAT.format     (dateTime);
   }

   public static String getDateDDD_DD_MMM_YYYY_HHMMSSAMPM (Date dateTime)
   {
      return DDD_DDMMYYYY_DATE_FORMAT.format (dateTime) + " @ " +
             HHMMSSAMPM_TIME_FORMAT.format   (dateTime);
   }


   public static String attemptToBuildValid_YYYY_MM_DD_Date (String InDateStr)
   {
      // Attempt to build valid YYYY-MM-DD date from a
      // date in any of these formars: DD/MM/YYYY, DD\MM\YYYY,
      // D/MM/YYYY, D\MM\YYYY, YYYY/MM/DD, YYYY/MM/D, etc
      // DD/MMM/YYYY, DD\MMM\YYYY,
      // D/MMM/YYYY, D\MMM\YYYY, YYYY/MMM/DD, YYYY/MMM/D,

      String yearStr, monthStr, dayStr;
      String OutDateStr = InDateStr;

      OutDateStr = OutDateStr.trim ();

      if (OutDateStr.compareToIgnoreCase ("NULL") == 0)
      {
         OutDateStr = "";
      }
      else
      {
         // Date must be in YYYY-MM-DD format.
         // The XML requires "-" date separator.
         OutDateStr = OutDateStr.replace ("\\", "-");
         OutDateStr = OutDateStr.replace ("/",  "-");

         // Remove any excess character: time, etc.
         // "1929-11-26 00:00:00" -> "1929-11-26".
         // 26-Mar-2018 is OK (11 chars).
         if (OutDateStr.length () > 11)
         {
            OutDateStr = OutDateStr.substring (0, 11);
            OutDateStr = OutDateStr.trim ();
         }

         // Date must be in YYYY-MM-DD format.
         yearStr  = Moose_Utils.getItemFromDelimitedText (OutDateStr, "-", 1).trim();
         monthStr = Moose_Utils.getItemFromDelimitedText (OutDateStr, "-", 2).trim();
         dayStr   = Moose_Utils.getItemFromDelimitedText (OutDateStr, "-", 3).trim();

         if ((yearStr.length() <= 2) && (dayStr.length() == 4))
         {
            // Date is in DD-MM-YYYY format ....
            // Swap the Year and the Day around.
            String tempStr = yearStr;
            yearStr        = dayStr;
            dayStr         = tempStr;
         }

         if (dayStr.length() == 1)
         {
            dayStr = "0" + dayStr; // Add leading zero.
         }

         if (monthStr.length() >= 3) // Apr -> 04
         {
            monthStr = "" + getMonthNumberFromMonthName (monthStr);
         }

         if (monthStr.length() == 1)
         {
            monthStr = "0" + monthStr; // Add leading zero.
         }

         // Reconstruct Date for final verification ... (reconstruct just in case we added leading 0 or something above).
         OutDateStr = yearStr + "-" + monthStr + "-" + dayStr;
      }

      return OutDateStr;
   }

   public static String attemptToBuildValid_DD_MM_YYYY_Date (String InDateStr, String delimStr)
   {
      // NOTE: This will NOT work for MM*DD*YYYY dates.
      //
      // Attempt to build valid YYYY*MM*DD format (where * = delimStr)
      // (DD-MM-YYYY or DD/MM/YYYY date or whatever -
      // depends on delimStr)
      // from a date in any of these formars: DD/MM/YYYY, DD\MM\YYYY,
      // D/MM/YYYY, D\MM\YYYY, YYYY/MM/DD, YYYY/MM/D,
      // DD/MMM/YYYY, DD\MMM\YYYY,
      // D/MMM/YYYY, D\MMM\YYYY, YYYY/MMM/DD, YYYY/MMM/D,
      // or any of these with / replaced with -, etc.

      String yearStr, monthStr, dayStr;
      String OutDateStr = InDateStr;

      OutDateStr = OutDateStr.trim ();

      if (OutDateStr.compareToIgnoreCase ("NULL") == 0)
      {
         OutDateStr = "";
      }
      else
      {
         OutDateStr = OutDateStr.replace ("\\", delimStr);
         OutDateStr = OutDateStr.replace ("/",  delimStr);
         OutDateStr = OutDateStr.replace ("-",  delimStr);

         // Remove any excess character: time, etc.
         // "1929-11-26 00:00:00" -> "1929-11-26".
         // 26-Mar-2018 is OK (11 chars).
         if (OutDateStr.length () > 11)
         {
            OutDateStr = OutDateStr.substring (0, 11);
            OutDateStr = OutDateStr.trim ();
         }

         // Try and putt the parts pf the date string apart
         // and identify which is the year, month, and day.
         yearStr  = Moose_Utils.getItemFromDelimitedText (OutDateStr, delimStr, 1).trim();
         monthStr = Moose_Utils.getItemFromDelimitedText (OutDateStr, delimStr, 2).trim();
         dayStr   = Moose_Utils.getItemFromDelimitedText (OutDateStr, delimStr, 3).trim();

         if ((yearStr.length() <= 2) && (dayStr.length() == 4))
         {
            // Input Date is in DD*MM*YYYY format ....
            // Swap the Year and the Day around.
            String tempStr = yearStr;
            yearStr        = dayStr;
            dayStr         = tempStr;
         }

         if (dayStr.length() == 1)
         {
            dayStr = "0" + dayStr; // Add leading zero.
         }

         if (monthStr.length() >= 3) // Apr -> 04
         {
            monthStr = "" + getMonthNumberFromMonthName (monthStr);
         }
         if (monthStr.length() == 1)
         {
            monthStr = "0" + monthStr; // Add leading zero.
         }

         // Output Date will be in YYYY*MM*DD format (where * = delimStr).
         // Reconstruct Date for final verification ...
         // (reconstruct just in case we added leading 0 or something above).
         OutDateStr = dayStr + delimStr + monthStr + delimStr + yearStr;

         if (OutDateStr.length () < 8) // The bare minimum length, if NO delimiter: YYYYMMDD
            OutDateStr = "";
      }

      return OutDateStr;
   }

   // No Delimited supplied - assume "-".
   public static String attemptToBuildValid_DD_MM_YYYY_Date (String InDateStr)
   {
      return attemptToBuildValid_DD_MM_YYYY_Date (InDateStr, "-");
   }

   // Get Date from String
   // StrToDate, StringToDate
   // Example use:
   //    Date dateOfBirth = Moose_Utils.toDate ("4/10/1950", "dd/MM/yyyy");
   //    Date date        = Moose_Utils.toDate ("Mon, 29-Jul-2019", "EEE, dd-MMM-yyyy");
   //
   // Some sample formats:  NOTE: These are CASE Sensitive !!!!!
   //    "dd/MM/yyyy"    "dd-MM-yyyy"   "yyyy-MM-dd hh:mm:ss a"
   //    "yyyy-MM-dd"
   //    "EEE, dd-MMM-yyyy"
   // "YYYY-MM-DD" - does NOT work - these are CASE Sensitive !!!!!
   public static Date toDate (String dateStr, String dateFormatStr)
   {
      SimpleDateFormat dateFormat = new SimpleDateFormat(dateFormatStr);
      Date   date= null;

      if ((dateStr       != null) && (dateStr.length()       > 1) &&
          (dateFormatStr != null) && (dateFormatStr.length() > 1) )
      {
         dateStr       = dateStr.trim();
         dateFormatStr = dateFormatStr.trim();

         //  Make sure dateStr is the same length as the dateFormatStr
         if (dateStr.length() > dateFormatStr.length() )
         {
            dateStr = dateStr.substring (0, dateFormatStr.length() );
         }

         try
         {
            date = new Date ();
            date = dateFormat.parse (dateStr);
         }
         catch (IllegalArgumentException | ParseException err)
         {
            System.out.println ("toDate(): Error: '" + dateStr +
                 "' is not a valid '" + dateFormatStr + "' date.");
            date = null;
         }
      }

      return date;
   }


   //-----------------------------------------------------------
   // Recommend using: DateLocalDateUtils.java
   //-----------------------------------------------------------


   // DateToStr
   // Example use:
   //    Date today = new Date ();
   //    String dateStr = Moose_Utils.dateToFormattedDateString (today, "dd/MM/yyyy");
   // Some sample formats:
   //    "dd/MM/yyyy"    "dd-MM-yyyy"   "yyyy-MM-dd'T'HH:mm:ss.S";
   public static String dateToFormattedDateString (Date date, String dateFormatStr)
   {
      SimpleDateFormat dateFormat = new SimpleDateFormat(dateFormatStr);
      return dateFormat.format (date);
   }

   // Get Age in YEARS between 2 dates.
   /*
      ERROR: Make sure the date format is correct - it is case sensitive !!!

      Date date1 = Moose_Utils.toDate ("2018-08-11", "yyyy-MM-dd");
      Date date2 = Moose_Utils.toDate ("2018-08-22", "yyyy-MM-dd"");
      System.out.println ("DateDiff 1: " + (Moose_Utils.dateDiffYears (date1, date2) * 365.0) + " days");
   */
   public static double dateDiffYears (Date startDate, Date endDate)
   {
      double yearsBetween = 0.0;

      if ((startDate != null) && (endDate != null))
      {
         long timeBetween    = endDate.getTime() - startDate.getTime();
         yearsBetween        = timeBetween / MILLISECONDS_IN_YEAR;  // Leap Years, Quarter Day.
         //int age = (int) Math.floor(yearsBetween);
      }

      return yearsBetween;
   }

   public static double getYearsBetween2Dates (Date startDate, Date endDate)
   {
      return dateDiffYears (startDate, endDate);
   }

   public static double getDaysBetween2Dates (Date startDate, Date endDate)
   {
      return dateDiffYears (startDate, endDate) * DAYS_IN_YEAR;
   }


   /*
   public static double dateDiffYears2 (Date startDate, Date endDate)
   {
      return DateLocalDateUtils.getYearsBetween2Dates (startDate, endDate);
   }
   */

   // Get Age in YEARS between a date and current system date.
   // Example use:
   //    System.out.println (getAge (dateOfBirth));
   public static double getAge (Date startDate)
   {
      return dateDiffYears (startDate, new Date () );
   }

   // Get Age in YEARS between a date and a particular reference date.
   // Example use:
   //    System.out.println (getAge (dateOfBirth, newYears2017));
   public static double getAge (Date startDate, Date referenceDate)
   {
      return dateDiffYears (startDate, referenceDate);
   }


   // Example use:
   // String dateStr = Moose_Utils.getRandomDateStrDDMMMYYYY ("-", 1950, 1980);
   // String dateStr = Moose_Utils.getRandomDateStrDDMMMYYYY ("-", Moose_Utils.getCurrentYear() - 30, Moose_Utils.getCurrentYear() - 85);
   public static String getRandomDateStrDDMMMYYYY (String delimiterStr, int fromYear, int toYear)
   {
      // Get random month:
      int monthIndex = Moose_Utils.getRandomIntBetween2Integers (0, MONTHS.length);

      // Get random year in the desired range:
      int year       = Moose_Utils.getRandomIntBetween2Integers (fromYear, toYear);

      // Get random number of days between 1 and the maximum number of days
      // in the month selected above.
      int days       = Moose_Utils.getRandomIntBetween2Integers (1, DAYS [monthIndex]);

      if (delimiterStr.length() == 0)
         delimiterStr = "-";

      return days                 + delimiterStr +
             MONTHS [monthIndex]  + delimiterStr +
             year;
   }



   // *********************************
   // Number Utils:
   // *********************************

   // Get random double: 0 <= rand < 1.0
   // Example use:
   //    double rand = Moose_Utils.getRandomDouble ();   // 0 <= rand < 1.0
   public static double getRandomDouble ()
   {
      return generator.nextDouble();  // 0 <= rand < 1.0
   }

   // Get random double: smallDouble <= rand < bigDouble
   // Example use:
   //    double rand = Moose_Utils.getRandomDouble (0.0, 1.0);   //    0 <= rand < 1.0
   //    double rand = Moose_Utils.getRandomDouble (-2.5, 3.5);  // -2.5 <= rand < 3.5
   public static double getRandomDouble (double smallDouble, double bigDouble)
   {
      return smallDouble + (generator.nextDouble() * (bigDouble - smallDouble)); // smallDouble <= rand < bigDouble
   }

   // Get random number between smallInt and bigInt inclusive.
   // Example use:
   //    int randomNum = Moose_Utils.getRandomIntBetween2Integers (1, 5); // Return 1 to 5 inclusive.
   public static int getRandomIntBetween2Integers (int smallInt, int bigInt)
   {
      //return (int) ((Math.random() * (bigInt - smallInt + 1)) + smallInt);
      int rand = 0;

      if (bigInt - smallInt + 1 > 0)
         rand = generator.nextInt (bigInt - smallInt + 1) + smallInt;

      return rand;
   }

   // Example use:
   //    System.out.println (Moose_Utils.roundToNDecimalPlaces (4.5 / 11, 2)); // 0.41 = correct.
   public static double roundToNDecimalPlaces (double value, int numDecimals)
   {
      double result = value;

      // e.g. to round to the nearest cent:
      // Math.round (4.5 / 11 * 100.0) / 100.0); // 0.41 = correct.

      if (numDecimals >= 0)
      {
         double divisor = Math.pow (10.0, numDecimals);

         result = Math.round (value * divisor) / divisor;
      }

      return result;
   }

   // Example use:
   //    boolean same = Moose_Utils.isDoubleEqualToDoubleWithinGivenTolerance (4.5, 4.5000001, 0.0001); // True
   public static boolean isDoubleEqualToDoubleWithinGivenTolerance (double value1, double value2, double tolerance)
   {
      boolean result = false;

      if (Math.abs (value1 - value2) <= tolerance)
         result = true;

      return result;
   }


   // Example use:
   //  if (Moose_Utils.isIntegerInArray (5, arr) == true) ....
   public static boolean isIntegerInArray (int number, int[] array)
   {
      boolean result = false; // Not found.

      if ((array != null) && (array.length > 0))
      {
         for (int k = 0; k < array.length; k++)
         {
            if (number == array [k])
            {
               result = true;         // Number found in array.
               k      = array.length; // Exit Loop
            }
         }
      }

      return result;
   }

   public static void randomiseArray (int[] array, int passes)
   {
      int randomLocn1 = 0;
      int randomLocn2 = 0;

      for (int p = 0; p < passes * array.length; p++)
      {
         randomLocn1 = Moose_Utils.getRandomIntBetween2Integers (0, array.length - 1);
         randomLocn2 = Moose_Utils.getRandomIntBetween2Integers (0, array.length - 1);

         int temp            = array [randomLocn1];
         array [randomLocn1] = array [randomLocn2];
         array [randomLocn2] = temp;
      }
   } // public static void randomiseArray (int[] array, int passes)

   public static double getMinValueIn1DArray (double[] points)
   {
      double min   = 0.0;

      if ((points != null) && (points.length > 0) )
      {
         min = points[0];

         for (int x = 1; x < points.length; x++)
         {
            if (min > points[x])
               min = points[x]; // We have a new min value.
         }
      }

      return min;
   }

   public static double getMaxValueIn1DArray (double[] points)
   {
      double max   = 0.0;

      if ((points != null) && (points.length > 0) )
      {
         max = points[0];

         for (int x = 1; x < points.length; x++)
         {
            if (max < points[x])
               max = points[x];  // We have a new max value.
         }
      }

      return max;
   }



   // *********************************
   // String To Number Conversions:
   // *********************************

   // Example use:
   //   boolean valid = Moose_Utils.isStringValidDouble ("$1,234.56", true); // True
   public static boolean isStringValidDouble (String sourceStr, boolean allowDollarSignsCommasSpaces)
   {
      boolean result = true; // All OK.

      // Remove common symbols that cause problems with the conversion:
      if (allowDollarSignsCommasSpaces == true)
      {
         sourceStr = sourceStr.replace ("$",  "");
         sourceStr = sourceStr.replace (",",  "");
         sourceStr = sourceStr.replace (" ",  "");
      }

      try
      {
         double val = Double.parseDouble (sourceStr.trim());
      }
      catch (NumberFormatException err)
      {
         result = false; // Error.
      }

      return result;
   }

   // Example use:
   //   double val = Moose_Utils.strToDouble ("$1,234.56", 0);
   public static double strToDouble (String sourceStr, double errorReturnVal)
   { // errorReturnVal will be returned of the conversion fails / errors.
      double resultVal = errorReturnVal;

      if ((sourceStr != null) && (sourceStr.length() > 0) )
      {
         // Remove common symbols that cause problems with the conversion:
         sourceStr = sourceStr.replace ("$",  "");
         sourceStr = sourceStr.replace (",",  "");
         sourceStr = sourceStr.replace (" ",  "");

         try
         {
            resultVal = Double.parseDouble (sourceStr.trim());
         }
         catch (NumberFormatException err)
         {
            resultVal = errorReturnVal;
         }
      }

      return resultVal;  // Return errorReturnVal if error or not found.
   }

   // Example use:
   //   int k = Moose_Utils.strToInt ("1234", -1);
   public static int strToInt (String sourceStr, int errorReturnVal)
   { // errorReturnVal will be returned of the conversion fails / errors.

       // This has 2 big advantages over the commented out code below:
       // (1). saves duplication what is essentially the same code.
       // (2). It works for numbers in Scientific Format. eg. 4.343E3

       int resultVal = (int) strToDouble (sourceStr, errorReturnVal);


       /*
       // Does NOT work for numbers in Scientific Format. eg. 4.343E3
       int resultVal = 0;

       try
       {
          resultVal = Integer.parseInt (sourceStr.trim());
       }
       catch (NumberFormatException err)
       {
          resultVal = errorReturnVal;
       }
       */

       return resultVal;  // // Return errorReturnVal if error or not found.
   }

   // Convert String to float and Round the float and convert to Int:
   public static int strToDoubleToRoundedInt (String valStr)
   {
      double valD = Moose_Utils.strToDouble (valStr, 0.0);

      int    valI = (int) Math.round (valD);

      return valI;
   }


   // *********************************
   // String Utils / String utilities
   // *********************************
/*
Other useful built-in functions:
replace(CharSequence target, CharSequence replacement)
*/


   // So many possible combinations and permutations here, I'm only going to support the base case:
   // * if the first character is alphabetic (A-Z,a-z), change it to Uppercase and leave the rest as is.
   // * Otherwise, find the first alphabetic (A-Z,a-z) with a space before it, change it to Uppercase and leave the rest as is.
   // e.g.
   //  String str1 = Moose_Utils.toTitleCase ("moose");             // returns "Moose".
   //  String str2 = Moose_Utils.toTitleCase ("moose. loves java"); // returns "Moose. loves java".
   //  String str3 = Moose_Utils.toTitleCase ("  moose");           // returns "  Moose".
   public static String toTitleCase (String inStr)
   {
      if (inStr == null)
         return null;

      StringBuffer outSB    = new StringBuffer();
      char priorChar        = ' ';
      char currentChar      = ' ';
      boolean titleCaseDone = false;

      for (int k = 0; k < inStr.length(); k++)
      {
         currentChar = inStr.charAt (k);

         if ((titleCaseDone == false) && (k == 0) && (Character.isAlphabetic(currentChar) == true) )
         {
            outSB.append (Character.toUpperCase (currentChar) );
            titleCaseDone = true; // No more letters to change to title case.
         }

         else if ((titleCaseDone == false) && (k > 0) && (priorChar == ' ') && (Character.isAlphabetic(currentChar) == true) )
         {
            outSB.append (Character.toUpperCase (currentChar) );
            titleCaseDone = true; // No more letters to change to title case.
         }

         else
         {
            outSB.append (currentChar);
         }

         priorChar = currentChar;
      }

      return outSB.toString();
   }


   // REF: https://stackoverflow.com/questions/3805601/whats-the-quickest-way-to-compare-strings-in-java
   public static boolean equals(final String s1, final String s2)
   {
      return ((s1 != null) &&
              (s2 != null) &&
              (s1.hashCode() == s2.hashCode()) &&
              (s1.equals(s2) == true) );
   }

   public static boolean equalsIgnoreCase(final String s1, final String s2)
   {
      return ((s1 != null) &&
              (s2 != null) &&
              //(s1.hashCode() == s2.hashCode()) &&
              (s1.equalsIgnoreCase(s2) == true) );
   }


/*
NOTE:
NOTE:
NOTE:
NOTE:
NOTE: I need to re-write much of the code below.

Because tokens are seriously broken in Java:

This is NOT reliable and does NOT work for MANY delimiters:

   String[] tokens = sourceStr.split(delimiter);

*/
   // Warning: string.split has MAJOR issues
   // with "." and other Regex / reserved chars and
   // if delimiters are contained within a field.
   // eg. 123,abcd,"Hi Moose, how are you ??"
   // string.split (",") will split this into 4 fields when there is only 3.

   public static String getRepeatedText (String basicStr, int repeatCount)
   {
      StringBuilder outSB = new StringBuilder ();

      for (int k = 0; k < repeatCount; k++)
      {
         outSB.append (basicStr);
      }

      return outSB.toString();
   }

   public static String getRepeatedText (int repeatCount)
   {
      return getRepeatedText (Moose_Utils.LAYS_OF_ANCIENT_ROME_HORATIUS,
                              repeatCount);
   }



   // Example use:
   //   System.out.println (Moose_Utils.getTextBetweenDelimiters ("<delim>abcdefg</delim><AddressLine1>347-351 Dean Street</AddressLine1>112121212",
   //                                                             "<AddressLine1>", "</AddressLine1>"));
   // returns:  347-351 Dean Street
   //
   //   System.out.println (Moose_Utils.getTextBetweenDelimiters ("<fileHeader agencyID=\"30688\" dataCollectionID=\"2016/1\"",
   //                                                             "\"", "\""));
   // returns:  3068
   // \" is how you specify " within quotes.
   public static String getTextBetweenDelimiters (String sourceStr, String startDelimiterStr, String endDelimiterStr)
   {
       int startInd = startDelimiterStr.length () + sourceStr.indexOf (startDelimiterStr);
       int endInd   = sourceStr.indexOf (endDelimiterStr, startInd + 1);

       if (startInd > endInd)
          endInd = sourceStr.length(); // return from start onwards.

       return  sourceStr.substring (startInd, endInd);
   }

   // String currLine = "<fileHeader agencyID=\"30688\" dataCollectionID=\"2016/1\" transmissionNum=\"27\" exportFilePortion=\"1\" fileSegmentNum=\"1\" clientRecordsCount=\"4\" rowId=\"1\" />";
   // System.out.println (Moose_Utils.getAllTextBetweenDelimiters (currLine, "\"", "\"", ","));
   // Returns: 30688,2016/1,27,1,1,4,1,
   // \" is how you specify " within quotes.
   public static String getAllTextBetweenDelimiters (String sourceStr, String startDelimiterStr, String endDelimiterStr, String outputDelimiter)
   {
       String outStr = "";
       String nextItem = "";
       int startInd = 0;
       int endInd   = 0;
       boolean moreData = true;

      //String[] tokens = currLine.split("\"");
      //System.out.printf("Number of elements: %d\nThe tokens are:\n", tokens.length);

      //outLine = outLine + "FILEHEADER: tokens = " + tokens.length + "\n";

      //for (String token : tokens)
      //   outLine = outLine + token + ",";

      while (moreData == true)
      {
          //System.out.println ("sourceStr.length():    " + sourceStr.length() +
          //     ", sourceStr.indexOf (startDelimiterStr): " + sourceStr.indexOf (startDelimiterStr) +
          //     ", sourceStr.indexOf (endDelimiterStr): "   + sourceStr.indexOf (endDelimiterStr));

          if ((sourceStr.length()                    == 0) ||
              (sourceStr.indexOf (startDelimiterStr) <= 0) ||
              (sourceStr.indexOf (endDelimiterStr)   <= 0))
          {
             moreData = false;
          }
         else
         {
             startInd = startDelimiterStr.length () + sourceStr.indexOf (startDelimiterStr);
             endInd   = sourceStr.indexOf (endDelimiterStr, startInd + 1);
             if (startInd > endInd)
                endInd = sourceStr.length(); // return from start onwards.

             nextItem = sourceStr.substring (startInd, endInd);

             outStr = outStr + nextItem + outputDelimiter;

             //System.out.println ("endInd:    " + endInd + ", sourceStr.length(): " + sourceStr.length());
             sourceStr = sourceStr.substring (endInd + 1, sourceStr.length());  // remove processed part of string.

             //System.out.println ("Remaining: " + sourceStr);
             //System.out.println ("outStr:    " + outStr);
             //System.out.println ("moreData:  " + moreData);
             //System.out.println ();
         }
      }

      return outStr;
   }

   public static String deleteTextBetweenDelimiters (String sourceStr, String startDelimiterStr, String endDelimiterStr)
   { // Returns the source string with everything between the delimiters removed.
     // Only the 1st delimiter item is removed.  If there are many, call this method multiple times.
      String outStr   = "";
      String nextItem = "";
      int startInd    = 0;
      int endInd      = 0;

      startInd = sourceStr.toUpperCase ().indexOf (startDelimiterStr.toUpperCase ());

      endInd   = sourceStr.toUpperCase ().indexOf (endDelimiterStr.toUpperCase (), startInd);

      //System.out.println ("startInd:    " + startInd + ", endInd: " + endInd);

      if ((sourceStr.length() == 0) || (startInd < 0) || (endInd   < 0))
      {
         // Error, nothing to process ....
         //System.out.println (" - Error, nothing to process ....");
         outStr = sourceStr; // Return the original source string.
      }
      else
      {
         //System.out.println (" - " + sourceStr.substring (0,      startInd));
         //System.out.println (" - " + sourceStr.substring (endInd + 1, sourceStr.length()));

         outStr = sourceStr.substring (0,      startInd) +
                  sourceStr.substring (endInd + 1, sourceStr.length());
      }

      return outStr;
   }


   // String delimLine = "30688,2016/1,27,1,1,4,1,";
   // System.out.println (Moose_Utils.removeItemFromDelimitedText (delimLine, ",", 3)); // Remove 3rd item
   // Returns: 30688,2016/1,1,1,4,1,
   // System.out.println (Moose_Utils.removeItemFromDelimitedText (delimLine, ",", 1)); // Remove 1st item
   // Returns: 2016/1,27,1,1,4,1,
   // \" is how you specify " within quotes.
   public static String removeItemFromDelimitedText (String sourceStr, String delimiter, int itemNumberToDelete)
   {
      String outStr = "";
      String[] tokens = sourceStr.split(delimiter);

      for (int k = 0; k < tokens.length; k++)
      {
        if (itemNumberToDelete != k + 1)
           outStr = outStr + tokens [k] + delimiter;
      }

      return outStr;
   }


   // Warning: string.split has MAJOR issues
   // with "." and other Regex / reserved chars and
   // if delimiters are contained within a field.
   // eg. 123,abcd,"Hi Moose, how are you ??"
   // string.split (",") will split this into 4 fields when there is only 3.
   public static String getItemFromDelimitedText (String sourceStr, String delimiter, int itemNumberToGet)
   {
      String outStr   = "";
      String[] tokens = sourceStr.split(delimiter);

      if (delimiter.compareTo(".") == 0)
      {
         outStr = "getItemFromDelimitedText (): ERROR: does not work with '.'.";
      }
      //System.out.println ("tokens.length = " + tokens.length);
      //System.out.println ("sourceStr.indexOf (delimiter) = " + sourceStr.indexOf (delimiter));
      //System.out.println ("sourceStr = " + sourceStr);

      if (sourceStr.indexOf (delimiter) < 0)
      {
         // There are NO delimiters in the text, so just return the original sourceStr.
         outStr = sourceStr;
      }
      else
      {
         for (int k = 0; k < tokens.length; k++)
         {
            //System.out.println (tokens [k]);
            if (itemNumberToGet == k + 1)
               outStr = tokens [k];
         }
      }

      return outStr;
   }

   public static int getIntegerItemFromDelimitedText (String sourceStr, String delimiter, int itemNumberToGet)
   {
      String outStr = getItemFromDelimitedText (sourceStr, delimiter, itemNumberToGet);

      return strToInt (outStr, 0); // Return 0 if error or not found.
   }

   // Warning: string.split has MAJOR issues
   // with "." and other Regex / reserved chars and
   // if delimiters are contained within a field.
   // eg. 123,abcd,"Hi Moose, how are you ??"
   // string.split (",") will split this into 4 fields when there is only 3.
   public static String setItemInDelimitedText (String sourceStr, String delimiter, int itemToUpdateNumber, String newItemValueStr)
   {
      String outStr = "";
      String[] tokens = sourceStr.split(delimiter);
      //System.out.println (tokens.length);

      if (itemToUpdateNumber <= tokens.length)
      {
         for (int k = 0; k < tokens.length; k++)
         {
           if (itemToUpdateNumber == k + 1)
              outStr = outStr + newItemValueStr + delimiter;
           else
              outStr = outStr + tokens [k] + delimiter;
         }
      }
      else
      {
         // Handle the case where user wants to update 15th item and we obnly have 4.
         // Insert the missing items and the required value.

         outStr = sourceStr;
         for (int k = tokens.length; k < itemToUpdateNumber; k++)
         {
           if (itemToUpdateNumber == k + 1)
              outStr = outStr + newItemValueStr + delimiter;
           else
              outStr = outStr + delimiter;
         }
      }

      return outStr;
   }


   // String delimLine = "30688,2016/1,27,1,1,4,1,";
   // System.out.println (Moose_Utils.getNumberofItemStrFromDelimitedText (delimLine, ",", "27")); // Return 3 = 3rd item.
   public static int getNumberofItemStrFromDelimitedText (String sourceStr, String delimiter, String itemToFindStr)
   {
       String outStr = "";
       int startInd = 0;
       int endInd   = 0;
       int foundLocn = -1;
       boolean moreData = true;

      String[] tokens = sourceStr.split(delimiter);
      //outLine = outLine + "FILEHEADER: tokens = " + tokens.length + "\n";

      //for (String token : tokens)
      for (int k = 0; k < tokens.length; k++)
      {
        if (itemToFindStr.compareTo (tokens [k]) == 0)
           foundLocn = k + 1; // 1 = 1st item, 2 = 2nd item, etc.
     }

      return foundLocn;
   }

   // String delimLine = "30688,2016/1,27,1,1,4,1,";
   // System.out.println (Moose_Utils.getItemByNumberFromDelimitedText (delimLine, ",", 3)); // Return 3rd item: "27".
   public static String getItemByNumberFromDelimitedText (String sourceStr, String delimiter, int itemNumberToFind)
   {
       String outStr = "";
       int startInd = 0;
       int endInd   = 0;
       boolean moreData = true;

      String[] tokens = sourceStr.split(delimiter);
      //outLine = outLine + "FILEHEADER: tokens = " + tokens.length + "\n";

      if (itemNumberToFind < tokens.length)
         outStr = tokens [itemNumberToFind - 1];

      return outStr;
   }


   public static String insertBlankItems (String sourceStr, String delimiter, int startIndex, int numToInsert)
   {
      String outStr = "";

      String[] tokens = sourceStr.split(delimiter);
      //outLine = outLine + "FILEHEADER: tokens = " + tokens.length + "\n";

      //for (String token : tokens)
      for (int k = 0; k < tokens.length; k++)
      {
        outStr = outStr + tokens [k] + delimiter;

        if (startIndex == k + 1)
        {
           for (int m = 0; m < numToInsert; m++)
           {
              outStr = outStr + delimiter;
           }
        }
     }

      return outStr;
   }

   public static int countDelimiters (String sourceStr, String delimiter)
   {
      // Handle blank strings and strings that do NOT contain any of the delimiter.
      int result = 0;

      if ((sourceStr.trim().length() > 0) && (sourceStr.indexOf (delimiter) >= 0) )
      {
         String[] tokens = sourceStr.split(delimiter);
         result =  tokens.length;
      }

      return result;
   }


   // Example use:
   //   String str1 = Moose_Utils.getFieldValueFromXML (currLine, "<fileHeader", "/>", "dataCollectionID", "\"", "");
   //   String str2 = Moose_Utils.getFieldValueFromXML (currLine, "<carerDetails", "</carerDetails>", "birthCountry",          "\"", "");
   //
   //<fileHeader agencyID="30688" dataCollectionID="2016/1" transmissionNum="27" exportFilePortion="1" fileSegmentNum="1" clientRecordsCount="4" rowId="1"
   //<clientDetails><clientRecord lettersOfName="utaat" birthDate="28/05/1964" />  <carerDetails lettersOfName="hehnn" birthDate="14/12/1969" /></clientDetails>
   public static String getFieldValueFromXML (String sourceStr, String sectionStartStr, String sectionEndStr, String fieldName, String delimiter, String defaultValue)
   {
      String fieldValueStr = defaultValue;

      int sectionStartLocn = sourceStr.indexOf (sectionStartStr, 0);
      int sectionEndLocn   = sourceStr.indexOf (sectionEndStr,   sectionStartLocn + sectionStartStr.length());

      System.out.println ("*** getFieldValueFromXML: sectionStartLocn: " + sectionStartLocn + "    sectionEndLocn: " + sectionEndLocn);

      // Is the required section in the XML ?
      if ((sectionStartLocn >= 0) && (sectionEndLocn >= 0))
      {
         sourceStr = sourceStr.substring (sectionStartLocn + sectionStartStr.length(), sectionEndLocn);

         System.out.println ("*** getFieldValueFromXML: sourceStr: " + sourceStr);

         int fieldLocn = sourceStr.indexOf (fieldName, 0);

         System.out.println ("*** getFieldValueFromXML: fieldLocn: " + fieldLocn);

         // Is the fieldName in the XML ?
         if (fieldLocn >= 0)
         {
            // Extract the fieldValue data.
            int startFieldValue = sourceStr.indexOf (delimiter, fieldLocn       + delimiter.length());
            int endFieldValue   = sourceStr.indexOf (delimiter, startFieldValue + delimiter.length());

            System.out.println ("*** getFieldValueFromXML: startFieldValue: " + startFieldValue + "    endFieldValue: " + endFieldValue );

            if ((startFieldValue >= 0) && (endFieldValue >= 0))
            {
               fieldValueStr = sourceStr.substring (startFieldValue + delimiter.length(), endFieldValue);
            }
         }
      }

      return fieldValueStr;
   }

   // Example use:
   //  String str = Moose_Utils.getFieldValueBetweenXMLTags ("<FileType>Microsoft Excel sheet</FileType>", "<FileType>", "</FileType>", "blank")

   public static String getFieldValueBetweenXMLTags (String sourceStr, String sectionStartStr, String sectionEndStr, String defaultValue)
   {
      String resultStr = defaultValue;

      int sectionStartLocn = sourceStr.indexOf (sectionStartStr, 0);
      int sectionEndLocn   = sourceStr.indexOf (sectionEndStr,   sectionStartLocn + sectionStartStr.length());

      // No ending tag ?  Get everything until the end of the string.
      if (sectionEndLocn < 0)
         sectionEndLocn = sourceStr.length();

      //System.out.println ("*** getFieldValueFromXML: sectionStartLocn: " + sectionStartLocn + "    sectionEndLocn: " + sectionEndLocn);

      // Is the required section in the XML ?
      if ((sectionStartLocn >= 0) && (sectionEndLocn >= 0))
      {
         resultStr = sourceStr.substring (sectionStartLocn + sectionStartStr.length(), sectionEndLocn);

         //System.out.println ("*** getFieldValueFromXML: sourceStr: " + sourceStr);
      }

      return resultStr;
   }

   public static String getAllNumericDigitsFromStrAsString (String sourceStr)
   {
       String digitsFromStr = "";

       for (int k = 0; k < sourceStr.length(); k++)
       {
          if (Character.isDigit (sourceStr.charAt (k)) == true)
          {
             digitsFromStr = digitsFromStr + sourceStr.charAt (k);
          }
       }
       return digitsFromStr;
   }

   // $123,456/78  => 12345678
   // $123,456.78  => 123456.78
   // $123.456.78  => 123.45678   // Ignores all decimal places after 1st decimal place.
   public static String getAllNumericDigitsAndDecimalPointFromStrAsString (String sourceStr)
   {
       String digitsFromStr = "";
       int countDecimalPoints = 0;

       for (int k = 0; k < sourceStr.length(); k++)
       {
          if (sourceStr.charAt (k) == '.')
          {
             countDecimalPoints++;
          }

          // If char is a digit or the first decimal point.
          if ((Character.isDigit (sourceStr.charAt (k)) == true) ||
              ((sourceStr.charAt (k) == '.') && (countDecimalPoints == 1)) )
          {
             digitsFromStr = digitsFromStr + sourceStr.charAt (k);
          }
       }

       //System.out.println (digitsFromStr);

       return digitsFromStr;
   }

   public static int countAllNumericDigitsFromStr (String sourceStr)
   {
       String digitsFromStr = getAllNumericDigitsFromStrAsString (sourceStr);

       return digitsFromStr.length();
   }

   public static double getAllNumericDigitsFromStrAsDouble (String sourceStr)
   {
       // Return 0.0 if error or not found.
       return strToDouble (getAllNumericDigitsAndDecimalPointFromStrAsString (sourceStr), 0.0);
   }

   public static int getAllNumericDigitsFromStrAsInt (String sourceStr)
   {
       // Return 0 if error or not found.
       return strToInt (getAllNumericDigitsFromStrAsString (sourceStr), 0);
   }

   public static boolean strToBoolean (String sourceStr)
   {
      return sourceStr.toLowerCase().equalsIgnoreCase("true");
   }

   public static boolean isAlphabeticAZaz (char inChar)
   {
      boolean result = false; // Error: not an alphabetic letter: A-Z, a-z.

      // Cannot use isAlphabetic() - it treats numbers
      // as alphabetic characters !  Stupid Java !!
      if (((inChar >= 'a') && (inChar <= 'z')) ||
          ((inChar >= 'A') && (inChar <= 'Z')))
      {
          result = true; // Yes, it is an alphabetic letter: A-Z, a-z.
      }

      return result;
   }

   public static String getAlphabeticCharsFromString (String inStr)
   {
      String outStr = "";

      for (int k = 0; k < inStr.length(); k++)
      {
         // Cannot use isAlphabetic() - it treats numbers as alphabetic characters !
         if (Moose_Utils.isAlphabeticAZaz (inStr.charAt (k)) == true)
         {
            outStr = outStr + inStr.charAt (k);
         }
      }
      return outStr;
   }

   // Moose_Utils.containsIgnoreCase ("maL", "O'Malley")
   //    returns true
   // Related: indexOfIgnoreCase (might also be needed) ....
   public static boolean containsIgnoreCase (String searchStr, String sourceStr)
   {
      boolean result = false;

      if (sourceStr.toUpperCase ().contains (searchStr.toUpperCase ()) == true)
      {
         result = true;
      }
      return result;
   }

   // Moose_Utils.startsWithIgnoreCase ("maL", "Malley")
   //    returns true
   public static boolean startsWithIgnoreCase (String searchStr, String sourceStr)
   {
      boolean result = false;

      if (sourceStr.toUpperCase ().startsWith (searchStr.toUpperCase ()) == true)
      {
         result = true;
      }
      return result;
   }

   // Moose_Utils.endsWithIgnoreCase ("LEY", "Malley")
   //    returns true
   public static boolean endsWithIgnoreCase (String searchStr, String sourceStr)
   {
      boolean result = false;

      if (sourceStr.toUpperCase ().endsWith (searchStr.toUpperCase ()) == true)
      {
         result = true;
      }
      return result;
   }

   // Note: Moose_Utils.replaceIgnoreCase handles NULLs,
   //       so no need to check for nulls before calling. :)
   //
   // REPLACE ALL Occurrences of 1 String within another.
   //
   // Moose_Utils.replaceIgnoreCase ("maL", "x", "O'Malley")
   //    returns "O'xley"
   // Moose_Utils.replaceIgnoreCase ("maL", "fRanKIe", "O'Malley")
   //    returns "O'fRanKIeley"
   // Moose_Utils.replaceIgnoreCase ("maX", "fRanKIe", "O'Malley")
   //    returns "O'Malley"  (does *not* contain "maX" !)
   // Moose_Utils.replaceIgnoreCase ("maL", "", "O'Malley")
   //    returns "O'ley"
   // Moose_Utils.replaceIgnoreCase ("", "fRanKIe", "O'Malley")
   //    returns "O'Malley"
   // Moose_Utils.replaceIgnoreCase ("TEST", "TEST 123", "TEST, TEST, TEST");
   //    returns "TEST 123, TEST 123, TEST 123"
   // Moose_Utils.replaceIgnoreCase ("TEST", "a", "TEST, TEST, TEST");
   //    returns "a, a, a"
   // Moose_Utils.replaceIgnoreCase ("  ", " ", "O'Ma    ll  e y")
   //    returns "O'Ma ll e y"
   public static String replaceIgnoreCase (String searchStr, String replaceStr, String sourceStr)
   {
      return replaceIgnoreCase (searchStr, replaceStr, sourceStr, 0);
   }

   public static String replaceIgnoreCase (String searchStr, String replaceStr, String sourceStr, int occurenceToReplace)
   {
      if ((sourceStr == null) || (searchStr == null) || (replaceStr == null) || (searchStr.length() == 0) )
         return sourceStr;

      //searchStr = searchStr.toUpperCase();
      //sourceStr = sourceStr.toUpperCase();

      String resultStr   = sourceStr;
      boolean moreToDo   = true;
      int startLocn      = 0;
      int occurenceCount = 0;

      while (moreToDo == true)
      {
         // If searchStr not found in resultStr, then IndexOf returns -1.
         // BUT, if searchStr is "", then IndexOf always returns 0 !!!
         startLocn = resultStr.indexOf (searchStr, startLocn);
         //startLocn = resultStr.toUpperCase().indexOf (searchStr.toUpperCase());
         //System.out.println ("replaceIgnoreCase: startLocn = " + startLocn);

         if ((startLocn >= 0) && (searchStr.length () > 0))
         {
            //System.out.println ("sourceStr.substring (0, startLocn) = " + resultStr.substring (0, startLocn));
            //System.out.println ("sourceStr.substring (startLocn + searchStr.length(), sourceStr.length()) = " + sourceStr.substring (startLocn + searchStr.length(), sourceStr.length()));

            occurenceCount++;

            if ((occurenceToReplace == 0) || (occurenceToReplace == occurenceCount))
            {
               String firstPartStr  = resultStr.substring (0, startLocn);
               String secondPartStr = resultStr.substring (startLocn + searchStr.length(), resultStr.length());

               resultStr = firstPartStr + replaceStr + secondPartStr;

               //System.out.println (resultStr);
               //System.out.println (startLocn);

               startLocn = startLocn + replaceStr.length ();
            }
         }
         else
         {
            moreToDo = false;

            // REPLACE ALL
            // Make this function REPLACE ALL occurences and keep looping
            // until all occurences have been replaced.
            startLocn = resultStr.indexOf (searchStr, 0);

            if ((startLocn >= 0) && (searchStr.length () > 0))
            {
               // If replaceStr is IN searchStr, we cannot loop again
               // this will be an infinite loop.
               // Only loop again if NOT found.  i.e. Result < 0.
               if (replaceStr.indexOf (searchStr, 0) < 0)
               {
                  moreToDo = true;
               }
            }
         }
      }

      return resultStr;
   }


   // Based on: replaceIgnoreCase (see above).
   // Example Use:
   //    int count = Moose_Utils.countOccurencesOfStringInString ("\"permanent_url\"", resultsStr);
   public static int countOccurencesOfStringInString (String searchStr, String sourceStr)
   {
      searchStr = searchStr.toUpperCase();
      sourceStr = sourceStr.toUpperCase();

      String resultStr   = sourceStr;
      boolean moreToDo   = true;
      int startLocn      = 0;
      int occurenceCount = 0;
      int occurenceToReplace = 0; // All.

      while (moreToDo == true)
      {
         // If searchStr not found in resultStr, then IndexOf returns -1.
         // BUT, if searchStr is "", then IndexOf always returns 0 !!!
         startLocn = resultStr.indexOf (searchStr, startLocn);
         //startLocn = resultStr.toUpperCase().indexOf (searchStr.toUpperCase());
         //System.out.println ("replaceIgnoreCase: startLocn = " + startLocn);

         if ((startLocn >= 0) && (searchStr.length () > 0))
         {
            occurenceCount++;
            startLocn++;
         }
         else
         {
            moreToDo = false;
         }
      }

      return occurenceCount;
   }



   // Change a Label (or whatever) between these values: /, -, \, |
   // to signal a program is still running / updating / working.
   // Example use:
   //  programRunningOKLabel.setText (Moose_Utils.updateProgressSpinnerSlashes (programRunningOKLabel.getText()));
   public static String updateProgressSpinnerSlashes (String currentValueStr)
   {
      String newValueStr;

      if ((currentValueStr                   == null) ||
          (currentValueStr.length()          == 0)    ||
          (currentValueStr.startsWith ("\\") == true))
         newValueStr = "|";
      else if (currentValueStr.startsWith ("|") == true)
         newValueStr = "/";
      else if (currentValueStr.startsWith ("/") == true)
         newValueStr = "-";
      else
         newValueStr = "\\"; // For single "\".

      return newValueStr;
   }


   // htmlToText
   public static String htmlToPlainText (String htmlStr)
   {
      return htmlStr.replaceAll("\\<.*?\\>", "");
   }

   /*
     Trim String to a particular length (or less).
     Example use:
       String new1Str = Moose_Utils.trimStringToLengthStr ("abcd", 9); // returns "abcd"
       String new2Str = Moose_Utils.trimStringToLengthStr ("abcd", 2); // returns "ab"

     Keywords: truncate,chop,trim,maxlenght, max length,
   */
   public static String trimStringToLengthStr (String inStr, int width)
   {
      String resultStr = inStr;

      if ((inStr != null) && (resultStr.length() > width) )
         resultStr = resultStr.substring (0, width);

      return resultStr;
   }

   /*
   Does a hard-line wrap at a certain location chopping words in half, etc.
      lineWrapAtLocationStr ("abcdefg", 3)
         returns "abc\ndef\ng"
      trimStringToLengthStr ("abcd", 5)
         returns "abcd"
   */
   public static String lineWrapAtLocationStr (String inStr, int width)
   {
      int    index     = 0;
      String resultStr = "";

      while ( index < inStr.length() )
      {
         if (index + width > inStr.length())
            width = inStr.length() - index;

         resultStr += inStr.substring (index, index + width) + "\n";
         index     += width;
      }

      return resultStr;
   }

   // Example use to reduce a really wide dialog text to a much more reasonable size:
   //    String dialogTextStr = Moose_Utils.truncateDelimittedStringLinesToLengthStr (dialogTextStr, "\n", 100, " :::")
   public static String truncateDelimittedStringLinesToLengthStr (String inStr, String delimiterStr, int maxLineLength, String paddingStr)
   {
      String[] strArray  = inStr.split(delimiterStr);
      String   resultStr = "";

      // Truncate long lines:
      for (int k = 0; k < strArray.length; k++)
      {
         // Is the line longer than the max allowed ?
         // Yes - truncate and add padding.
         if (strArray[k].length() > maxLineLength)
         {
            strArray[k] = strArray[k].substring (0, maxLineLength) + paddingStr;
         }
      }

      // Join String back together again, separated by delimiter:
      for (int k = 0; k < strArray.length; k++)
      {
         if (k < strArray.length - 1)
         {
            resultStr += strArray[k] + delimiterStr;
         }
         else
         {
            resultStr += strArray[k]; // No ending delimiter for last item
         }
      }

      return resultStr;
   }


   public static int getIndexOfStringInStringArray (String[] strArray, String itemStr, boolean caseSensitive)
   {
      int index = -1; // Not found

      if ((strArray != null) && (strArray.length > 0))
      {
         // Exit as soon as itemStr is found in the array.
         // i.e. exit after the first occurence is found.
         for (int k = 0; (k < strArray.length && index < 0); k++)
         {
            if ((caseSensitive == true) && (itemStr.compareTo (strArray[k]) == 0))
            {
               index = k;
            }
            else if ((caseSensitive == false) && (itemStr.compareToIgnoreCase (strArray[k]) == 0))
            {
               index = k;
            }
         }
      }

      return index;
   }

   //Example use:
   //    Moose_Utils.removeAllLeadingCharacter ("01234", '0'); // Returns "1234"
   //    Moose_Utils.removeAllLeadingCharacter ("00034", '0'); // Returns "34"
   //    Moose_Utils.removeAllLeadingCharacter ("00000", '0'); // Returns ""
   public static String removeAllLeadingCharacter (String valStr, char aChar)
   {
      String resultStr = valStr;
      int k = 0;

      while ((resultStr.length() > 0) && (resultStr.charAt (0) == aChar))
      {
         resultStr = resultStr.substring (1, resultStr.length() );
      }

      return resultStr;
   }

   //Example use:
   //    String new1Str = Moose_Utils.removeAllTrailingCharacter ("0123400", '0'); // Returns "01234"
   //    String new2Str = Moose_Utils.removeAllTrailingCharacter ("3400",    '0'); // Returns "34"
   //    String new3Str = Moose_Utils.removeAllTrailingCharacter ("00000",   '0'); // Returns ""
   public static String removeAllTrailingCharacter (String valStr, char aChar)
   {
      String resultStr = valStr;
      int k = 0;

      if (valStr != null)
      {
         while ((resultStr.length() > 0) && (resultStr.charAt (resultStr.length() - 1) == aChar))
         {
            resultStr = resultStr.substring (0, resultStr.length() - 1);
         }
      }

      return resultStr;
   }

   // Example use:
   //   Moose_Utils.deleteEverythingInStringBeforeString("Hello World", "Wor"); // Returns "World".
   public static String deleteEverythingInStringBeforeString (String sourceStr, String searchStr)
   {
      String resultStr = sourceStr;
      int startInd = resultStr.indexOf (searchStr);

      if (startInd > 0)
      {
         resultStr = resultStr.substring (startInd, resultStr.length() );
      }
      else
      {
         resultStr = "";
      }

      return resultStr;
   }

   // Example use:
   //   Moose_Utils.deleteEverythingInStringFromStringOnwards("Hello World", "Wor"); // Returns "Hello ".
   public static String deleteEverythingInStringFromStringOnwards (String sourceStr, String searchStr)
   {
      String resultStr = sourceStr;
      int endInd = resultStr.indexOf (searchStr);

      if (endInd > 0)
      {
         resultStr = resultStr.substring (0, endInd );
      }

      return resultStr;
   }


   // *********************************
   // *** JLabel
   // *********************************

   // Example use:
   //     Moose_Utils.spacePadLabelOnRightToLength (applicationNameLabel, 20);
   public static void spacePadLabelOnRightToLength (final JLabel inLabel, int reqLength)
   {
      if (inLabel.getText().length() < reqLength)
      {
         String tempStr = inLabel.getText();

         while (tempStr.length() < reqLength)
         {
            tempStr += "          ";
         }

         tempStr = tempStr.substring (0, reqLength);

         inLabel.setText (tempStr);
      }
   }


   // *********************************
   // *** ArrayList
   // *********************************

   // Example use:
   //    boolean inListAlready = Moose_Utils.isItemAlreadyInArrayList (myArrayList, itemStr, false);
   public static boolean isItemAlreadyInArrayList (ArrayList<String> myArrayList, String itemStr, boolean caseSensitive)
   {
      boolean itemFound = false;
      String currItem = "";

      for (int k = 0; k < myArrayList.size(); k++)
      {
         currItem = myArrayList.get (k);

         if ((caseSensitive == true) && (currItem.compareTo (itemStr) == 0))
         {
            itemFound = true;
         }
         else if ((caseSensitive == false) && (currItem.compareToIgnoreCase (itemStr) == 0))
         {
            itemFound = true;
         }
      }

      return itemFound;
   }

   // Example use:
   //    Moose_Utils.addUniqueItemToArrayList (uniqueNamesArrayList, "Mike", false); // Not case sensitive.
   public static boolean addUniqueItemToArrayList (ArrayList<String> myArrayList, String itemStr, boolean caseSensitive)
   {
      boolean itemAdded = false;

      if (isItemAlreadyInArrayList (myArrayList, itemStr, caseSensitive) == false)
      {
         myArrayList.add (itemStr);

         itemAdded = true;
      }

      return itemAdded;
   }

   // Example use:
   //  String str = Moose_Utils.arrayListToStr (myArrayList, " * ", "\n");
   //  String csv = Moose_Utils.arrayListToStr (myArrayList, "", ",");
   // Keywords: arrayListToString
   public static String arrayListToStr (ArrayList<String> stringArrayList, String itemPrefixStr, String delimStr)
   {
      StringBuilder outSB = new StringBuilder ();

      if ((stringArrayList != null) && (stringArrayList.size() > 0))
      {
         for (int k = 0; k < stringArrayList.size(); k++)
         {
            outSB.append (itemPrefixStr + stringArrayList.get (k) + delimStr);
         }
      }

      return outSB.toString();
   }

   // Example use:
   //   Moose_Utils.copyArrayListStringToClipboard (myArrayList, "", "\n");
   public static void copyArrayListStringToClipboard (ArrayList<String> stringArrayList, String itemPrefixStr, String delimStr)
   {
      Moose_Utils.copyStringToClipboard (Moose_Utils.arrayListToStr (stringArrayList, itemPrefixStr, delimStr) );
   }

   // Example use:
   //  String str = Moose_Utils.arrayListToStr (myArrayList, "\n");
   //  String csv = Moose_Utils.arrayListToStr (myArrayList, ",");
   // Keywords: arrayListToString
   public static String arrayListToStr (ArrayList<String> stringArrayList, String delimStr)
   {
      // No Delimiter ?  Assume new line char.
      return arrayListToStr (stringArrayList, "", delimStr);
   }

   // Example use:
   //  String str = Moose_Utils.arrayListToStr (myArrayList);
   public static String arrayListToStr (ArrayList<String> stringArrayList)
   {
      // No Delimiter ?  Assume new line char.
      return arrayListToStr (stringArrayList, "", "\n");
   }


   // Save all Strings in ArrayList to file.
   // Example use:
   //    Moose_Utils.saveArrayListToFile (combinationsArrayList, "comb.txt");
   public static void saveArrayListToFile (ArrayList<String> stringArrayList, String fileName)
   {
      saveArrayListToFile (stringArrayList, fileName, false);
   }

   // Example use:
   //    Moose_Utils.saveArrayListToFile (combinationsArrayList, "comb.txt", false);  // Overwrite file.
   public static void saveArrayListToFile (ArrayList<String> stringArrayList, String fileName, boolean appendToFile)
   {
      BufferedWriter bw = null;
      FileWriter     fw = null;

      try
      {
         //Formatter outputFile = new Formatter (fileName);
         File file = new File(fileName);

         // if file doesnt exist, then create it:
         if (file.exists() == false)
         {
            file.createNewFile();
         }

         // if appendToFile is true, then append file.
         fw = new FileWriter(file.getAbsoluteFile(), appendToFile);
         bw = new BufferedWriter(fw);

         for (int k = 0; k < stringArrayList.size(); k++)
         {
            //outputFile.format ("%s\n", stringArrayList.get (k));
            //outputFile.format ("%s", stringArrayList.get (k) + Moose_Utils.getLineSeparator ());
            bw.write (stringArrayList.get (k) + Moose_Utils.getLineSeparator ());
         }

      }
      catch(Exception ex)
      {
         System.out.println ("Error writing to file: " + fileName);
         //System.exit(-2);
      }
      finally
      {
         //outputFile.close();

         try
         {
            if (bw != null)
               bw.close();  // also does a flush() !!

            if (fw != null)
               fw.close();

            bw = null;
            fw = null;

            System.out.println (" - SUCCESS: " +
                                String.format ("%,d", stringArrayList.size()) +
                                " lines written to: " + fileName);
         }
         catch (IOException err)
         {
            System.out.println ("Error closing file: " + fileName);
         }
      }

      //Toolkit.getDefaultToolkit().beep();

   } // public void saveArrayListToFile (ArrayList<String> stringArrayList, String fileName)


   // FileToArrayList
   // Example use:
   //   Moose_Utils.loadArrayListFromFile ("abc.txt", stringArrayList, false);
   public static String loadArrayListFromFile (String fileName, ArrayList<String> stringArrayList, boolean appendData)
   {
      String outStr = ""; // Contains the results of the load and/or error message.

      outStr = outStr + "Reading from file: '" + fileName + "' ..." + "\n";

      if (stringArrayList == null)
      {
         // If ArrayList has NOT been ceated, then create it.
         stringArrayList = new ArrayList<String> ();
      }

      if (appendData == false)
      {
         // If not appending data, erase the ArrayList.
         stringArrayList.clear();
      }

      try
      {
         String fileNameWithPath = fileName;

         File file = new File(fileName);

         // If file doesn't exist, then look where program is running ...
         if (file.exists() == false)
         {
            // Linux Vs Windows differences
            // Linux: home dir = /home/username
            // Windows: home dir = dir where the current Java programming is running !
            // = MAJOR difference !!!!

            // If file does NOT exist - look in the same directory where this program is running.
            fileNameWithPath = System.getProperty("user.dir")       +
                               System.getProperty("file.separator") + fileName;

            file = new File(fileNameWithPath);

            // If file still doesn't exist, then create it in the user.dir
            // (i.e. the filename without ANY path).
            if (file.exists() == false)
            {
               file = new File(fileName);
               fileNameWithPath = fileName;
               file.createNewFile();
            }
         }

         FileReader fileReader = new FileReader(fileNameWithPath);

         /*
         // *** OLD / SLOW Way:

         Scanner inFile = new Scanner(fileReader);

         // Reading all lines from file ...
         while(inFile.hasNext() == true)
         {
             stringArrayList.add (inFile.nextLine());
         }

         inFile.close();
         */

         // *** NEW / FAST Way:
         BufferedReader bufferedReader = new BufferedReader(fileReader);
         String line = "";

         while ((line = bufferedReader.readLine()) != null)
         {
             stringArrayList.add(line);
         }

         bufferedReader.close();
         fileReader.close();

         outStr = outStr + " - SUCCESS: " + String.format ("%,d", stringArrayList.size()) +
                 " items loaded from file: '" + fileName + "'." + "\n";
      }
      catch(FileNotFoundException ex)
      {
         outStr = outStr + "ERROR: Input file not found: '" + fileName + "'." + "\n";
         //JOptionPane.showMessageDialog(null, "Input file not found: '" + fileName + "'.");
         //System.exit(-1);
      }
      catch(NoSuchElementException ex)
      {
         outStr = outStr + "ERROR: No such element found in the file: '" + fileName + "'." + "\n";
         //JOptionPane.showMessageDialog(null, "No such element found in the file: '" + fileName + "'.");
         //System.exit(-2);
      }
      catch(IOException ex)
      {
         outStr = outStr + "ERROR: I/O Exception when accessing file: '" + fileName + "'." + "\n";
         //JOptionPane.showMessageDialog(null, "No such element found in the file: '" + fileName + "'.");
         //System.exit(-2);
      }

      System.out.println (outStr);

      return outStr;
   }


   public static void randomiseArrayList (ArrayList<String> stringArrayList, int passes)
   {
      int randomLocn1 = 0;
      int randomLocn2 = 0;

      for (int p = 0; p < passes * stringArrayList.size(); p++)
      {
         randomLocn1 = Moose_Utils.getRandomIntBetween2Integers(0, stringArrayList.size() - 1);
         randomLocn2 = Moose_Utils.getRandomIntBetween2Integers(0, stringArrayList.size() - 1);

         // Swap the Year and the Day around.
         String tempStr = stringArrayList.get (randomLocn1);
         stringArrayList.set (randomLocn1, stringArrayList.get (randomLocn2));
         stringArrayList.set (randomLocn2, tempStr);
      }

   } // public static void randomiseArrayList (ArrayList<String> stringArrayList, int passes)

   // Example use:
   //    Moose_Utils.reverseOrderArrayList (sourceLinesArrayList);
   public static void reverseOrderArrayList (ArrayList<String> stringArrayList)
   {
      if (stringArrayList != null)
      {
         Stack<String> stack = new Stack<>();
         for (int k = 0; k < stringArrayList.size(); k++)
         {
            stack.push (stringArrayList.get(k) );
         }

         stringArrayList.clear();

         while (stack.empty() == false)
         {
            stringArrayList.add (stack.pop() );
         }
      }
   }


   // Result = ArrayList1 contents + ArrayList2 contents.
   // Example use:
   //    ArrayList<String> arratList = Moose_Utils.appendArrayListToArrayList (arrayList1, arrayList2);
   public static ArrayList<String> appendArrayListToArrayList (ArrayList<String> string1ArrayList, ArrayList<String> string2ArrayList)
   {
      ArrayList<String> resultList = new ArrayList<String>();

      for (int k = 0; k < string1ArrayList.size(); k++)
      {
         resultList.add (string1ArrayList.get (k));
      }

      for (int k = 0; k < string2ArrayList.size(); k++)
      {
         resultList.add (string2ArrayList.get (k));
      }
      return resultList;
   } // public static ArrayList<String> appendArrayListToArrayList (ArrayList<String> string1ArrayList, ArrayList<String> string2ArrayList)

   /*
      Why have the copyArrayListToArrayList method ???

      NONE of the code below fixes the compiler warnings.
      Conclusion: do not bother using clone() - just write the code yourself !

      try
      {
         // warning: [unchecked] unchecked cast
         // Try/catch and if check... check does NOT fix this warning = WTF ????
         // I am checking the cast stupid fucking Java !!!!
         //if (e.getTransferable().isDataFlavorSupported(DataFlavor.String) == true)
         //{
         //}
            @SuppressWarnings("unchecked")

         if (OneMinusTwoRadioButton.isSelected () == true)
         {
            // Copy all hours in input2ArrayList.
            if (input2ArrayList.isDataFlavorSupported(DataFlavor.stringFlavour) == true)
            {
               inputCopyArrayList = (ArrayList<String>) input2ArrayList.clone();
            }
         }
         else
         {
            // Copy all hours in input1ArrayList.
            inputCopyArrayList = (ArrayList<String>) input1ArrayList.clone();
         }
      }
      catch (UnsupportedFlavorException err)
      {
      }

   */
   //public static void copyArrayListToArrayList (ArrayList<String> sourceArrayList, ArrayList<String> destinationArrayList)
   //{
   //   destinationArrayList.clear ();
   //
   //   destinationArrayList = appendArrayListToArrayList (sourceArrayList, destinationArrayList);
   //} // public static void copyArrayListToArrayList (ArrayList<String> sourceArrayList, ArrayList<String> destinationArrayList)

   // Example use:
   //   ArrayList<String> copyArrayList = Moose_Utils.copyArrayListToArrayList (sourceArrayList);
   public static ArrayList<String> copyArrayListToArrayList (ArrayList<String> sourceArrayList)
   {
      ArrayList<String> destinationArrayList = new ArrayList<String> ();

      destinationArrayList = appendArrayListToArrayList (sourceArrayList, destinationArrayList);

      return destinationArrayList;
   } // public static void copyArrayListToArrayList (ArrayList<String> sourceArrayList, ArrayList<String> destinationArrayList)


   public static String getRandomStringFromArrayList (ArrayList<String> stringArrayList)
   {
      String outStr = "";

      if (stringArrayList.size() > 0)
      {
         int newNumber = Moose_Utils.getRandomIntBetween2Integers(0, stringArrayList.size() - 1);

         // Add HTML tags to force the label to word wrap.
         //outStr = "\n" + "<html><p>" + stringArrayList.get (newNumber) + "</p></html>";
         outStr = stringArrayList.get (newNumber);
      }

      return outStr;
   }

   public static String getRandomStringFromArray (String[] stringArray)
   {
      String outStr = "";

      if (stringArray.length > 0)
      {
         int newNumber = Moose_Utils.getRandomIntBetween2Integers(0, stringArray.length - 1);

         // Add HTML tags to force the label to word wrap.
         //outStr = "\n" + "<html><p>" + stringArrayList.get (newNumber) + "</p></html>";
         outStr = stringArray [newNumber];
      }

      return outStr;
   }

   // Parameter is: ArrayList<String>.  e.g. file contents (lines of text loaded from the file).
   // A trivial method, but I am thinking of adding options on the future like
   // do not count blank lines, don't count leading or trailing blank lines, etc.
   public static long getArrayListLineCount (ArrayList<String> sourceLinesArrayList)
   {
      return sourceLinesArrayList.size();
   }

   // Example use:
   //    ArrayList<String> fileLinesArrayList = new ArrayList<String>();
   //    File myFile = new File ("c:/abc.txt");
   //    Moose_Utils.loadArrayListFromFile (myFile.toString(), fileLinesArrayList, false);
   //    long digits = Moose_Utils.getArrayListDigits (fileLinesArrayList);
   public static long getArrayListDigits (ArrayList<String> sourceLinesArrayList)
   {
      long digitCount      = 0;
      long totalDigitCount = 0;

      for (int k = 0; k < sourceLinesArrayList.size(); k++)
      {
         digitCount = Moose_Utils.countAllNumericDigitsFromStr (sourceLinesArrayList.get (k));

         totalDigitCount += digitCount;
      }

      return totalDigitCount;
   }

   // Example use:
   //    ArrayList<String> fileLinesArrayList = new ArrayList<String>();
   //    File myFile = new File ("c:/abc.txt");
   //    Moose_Utils.loadArrayListFromFile (myFile.toString(), fileLinesArrayList, false);
   //    long chars = Moose_Utils.getArrayListChars (fileLinesArrayList);
   public static long getArrayListChars (ArrayList<String> sourceLinesArrayList, boolean trimText)
   {
      long charCount      = 0;
      long totalCharCount = 0;

      for (int k = 0; k < sourceLinesArrayList.size(); k++)
      {
         if (trimText == true)
            charCount = sourceLinesArrayList.get (k).trim().length();
         else
            charCount = sourceLinesArrayList.get (k).length();

         totalCharCount += charCount;
      }

      return totalCharCount;
   }

   // Example use:
   //    ArrayList<String> fileLinesArrayList = new ArrayList<String>();
   //    File myFile = new File ("c:/abc.txt");
   //    Moose_Utils.loadArrayListFromFile (myFile.toString(), fileLinesArrayList, false);
   //    long words = Moose_Utils.getArrayListWords (fileLinesArrayList);
   public static long getArrayListWords (ArrayList<String> sourceLinesArrayList, boolean trimText)
   {
      long wordCount      = 0;
      long totalWordCount = 0;
      String currLine    = "";

      for (int k = 0; k < sourceLinesArrayList.size(); k++)
      {
         wordCount = 0;

         if (trimText == true)
            currLine = sourceLinesArrayList.get (k).trim();
         else
            currLine = sourceLinesArrayList.get (k);

         // Replace consecutive spaces with single space.
         currLine = Moose_Utils.replaceIgnoreCase ("  ", " ", currLine);

         //For testing:
         //sb.append (currLine + Moose_Utils.getLineSeparator());

         if (currLine.length() > 0)
         {
            String[] tokens = currLine.split(" ");

            for (int w = 0; w < tokens.length; w++)
            {
               if (tokens[w].trim().length() > 0)
                  wordCount++;
            }

            // Does NOT work: because it counts consecutive spaces as words.
            //wordCount = tokens.length;

            totalWordCount += wordCount;
         }
      }

      return totalWordCount;
   }

   // Example use:
   //  int index = Moose_Utils.getIndexOfStringInArrayList (codeParentListArrayList, "Australian");
   public static int getIndexOfStringInArrayList (ArrayList<String> inArrayList, String searchStr)
   {
      int index = -1; // Return value if String not found.

      for (int k = 0; k < inArrayList.size(); k++)
      {
         if (inArrayList.get(k).compareToIgnoreCase (searchStr) == 0)
         {
            index = k; // Current String location.
         }
      }

      return index;
   }

   // Example use:
   //  ArrayList<String> uniqueStringsArrayList =
   //      Moose_Utils.getArrayListOfUniqueStringsFromArrayList (codeParentListArrayList);
   public static ArrayList<String> getArrayListOfUniqueStringsFromArrayList (ArrayList<String> inArrayList)
   {
      ArrayList<String> uniqueStringsArrayList = new ArrayList<String> ();

      int index = -1;

      for (int k = 0; k < inArrayList.size(); k++)
      {
         index = getIndexOfStringInArrayList (uniqueStringsArrayList, inArrayList.get(k));

         if (index < 0) // String not already in uniqueStringsArrayList ?
         {
            uniqueStringsArrayList.add (inArrayList.get(k));
         }
      }

      return uniqueStringsArrayList;
   }

   // Remove loading and trailing white space: spaces, tabs, etc
   // from all items in the array list.
   // Example use:
   //    Moose_Utils.trimAllItemsInArrayList (list1ArrayList);
   public static void trimAllItemsInArrayList (ArrayList<String> inArrayList)
   {
      for (int k = 0; k < inArrayList.size(); k++)
      {
         //String itemStr = inArrayList.get (k);
         //itemStr = itemStr.trim();
         //inArrayList.set (k, itemStr);
         inArrayList.set (k, inArrayList.get (k).trim());
      }
   }

   // Delete all blank items in the array list.
   // Example use:
   //    Moose_Utils.removeBlankItemsFromArrayList (list1ArrayList);
   public static void removeBlankItemsFromArrayList (ArrayList<String> inArrayList)
   {
      int k = 0;
      while (k < inArrayList.size())
      {
         //String itemStr = inArrayList.get (k);
         //itemStr = itemStr.trim();
         //if (itemStr.length () == 0)
         if (inArrayList.get (k).trim().length () == 0)
         {
            inArrayList.remove (k);
         }
         else
         {
            k++;
         }
      }
   }

   // Delete item from the array list.
   // If it occurs multiple times, all will be deleted.
   // Example use:
   //   Moose_Utils.removeStringFromArrayListStartingWith (myArrayList, "pause", false);
   public static void removeStringFromArrayList (ArrayList<String> inArrayList, String itemStr, boolean caseSensitive)
   {
      int k = 0;
      while (k < inArrayList.size())
      {
         if ( ((caseSensitive == true) &&
               (itemStr.compareTo (inArrayList.get(k)) == 0))
            ||
              ((caseSensitive == false) &&
               (itemStr.compareToIgnoreCase (inArrayList.get(k)) == 0) )
            )
         {
            inArrayList.remove (k);
         }
         else
         {
            k++;
         }
      }
   }

   // Delete item from the array list starting with ...
   // If items occurs multiple times, all will be deleted.
   // Example use:
   //   Moose_Utils.removeStringFromArrayListStartingWith (myArrayList, "--", false);
   /*
   public static void removeStringFromArrayListStartingWith (ArrayList<String> inArrayList, String itemStr, boolean caseSensitive)
   {
      int k = 0;
      while (k < inArrayList.size())
      {
         if ( ((caseSensitive == true) &&
               (itemStr.startsWith (inArrayList.get(k)) == true))
            ||
              ((caseSensitive == false) &&
               (startsWithIgnoreCase (itemStr, inArrayList.get(k)) == true))
            )
         {
            inArrayList.remove (k);
         }
         else
         {
            k++;
         }
      }
   }
   */
   // I like my other version developed for GenerateClientData.java better - it's cleaner code:
   public static void removeStringFromArrayListStartingWith (ArrayList<String> inArrayList, String startStr, boolean caseSensitive)
   {
      if (caseSensitive == false)
      {
         startStr = startStr.toUpperCase();
      }

      for (int k = inArrayList.size() - 1; k >= 0; k--) // Start at the end of the arraylist ...
      {
         if (caseSensitive == false)
         {
            if (inArrayList.get(k).toUpperCase().startsWith (startStr) == true)
               inArrayList.remove (k);
         }
         else
         {
            if (inArrayList.get(k).startsWith (startStr) == true)
               inArrayList.remove (k);
         }
      }
   }

   // Result = List1 - List2.
   // The items that are List1 and NOT List2.
   // Example use:
   //   ArrayList<String> list3ArrayList = Moose_Utils.getArrayListOfItemsInArrayList1AndNotInArrayList2
   //                                         (list1ArrayList, list2ArrayList, false);
   public static ArrayList<String> getArrayListOfItemsInArrayList1AndNotInArrayList2 (ArrayList<String> arrayList1, ArrayList<String> arrayList2, boolean caseSensitive)
   {
      ArrayList<String> arrayListIn1Not2 = new ArrayList<String> ();

      for (int k = 0; k < arrayList1.size(); k++)
      {
         boolean found = false;

         for (int m = 0; (m < arrayList2.size() && found == false); m++)
         {
            if (caseSensitive == true)
            {
               if (arrayList1.get(k).equals (arrayList2.get(m)) == true)
                  found = true;
            }
            else
            {
               if (arrayList1.get(k).equalsIgnoreCase (arrayList2.get(m)) == true)
                  found = true;
            }
         }

         if (found == false)
         {
            arrayListIn1Not2.add (arrayList1.get(k));
         }
      }

      return arrayListIn1Not2;
   }

   // Result = Intersection of List1 and List2.
   // i.e. The items that are in BOTH lists.
   // Example use:
   //     ArrayList<String> list3ArrayList = Moose_Utils.getArrayListOfItemsInBothArrayList1AndList2
   //                                        (list1ArrayList, list2ArrayList, false);
   public static ArrayList<String> getArrayListOfItemsInBothArrayList1AndList2 (ArrayList<String> arrayList1, ArrayList<String> arrayList2, boolean caseSensitive)
   {
      ArrayList<String> arrayListInBoth = new ArrayList<String> ();

      for (int k = 0; k < arrayList1.size(); k++)
      {
         boolean found = false;

         for (int m = 0; (m < arrayList2.size() && found == false); m++)
         {
            if (caseSensitive == true)
            {
               if (arrayList1.get(k).equals (arrayList2.get(m)) == true)
                  found = true;
            }
            else
            {
               if (arrayList1.get(k).equalsIgnoreCase (arrayList2.get(m)) == true)
                  found = true;
            }
         }

         if (found == true)
         {
            arrayListInBoth.add (arrayList1.get(k));
         }
      }

      return arrayListInBoth;
   }

   // Result = UNION of List1 and List2.
   // i.e. all of the unique items in List 1 + all of the unique
   //      items in List 2 (that are not in List 1).
   // If either list contains duplicates, then these are removed.
   // e.g. if List 1 contains "aaaa", "bbbb", "aaaa", then only the 1st "aaaa" will be copied over.
   // Example use:
   //     ArrayList<String> list3ArrayList = Moose_Utils.getArrayListOfItemsInBothArrayList1AndList2
   public static ArrayList<String> getArrayListUnionList1AndList2 (ArrayList<String> arrayList1, ArrayList<String> arrayList2, boolean caseSensitive)
   {
      ArrayList<String> arrayListUnion = new ArrayList<String> ();

      for (int k = 0; k < arrayList1.size(); k++)
      {
         Moose_Utils.addUniqueItemToArrayList (arrayListUnion, arrayList1.get(k), caseSensitive);
      }

      for (int k = 0; k < arrayList2.size(); k++)
      {
         Moose_Utils.addUniqueItemToArrayList (arrayListUnion, arrayList2.get(k), caseSensitive);
      }

      return arrayListUnion;
   }

   // Example use:
   //    String[] lines = Moose_Utils.arrayListToArrayOfString (servicesArrayList, 0);
   // Keywords: arrayListOfStringToArrayOfString, arrayListStringToArrayString
   public static String[] arrayListToArrayOfString (ArrayList<String> arrayList, int startRowIndex)
   {
      String[] array = null;
      int count = 0;

      if ((arrayList != null)  && (arrayList.size() > 0))
      {
         array = new String[arrayList.size() - startRowIndex];

         // Start at startRowIndex to Exclude Headings or unwanted data.
         for (int k = startRowIndex; k < arrayList.size(); k++)
         {
            array [count] = arrayList.get(k);
            count++;
         }
      }

      return array;
   }


   // Example use:
   //   String[] lines = Moose_Utils.fileToStringArray ("abc.txt", 0); // All lines / data in file.
   //   String[] lines = Moose_Utils.fileToStringArray ("abc.txt", 1); // Skip line 1. eg. skip headings.
   public static String[] fileToStringArray (String fileName, int startRowIndex)
   {
      ArrayList<String> stringArrayList = new ArrayList<String> ();

      Moose_Utils.loadArrayListFromFile (fileName, stringArrayList, false);

      return Moose_Utils.arrayListToArrayOfString (stringArrayList, startRowIndex);
   }



   // *********************************
   // JTextField
   // *********************************

   public static void copyJTextFieldToClipboard (JTextField inTextField)
   {
      copyStringToClipboard (inTextField.getText());
   }


   // *********************************
   // JTextArea
   // *********************************

   public static void setTextJTextArea (JTextArea inTextArea, String inStr)
   {
      inTextArea.setText (inStr);

      // Move cursor/view to start of data at TOP of textarea.
      inTextArea.setCaretPosition (0);
   }

   public static void copyJTextAreaToClipboard (JTextArea inTextArea)
   {
      copyStringToClipboard (inTextArea.getText());
   }

   public static void pasteJTextAreaFromClipboard (JTextArea inTextArea, boolean appendData)
   {
      if (appendData == false)
      {
         inTextArea.setText ("");
         inTextArea.setText (Moose_Utils.CopyTextFromClipboard ());
      }
      else
      {
         JTextArea tempArea = new JTextArea ();
         tempArea.setText (Moose_Utils.CopyTextFromClipboard ());

         inTextArea.append (tempArea.getText());
      }

      // Move cursor/view to start of data at TOP of textarea.
      inTextArea.setCaretPosition (0);
   }

   // Example use:
   //    ArrayList<String> alist = Moose_Utils.CopyJTextAreaToArrayList (myJTextArea);
   public static ArrayList<String> CopyJTextAreaToArrayList (JTextArea inTextArea)
   {
      //REF: http://stackoverflow.com/questions/20432404/lines-of-jtextarea-to-an-arrayliststring
      String s[] = inTextArea.getText().split("\\r?\\n");
      ArrayList<String>arrList = new ArrayList<>(Arrays.asList(s));
      return arrList;
   }

   // Example use:
   //    ArrayList<String> alist = Moose_Utils.copyStringToArrayList (myStr);
   public static ArrayList<String> copyStringToArrayList (String inString)
   {
      //REF: http://stackoverflow.com/questions/20432404/lines-of-jtextarea-to-an-arrayliststring
      String s[] = inString.split("\\r?\\n");
      ArrayList<String>arrList = new ArrayList<>(Arrays.asList(s));
      return arrList;
   }

   public static void sortJTextArea (JTextArea inTextArea, boolean caseSensitive)
   {
      boolean lineWrap = inTextArea.getLineWrap();

      if (lineWrap == true)
      {
         // Turn off line wrapping.
         inTextArea.setLineWrap (false);
      }

      // Copy all lines to an ArrayList.
      ArrayList<String> tempArrayList = CopyJTextAreaToArrayList (inTextArea);

      // Sort the ArrayList:
      if (caseSensitive == true)
         Collections.sort(tempArrayList);
      else
         Collections.sort(tempArrayList, String.CASE_INSENSITIVE_ORDER);


      // Copy sorted lines back to TextArea.
      CopyArrayListToJTextArea (tempArrayList, inTextArea);

      // Restore Line Wrap to true if that is what it was originally.
      if (lineWrap == true)
      {
         inTextArea.setLineWrap (true);
      }
   }

   // Example use:
   //    Moose_Utils.CopyArrayListToJTextArea (myArrayList, resultsTextArea);
   public static void CopyArrayListToJTextArea (ArrayList<String> inArrayList, JTextArea outJTextArea)
   {
      CopyOrAppendArrayListToJTextArea (inArrayList, outJTextArea, false);
   }

   public static void AppendArrayListToJTextArea (ArrayList<String> inArrayList, JTextArea outJTextArea)
   {
      CopyOrAppendArrayListToJTextArea (inArrayList, outJTextArea, true);
   }

   public static void CopyOrAppendArrayListToJTextArea (ArrayList<String> inArrayList, JTextArea outJTextArea, boolean appendData)
   {
      // All data currently in the TextArea is either erased or appended to:
      // depending on value of appendData parameter.

      //outJTextArea.setText ("");
      //outJTextArea.setVisible (false);

      //String outText = "";
      StringBuffer sb = new StringBuffer();

      //System.out.println ("CopyArrayListToJTextArea: size = " + inArrayList.size());

      for (int k = 0; k < inArrayList.size(); k++)
      {
         // FAST:  :D  :D
         // 0.3 seconds to copy 120,000 lines on my HP Elitebook Core i7 laptop !!!!!
         sb.append (inArrayList.get (k) + "\n");

         // VERY SLOW: all of the code below is VERY, VERY slow.
         // It took 200+ seconds to copy 120,000 lines on my HP Elitebook Core i7 laptop !!!!!
         //outJTextArea.append (inArrayList.get (k) + "\n");
         //outText = outText + inArrayList.get (k) + "\n";

         //if (k%1000 == 0)
         //   System.out.print ('.');
      }
      //System.out.println ();

      if (appendData == true)
      {
         // Append ArrayList / StringBuffer data onto the text area:
         // Any existing data in the text area is preserved.
         //outJTextArea.setText (outJTextArea.getText() + "\n" + sb.toString());
         outJTextArea.setText (outJTextArea.getText() + sb.toString());
      }
      else
      {
         // Copy ArrayList / StringBuffer data into the text area:
         // Any existing data in the text area is overwritten / erased.
         outJTextArea.setText (sb.toString());
      }

      //outJTextArea.setVisible (true);

      // Move cursor/view to start of data at TOP of textarea.
      outJTextArea.setCaretPosition (0);
   }

   public static int getLineCountForJTextArea (JTextArea inTextArea)
   {
      int length = 0;

      // If the textarea contains any data ...  even spaces count.
      if (inTextArea.getText().length() > 0)
      {
         // Note: returns number of lines.  All lines could be blank.
         String s[] = inTextArea.getText().split("\\r?\\n");

         length = s.length;
      }

      return length;
   }


   // keywords: saveJTextAreaToFile, saveTextAreaToFile
   // Example use:
   //    Moose_Utils.saveJTextAreaToFile (combinationsTextArea, "comb.txt");
   public static void saveJTextAreaToFile (JTextArea inTextArea, String fileName)
   {
      // A little slower than it could be - copying data to ArrayList first -
      // but it saves / reuses code.
      ArrayList<String> tempArrayList = CopyJTextAreaToArrayList (inTextArea);
      saveArrayListToFile (tempArrayList, fileName);
   } //

   // Keywords: loadJTextArea, loadTextArea, readJTextArea, readTextArea,
   // Example use:
   //    Moose_Utils.readJTextAreaFromFile (combinationsTextArea, "comb.txt");
   // loadJTextAreaFromFile, loadTextAreaFromFile
   public static void readJTextAreaFromFile (JTextArea inTextArea, String fileName)
   {
      try
      {
         FileReader fileReader = new FileReader(fileName);
         inTextArea.read(fileReader, null);

         fileReader.close();
      }
      catch(Exception ex)
      {
      }
   } //

   public static boolean appendJTextAreaToFile (JTextArea inTextArea, String fileName)
   {
      // WriteStringToFile, SaveStringToFile, StringToFile
      return writeOrAppendStringToFile (fileName, inTextArea.getText(), true);
   }


   public static ArrayList<String> randomiseJTextArea (JTextArea inTextArea, int passes)
   {
      ArrayList<String>arrList = new ArrayList<>();

      arrList = CopyJTextAreaToArrayList (inTextArea);
      randomiseArrayList (arrList, passes);

      CopyArrayListToJTextArea (arrList, inTextArea);

      return arrList;
   }

   public static ArrayList<String> randomiseJTextAreaToAnotherJTextArea (JTextArea sourceTextArea, JTextArea destinationTextArea, int passes)
   {
      ArrayList<String>arrList = new ArrayList<>();

      arrList = CopyJTextAreaToArrayList (sourceTextArea);
      randomiseArrayList (arrList, passes);

      CopyArrayListToJTextArea (arrList, destinationTextArea);

      return arrList;
   }


   public static long getJTextAreaSizeInBytes (JTextArea inTextArea)
   {
      ArrayList<String> arrayList = Moose_Utils.CopyJTextAreaToArrayList (inTextArea);
      long sizeBytes = 0l;

      for (int k = 0; k < arrayList.size(); k++)
      {
         sizeBytes = sizeBytes + arrayList.get (k).length();
                     // + getLineSeparator ().length();
      }

      return sizeBytes;
   }

   public static String getJTextAreaSizeToKBMBGBTBWithUnits (JTextArea inTextArea, int numDecimalPlaces)
   {
      long sizeBytes = getJTextAreaSizeInBytes (inTextArea);

      return scaleBytesToKBMBGBTBWithUnitsStr (sizeBytes, numDecimalPlaces);
   }


   // *********************************
   // OS: Windows, Mac, Linix, Unix, Solaris, etc
   // *********************************

   // Example use:
   //   if (Moose_Utils.isOSWindows () == true)
   //      ::::
   public static boolean isOSWindows ()
   {
      return System.getProperty("os.name").toLowerCase().startsWith ("windows");
   }

   public static boolean isOSMac ()
   {
      return System.getProperty("os.name").toLowerCase().startsWith ("mac");
   }

   // isLinux
   public static boolean isOSUnix ()
   {
      return (System.getProperty("os.name").toLowerCase().contains ("nix") ||
              System.getProperty("os.name").toLowerCase().contains ("nux") ||
              System.getProperty("os.name").toLowerCase().contains ("aix") );
   }

   public static boolean isOSSolaris ()
   {
      return System.getProperty("os.name").toLowerCase().contains ("sunos");
   }



   // *********************************
   // Windows Clipboard
   // *********************************

   // stringToClipboard, strToClipboard
   // Example use:
   //     Moose_Utils.copyStringToClipboard (myTextField.getText() );
   public static void copyStringToClipboard (String inStr)
   {
      StringSelection selection = new StringSelection (inStr);

      Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
      clipboard.setContents(selection, selection);
   }

   public static String pasteTextFromClipboard ()
   {
      return CopyTextFromClipboard ();
   }

   public static String CopyTextFromClipboard ()
   {
      String clipString = "";

      //StringSelection selection = new StringSelection ();

      Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
      //selection = clipboard.getContents(selection, selection);

      Transferable content = clipboard.getContents(null);

      try
      {
         clipString = (String) content.getTransferData (DataFlavor.stringFlavor);
         // OR:
         //String clipFlavor = (String) clipboard.getData (DataFlavor.stringFlavor);
         //System.out.println(clipString);
         //System.out.println(clipFlavor);

         //System.out.println ("Pasting from clipboard ...");
      }
      catch (Exception err)
      {
         //System.out.println ("Whoops data is not 'stringFlavor'");
      }

      return clipString;
   }

   public static StringBuffer CopyStringBufferTextFromClipboard ()
   {
      // This is NO faster than the above method - both exactly the same speed.
      // Tested with 10,000 rows x 10 columns of string data copied from an Excel spreadsheet/

      //String clipString = "";
      StringBuffer sb = new StringBuffer();

      //StringSelection selection = new StringSelection ();

      Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
      //selection = clipboard.getContents(selection, selection);

      Transferable content = clipboard.getContents(null);

      try
      {
         //clipString = (String) content.getTransferData (DataFlavor.stringFlavor);
         sb.append ((String) content.getTransferData (DataFlavor.stringFlavor));
         // OR:
         //String clipFlavor = (String) clipboard.getData (DataFlavor.stringFlavor);
         //System.out.println(clipString);
         //System.out.println(clipFlavor);

         //System.out.println ("Pasting from clipboard ...");
      }
      catch (Exception err)
      {
         //System.out.println ("Whoops data is not 'stringFlavor'");
      }

      //return clipString;
      //return sb.toString();
      return sb;
   }


   // *********************************
   // JComboBox
   // *********************************

   public static boolean isItemAlreadyInComboBox (JComboBox<String> myComboBox, String itemStr, boolean caseSensitive)
   {
      boolean itemFound = false;
      String currItem = "";

      for (int k = 0; k < myComboBox.getItemCount(); k++)
      {
         currItem = myComboBox.getItemAt (k);

         if ((caseSensitive == true) && (currItem.compareTo (itemStr) == 0))
         {
            itemFound = true;
         }
         else if ((caseSensitive == false) && (currItem.compareToIgnoreCase (itemStr) == 0))
         {
            itemFound = true;
         }
      }

      return itemFound;
   }

   public static boolean addUniqueItemToComboBox (JComboBox<String> myComboBox, String itemStr, boolean caseSensitive)
   {
      boolean itemAdded = false;

      if ((itemStr                 != null)  &&
          (itemStr.trim().length() >  0   )  &&
          (isItemAlreadyInComboBox (myComboBox, itemStr, caseSensitive) == false) )
      {
         myComboBox.addItem (itemStr);

         itemAdded = true;
      }

      return itemAdded;
   }

   public static void sortComboBox (JComboBox<String> myComboBox)
   {
      sortComboBox (myComboBox, false);
   }

   public static void comboBoxToArrayList (JComboBox<String> myComboBox, ArrayList<String> itemsList, boolean appendData)
   {
      //ArrayList<String> itemsList = new ArrayList<String> ();

      if (appendData == false)
         itemsList.clear();

      // Copy all ComboBox items to List:
      for (int k = 0; k < myComboBox.getItemCount(); k++)
      {
         itemsList.add (myComboBox.getItemAt (k));
      }

      //return itemsList;
   }

   // Example use:
   //    JComboBox myComboBox = new JComboBox ();
   //    Moose_Utils.arrayListToComboBox (myArrayList, myComboBox, false);
   public static void arrayListToComboBox (ArrayList<String> myArrayList, JComboBox<String> comboBox, boolean appendData, boolean allowBlankLines)
   {
      //JComboBox<String> comboBox = new JComboBox<String> ();

      if (appendData == false)
         comboBox.removeAllItems();

      if (myArrayList != null)
      {
         // Copy all ArrayList items to ComboBox:
         for (int k = 0; k < myArrayList.size(); k++)
         {
            String str = myArrayList.get (k).trim();

            if (allowBlankLines == true)
            {
               comboBox.addItem (str);
            }
            else
            {
               // blank lines are not allowed.
               if (str.length() > 0)
               {
                  comboBox.addItem (str);
               }
            }
         }
      }

      //return comboBox;
   }

   // Example use:
   //    JComboBox myComboBox = new JComboBox ();
   //    Moose_Utils.arrayToComboBox (myArray, myComboBox, false);
   public static void arrayToComboBox (String[] strArray, JComboBox<String> comboBox, boolean appendData, boolean allowBlankLines)
   {
      //JComboBox<String> comboBox = new JComboBox<String> ();

      if (appendData == false)
         comboBox.removeAllItems();

      if (strArray != null)
      {
         // Copy all ArrayList items to ComboBox:
         for (int k = 0; k < strArray.length; k++)
         {
            String str = strArray [k].trim();

            if (allowBlankLines == true)
            {
               comboBox.addItem (str);
            }
            else
            {
               // blank lines are not allowed.
               if (str.length() > 0)
               {
                  comboBox.addItem (str);
               }
            }
         }
      }

      //return comboBox;
   }

   public static void sortComboBox (JComboBox<String> myComboBox, boolean caseSensitive)
   {
      // There are probably better / more efficient ways to do this.
      // But this works, is super simple, and dos exactly what I need.

      ArrayList<String> itemsList = new ArrayList<String>();

      comboBoxToArrayList (myComboBox, itemsList, false);

      // Sort the List:
      if (caseSensitive == true)
         Collections.sort(itemsList);
      else
         Collections.sort(itemsList, String.CASE_INSENSITIVE_ORDER);

      // Remove all items from the ComboBox:
      myComboBox.removeAllItems ();

      // Copy the Soted List items to the ComboBox:
      for (int k = 0; k < itemsList.size(); k++)
      {
         myComboBox.addItem (itemsList.get (k));
      }
   }

   public static void saveComboBoxToFile (JComboBox<String> myComboBox, String fileName)
   {
      ArrayList<String> itemsList = new ArrayList<String>();

      comboBoxToArrayList (myComboBox, itemsList, false);

      saveArrayListToFile (itemsList,  fileName);
   }

   public static void loadComboBoxFromFile (JComboBox<String> myComboBox, String fileName)
   {
      ArrayList<String> itemsList = new ArrayList<String>();

      loadArrayListFromFile (fileName, itemsList, false);

      arrayListToComboBox (itemsList, myComboBox, false, true);
   }

   // Sets background to gray or white depending on whether combobox is enabled or not.
   // Example use:
   //   Moose_Utils.setBackgroundComboBox (supportCategoryJComboBox);
   public static void setBackgroundComboBox (JComboBox myComboBox)
   {
      Moose_Utils.setBackgroundComboBox (myComboBox, Color.gray, Color.white);
   }

   public static void setBackgroundComboBox (JComboBox myComboBox, Color enabledColor, Color disabledColor)
   {
      if (myComboBox.isEnabled() == false)
      {
         myComboBox.getEditor().getEditorComponent().setBackground(enabledColor);
         // This makes the combobox look really uglt = big gray border, etc
         //myComboBox.setBackground(enabledColor);
      }
      else
      {
         myComboBox.getEditor().getEditorComponent().setBackground(disabledColor);
         myComboBox.setBackground(disabledColor);
      }
   }

   public static void setForegroundComboBox (JComboBox myComboBox)
   {
      Moose_Utils.setForegroundComboBox (myComboBox, Color.gray, Color.white);
   }

   public static void setForegroundComboBox (JComboBox myComboBox, Color enabledColor, Color disabledColor)
   {
      if (myComboBox.isEnabled() == false)
      {
         myComboBox.getEditor().getEditorComponent().setForeground(enabledColor);
         // This makes the combobox look really uglt = big gray border, etc
         //myComboBox.setForeground(enabledColor);
      }
      else
      {
         myComboBox.getEditor().getEditorComponent().setForeground(disabledColor);
         myComboBox.setForeground(disabledColor);
      }
   }


   // *********************************
   // Java / Environment
   // *********************************
/*
REF:  java.lang.System

java.version Java Runtime Environment version
java.vendor Java Runtime Environment vendor
java.vendor.url Java vendor URL
java.home Java installation directory
returns:    C:\Program Files (x86)\Java\jdk1.8.0_45\jre\

java.vm.specification.version Java Virtual Machine specification version
java.vm.specification.vendor Java Virtual Machine specification vendor
java.vm.specification.name Java Virtual Machine specification name
java.vm.version Java Virtual Machine implementation version
java.vm.vendor Java Virtual Machine implementation vendor
java.vm.name Java Virtual Machine implementation name
java.specification.version Java Runtime Environment specification version
java.specification.vendor Java Runtime Environment specification vendor
java.specification.name Java Runtime Environment specification name
java.class.version Java class format version number
java.class.path Java class path
java.library.path List of paths to search when loading libraries
java.io.tmpdir Default temp file path
java.compiler Name of JIT compiler to use
java.ext.dirs Path of extension directory or directories
os.name Operating system name
os.arch Operating system architecture
os.version Operating system version
file.separator File separator ("/" on UNIX)
path.separator Path separator (":" on UNIX)
line.separator Line separator ("\n" on UNIX)
user.name User's account name
user.home User's home directory
user.dir User's current working directory - current Java Application's folder.
*/

   public static void showAllSystemGetPropertyItems ()
   {
/*
*** Sample output:
java.version : 1.8.0_45
32/64 bit:     x32
java.vendor : Oracle Corporation
java.vendor.url : http://java.oracle.com/
java.home : C:\Program Files (x86)\Java\jdk1.8.0_45\jre
java.vm.specification.version : 1.8
java.vm.specification.vendor : Oracle Corporation
java.vm.specification.name : Java Virtual Machine Specification
java.vm.version : 25.45-b02
java.vm.vendor : Oracle Corporation
java.vm.name : Java HotSpot(TM) Client VM
java.specification.version : 1.8
java.specification.vendor : Oracle Corporation
java.specification.name : Java Platform API Specification
java.class.version : 52.0
java.class.path : .
java.library.path : C:\Program Files (x86)\Java\jdk1.8.0_45\bin;C:\WINDOWS\Sun\Java\bin;C:\WINDOWS\system32;C:\WINDOWS;C:\ProgramData\Oracle\Java\javapath;C:\WINDOWS\system32;C:\WINDOWS;C:\WINDOWS\System32\Wbem;C:\WINDOWS\System32\WindowsPowerShell\v1.0\;C:\Program Files (x86)\ATI Technologies\ATI.ACE\Core-Static;C:\Program Files (x86)\AMD\ATI.ACE\Core-Static;.
java.io.tmpdir : C:\Users\KINKA-~1\AppData\Local\Temp\
java.compiler : null
java.ext.dirs : C:\Program Files (x86)\Java\jdk1.8.0_45\jre\lib\ext;C:\WINDOWS\Sun\Java\lib\ext
os.name : Windows 8.1
os.arch : x86
os.version : 6.3
file.separator : \
path.separator : ;
line.separator :
user.name : Kinka-HPDesktop
user.home : C:\Users\Kinka-HPDesktop
user.dir : I:\Shared_VBox_READ\RAC\CQUni - 2016-T2\Java - Mike's Explorations
*/

      // Java Version, etc
      System.out.println("java.version : " + System.getProperty("java.version"));
      System.out.println("32/64 bit:     x" + System.getProperty ("sun.arch.data.model") );
      System.out.println("java.vendor : " + System.getProperty("java.vendor"));
      System.out.println("java.vendor.url : " + System.getProperty("java.vendor.url"));
      System.out.println("java.home : " + System.getProperty("java.home"));
      System.out.println("java.vm.specification.version : " + System.getProperty("java.vm.specification.version"));
      System.out.println("java.vm.specification.vendor : " + System.getProperty("java.vm.specification.vendor"));
      System.out.println("java.vm.specification.name : " + System.getProperty("java.vm.specification.name"));
      System.out.println("java.vm.version : " + System.getProperty("java.vm.version"));
      System.out.println("java.vm.vendor : " + System.getProperty("java.vm.vendor"));
      System.out.println("java.vm.name : " + System.getProperty("java.vm.name"));
      System.out.println("java.specification.version : " + System.getProperty("java.specification.version"));
      System.out.println("java.specification.vendor : " + System.getProperty("java.specification.vendor"));
      System.out.println("java.specification.name : " + System.getProperty("java.specification.name"));
      System.out.println("java.class.version : " + System.getProperty("java.class.version"));
      System.out.println("java.class.path : " + System.getProperty("java.class.path"));
      System.out.println("java.library.path : " + System.getProperty("java.library.path"));
      System.out.println("java.io.tmpdir : " + System.getProperty("java.io.tmpdir"));
      System.out.println("java.compiler : " + System.getProperty("java.compiler"));
      System.out.println("java.ext.dirs : " + System.getProperty("java.ext.dirs"));
      System.out.println("os.name : " + System.getProperty("os.name"));
      System.out.println("os.arch : " + System.getProperty("os.arch"));
      System.out.println("os.version : " + System.getProperty("os.version"));
      System.out.println("file.separator : " + System.getProperty("file.separator"));
      System.out.println("path.separator : " + System.getProperty("path.separator"));
      System.out.println("line.separator : " + System.getProperty("line.separator"));
      System.out.println("user.name : " + System.getProperty("user.name"));
      System.out.println("user.home : " + System.getProperty("user.home"));
      System.out.println("user.dir : " + System.getProperty("user.dir"));
   }

   /*
    Change code to this in my Apps:
      //int screenWidth  = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
      //int screenHeight = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
      int screenWidth  = Moose_Utils.getScreenWidth  ();
      int screenHeight = Moose_Utils.getScreenHeight ();
   */
   public static int getScreenHeight ()
   {
      // This works for a single monitor / screen:
      /*
      Toolkit kit = Toolkit.getDefaultToolkit();
      Dimension screenSize = kit.getScreenSize();

      return screenSize.height; //height is public instance field.
      */

      // This works for a 1, 2, 3, ... monitors / screens:
      GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
      GraphicsDevice[]    gs = ge.getScreenDevices();
      int maxHeightOfAllScreens = 0;

      for (int i = 0; i < gs.length; i++)
      {
         DisplayMode dm = gs[i].getDisplayMode();
         if (maxHeightOfAllScreens < dm.getHeight())
         {
            maxHeightOfAllScreens = dm.getHeight();
         }
      }
      return maxHeightOfAllScreens;
   }

   public static int getScreenWidth ()
   {
      // This works for a single monitor / screen:
      /*
      Toolkit kit = Toolkit.getDefaultToolkit();
      Dimension screenSize = kit.getScreenSize();

      return screenSize.width; // width is public instance field
      */

      // This works for a 1, 2, 3, ... monitors / screens:
      GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
      GraphicsDevice[]    gs = ge.getScreenDevices();
      int totalWidthOfAllScreens = 0;

      for (int i = 0; i < gs.length; i++)
      {
         DisplayMode dm = gs[i].getDisplayMode();
         totalWidthOfAllScreens += dm.getWidth();
      }
      return totalWidthOfAllScreens;
   }

   // On UNIX systems, it returns "\n"; on Microsoft Windows systems it returns "\r\n".
   // CRLF or LF
   public static String getLineSeparator ()
   {
      return java.lang.System.lineSeparator();
   }

   //Used  = scaleBytesToKBMBGBTBWithUnitsStr (getSystemUsedMemoryBytes (), 1)
   //Free  = scaleBytesToKBMBGBTBWithUnitsStr (getSystemFreeMemoryBytes (), 1)
   //Total = scaleBytesToKBMBGBTBWithUnitsStr (getSystemTotalMemoryBytes (), 1)
   public static long getSystemFreeMemoryBytes ()
   {
      // Returns the amount of free memory in the Java Virtual Machine.
      Runtime runtime = Runtime.getRuntime();
      return runtime.freeMemory();
   }

   public static long getSystemTotalMemoryBytes ()
   {
      // Returns the total amount of memory in the Java virtual machine.
      Runtime runtime = Runtime.getRuntime();
      return runtime.totalMemory();
   }

   public static long getSystemUsedMemoryBytes ()
   {
      // Returns the amount of used memory in the Java virtual machine.
      Runtime runtime = Runtime.getRuntime();
      return runtime.totalMemory() - runtime.freeMemory();
   }

   // System.out.println (scaleBytesToKBMBGBTBWithUnitsStr (2134567, 2));
   // returns "2.13 MB"
   public static String scaleDataWithUnitsStr (double inValue, int numDecimalPlaces, String[] unitsArray)
   {
      long multiplier      = 1000;
      long currMmultiplier = 1;
      String unitsStr      = unitsArray [0];
      double resultVal     = inValue;

      for (int k = 0; k < unitsArray.length; k++)
      {
         if (inValue >= currMmultiplier)
         {
            unitsStr  = unitsArray [k];
            resultVal = 1.0 * inValue / currMmultiplier;
         }
         currMmultiplier = currMmultiplier * multiplier;
      }

      return String.format ("%,." + numDecimalPlaces + "f", resultVal) + " " + unitsStr;
   }


   // System.out.println (scaleHashRatesUnitsStr (2134567, 2));
   // returns "2.13 MH/s"
   public static String scaleHashRatesUnitsStr (double inValue, int numDecimalPlaces)
   {  // https://en.wikipedia.org/wiki/Yotta-
      //                                kilo(K) mega(M) giga(G) tera(T) peta(P) exa(E) zetta(Z) yotta(Y)
      //                      1         10^3    10^6    10^9    10^12   10^15   10^18   10^21   10^24
      String[] unitsArray  = {"H/s",    "KH/s", "MH/s", "GH/s", "TH/s", "PH/s", "EH/s", "ZH/s", "YH/s"};
      return scaleDataWithUnitsStr (inValue, numDecimalPlaces, unitsArray);
   }

   // System.out.println (scaleBytesToKBMBGBTBWithUnitsStr (2134567, 2));
   // returns "2.13 MB"
   public static String scaleBytesToKBMBGBTBWithUnitsStr (long inBytes, int numDecimalPlaces)
   {  // https://en.wikipedia.org/wiki/Yotta-
      //                                kilo(K) mega(M) giga(G) tera(T) peta(P) exa(E) zetta(Z) yotta(Y)
      //                      1         10^3    10^6    10^9    10^12   10^15   10^18   10^21   10^24
      String[] unitsArray  = {"bytes",  "KB",   "MB",   "GB",   "TB",   "PB",   "EB",   "ZB",   "YB"};
      return scaleDataWithUnitsStr (inBytes, numDecimalPlaces, unitsArray);
   }


   // Moved to: ZipAndJar.java
   //public static boolean loadJARFileLibrary (String jarName)
   public static long getJavaVersionReleaseAgeDays ()
   {
      File javaEXEFile = new File (System.getProperty("java.home") +
                                   File.separator + "bin" +
                                   File.separator + "java.exe");

      return getFileAgeDays (javaEXEFile);
   }

   public static Date getJavaVersionReleaseDate ()
   {
      File javaEXEFile = new File (System.getProperty("java.home") +
                                   File.separator + "bin" +
                                   File.separator + "java.exe");

      Date dateModified = new Date (javaEXEFile.lastModified());

      System.out.println (javaEXEFile.toString());

      return dateModified;
   }

   public static String getJavaVersionReleaseDateStr ()
   {
      Date dateModified = getJavaVersionReleaseDate ();

      System.out.println ("-> " + getDateDDD_DD_MMM_YYYY_TimeAMPM (dateModified));

      return getDateDDD_DD_MMM_YYYY_TimeAMPM (dateModified);
   }

   public static String getJavaVersionReleaseDateAgeStr ()
   {
      return getJavaVersionReleaseDateStr ()    +
            "  (" + getJavaVersionReleaseAgeDays () + " days).";
   }
   public static String getJavaVersionReleaseVersionDateAgeStr ()
   {
      return "* Java Version: "      + System.getProperty("java.version") + "\n"  +
             "* Java Installed Date: " + getJavaVersionReleaseDateAgeStr ();
   }


/*
public static void main(String [] args) {

      int mb = 1024*1024;

      //Getting the runtime reference from system
      Runtime runtime = Runtime.getRuntime();

      System.out.println("##### Heap utilization statistics [MB] #####");

      //Print used memory
      System.out.println("Used Memory:"
         + (runtime.totalMemory() - runtime.freeMemory()) / mb);

      //Print free memory
      System.out.println("Free Memory:"
         + runtime.freeMemory() / mb);

      //Print total available memory
      System.out.println("Total Memory:" + runtime.totalMemory() / mb);

      //Print Maximum available memory
      System.out.println("Max Memory:" + runtime.maxMemory() / mb);
   }
}
*/

   // *********************************
   // Files and Directories (Folders), File I/O, File IO
   // *********************************

   public static String getFileSeparator ()
  {
      // Or:
      //return System.getProperty("file.separator")
      return File.separator; // / on Unix or \ on Windows
   }

   public static String getPathSeparator ()
   {
      return System.getProperty("path.separator");
   }

   /*
    Example use:
      String fileNameStr = "abc/\\@#$1.txt";
      fileNameStr = Moose_Utils.replaceCharsThatMightCauseProblemsInFileNameStr (fileNameStr, "-");
    returns: "abc-----1.txt"
   */
   public static String replaceCharsThatMightCauseProblemsInFileNameStr (String fileNameStr, String replaceWithStr)
   {
      // Assume just a file name has been passed.
      // i.e. Not a file with path / folder as well ....

      // Replace chars that might cause problems:
      fileNameStr = fileNameStr.replace ("\\", replaceWithStr);
      fileNameStr = fileNameStr.replace ("/",  replaceWithStr);
      fileNameStr = fileNameStr.replace ("!",  replaceWithStr);
      fileNameStr = fileNameStr.replace ("@",  replaceWithStr);
      fileNameStr = fileNameStr.replace ("#",  replaceWithStr);
      fileNameStr = fileNameStr.replace ("$",  replaceWithStr);
      fileNameStr = fileNameStr.replace ("%",  replaceWithStr);
      fileNameStr = fileNameStr.replace ("^",  replaceWithStr);
      fileNameStr = fileNameStr.replace ("&",  replaceWithStr);
      fileNameStr = fileNameStr.replace ("*",  replaceWithStr);
      fileNameStr = fileNameStr.replace ("|",  replaceWithStr);
      fileNameStr = fileNameStr.replace ("~",  replaceWithStr);
      fileNameStr = fileNameStr.replace ("`",  replaceWithStr);
      fileNameStr = fileNameStr.replace (":",  replaceWithStr);
      fileNameStr = fileNameStr.replace (";",  replaceWithStr);
      fileNameStr = fileNameStr.replace ("'",  replaceWithStr);
      fileNameStr = fileNameStr.replace ("\"", replaceWithStr);
      fileNameStr = fileNameStr.replace ("<",  replaceWithStr);
      fileNameStr = fileNameStr.replace (">",  replaceWithStr);
      fileNameStr = fileNameStr.replace ("?",  replaceWithStr);

      return fileNameStr;
   }



   // File Exists
   // Example use:
   //  boolean fileExists = Moose_Utils.fileExists ("temp.txt");
   public static boolean fileExists (String fileNameStr)
   {
      boolean result = false; // Does not exist.

      if ((fileNameStr != null) && (fileNameStr.length() > 1))
      {
         File file      = new File(fileNameStr);

         if (file.exists() == true)
         {
            result = true; // File does exist.
         }
      }

      return result;
   }


   public static String trimAndMakeSureDirectoryEndsWithSlash (String currentDir)
   {
      if (currentDir == null)
         currentDir = "";

      //if ((currentDir != null) && (currentDir.length() > 0))
      //{
         currentDir = currentDir.trim();

         // Make sure the directory ends with a slash (/ or \ depending on Windows\DOS or Unix/Web)
         if (currentDir.endsWith(File.separator) == false)
         {
            currentDir = currentDir + File.separator;
         }
      //}
      return currentDir;
   }

   // Current Work Directory - the location of the program we
   // are currently compiling / running.
   public static String getCurrentDirectory ()
   {
      return trimAndMakeSureDirectoryEndsWithSlash (System.getProperty("user.dir"));
   }

   // GetFolder, Get Folder, GetDirectory, Get Directory,
   public static String getDirectoryFromFile (File file)
   {
      // OLD, HARD WAY:  Get the directory path (excluding the file name).
      //String directoryPath = fileName.substring(0, fileName.lastIndexOf(File.separator));
      if (file.isDirectory() == true)
         return file.getAbsolutePath();
      else
         return file.getParentFile().getAbsolutePath();
   }

   public static String getDirectoryFromFile (String fileStr)
   {
      return getDirectoryFromFile (new File (fileStr));
   }

   public static String getJavaCompilerBinDirectory ()
   {
      // System.getProperty()
      //  "java.compiler"       Always seems to be null for me.
      //  "java.home"           Returns the JRE path.   e.g. C:\Program Files (x86)\Java\jdk1.8.0_45\jre

      // e.g. java.library.path : C:\Program Files (x86)\Java\jdk1.8.0_45\bin;C:\WINDOWS\Sun\Java\bin;C:\WINDOWS\system32;C:\WINDOWS;C:\ProgramData\Oracle\Java\javapath;C:\WINDOWS\system32;C:\WINDOWS;C:\WINDOWS\System32\Wbem;C:\WINDOWS\System32\WindowsPowerShell\v1.0\;C:\Program Files (x86)\ATI Technologies\ATI.ACE\Core-Static;C:\Program Files (x86)\AMD\ATI.ACE\Core-Static;.

      String compilerStr = "";
      String pathsStr    = System.getProperty("java.library.path");
      String[] tokens    = pathsStr.split(";");

      for (String token : tokens)
      {
         if ((token.toLowerCase().contains ("java") == true) &&
             (token.toLowerCase().contains ("jdk")  == true) &&
             (token.toLowerCase().contains ("bin")  == true))
             compilerStr = token; // Java compiler path found !!
      }

      compilerStr = trimAndMakeSureDirectoryEndsWithSlash (compilerStr);
      return compilerStr;
   }

   // Example use:
   //  String fileExtensionStr = Moose_Utils.getFileExtensionFromStr ("c:\\java\\test.java"); // Returns "java"
   public static String getFileExtensionFromStr (String fileNameStr)
   {
      // Return the file extension as Lowercase without the ".".  e.g. "java"
      String extnStr = "";

      if ((fileNameStr != null) && (fileNameStr.length() > 0))
      {
         // Slash is / or \ depending on Windows\DOS or Unix/Web.
         int    lastSlash = fileNameStr.lastIndexOf (File.separator);

         if (lastSlash >= 0) // Is there an slash ??
            fileNameStr = fileNameStr.substring (lastSlash+1);

         int    lastDot = fileNameStr.lastIndexOf (".");

         if (lastDot >= 0) // Is there an extension ??
            extnStr = fileNameStr.substring (lastDot+1);
      }

      return extnStr.toLowerCase(); // Returns lowercase extension.
   }

   // Example use:
   //   String fileNameStr = Moose_Utils.getFileNameWithoutExtensionOrPath (new File ("c:\temp\abc.dat");
   //
   public static String getFileNameWithoutExtensionOrPath (File file)
   {
      // Return the file name without the "." or the extension or the directory path.
      // e.g. "c:\temp\abc.dat" -> "abc"
      String fileNameStr = file.getName();

      fileNameStr = fileNameStr.replace("." + Moose_Utils.getFileExtensionFromFile(file), "");

      return fileNameStr;
   }

   public static String getFileExtensionFromFile (File file)
   {
      // Return the file extension without the ".".
      // e.g. "abc.java" -> "java"
      return getFileExtensionFromStr (file.getPath ());
   }

   // Example use:
   //    String v2OutFileStr = Moose_Utils.setNewFileExtensionFromStr ("mydata.csv", "txt");
   public static String setNewFileExtensionFromStr (String fileNameStr, String newExtension)
   {
      String currentExtnStr = getFileExtensionFromStr (fileNameStr);
      String newFileNameStr = fileNameStr;

      newFileNameStr = newFileNameStr.substring (0, newFileNameStr.length() - currentExtnStr.length());
      newFileNameStr = newFileNameStr + newExtension;

      return newFileNameStr;
   }

   public static File setNewFileExtensionFromFile (File file, String newExtension)
   {
      newExtension = newExtension.replace (".", ""); // Cannot have a ".".

      return new File (setNewFileExtensionFromStr (file.getPath (), newExtension));
   }

   // Example use:
   //    String v2OutFileStr = Moose_Utils.addFileNamePrefixBeforeExtensionFromStr (csvFile.toString (), "__v2_temp");
   public static String addFileNamePrefixBeforeExtensionFromStr (String fileNameStr, String prefixStr)
   {
      String newFileNameStr = "";

      if ((fileNameStr != null) && (fileNameStr.length() > 0) &&
          (prefixStr   != null) && (prefixStr.length()   > 0)  )
      {
         String currentExtnStr = getFileExtensionFromStr (fileNameStr);
         newFileNameStr = fileNameStr;

         newFileNameStr = newFileNameStr.substring (0, newFileNameStr.length() - currentExtnStr.length() - 1) +
                          prefixStr + "." + currentExtnStr;
      }

      return newFileNameStr;
   }

   public static File addFileNamePrefixBeforeExtensionFromFile (File file, String prefixStr)
   {
      return new File (addFileNamePrefixBeforeExtensionFromStr (file.getPath (), prefixStr));
   }

   public static File[] getAllFilesOfType (final String directoryPath, final String nameStartsWith, final String fileExtension)
   {
      FilenameFilter fileFilter = new FilenameFilter()
      {
         public boolean accept(File file, String name)
         {
            if (((nameStartsWith.length() == 0) || (name.toLowerCase().startsWith (nameStartsWith.toLowerCase()) == true))  &&
                ((fileExtension.length()  == 0) || (name.toLowerCase().endsWith   (fileExtension.toLowerCase())  == true)))
            {
               return true;
            }
            else
            {
               return false;
            }
         }
      };

      File dir     = new File      (directoryPath);
      File[] files = dir.listFiles (fileFilter);
      // if (files.length == 0), there are no files.

      return files;
   }

   /*
    Example use:
      System.out.println ("\n**** All Files (*.*):");
      listAllFilesOfTypeToConsole (getCurrentDirectory (), "", "");

      System.out.println ("\n**** All Class Files (*.class):");
      listAllFilesOfTypeToConsole (getCurrentDirectory (), "", "class");
   */
   public static void listAllFilesOfTypeToConsole (String directoryPath, String nameStartsWith, String fileExtension)
   {
      File[] files = getAllFilesOfType (directoryPath, nameStartsWith, fileExtension);

      // Display files to screen.
      if (files == null)
      {
        System.out.println("No files to list.");
      }
      else
      {
         for (File aFile : files)
         {
           System.out.println(aFile.getName() + " - " + aFile.length() + " bytes");
         }
      }
   }

/*
REPLACE_EXISTING  If the target file exists, then the target file is replaced if it is not a non-empty directory. If the target file exists and is a symbolic link, then the symbolic link itself, not the target of the link, is replaced.
COPY_ATTRIBUTES  Attempts to copy the file attributes associated with this file to the target file. The exact file attributes that are copied is platform and file system dependent and therefore unspecified. Minimally, the last-modified-time is copied to the target file if supported by both the source and target file stores. Copying of file timestamps may result in precision loss.
NOFOLLOW_LINKS  Symbolic links are not followed. If the file is a symbolic link, then the symbolic link itself, not the target of the link, is copied. It is implementation specific if file attributes can be copied to the new link. In other words, the COPY_ATTRIBUTES option may be ignored when copying a symbolic link.
*/
   public static boolean copyFile(File src, File dest) throws IOException
   {
      boolean successFlag = false; // Error

      //Files.copy(src.toPath(), dest.toPath());

      // Make sure the folder exists on the Destination:
      String destFolderStr = Moose_Utils.getDirectoryFromFile (dest);
      Moose_Utils.createDirectoryIfNotAlreadyExists (destFolderStr);

      Files.copy(src.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.COPY_ATTRIBUTES, LinkOption.NOFOLLOW_LINKS);

      // Was entire file (all bytes) copied ??
      if (getFileSizeBytes (src) == getFileSizeBytes (dest))
         successFlag = true; // All OK

      return successFlag;
   }

   // Based on REF: http://stackoverflow.com/questions/106770/standard-concise-way-to-copy-a-file-in-java
/*
   public static boolean copyFile(File src, File dst) throws IOException
   {
       boolean copyResult = false;

       if (src.compareTo (dst) == 0)
       {
          // Do nothing more - src and dst files are the same file.
       }
       else
       {

          InputStream in = new FileInputStream(src);

          try
          {
              OutputStream out = new FileOutputStream(dst);

              try
              {
                  // Transfer bytes from in to out
                  byte[] buf = new byte[1024];
                  int len;

                  while ((len = in.read(buf)) > 0)
                  {
                      out.write(buf, 0, len);
                  }

                  copyResult = true;
              }
              finally
              {
                  out.close();
              }
          }
          finally
          {
              in.close();
          }
       }

       return copyResult;
   }
*/

   public static boolean copyFile(String src, String dst) throws IOException
   {
       return copyFile (new File (src), new File (dst));
   }

   // Delete file
   // Example use:
   //  boolean fileDeleted = Moose_Utils.deleteFile ("temp.txt");
   public static boolean deleteFile (String fileNameStr)
   {
      File file = new File (fileNameStr);

      return deleteFile (file);
   }

   public static boolean deleteFile (File file)
   {
      boolean successFlag = false; // ERROR.

      try
      {
         successFlag = Files.deleteIfExists (file.toPath ());

         if (successFlag == false)
            throw new IOException ();
      }
      catch (IOException | SecurityException e)
      {
         //System.err.println(e);
         System.out.println ("ERROR: file could not be deleted: " + file.toString());
      }

      return successFlag;
   }


   // Rename file 1 to file2
   /*
   Path source = Paths.get("from/path");
   Path newdir = Paths.get("to/path");
   Files.move(source, newdir.resolve(source.getFileName()), REPLACE_EXISTING);
   */

   public static boolean moveFile (String file1Str, String file2Str)
   {
      return renameFile (file1Str, file2Str);
   }

   public static boolean moveFile (File file1, File file2)
   {
      return renameFile (file1, file2);
   }

   public static boolean renameFile (String file1Str, String file2Str)
   {
      File file1 = new File (file1Str);
      File file2 = new File (file2Str);

      return renameFile (file1, file2);
   }

   public static boolean renameFile (File file1, File file2)
   {
      boolean successFlag = false; // ERROR.

      try
      {
         String destFolderStr = Moose_Utils.getDirectoryFromFile (file2);
         Moose_Utils.createDirectoryIfNotAlreadyExists (destFolderStr);

         Files.move (file1.toPath(), file2.toPath());

         //if (result == false)
         //   throw new IOException ();

         successFlag = true;
      }
      catch (IOException | SecurityException e)
      {
         //System.err.println(e);
         System.out.println ("ERROR: file could not be renamed from: '" + file1.toString() +
                             "', to: " + file2.toString() + "'.");
      }

      return successFlag;
   }


   public static void deleteAllFilesOfType (String directoryPath, String nameStartsWith, String fileExtension)
   {
      // Example use to delete ALL class files in the current work directory:
      //   Moose_Utils.deleteAllFilesOfType (Moose_Utils.getCurrentDirectory (), "", ".class");

      File[] files = getAllFilesOfType (directoryPath, nameStartsWith, fileExtension);

      // Display files to screen.
      if (files == null)
      {
        System.out.println("No files to delete.");
      }
      else
      {
         for (File aFile : files)
         {
            try
            {
               boolean success = Files.deleteIfExists (aFile.toPath ());
            }
            catch (IOException | SecurityException e)
            {
               //System.err.println(e);
               System.out.println ("ERROR: file could not be deleted: " + aFile.toString());
            }
         }
      }
   }

   /* Example use:   (BackupFileOrganiser is a class that extends JFrame).
      // Center dialog inside GUI JFrame.
      File selectedDir = Moose_Utils.promptUserToSelectDirectory (BackupFileOrganiser.this, "Select Folder:",
                                                                  selectedFolderTextField.getText());
      // Center dialog in screen.
      File selectedDir = Moose_Utils.promptUserToSelectDirectory (null, "Select Folder:",
                                                                  selectedFolderTextField.getText());
   */
   public static File promptUserToSelectDirectory (JFrame currentFrame, String dialogTitleStr, String defaultDirStr)
   {
      File selectedDir  = null;
      JFileChooser chooser = new JFileChooser();
      //Class currentClass   = new Object() { }.getClass().getEnclosingClass();
      //System.out.println ("promptUserToSelectDirectory: currentClass= " + currentClass);

      defaultDirStr.trim();

      if (defaultDirStr.compareTo("") == 0)
         defaultDirStr = ".";

      chooser.setCurrentDirectory  (new File(defaultDirStr));
      chooser.setDialogTitle       (dialogTitleStr);
      chooser.setFileSelectionMode (JFileChooser.DIRECTORIES_ONLY);

      // disable the "All files" option.
      chooser.setAcceptAllFileFilterUsed(false);

      //if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
      // Center dialog inside parent JFrame.
      if (chooser.showOpenDialog(currentFrame) == JFileChooser.APPROVE_OPTION)
      {
         selectedDir  = new File ("");

         selectedDir = chooser.getSelectedFile();
      }
      //System.out.println ("promptUserToSelectDirectory - selectedDir= " + selectedDir);

      return selectedDir;
   }

   public static String promptUserToSelectDirectoryString (JFrame currentFrame, String dialogTitleStr, String defaultDirStr)
   {
      File selectedDir = Moose_Utils.promptUserToSelectDirectory (currentFrame, dialogTitleStr, defaultDirStr);
      return selectedDir.getAbsolutePath();
   }


   public static String fileToString (String inFileStr)
   {
      // StringBuffer are *much* faster than String.
      StringBuffer fileContentsStrBuff = new StringBuffer();

      try
      {
         FileReader fileReader = new FileReader(inFileStr);

         /*
         // *** OLD / SLOW Way:
         Scanner inFile = new Scanner(fileReader);

         while(inFile.hasNext() == true)
         {
            // fileContentsStr = fileContentsStr + inFile.nextLine() + "\n";
            fileContentsStrBuff.append (inFile.nextLine() + "\n");
         }

         inFile.close();
         */

         // *** NEW / FAST Way:
         BufferedReader bufferedReader = new BufferedReader(fileReader);
         String line = "";

         while ((line = bufferedReader.readLine()) != null)
         {
            fileContentsStrBuff.append (line + "\n");
         }

         bufferedReader.close();
         fileReader.close();
      }
      catch(NoSuchElementException ex)
      {
         fileContentsStrBuff.append ("Error: No such element found in the file '" + inFileStr + "'.");
      }
      catch(FileNotFoundException ex)
      {
         fileContentsStrBuff.append ("Error: Input file '" + inFileStr + "'not found.");
      }
      catch(IOException ex)
      {
         fileContentsStrBuff.append ("Error: Input file '" + inFileStr + "' could not be read.");
      }


      return fileContentsStrBuff.toString();
   }

   public static String fileToString (String inFileStr, int linesToRead)
   {
      // StringBuffer are *much* faster than String.
      StringBuffer fileContentsStrBuff = new StringBuffer();
      int linesRead = 0;

      try
      {
         FileReader fileReader = new FileReader(inFileStr);

         /*
         // *** OLD / SLOW Way:
         Scanner inFile = new Scanner(fileReader);

         while ( (inFile.hasNext() == true) && (linesRead < linesToRead) )
         {
            // fileContentsStr = fileContentsStr + inFile.nextLine() + "\n";
            fileContentsStrBuff.append (inFile.nextLine() + "\n");

            linesRead++;
         }

         inFile.close();
         */

         // *** NEW / FAST Way:
         BufferedReader bufferedReader = new BufferedReader(fileReader);
         String line = "";

         while (((line      = bufferedReader.readLine()) != null) &&
                (linesRead < linesToRead) )
         {
            fileContentsStrBuff.append (line + "\n");
            linesRead++;
         }

         bufferedReader.close();
         fileReader.close();
      }
      catch(NoSuchElementException ex)
      {
         fileContentsStrBuff.append ("Error: No such element found in the file '" + inFileStr + "'.");
      }
      catch(FileNotFoundException ex)
      {
         fileContentsStrBuff.append ("Error: Input file '" + inFileStr + "'not found.");
      }
      catch(IOException ex)
      {
         fileContentsStrBuff.append ("Error: Input file '" + inFileStr + "' could not be read.");
      }

      return fileContentsStrBuff.toString();
   }


   // String str   = "Hello Moose";
   // byte[] bytes = str.getBytes();
   // String str2  = new String (bytes);
   public static byte[] stringToByteArray (String str)
   {
      return str.getBytes();
   }

   public static String byteArrayToString (byte[] bytes)
   {
      // You should always specify the encoding when
      // converting bytes.
      String outStr = "";
      try
      {
       //outStr = new String (bytes);          // NO !
         outStr = new String (bytes, "UTF-8"); // YES !
      }
      catch (UnsupportedEncodingException err)
      {
         outStr = "";
      }
      return outStr;
   }


   // To convert output to a String:
   // byte[] fileBytes = calculateChecksumForFile (checkSumType, Moose_Utils.fileToBytesArray (inFileName).toString()) );
   // String fileStr   = new String (fileBytes);
   // To convert string back to array of bytes:
   // byte[] fileBytes2 = fileStr.getBytes();
   public static byte[] fileToBytesArray (File file)
   {
      byte[] fileBytes = null;

      try
      {
         // Reads all the bytes and close file (even if error).
         fileBytes = Files.readAllBytes(file.toPath());
      }
      catch (Exception err)
      {
      }

      return fileBytes;
   }

   public static byte[] fileToBytesArray (String inFileStr)
   {
      return fileToBytesArray (new File (inFileStr));
   }


   // Moved to: ZipAndJar.java
   //public static String fileToStringFromInsideJAR (String inFileStr)

   // Moved to: ZipAndJar.java
   //public static ArrayList<String> fileToStringArayListFromInsideJAR (String inFileStr)


   public static Date getFileModifiedDateTime (File myFile)
   {
      Date dateModified = null;

      if (myFile != null)
      {
         dateModified = new Date (myFile.lastModified());
      }
      return dateModified;
   }

   public static double getDaysSinceFileModified (File myFile)
   {
      double daysSinceFileModified = 0.0;
      Date dateModified = null;
      Date currDate = new Date ();

      LocalDate currLocalDate = currDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

      if (myFile != null)
      {
         dateModified = getFileModifiedDateTime (myFile);

         LocalDate dateModifiedLocalDate = dateModified.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

         daysSinceFileModified = Math.abs (ChronoUnit.DAYS.between(currLocalDate, dateModifiedLocalDate));
      }
      return daysSinceFileModified;
   }

   public static double getSecondsSinceFileModified (File myFile)
   {
      double secondsSinceFileModified = 0.0;
      Date dateModified = null;
      Date currDate = new Date ();

      // Must be LocalDateTime  and NOT LocalDate to use the ChronoUnit.SECONDS.between function.
      // Found this out after trial and error ...  Moose.
      LocalDateTime  currLocalDate = currDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();

      if (myFile != null)
      {
         dateModified = getFileModifiedDateTime (myFile);

         LocalDateTime  dateModifiedLocalDate = dateModified.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();

         secondsSinceFileModified = Math.abs (ChronoUnit.SECONDS.between(currLocalDate, dateModifiedLocalDate));
      }
      return secondsSinceFileModified;
   }

   public static long getFileSizeBytes (String myFileStr)
   {
      return getFileSizeBytes (new File (myFileStr) );
   }

   public static long getFileSizeBytes (File myFile)
   {
      long fileSizeBytes = 0;

      if (myFile != null)
      {
         fileSizeBytes = myFile.length();
      }
      return fileSizeBytes;
   }

   // OLD WAY: look up file extension is a list of
   // "known" text file extensions.
   // This was a stop gap "solution" to get me up and running.
   // Misses many files that are text files, and fails
   // when a binary file is renamed with a ".txt" extension.
   /*
   public static boolean isTextFile (File myFile)
   {
      boolean result = false;

      if (myFile != null)
      {
         String fileExtension = Moose_Utils.getFileExtensionFromFile (myFile);

         // Add "," before and after extension, so we can make sure that
         // the entire file extension is on the text files list or not.
         fileExtension = "," + fileExtension + ",";
         fileExtension = fileExtension.toLowerCase();

         if (TEXT_FILES_EXTENSIONS_LIST.indexOf (fileExtension, 0) >= 0)
         {
            result = true;
         }
      }

      return result;
   }
   */


   /* REF: https://stackoverflow.com/questions/220547/printable-char-in-java

      This was the "Font" independent way.  (see below).
   OR:
      If you want detect if character can be drawn to
      Graphics object, and if not print some placeholder
      char you might find usefull:

      Font.canDisplay(int)

      It will check whether font can display specific
      codepoint (it is more that check whether font is
      displayable at all -- since there are chars that are
      displayable - like a - but some fonts cant display them.
   */
   public static boolean isPrintableChar( char c )
   {
      Character.UnicodeBlock block = Character.UnicodeBlock.of( c );
      return (!Character.isISOControl(c))    &&
               c != KeyEvent.CHAR_UNDEFINED  &&
               block != null                 &&
               block != Character.UnicodeBlock.SPECIALS;
   }

   public static boolean isNullChar( char c )
   {
      return c == 0; // Nul char = ASCII 0 (zero).
   }

   /*
   Python function - is file binary?

   Function which determines if a given file is binary.

   Test is based on the following algorithm (similar to
   that implemented within Perl):

   • Empty files are considered text.

   • If not empty, read up to 512 bytes as a buffer.
     File will be binary if:
    - Null byte is encountered.
    - More than 30% of the buffer consists of "non text" characters.

   • Otherwise, file is text.

   Reference
   • https://gist.github.com/magnetikonline/7a21ec5f5bcdbf7adb92f9d617e6198f
   • http://eli.thegreenplace.net/2011/10/19/perls-guess-if-file-is-text-or-binary-implemented-in-python
   • http://code.activestate.com/recipes/173220/
   • https://stackoverflow.com/questions/1446549/how-to-identify-binary-and-text-files-using-python/1446870#1446870
   */
   public static boolean isTextFile (File myFile)
   {
      boolean result         = false;
      int numCharsRead       = 0;
      int numNulls           = 0;
      int numTextChars       = 0; // Printable characters: letters, numbers, !@#$%, etc.
      int numNonTextChars    = 0;
      double pctNonTextChars = 0.0;
      byte[] buffer          = new byte [0];

      try (InputStream inputStream = new FileInputStream(myFile);)
      {
         //byte[] buffer = new byte[512 * 1024 * 1024]; // 512Mb
         buffer          = new byte[512]; // 512 bytes.
         numCharsRead    = inputStream.read (buffer);
      }
      catch (Exception err)
      {
      }

      for (int k = 0; k < numCharsRead; k++)
      {
         if (isNullChar ((char)buffer[k]) == true)
         {
            numNulls++;
         }
         else if (isPrintableChar ((char)buffer[k]) == true)
         {
            numTextChars++;
         }
         else
         {
            numNonTextChars++;
         }
      }

      if (numCharsRead > 0)
      {
         pctNonTextChars = 100.0 * numNonTextChars / numCharsRead;
      }

      if ((numNulls == 0) && (pctNonTextChars < 30.0))
      {
         result = true; // A text file.
      }

      System.out.println
         (" - " + myFile.getName() +
          ", numCharsRead="    + numCharsRead +
          ", nulls="           + numNulls +
          ", numTextChars="    + numTextChars +
          ", numNonTextChars=" + numNonTextChars +
          ", pctNonTextChars=" + String.format ("%,.2f", pctNonTextChars)
          );

      return result;
   }



   // Parameter is: File object
   public static long getFileLineCount (File myFile)
   {
      ArrayList<String> fileLinesArrayList = new ArrayList<String>();

      long lineCount = -1; // Error.

      if (isTextFile (myFile) == true)
      {
         Moose_Utils.loadArrayListFromFile (myFile.toString(), fileLinesArrayList, false);

         lineCount = fileLinesArrayList.size();
      }

      return lineCount;
   }

   public static long getFileLineCount (String myFileStr)
   {
      return getFileLineCount (new File (myFileStr) );
   }

   // Create an EMPTY File - erase the file's contents so it is empty.
   // This method is VERY dangerous - the file's data is deleted without further warning !!!!
   public static String eraseFileContents (String fileName)
   {
      String resultStr = "";

      File file = new File(fileName);

      try
      {
         if (file.isFile() == true) // if NOT a Directory / Folder ...
         {
            Formatter outputFile = new Formatter (fileName);

            outputFile.close();

            resultStr = "Erased";
         }
         else
         {
            resultStr = "Error: cannot erase a directory";
         }
      }
      catch(FileNotFoundException ex)
      {
         resultStr = "File not found: " + fileName;
         System.out.println  (resultStr);
      }
      catch(NoSuchElementException ex)
      {
         resultStr = "No such element found in the file: " + fileName;
         System.out.println  (resultStr);
      }
      catch(FormatterClosedException ex)
      {
         resultStr = "Error writing to file: " + fileName;
         System.out.println  (resultStr);
      }

      return resultStr;
   }

   // strToFile, StringToFile
   // Example use:
   //   Moose_Utils.writeOrAppendStringToFile ("names.dat", "Mike\nFrankie\nBella", false);
   public static boolean writeOrAppendStringToFile (String fileName, String dataToWrite, boolean appendToFile)
   {
      BufferedWriter bw = null;
      FileWriter     fw = null;
      boolean result    = false; // ERROR / No data written.

      try
      {
         File file = new File(fileName);

         // if file doesnt exist, then create it:
         if (file.exists() == false)
         {
            file.createNewFile();
         }

         // if appendToFile is true, then append file.
         fw = new FileWriter(file.getAbsoluteFile(), appendToFile);
         bw = new BufferedWriter(fw);

         bw.write(dataToWrite);

         bw.close();
         fw.close();

         //System.out.println("Write to '" + fileName + "' = Done.");

         result  = true; // Data written.
      }
      catch (IOException e)
      {
         e.printStackTrace();
         result  = false; // ERROR / No data written.
      }
      finally
      {
         // Is this *really* necessary ?
         try
         {
            if (bw != null)
               bw.close();

            if (fw != null)
               fw.close();

         }
         catch (IOException ex)
         {
            ex.printStackTrace();
            result  = false; // ERROR / No data written.
         }
      }

      return result;
   } // public static boolean writeOrAppendStringToFile



   // Get File Name without Path, Without Directory
   // Keywords: Get file name without path.  FileNameWithoutPath FileNameNoPath FileNoDir
   // Example use:
   //    Moose_Utils.getFileNameFromFileNameWithPath ("c:\\temp\\docs\\abc.txt");
   // returns: abc.txt
   public static String getFileNameFromFileNameWithPath (String fileNameWithPath)
   {
      String outStr = fileNameWithPath;
      int slashLocn = outStr.indexOf (System.getProperty("file.separator"), 0);

      while (slashLocn >= 0)
      {
         slashLocn = outStr.indexOf (System.getProperty("file.separator"), 0);

         outStr = outStr.substring (slashLocn + 1, outStr.length());
      }

      return outStr;
   }


   // Gets an ArrayList of Files in a directory.  Does NOT include any sub-directories.
   // Parameter: String object.
   // Example use:
   //   ArrayList<File> filesArrayList = Moose_Utils.getAllFilesInDirectory ("C:/RAC/Java - Mike's Explorations/");
   public static ArrayList<File> getAllFilesInDirectory (String folderNameStr)
   {
      folderNameStr = trimAndMakeSureDirectoryEndsWithSlash (folderNameStr);

      return getAllFilesInDirectory (new File(folderNameStr) );
   }

   // Gets an ArrayList of Files in a directory.  Does NOT include any sub-directories.
   // Parameter: File object.
   // Example use:
   //   ArrayList<File> filesArrayList = Moose_Utils.getAllFilesInDirectory (new File("C:/RAC/Java - Mike's Explorations/"));
   public static ArrayList<File> getAllFilesInDirectory (File aFile)
   {
      ArrayList<File> filesArrayList      = new ArrayList<File> ();

      if(aFile.isFile() == true)
      {
         filesArrayList.add (aFile);
      }
      else if (aFile.isDirectory() == true)
      {
         File[] listOfFiles = aFile.listFiles();

         if(listOfFiles != null)
         {
            for (int i = 0; i < listOfFiles.length; i++)
            {
               filesArrayList.add (listOfFiles[i]);
            }
         }
      }

      return filesArrayList;
   }


   // Gets an ArrayList of Files in a directory and all of its sub-directories.
   // Parameter: String object.
   // Typo: missing "t", should be getAllFilesInDirectoryAndAllSubDirectories.
   // Example use:
   //   ArrayList<File> filesArrayList = Moose_Utils.getAllFilesInDirecoryAndAllSubDirectories ("C:/RAC/Java - Mike's Explorations/");
   public static ArrayList<File> getAllFilesInDirecoryAndAllSubDirectories (String folderNameStr)
   {
      folderNameStr = trimAndMakeSureDirectoryEndsWithSlash (folderNameStr);

      return getAllFilesInDirecoryAndAllSubDirectories (new File(folderNameStr) );
   }

   // Gets an ArrayList of Files in a directory and all of its sub-directories.
   // Parameter: File object.
   // Typo: missing "t", should be getAllFilesInDirectoryAndAllSubDirectories.
   // Example use:
   //   ArrayList<File> filesArrayList = Moose_Utils.getAllFilesInDirecoryAndAllSubDirectories (new File("C:/RAC/Java - Mike's Explorations/"));
   public static ArrayList<File> getAllFilesInDirecoryAndAllSubDirectories (File aFile)
   {
      ArrayList<File> filesArrayList      = new ArrayList<File> ();

      if(aFile.isFile() == true)
      {
         filesArrayList.add (aFile);
      }
      else if (aFile.isDirectory() == true)
      {
         //filesArrayList.add (aFile);

         File[] listOfFiles = aFile.listFiles();

         if(listOfFiles != null)
         {
            for (int i = 0; i < listOfFiles.length; i++)
            {
               filesArrayList.addAll (getAllFilesInDirecoryAndAllSubDirectories (listOfFiles[i]));
            }
         }
      }

      return filesArrayList;
   }


   public static void listFilesAndFoldersInArrayList (ArrayList<File> filesArrayList)
   {
      for (int k = 0; k < filesArrayList.size(); k++)
      {
         if (filesArrayList.get(k).isDirectory() == true)
         {
            // toString(): Directory name with full absolute path.
            // getName():  Directory name (no path).
            System.out.println ("" + filesArrayList.get(k).getName());
         }
         if (filesArrayList.get(k).isFile() == true)
         {
            // toString(): File name with full absolute path.
            // getName():  File name (no path).
            System.out.println (" - " + filesArrayList.get(k).getName());
         }
      }
   }


   public static long getFileAgeDays (File file)
   {
      long fileAgeDays = 0;

      Date currDate = new Date ();
      LocalDate currLocalDate = currDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

      if ((file.exists() == true) && (file.isFile() == true))
      {
         Date Date_Created = new Date (file.lastModified());
         LocalDate dateCreatedLocalDate = Date_Created.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

         fileAgeDays = ChronoUnit.DAYS.between(currLocalDate, dateCreatedLocalDate);
      }

      return fileAgeDays;
   }

   public static long getFileAgeDays (String fileNameStr)
   {
      return getFileAgeDays (new File (fileNameStr));
   }


   // Example use:
   //     Moose_Utils.setFileLastModifiedDateTime (new File ("c:\\temp\\moose.txt", "2020-02-04 09:16:23", "yyyy-MM-dd HH:mm:ss");
   public static boolean setFileLastModifiedDateTime (File file, String newLastModifiedStr, String dateFormatStr)
   {
      Date newDate = Moose_Utils.toDate (newLastModifiedStr, dateFormatStr);

      return setFileLastModifiedDateTime (file, newDate);
   }

   public static boolean setFileLastModifiedDateTime (File file, Date newLastModified)
   {
      boolean result = false; // error.

      try
      {
         System.out.println("OLD Last Modified Date: " +
                            Moose_Utils.DDD_DDMMYYYY_HHMMSS_DATE_TIME_FORMAT.format (file.lastModified()) );

         //file.setLastModified(newLastModified.getTime()); // Get milliseconds since January 1, 1970, 00:00:00 GM.

         Path path = file.toPath();
         //long time = System.currentTimeMillis();
         long time = newLastModified.getTime();

         /* Get FileTime value */
         FileTime fileTime = FileTime.fromMillis(time);

         /* Change Created Time Stamp */
         Files.setAttribute(path, "basic:creationTime",     fileTime, NOFOLLOW_LINKS);
         Files.setAttribute(path, "basic:lastAccessTime",   fileTime, NOFOLLOW_LINKS);
         Files.setAttribute(path, "basic:lastModifiedTime", fileTime, NOFOLLOW_LINKS);

         //System.out.println("NEW Last Modified Date: " +
         //                   Moose_Utils.DDD_DDMMYYYY_HHMMSS_DATE_TIME_FORMAT.format (file.lastModified()) );

         result = true; // All OK.
      }
      catch(Exception e)
      {
         result = false; // error.

         e.printStackTrace();
      }

      return result;
   }

/*

In Java7 there is a more sophisticated way to get (or set!) file attributes, including creation time.

public void printFileCreationTime() throws IOException {
Path path = Paths.get(“C:\\myfile.txt”);
BasicFileAttributeView basicView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
BasicFileAttributes basicAttr = basicView.readAttributes();
LOG.info(String.format(“BasicFileAttribute creationTime: %s”, basicAttr.creationTime()));
}

If you don’t use log4j, replace the LOG.info(String.format()) to System.out.format(), or something similar.

There are lots of other attribute views, with lots of fields. Check them out.



import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import static java.nio.file.LinkOption.NOFOLLOW_LINKS;
public class FileCreatedTime {
    public static void main(String[] args) throws Exception {
        // Step  -1: Access the file in Path object
        Path path = Paths.get("C:", "test.xml");
        // Get System time to set against created timestamp
        long time = System.currentTimeMillis();
        // Get FileTime value
        FileTime fileTime = FileTime.fromMillis(time);
        // Change Created Time Stamp
        Files.setAttribute(path, "basic:creationTime", fileTime, NOFOLLOW_LINKS);
    }
}
*/



   public static boolean createDirectoryIfNotAlreadyExists (String folderNameStr)
   {
      boolean result = false; // Error.

      Path folderPath = Paths.get(folderNameStr);

      if ((Files.exists(folderPath) == true) && (Files.isDirectory(folderPath) == true))
      {
         // Do Nothing
         result = true; // Already exists.
      }
      else
      {
         File newFolder = new File(folderNameStr);

         result =  newFolder.mkdir();
      }

      return result;
   }



   // *********************************
   // SOUNDS, Audio
   // *********************************

   // Example use:
   //    playSound ("Whip-sound-effect.wav");
   public static void playSound (String soundFileName) //throws Exception
   {
      //URL url = new URL ("http://pscode.org/media/leftright.wav");
      File soundFile = new File (soundFileName);

      try
      {
         Clip clip = AudioSystem.getClip ();

         // getAudioInputStream() accepts a URL or File or InputStream.
         AudioInputStream ais = AudioSystem.getAudioInputStream (soundFile);

         clip.open(ais);
         //clip.loop(Clip.LOOP_CONTINUOUSLY);
         clip.loop(0); // Play sound once.
      }
      catch (Exception err)
      {
         // LineUnavailableException
         // UnsupportedAudioFileException

         err.printStackTrace ();
      }
   }

   // *********************************
   // DIALOGS - Common Dialogs
   // *********************************

   public static String getUsernameSanitisedStr ()
   {
      String userName = System.getProperty("user.name");

      if ((userName.compareToIgnoreCase ("STD-User__Mike") == 0) ||
          (userName.compareToIgnoreCase ("Moose__Std")     == 0) ||
          (userName.compareToIgnoreCase ("M.omalley")      == 0) ||
          (userName.compareToIgnoreCase ("Omalley")        == 0) ||
          (userName.compareToIgnoreCase ("MichaelO")       == 0) ||
          (userName.compareToIgnoreCase ("Omalley")        == 0) ||
          (userName.compareToIgnoreCase ("Omalleym")       == 0) ||
          (userName.compareToIgnoreCase ("Kinka")          == 0) )
      {
         // Hide my real username for screen shots - just in case a
         // hacker could use it against me.
         userName = "Moose";
      }

      return userName;
   }

   // Get the dialog contents, without displaying the dialog.
   // Useful sometimes ...
   public static String getDisplayAboutDialogStr (JFrame currentFrame, String applicationTitle, String authorName, String additionalText, String copyrightHolderStr)
   {
      //Date Current_System_Date  = new Date ();
      String result       = "";
      String userName     = getUsernameSanitisedStr ();
      String copyrightStr = "";

      if (Moose_Utils.containsIgnoreCase ("Centacare", copyrightHolderStr) == true)
      {
         copyrightStr = "Copyright (C) CentacareCQ " +
             Moose_Utils.getCurrentYear() +
             ".  All Rights Reserved.";
      }
      else
      {
         copyrightStr = "100% Freeware - free for any person or company to use !";
      }


      result =
         applicationTitle + "\nby " + authorName                      + "\n\n" +
         copyrightStr     + "             "                           + "\n\n" +
         //CENTURY_DATE_FORMAT.format (Current_System_Date)           + "\n\n" +
         "System Information: "                                       + "\n"   +
         "* Java Version: "      + System.getProperty("java.version") + "\n"   +
         "* Java Installed Date: " + getJavaVersionReleaseDateAgeStr () + "          " + "\n"   +
         "* Java Home Folder: "  + System.getProperty("java.home")    + "\n"   +
         "* Java Architecture: " + System.getProperty("os.arch")      + "\n"   +
         "* JVM Memory Used: "   + scaleBytesToKBMBGBTBWithUnitsStr (getSystemUsedMemoryBytes (), 1) + "\n"   +
         "* JVM Memory Free: "   + scaleBytesToKBMBGBTBWithUnitsStr (getSystemFreeMemoryBytes (), 1) + "\n"   +
         "* JVM Memory Total: "  + scaleBytesToKBMBGBTBWithUnitsStr (getSystemTotalMemoryBytes (), 1) + "\n"   +
         "\n"   +
         "* Operating System: "  + System.getProperty("os.name")      + " (v"  +
                                   System.getProperty("os.version")   + ")\n"  +
         "\n" +
         "* Screen: "  + getScreenWidth () + "w x " + getScreenHeight () + "h" + "\n";

      if (currentFrame != null)
      {
         result +=
            "* Application: "  + currentFrame.getWidth () + "w x " + currentFrame.getHeight () + "h" + "\n"   +
            "\n";
      }

      result +=
       //"* Current User: "      + System.getProperty("user.name")        + "\n\n",
         "* Domain Name\\Username: " + System.getenv("USERDOMAIN")        + "\\" + userName + "\n" +
       //"* Current User: "      + userName                               + "\n" +
         "\n" +
//         "* Current HostName: "      + Network.getCurrentHostName ()      + "\n" +
//         "* Current IP Address: "    + Network.getLanIPAddress ()         + "\n" +
       //"* LAN IP: "                + Network.getCurrentHostIPAddress () + "\n" +
       //"* WAN IP: "                + Network.getWanIPAddress ()         + "\n" +
         additionalText + "\n";

      return result;
   }

   // Overloaded version: no copyrightHolderStr.
   public static String getDisplayAboutDialogStr (JFrame currentFrame, String applicationTitle, String authorName, String additionalText)
   {
      return getDisplayAboutDialogStr (currentFrame, applicationTitle, authorName, additionalText, "");
   }


   // Get the dialog contents, without displaying the dialog.
   // as HTML = nicely formatted !
   // Useful sometimes ...
   public static String getDisplayAboutDialogHTMLStr (JFrame currentFrame, String applicationTitle, String authorName, String additionalText, String copyrightHolderStr)
   {
      // NOTE WELL: if you include any "\n" in the HTML, it will NOT
      //            display as HTML in the dialog !!!!
      //Date Current_System_Date  = new Date ();
      String htmlStr      = "";
      String userName     = getUsernameSanitisedStr ();
      String copyrightStr = "";

      if (Moose_Utils.containsIgnoreCase ("Centacare", copyrightHolderStr) == true)
      {
         copyrightStr = "Copyright (C) CentacareCQ " +
             Moose_Utils.getCurrentYear() +
             ".  All Rights Reserved.";
      }
      else
      {
         copyrightStr = "100% Freeware - free for any person or company to use !";
      }


      // NOTE WELL: if you include any "\n" in the HTML, it will NOT
      //            display as HTML in the dialog !!!!
      htmlStr = "<html>" +
         "<h1>" + applicationTitle  + "</h1>" +
         "<p>by <font color=blue> " + authorName            + "<font></p>"  +
         "<p>" + copyrightStr                               + "</p>"  +
         //CENTURY_DATE_FORMAT.format (Current_System_Date)           +
         "<table border=1>" +
         "<tr><caption>System Information: <caption>"  +
         "<tr><td>* Java Version:        </td><td>" + System.getProperty("java.version") + "</td></tr>"   +
         "<tr><td>* Java Installed Date: </td><td>" + getJavaVersionReleaseDateAgeStr () + "    " + "</td></tr>"   +
         "<tr><td>* Java Home Folder:    </td><td>" + System.getProperty("java.home")    + "    " + "</td></tr>"   +
         "<tr><td>* Java Architecture:   </td><td>" + System.getProperty("os.arch")      + "</td></tr>"   +
         "<tr><td>* JVM Memory Used:     </td><td>" + scaleBytesToKBMBGBTBWithUnitsStr (getSystemUsedMemoryBytes (), 1) + "</td></tr>"   +
         "<tr><td>* JVM Memory Free:     </td><td>" + scaleBytesToKBMBGBTBWithUnitsStr (getSystemFreeMemoryBytes (), 1) + "</td></tr>"   +
         "<tr><td>* JVM Memory Total:    </td><td>" + scaleBytesToKBMBGBTBWithUnitsStr (getSystemTotalMemoryBytes (), 1) + "</td></tr>"  +
         "<tr></tr>" +
         "<tr><td>* Operating System: </td><td>"  + System.getProperty("os.name")      + " (v"  +
                                                    System.getProperty("os.version")   + ")"  + "    " + "</td></tr>"   +

         "<tr><td>* Screen:       </td><td>"  + getScreenWidth () + "w x " + getScreenHeight () + "h" + "</td></tr>";

      if (currentFrame != null)
      {
         htmlStr +=
            "<tr><td>* Application:  </td><td>"  + currentFrame.getWidth () + "w x " + currentFrame.getHeight () + "h" + "</td></tr>";
      }

      htmlStr +=
         "<tr></tr>" +
         "<tr><td>* Domain Name/Username: </td><td>"   + System.getenv("USERDOMAIN") + "<b>\\</b>" + userName  + "</td></tr>" +
       //"<tr><td>* Current User: </td><td>"  + System.getProperty("user.name")    + "</td></tr>"   +
       //"<tr><td>* Current User: </td><td>"  + userName                           + "</td></tr>"   +
         "<tr></tr>" +
//         "<tr><td>* Current HostName: </td><td>"   + Network.getCurrentHostName ()      + "</td></tr>" +
//         "<tr><td>* Current IP Address: </td><td>" + Network.getLanIPAddress ()         + "</td></tr>" +
       //"<tr><td>* LAN IP: </td><td>"             + Network.getCurrentHostIPAddress () + "</td></tr>" +
       //"<tr><td>* WAN IP: </td><td>"             + Network.getWanIPAddress ()         + "</td></tr>" +
         "</table>" +
         "<p>" + additionalText + "</p>" +
         "</html>";

      // Remove ALL \n
      htmlStr = Moose_Utils.replaceIgnoreCase ("\n", "", htmlStr);

      return htmlStr;
   }

   // Overloaded version: no copyrightHolderStr.
   public static String getDisplayAboutDialogHTMLStr (JFrame currentFrame, String applicationTitle, String authorName, String additionalText)
   {
      return getDisplayAboutDialogHTMLStr (currentFrame, applicationTitle, authorName, additionalText, "");
   }


   // aboutApplication
   // Example use on a JFrame class called TextTools:
   //    aboutMenuItem.addActionListener  (event -> Moose_Utils.displayAboutDialog (TextTools.this, APPLICATION_TITLE, APPLICATION_AUTHOR, ""));
   public static void displayAboutDialog (JFrame currentFrame, String applicationTitle, String authorName, String additionalText, String copyrightHolderStr)
   {
      // Display dialog centered in this application's window.
      JOptionPane.showMessageDialog
         (currentFrame,
         //getDisplayAboutDialogStr     (currentFrame, applicationTitle, authorName, additionalText),
         getDisplayAboutDialogHTMLStr (currentFrame, applicationTitle, authorName, additionalText, copyrightHolderStr),
         "About " + applicationTitle + " ...",  JOptionPane.INFORMATION_MESSAGE);
   }


   // Overloaded version: no copyrightHolderStr.
   public static void displayAboutDialog (JFrame currentFrame, String applicationTitle, String authorName, String additionalText)
   {
      displayAboutDialog (currentFrame, applicationTitle, authorName, additionalText, "");
   }


   // Example Use:
   // String password = Moose_Utils.showInputPasswordDialog (PaymentReceiptSystem.this,
   //                                                        "Enter Password: ");
   public static String showInputPasswordDialog (Component parentComponent, String promptStr)
   {
      String passwordStr = null;

      JPasswordField passwordField = new JPasswordField();
      passwordField.grabFocus ();

      int okCancel = JOptionPane.showConfirmDialog
                       (parentComponent, passwordField, promptStr,
                       JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

      if (okCancel == JOptionPane.OK_OPTION)
      {
         passwordStr = new String(passwordField.getPassword());
         //System.err.println("You entered: " + passwordStr);
      }

      return passwordStr;
   }


   // *** Radiobittons

   public static int getIndexOfSelectedArrayRadioButton (JRadioButton[] radiobuttons)
   {
      int result = -1; // None selected.

      for (int k = 0; k < radiobuttons.length; k++)
      {
         if (radiobuttons[k].isSelected() == true)
         {
            result = k;
         }
      }

      return result;
   }

   // Example use:
   //    String databaseName = Moose_Utils.getTextOfSelectedArrayRadioButton (databaseNameRadioButtons);
   public static String getTextOfSelectedArrayRadioButton (JRadioButton[] radiobuttons)
   {
      String result = ""; // None selected.

      for (int k = 0; k < radiobuttons.length; k++)
      {
         if (radiobuttons[k].isSelected() == true)
         {
            result = radiobuttons[k].getText();
         }
      }

      return result;
   }

   // ExampleUse:
   //    Moose_Utils.setEnabledOrDisabledArrayRadioButton (remotenessRadioButtons, true);
   public static void setEnabledOrDisabledArrayRadioButton (JRadioButton[] radiobuttons, boolean enabledState)
   {
      for (int k = 0; k < radiobuttons.length; k++)
      {
         radiobuttons[k].setEnabled (enabledState);
      }
   }


   // *********************************
   // JTable
   // *********************************

   // Example use:
   //    Moose_Utils.removeAllRows (clientVisitsTable);
   public static boolean removeAllRows (JTable myTable)
   {
      DefaultTableModel myTableModel = (DefaultTableModel) myTable.getModel();
      myTableModel.setRowCount(0);

      return true; // All OK.
   }


   // Example use:
   //   int [] myJTableColWidths;
   //   Moose_Utils.preserveColumnWidthsToArray (myJTable, myJTableColWidths);
   public static int[] preserveColumnWidthsToArray (JTable table)
   {
      int[] colWidthsArray = new int [table.getColumnCount()];

      //table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

      for (int k = 0; k < colWidthsArray.length; k++)
      {
         colWidthsArray [k] = table.getColumnModel().getColumn(k).getWidth();
      }

      System.out.println ("preserveColumnWidthsToArray(): " + Arrays.toString(colWidthsArray) );

      return colWidthsArray;
   }

   // Example use:
   //   Moose_Utils.restoreColumnWidthsFromArray (myJTable, myJTableColWidths);
   public static void restoreColumnWidthsFromArray (JTable table, int[] colWidthsArray)
   {
      //table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

      System.out.println ("restoreColumnWidthsFromArray(): " + Arrays.toString(colWidthsArray) );

      for (int k = 0; k < colWidthsArray.length; k++)
      {
         table.getColumnModel().getColumn(k).setPreferredWidth (colWidthsArray [k]);
         table.getColumnModel().getColumn(k).setMinWidth       (colWidthsArray [k]);
         table.getColumnModel().getColumn(k).setMaxWidth       (colWidthsArray [k]);
      }

      //table.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
   }

   // Almost always checkboxColumn will be 0, but it could be anyh column.
   // Example usage:
   //   int count = Moose_Utils.getCountCheckBoxedTableItems (table, FOLDER_CHECK_COLUMN);
   public static int getCountCheckBoxedTableItems (JTable table, int checkboxColumn)
   {
      int count = 0;

      for (int row = 0; row < table.getRowCount (); row++)
      {
         if ((boolean) table.getValueAt(row, checkboxColumn) == true)
            count++;
      }

      return count;
   }


   // *********************************
   // Threads:
   // *********************************

   // Sleep, Delay, Wait, Pause:
   // Example use:
   //   Moose_Utils.sleep (100);
   public static void sleep (int millisec)
   {
      try
      {
         Thread.sleep (millisec);
      }
      catch (InterruptedException err)
      {
      }
   }

   // *********************************
   // MAIN - for testing:
   // *********************************
// ProGuard: need to comment out the main - otherwise
// ProGuard wont fully process / anonymise this class.
//  Remove main - so this class is processed / obfuscated correctly
//  and/or removed if not used in the current project by ProGuard.
/*
   public static void main (String args[])
   {
      showAllSystemGetPropertyItems ();

      System.out.println ("\n**** Java Compiler dir: \n" + getJavaCompilerBinDirectory ());
      System.out.println ("\n**** Current Work dir: \n"  + getCurrentDirectory ());

      System.out.println ("\n**** All Files (*.*):");
      listAllFilesOfTypeToConsole (getCurrentDirectory (), "", "");

      System.out.println ("\n**** All Class Files (*.class):");
      listAllFilesOfTypeToConsole (getCurrentDirectory (), "", "class");

      System.out.println ("\n**** All TextPad Temporary BAT Files (tp*.bat):");
      listAllFilesOfTypeToConsole (getCurrentDirectory (), "tp", "bat");
      //deleteAllFilesOfType        (getCurrentDirectory (), "", ".class");

      System.out.println ("\n**** Other tests:");
      System.out.println (Moose_Utils.getTextBetweenDelimiters ("<fileHeader agencyID=\"30688\" dataCollectionID=\"2016/1\"",
                                                                "\"", "\""));

      // 30688,2016/1,27,1,1,4,1,
      String currLine = "<fileHeader agencyID=\"30688\" dataCollectionID=\"2016/1\" transmissionNum=\"27\" exportFilePortion=\"1\" fileSegmentNum=\"1\" clientRecordsCount=\"4\" rowId=\"1\" />";
      System.out.println (Moose_Utils.getAllTextBetweenDelimiters (currLine, "\"", "\"", ","));

      String delimLine = "30688,2016/1,27,1,1,4,1,";
      System.out.println (Moose_Utils.removeItemFromDelimitedText (delimLine, ",", 3));
      System.out.println (Moose_Utils.removeItemFromDelimitedText (delimLine, ",", 1));
      System.out.println (Moose_Utils.removeItemFromDelimitedText (delimLine, ",", 99));
      System.out.println (Moose_Utils.removeItemFromDelimitedText (delimLine, ",", 7));

      System.out.println (Moose_Utils.getItemByNumberFromDelimitedText (delimLine, ",", 3)); // Return 3rd item: "27".

      System.out.println (Moose_Utils.getNumberofItemStrFromDelimitedText (delimLine, ",", "27")); // Return 3 = 3rd item.


      System.out.println (Moose_Utils.getItemByNumberFromDelimitedText (delimLine, ",", 3)); // Return 3rd item: "27".
      System.out.println (Moose_Utils.getNumberofItemStrFromDelimitedText (delimLine, ",", "27")); // Return 3 = 3rd item.

      currLine = "<fileHeader agencyID=\"30688\" dataCollectionID=\"2016/1\" transmissionNum=\"27\" exportFilePortion=\"1\" fileSegmentNum=\"1\" clientRecordsCount=\"4\" rowId=\"1\" />";
      System.out.println (Moose_Utils.getFieldValueFromXML (currLine, "<fileHeader", "/>", "dataCollectionID", "\"", ""));
      System.out.println (Moose_Utils.getFieldValueFromXML (currLine, "<fileHeader", "/>", "agencyID", "\"", ""));

      currLine = "<clientDetails><clientRecord lettersOfName=\"utaat\" birthDate=\"28/05/1964\" />  <carerDetails lettersOfName=\"hehnn\" birthDate=\"14/12/1969\" /></clientDetails>";
      System.out.println (Moose_Utils.getFieldValueFromXML (currLine, "<clientRecord", "/>", "lettersOfName", "\"", ""));
      System.out.println (Moose_Utils.getFieldValueFromXML (currLine, "<carerDetails", "/>", "lettersOfName", "\"", ""));

      // Returns nothing = correct !
      System.out.println (Moose_Utils.getFieldValueFromXML (currLine, "", "", "lettersOfName", "\"", ""));

      System.out.println (getFileExtensionFromFile (new File ("c:\\temp\\abc.net.java")));
      System.out.println (getFileExtensionFromStr  ("c:\\temp\\abc.net.java"));
      System.out.println (getFileExtensionFromFile (new File ("c:\\temp\\abc")));           // Answer: "".
      System.out.println (getFileExtensionFromStr  ("c:\\temp\\abc"));                      // Answer: "".
      System.out.println (getFileExtensionFromFile (new File ("c:\\temp.labs.mike\\abc"))); // Answer: "".
      System.out.println (getFileExtensionFromStr  ("c:\\temp.labs.mike\\abc"));            // Answer: "".

      currLine = "STARTHEADER2,30926,2013/1,1,1,547,ENDHEADER2,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,";
      currLine = "one,two,three,four,five,six,seven,eight,nine,ten,11,12,13,,,,,,,,,";
      System.out.println ("");
      System.out.println (currLine);
      currLine = setItemInDelimitedText (currLine, ",", 6, "399");
      System.out.println (currLine);
      currLine = setItemInDelimitedText (currLine, ",", 16, "abc");
      System.out.println (currLine);

      System.out.println (getItemFromDelimitedText (currLine, ",", 6));
      System.out.println (getItemFromDelimitedText (currLine, ",", 16));

      System.out.println ("");
      currLine = "<font color = #FFFF00>with nothing but a pallet</font>";
      System.out.println (currLine);
      currLine = deleteTextBetweenDelimiters (currLine, "<font", ">");
      currLine = deleteTextBetweenDelimiters (currLine, "</font", ">");
      System.out.println (currLine);

      System.out.println ("");
      System.out.println (addFileNamePrefixBeforeExtensionFromStr ("c:\\Mike's Files\\abc file.dat", "_fix"));

      String suburb = "West Rockhampton, ";
      System.out.println (suburb);
      suburb = suburb.replace (",", "");
      System.out.println (suburb);

      currLine =
        "<clientDetails minutesToCollectInfo=\"1\" rowId=\"1\">" +
   "  <statisticalLinkageKey lettersOfName=\"bbtar\" birthDate=\"13/05/1952\" birthDateEst=\"Not Estimated\" sex=\"Female\" />" +
   "  <demographics birthCountry=\"Australia\" languageSpokenAtHome=\"English\" indigenousStatus=\"Neither Aboriginal nor Torres Strait Islander origin\" />" +
   "  <locationInformation stateID=\"Queensland\" suburbName=\"Keppel Sands\" postcode=\"4702\" />" +
   "  <circumstances missingSLKField=\"Both Client and Carer SLKs are correct\" reasonForHACCStatus=\"Care Recipient\" livingArrangements=\"Lives with family\" pensionStatus=\"Disability Support Pension\" DVACard=\"No DVA card\" accommodationSetting=\"Private residence - owned/purchasing (includes mobile home)\" carerExistenceOf=\"Has a carer\" />" +
   "  <carerDetails residencyStatus=\"Co-resident carer\" relationshipToCareRecipient=\"Spouse/partner\" carerForMoreThanOne=\"No\">" +
   "       <statisticalLinkageKey lettersOfName=\"bbtil\" birthDate=\"16/07/1950\" birthDateEst=\"Not Estimated\" sex=\"Not stated/inadequately described\" />" +
   "       <demographics birthCountry=\"Australia\" languageSpokenAtHome=\"English\" indigenousStatus=\"Neither Aboriginal nor Torres Strait Islander origin\" />" +
   "       <locationInformation stateID=\"Queensland\" suburbName=\"Frenchville\" postcode=\"4701\" />" +
   "       <carerServicesReceivedTotals counsellingHours=\"0\" respiteCareHours=\"0\" />" +
   "  </carerDetails>" +
   "  <transitionDetail dateOfLastAssessment=\"14/03/2016\" sourceOfReferral=\"Family, significant other, friend\">" +
   "       <HACCServiceEpisode entryDate=\"09/02/2012\" />" +
   "  </transitionDetail>" +
   "  <servicesReceivedTotals domesticAssistanceHours=\"16\" socialSupportHours=\"0\" personalCareHours=\"0\" centreBasedDayCareHours=\"0\" otherFoodServicesHours=\"0\" assessmentHours=\"0\" careCoordinationHours=\"0\" caseManagementHours=\"0\" homeMaintenanceHours=\"0\" homeModificationCost=\"0\" linenServiceDeliveries=\"0\" transportTrips=\"0\" counsellingHours=\"0\">" +
   "       <nursingCare receivedAtHomeHours=\"0\" receivedAtCentreHours=\"0\" />" +
   "       <alliedHealthCare receivedAtHomeHours=\"0\" receivedAtCentreHours=\"0\" />" +
   "       <mealsTotal receivedAtHome=\"0\" receivedAtCentre=\"0\" />" +
   "       <goodsAndEquipmentTotals selfCareAids=\"0\" supportAndMobilityAids=\"0\" communicationAids=\"0\" aidsForReading=\"0\" medicalCareAids=\"0\" carModifications=\"0\" other=\"0\" />" +
   "  </servicesReceivedTotals>" +
   "  <functionalScreeningInstrument housework=\"With some help\" transport=\"With some help\" shopping=\"With some help\" medication=\"Without help\" money=\"Without help\" walking=\"Without help\" bathingShowering=\"With some help\" memoryProblemsConfusion=\"No\" behavioralProblems=\"No\" />" +
   "  <additionalFunctionalDependency communication=\"No\" dressing=\"Not stated/inadequately described\" eating=\"Not stated/inadequately described\" toileting=\"Not stated/inadequately described\" mobility=\"Not stated/inadequately described\" />" +
   "</clientDetails>";
      System.out.println ("\nbirthCountry: ");
      System.out.println (Moose_Utils.getFieldValueFromXML (currLine, "<carerDetails", "</carerDetails>", "birthCountry",          "\"", ""));
      //System.out.println (currLine);

      currLine = "1929-11-26 00:00:00";
      System.out.println (currLine.substring (0, 10));

      System.out.println ("1st: " + getItemFromDelimitedText ("abc,def", ",", 1));
      System.out.println ("2nd: " + getItemFromDelimitedText ("abc,def", ",", 2));
      System.out.println ("3rd: " + getItemFromDelimitedText ("abc,def", ",", 3));
      System.out.println (getItemFromDelimitedText ("abc,def", ";", 1));
      System.out.println (getItemFromDelimitedText ("12.50", ".", 1));
      System.out.println (getItemFromDelimitedText ("12", ".", 1));

      System.out.println ("");
      System.out.println (Moose_Utils.replaceIgnoreCase ("maL", "x", "O'Malley"));
      System.out.println (Moose_Utils.replaceIgnoreCase ("maL", "fRanKIe", "O'Malley"));
      System.out.println (Moose_Utils.replaceIgnoreCase ("maX", "fRanKIe", "O'Malley"));
      System.out.println (Moose_Utils.replaceIgnoreCase ("maL", "", "O'Malley"));
      System.out.println (Moose_Utils.replaceIgnoreCase ("", "fRanKIe", "O'Malley"));
      System.out.println (Moose_Utils.replaceIgnoreCase ("maL", "Mall", "O'Malley"));
      System.out.println (Moose_Utils.replaceIgnoreCase ("TEST", "TEST 123", "TEST, TEST, TEST"));


      System.out.println (scaleBytesToKBMBGBTBWithUnitsStr (625, 2));
      System.out.println (scaleBytesToKBMBGBTBWithUnitsStr (1625, 2));
      System.out.println (scaleBytesToKBMBGBTBWithUnitsStr (2134567, 2));
      System.out.println (scaleBytesToKBMBGBTBWithUnitsStr (1625292128, 2));

      System.out.println ("* Memory Used: "     + getSystemUsedMemoryBytes ());
      System.out.println ("* Memory Free: "     + getSystemFreeMemoryBytes ());
      System.out.println ("* Memory Total: "    + getSystemTotalMemoryBytes ());

      System.out.println ("* Memory Used: "     + scaleBytesToKBMBGBTBWithUnitsStr (getSystemUsedMemoryBytes (), 1));
      System.out.println ("* Memory Free: "     + scaleBytesToKBMBGBTBWithUnitsStr (getSystemFreeMemoryBytes (), 1));
      System.out.println ("* Memory Total: "    + scaleBytesToKBMBGBTBWithUnitsStr (getSystemTotalMemoryBytes (), 1));

      System.out.println (Moose_Utils.replaceIgnoreCase ("“", "", "“They are so good to me. I don’t ....”"));
      System.out.println (Moose_Utils.replaceIgnoreCase ("”", "", "“They are so good to me. I don’t ....”"));
      System.out.println (Moose_Utils.replaceIgnoreCase ("North Bundaberg",   "Bundaberg North", "<Suburb>NORTH BUNDABERG</Suburb>"));
      System.out.println ("indexOf = " + "Mike O".indexOf ("Frank", 0));

      System.out.println ("getFileNameFromFileNameWithPath (\"c:\\temp\\docs\\abc.txt\") = " + Moose_Utils.getFileNameFromFileNameWithPath ("c:\\temp\\docs\\abc.txt"));
      System.out.println ("toDate = " + toDate ("4/10/1950", "dd/MM/yyyy"));

      // Example: \\BriTS1\c$\Users\annac\Desktop\PaymentReceiptSystem.jar:
      // I want:  * BriTS1 - annac
      String checkFile     = "\\\\BriTS1\\c$\\Users\\annac\\Desktop\\PaymentReceiptSystem.jar:";
      String serverUserStr = checkFile;
      serverUserStr = serverUserStr.substring (0, serverUserStr.indexOf ("Desktop"));
      serverUserStr = Moose_Utils.replaceIgnoreCase ("\\c$",      "",    serverUserStr);
      serverUserStr = Moose_Utils.replaceIgnoreCase ("\\Users\\", " - ", serverUserStr);
      serverUserStr = Moose_Utils.replaceIgnoreCase ("\\",        "",    serverUserStr);
      serverUserStr = Moose_Utils.replaceIgnoreCase ("\\",        "",    serverUserStr);
      serverUserStr = "* " + serverUserStr;

      System.out.println (serverUserStr);
      System.out.println (Math.round (4.5 / 11 * 100.0) / 100.0); // 0.41 = correct.
      System.out.println (Moose_Utils.roundToNDecimalPlaces (4.5 / 11, 2)); // 0.41 = correct.

      System.out.println (Moose_Utils.replaceIgnoreCase ("TEST", "a", "TEST, TEST, TEST"));

      System.out.println (Moose_Utils.attemptToBuildValid_DD_MM_YYYY_Date ("4-6-2018", "/"));
      System.out.println (Moose_Utils.attemptToBuildValid_DD_MM_YYYY_Date ("2018-6-4", "/"));

      Date date1 = Moose_Utils.toDate ("2018-08-11", "yyyy-MM-dd");
      Date date2 = Moose_Utils.toDate ("2018-08-22", "yyyy-MM-dd");
      System.out.println ("date1: " + date1);
      System.out.println ("date1: " + date2);
      System.out.println ("DateDiff 1: " + (Moose_Utils.dateDiffYears (date1, date2) * 365.0) + " days");
      //System.out.println ("DateDiff 2: " + (Moose_Utils.dateDiffYears2 (date2, date1) * 365.0) + " days");

      System.out.println (String.format ("%+,.2f", -33.4) );
      System.out.println (String.format ("%+,.2f", 33.5) );

      System.out.println ("\n" + "Wed, 26-Jun-2019" + ": " +
         Moose_Utils.DDD_DDMMYYYY_DATE_FORMAT.toPattern() );
      Date date = Moose_Utils.toDate ("Wed, 26-Jun-2019",
          Moose_Utils.DDD_DDMMYYYY_DATE_FORMAT.toPattern() );
      System.out.println (date);


      System.out.println ("Wed, 26-Jun-2019" + ": " +
         Moose_Utils.DDD_DDMMYYYY_DATE_FORMAT.toPattern() );
      Date date = Moose_Utils.toDate ("Wed, 26-Jun-2019",
          Moose_Utils.DDD_DDMMYYYY_DATE_FORMAT.toPattern() );
      System.out.println (date);

      System.out.println ("'" + Moose_Utils.deleteEverythingInStringBeforeString("Hello World", "Wor") + "'" );      // Returns "World."
      System.out.println ("'" + Moose_Utils.deleteEverythingInStringFromStringOnwards("Hello World", "Wor") + "'" ); // Returns "Hello ".

     System.out.println (Moose_Utils.toTitleCase ("moose") );             // returns "Moose".
     System.out.println (Moose_Utils.toTitleCase ("moose. loves java") ); // returns "Moose. loves java".
     System.out.println (Moose_Utils.toTitleCase ("  moose") );           // returns "  Moose".

   } // public static void main
*/


} // public class Moose_Utils