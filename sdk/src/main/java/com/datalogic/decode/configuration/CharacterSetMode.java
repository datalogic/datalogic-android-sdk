package com.datalogic.decode.configuration;

/**
 * <code>CharacterSetMode</code> is an enumeration defining the different String encodings supported for certain symbologies of barcodes.
 * The result extracted from the label is converted to a selected character set, supported by Java.
 * 
 * The supported symbologies are:
 * <ul>
 *  <li>Aztec</li>
 *  <li>Data Matrix</li>
 *  <li>MicroPDF417</li>
 *  <li>Micro QR code</li>
 *  <li>PDF417</li>
 *  <li>QR code</li>
 *  <li>DotCode</li>
 * </ul>
 * 
 * The type of mode is one of:
 * <table border=2>
 * <tr>
 * <td>BIG_5</td>
 * <td>Big5, Traditional Chinese</td>
 * </tr>
 * <tr>
 * <td>EUC_CN</td>
 * <td>GB2312, EUC encoding, Simplified Chinese</td>
 * </tr>
 * <tr>
 * <td>EUC_KR</td>
 * <td>KS C 5601, EUC encoding, Korean</td>
 * </tr>
 * <tr>
 * <td>GB18030</td>
 * <td>Simplified Chinese, PRC standard</td>
 * </tr>
 * <tr>
 * <td>GBK</td>
 * <td>GBK, Simplified Chinese</td>
 * </tr>
 * <tr>
 * <td>IBM_437</td>
 * <td>MS-DOS United States, Australia, New Zealand, South Africa</td>
 * </tr>
 * <tr>
 * <td>ISO_8859_1</td>
 * <td>Latin Alphabet No. 1</td>
 * </tr>
 * <tr>
 * <td>ISO_8859_2</td>
 * <td>Latin Alphabet No. 2</td>
 * </tr>
 * <tr>
 * <td>ISO_8859_3</td>
 * <td>Latin Alphabet No. 3</td>
 * </tr>
 * <tr>
 * <td>ISO_8859_4</td>
 * <td>Latin Alphabet No. 4</td>
 * </tr>
 * <tr>
 * <td>ISO_8859_5</td>
 * <td>Latin/Cyrillic Alphabet</td>
 * </tr>
 * <tr>
 * <td>ISO_8859_6</td>
 * <td>Latin/Arabic Alphabet</td>
 * </tr>
 * <tr>
 * <td>ISO_8859_7</td>
 * <td>Latin/Greek Alphabet</td>
 * </tr>
 * <tr>
 * <td>ISO_8859_8</td>
 * <td>Latin/Hebrew Alphabet</td>
 * </tr>
 * <tr>
 * <td>ISO_8859_9</td>
 * <td>Latin No. 5/Turkish Alphabet</td>
 * </tr>
 * <tr>
 * <td>ISO_8859_11</td>
 * <td>Latin/Thai Alphabet</td>
 * </tr>
 * <tr>
 * <td>ISO_8859_13</td>
 * <td>Latin No. 7/Baltic Rim Alphabet</td>
 * </tr>
 * <tr>
 * <td>ISO_8859_14</td>
 * <td>Latin No. 8/Celtic Alphabet</td>
 * </tr>
 * <tr>
 * <td>ISO_8859_15</td>
 * <td>Latin Alphabet No. 9</td>
 * </tr>
 * <tr>
 * <td>SHIFT_JIS</td>
 * <td>Shift-JIS, Japanese</td>
 * </tr>
 * <tr>
 * <td>US_ASCII</td>
 * <td>American Standard Code for Information Interchange</td>
 * </tr>
 * <tr>
 * <td>UTF_8</td>
 * <td>Eight-bit Unicode (or UCS) Transformation Format</td>
 * </tr>
 * <tr>
 * <td>UTF_16</td>
 * <td>Sixteen-bit Unicode (or UCS) Transformation Format, byte order identified by an optional byte-order mark</td>
 * </tr>
 * <tr>
 * <td>WINDOWS_1250</td>
 * <td>Windows Eastern European</td>
 * </tr>
 * <tr>
 * <td>WINDOWS_1251</td>
 * <td>Windows Cyrillic</td>
 * </tr>
 * <tr>
 * <td>WINDOWS_1252</td>
 * <td>Windows Latin-1</td>
 * </tr>
 * <tr>
 * <td>WINDOWS_1254</td>
 * <td>Windows Turkish</td>
 * </tr>
 * <tr>
 * <td>WINDOWS_1256</td>
 * <td>Windows Arabic</td>
 * </tr>
 * </table>
 */
public enum CharacterSetMode {
    /**
     * Big5
     */
    BIG_5,
    /**
     * EUC-CN
     */
    EUC_CN,
    /**
     * EUC-KR
     */
    EUC_KR,
    /**
     * GB18030
     */
    GB18030,
    /**
     * GBK
     */
    GBK,
    /**
     * IBM-437
     */
    IBM_437,
    /**
     * ISO-8859-1
     */
    ISO_8859_1,
    /**
     * ISO-8859-2
     */
    ISO_8859_2,
    /**
     * ISO-8859-3
     */
    ISO_8859_3,
    /**
     * ISO-8859-4
     */
    ISO_8859_4,
    /**
     * ISO-8859-5
     */
    ISO_8859_5,
    /**
     * ISO-8859-6
     */
    ISO_8859_6,
    /**
     * ISO-8859-7
     */
    ISO_8859_7,
    /**
     * ISO-8859-8
     */
    ISO_8859_8,
    /**
     * ISO-8859-9
     */
    ISO_8859_9,
    /**
     * ISO-8859-11
     */
    ISO_8859_11,
    /**
     * ISO-8859-13
     */
    ISO_8859_13,
    /**
     * ISO-8859-14
     */
    ISO_8859_14,
    /**
     * ISO-8859-15
     */
    ISO_8859_15,
    /**
     * Shift-JIS
     */
    SHIFT_JIS,
    /**
     * ASCII
     */
    US_ASCII,
    /**
     * UTF-8
     */
    UTF_8,
    /**
     * UTF-16
     */
    UTF_16,
    /**
     * Windows 1250
     */
    WINDOWS_1250,
    /**
     * Windows 1251
     */
    WINDOWS_1251,
    /**
     * Windows 1252
     */
    WINDOWS_1252,
    /**
     * Windows 1254
     */
    WINDOWS_1254,
    /**
     * Windows 1256
     */
    WINDOWS_1256;
}
