# FPGA Memory File Converter: Lattice XP2 FPGA to Xilinx Zynq FPGA

Welcome to the Github for this project:
* https://github.com/MooseValley/FPGA-Memory-File-Converter


## Samples of Input and Output:

```
-----------------------------------------------------------------------------------------------
Lattice XP2 FPGA | Xilinx Zynq FPGA
    (input)      |    (output)
-----------------------------------------------------------------------------------------------
                 |
#Format=AddrHex  | BRAM_SINGLE_MACRO_inst : BRAM_SINGLE_MACRO
#Depth=4096      | generic map (
#Width=32        |   INIT_00 => X"0000000000000000000000000000000000000000000000000000000000000000",
#AddrRadix=3     |   INIT_01 => X"0000000000000000000000000000000000000000000000000000000000000000",
#DataRadix=3     |   INIT_02 => X"0000000000000000000000000000000000000000000000000000000000000000",
0:68D            |   INIT_03 => X"0000000000000000000000000000000000000000000000000000000000000000",
24:80            |   INIT_04 => X"0000000000500010000010001000F00020100010000000500010001000004040",
25:A             |   ::::
26:7C1           |   ::::
27:7C3           |   INIT_3F => X"0000000000000000000000000000000000000000000000000000000000000000" )
28:7C1           |   ::::
29:4A0           |   ::::
2A:4D2           |
2D:7C1           |
101:564F4405     |
```


## Java Source Code and JAR:

The source code, input data file, JAR file, etc are all here - but it is command line only (at this stage), so you wont see any GUI app when you run it.  No command line parameters at this stage.  Very rudimentary.

You can download a ZIP of everything by clicking the green "**Code**" button on the right, and selecting "Download ZIP".

After you extract the ZIP to a folder on your PC - e.g. c:\Java - open a command prompt and cd to that folder and type this to run the JAR:

c:\java>  java -jar Ep32Ram.jar


## Java Runtime Environment (JRE)

You need to have the Java Runtime Environment (JRE) installed on your machine.

If you need the JRE, you can download from Oracle (but this requires you to create an account and faff around),
or here's a link to what is currently the latest AdoptOPEN JRE (free):
* https://adoptopenjdk.net/releases.html?variant=openjdk8&jvmVariant=hotspot
* jdk8u292-b10, x86, MSI installer download: https://github.com/AdoptOpenJDK/openjdk8-binaries/releases/download/jdk8u292-b10/OpenJDK8U-jre_x86-32_windows_hotspot_8u292b10.msi
* jdk8u292-b10, x64, MSI installer download: https://github.com/AdoptOpenJDK/openjdk8-binaries/releases/download/jdk8u292-b10/OpenJDK8U-jre_x64_windows_hotspot_8u292b10.msi

**Moose**
<br>Moose's Software Valley, established July, 1996.
<br>https://moosevalley.github.io/
