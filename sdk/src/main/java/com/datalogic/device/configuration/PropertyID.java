package com.datalogic.device.configuration;


import com.datalogic.device.configuration.*;
import com.datalogic.device.power.*;
import com.datalogic.decode.configuration.*;
import com.datalogic.device.*;
/**
 * <code>PropertyID</code> is the class that includes all the properties
 * identifiers.<br>
 * The {@link Property}s are organized in a tree. The {@link Property}s are the leaves while the intermediate nodes are the {@link PropertyGroup}s.<br>
 * A property is uniquely identified by its {@link PropertyID}.<br>
 * A property group is uniquely identified by its {@link PropertyGroupID}.<br>
 * In the following all the property group identifiers and all the property identiers are listed in a manner resembling the hierarchical tree of the corresponding {@link PropertyGroup}s and {@link Property}s. <br>
 * Each property group can be collapsed/exanded clicking on the blue squared bullet preceding the identifier. The group contains:
 * <ul>
 * <li> the {@link PropertyID} of the contained properties
 * <li> the {@link PropertyGroupID}s of the contained property groups
 * </ul>
 * <style>
 * .tree{
 *   --spacing : 1.5rem;
 *   --radius  : 7px;
 * }
 * .tree li{
 *   display      : block;
 *   position     : relative;
 *   padding-left : calc(2 * var(--spacing) - var(--radius) - 2px);
 * }
 * 
 * .tree ul{
 *   margin-left  : calc(var(--radius) - var(--spacing));
 *   padding-left : 0;
 * }
 * .tree ul li{
 *   border-left : 2px solid #ddd;
 * }
 * 
 * .tree ul li:last-child{
 *   border-color : transparent;
 * }
 * .tree ul li::before{
 *  content      : '';
 *  display      : block;
 *   position     : absolute;
 *  top          : calc(var(--spacing) / -2);
 *  left         : -2px;
 *  width        : calc(var(--spacing) + 2px);
 *  height       : calc(var(--spacing) + 1px);
 *  border       : solid #ddd;
 *  border-width : 0 0 2px 2px;
 * }
 * .tree summary{
 *  display : block;
 *  cursor  : pointer;
 * }
 * 
 * .tree summary::marker,
 * .tree summary::-webkit-details-marker{
 *  display : none;
 * }
 * 
 * .tree summary:focus{
 *  outline : none;
 * }
 * 
 * .tree summary:focus-visible{
 * outline : 1px dotted #000;
 * }
 * .tree li::after,
 * .tree summary::before{
 * content       : '';
 * display       : block;
 * position      : absolute;
 * top           : calc(var(--spacing) / 2 - var(--radius));
 * left          : calc(var(--spacing) - var(--radius) - 1px);
 * width         : calc(2 * var(--radius));
 * height        : calc(2 * var(--radius));
 * border-radius : 25%;
 * background    : #0235a4;
 * }
 * .tree summary::before{
 * content     : '+';
 * z-index     : 1;
 * background  : #0235a4;
 * color       : #fff;
 * line-height : calc(2.5 * var(--radius) - 2px);
 * text-align  : center;
 * }
 * 
 * .tree details[open] > summary::before{
 * content : '−';
 * }
 * </style>
 * <ul class=tree>
 *   <li>
 *   <details open>
 *   <summary>ROOT</summary>
 *   <ul>
 *       <li>
 *         <details>
 *             <summary> {@link PropertyGroupID#SCANNER_GROUP}</summary>
 *             <ul>
 *                 <li>
 *                     <details>
 *                         <summary> {@link PropertyGroupID#SYMBOLOGIES_GROUP}</summary>
 *                         <ul>
 *                             <li>
 *                                 <details>
 *                                     <summary> {@link PropertyGroupID#s1D_GROUP}</summary>
 *                                     <ul>
 *                                         <li>
 *                                             <details>
 *                                                 <summary> {@link PropertyGroupID#CODABAR_GROUP}</summary>
 *                                                 <ul>
 *                                                     <li> {@link #CODABAR_ENABLE} </li>
 *                                                     <li> {@link #CODABAR_USER_ID} </li>
 *                                                     <li> {@link #CODABAR_LENGTH1} </li>
 *                                                     <li> {@link #CODABAR_LENGTH2} </li>
 *                                                     <li> {@link #CODABAR_LENGTH_CONTROL} </li>
 *                                                     <li> {@link #CODABAR_ENABLE_CHECK} </li>
 *                                                     <li> {@link #CODABAR_SEND_CHECK} </li>
 *                                                     <li> {@link #CODABAR_CLSI} </li>
 *                                                     <li> {@link #CODABAR_SEND_START} </li>
 *                                                 </ul>
 *                                             </details>
 *                                         </li>
 *                                         <li>
 *                                             <details>
 *                                                 <summary> {@link PropertyGroupID#CODE128_GROUP}</summary>
 *                                                 <ul>
 *                                                     <li> {@link #CODE128_ENABLE} </li>
 *                                                     <li> {@link #CODE128_USER_ID} </li>
 *                                                     <li> {@link #CODE128_LENGTH1} </li>
 *                                                     <li> {@link #CODE128_LENGTH2} </li>
 *                                                     <li> {@link #CODE128_LENGTH_CONTROL} </li>
 *                                                     <li> {@link #CODE128_AGGRESSIVENESS} </li>
 *                                                     <li> {@link #CODE128_EXTENDED_ASCII} </li>
 *                                                     <li> {@link #CODE128_CHARACTER_SET_MODE} </li>
 *                                                     <li>
 *                                                         <details>
 *                                                             <summary> {@link PropertyGroupID#GS1_128_GROUP}</summary>
 *                                                             <ul>
 *                                                                 <li> {@link #CODE128_GS1_ENABLE} </li>
 *                                                                 <li> {@link #CODE128_GS1_USER_ID} </li>
 *                                                             </ul>
 *                                                         </details>
 *                                                     </li>
 *                                                     <li>
 *                                                         <details>
 *                                                             <summary> {@link PropertyGroupID#ISBT_128_GROUP}</summary>
 *                                                             <ul>
 *                                                                 <li> {@link #ISBT_128_ENABLE} </li>
 *                                                                 <li> {@link #ISBT_128_USER_ID} </li>
 *                                                                 <li> {@link #ISBT_128_MODE} </li>
 *                                                                 <li> {@link #ISBT_128_COMMONLY_CONCATENATED_PAIRS} </li>
 *                                                             </ul>
 *                                                         </details>
 *                                                     </li>
 *                                                 </ul>
 *                                             </details>
 *                                         </li>
 *                                         <li>
 *                                             <details>
 *                                                 <summary> {@link PropertyGroupID#CODE39_GROUP}</summary>
 *                                                 <ul>
 *                                                     <li> {@link #CODE39_ENABLE} </li>
 *                                                     <li> {@link #CODE39_USER_ID} </li>
 *                                                     <li> {@link #CODE39_LENGTH1} </li>
 *                                                     <li> {@link #CODE39_LENGTH2} </li>
 *                                                     <li> {@link #CODE39_LENGTH_CONTROL} </li>
 *                                                     <li> {@link #CODE39_ENABLE_CHECK} </li>
 *                                                     <li> {@link #CODE39_FULL_ASCII} </li>
 *                                                     <li> {@link #CODE39_SEND_CHECK} </li>
 *                                                     <li> {@link #CODE39_AGGRESSIVENESS} </li>
 *                                                     <li>
 *                                                         <details>
 *                                                             <summary> {@link PropertyGroupID#CODE32_GROUP}</summary>
 *                                                             <ul>
 *                                                                 <li> {@link #CODE32_ENABLE} </li>
 *                                                                 <li> {@link #CODE32_USER_ID} </li>
 *                                                             </ul>
 *                                                         </details>
 *                                                     </li>
 *                                                     <li>
 *                                                         <details>
 *                                                             <summary> {@link PropertyGroupID#TRIOPTIC_GROUP}</summary>
 *                                                             <ul>
 *                                                                 <li> {@link #TRIOPTIC_ENABLE} </li>
 *                                                                 <li> {@link #TRIOPTIC_USER_ID} </li>
 *                                                             </ul>
 *                                                         </details>
 *                                                     </li>
 *                                                 </ul>
 *                                             </details>
 *                                         </li>
 *                                         <li>
 *                                             <details>
 *                                                 <summary> {@link PropertyGroupID#CODE93_GROUP}</summary>
 *                                                 <ul>
 *                                                     <li> {@link #CODE93_ENABLE} </li>
 *                                                     <li> {@link #CODE93_USER_ID} </li>
 *                                                     <li> {@link #CODE93_LENGTH1} </li>
 *                                                     <li> {@link #CODE93_LENGTH2} </li>
 *                                                     <li> {@link #CODE93_LENGTH_CONTROL} </li>
 *                                                 </ul>
 *                                             </details>
 *                                         </li>
 *                                         <li>
 *                                             <details>
 *                                                 <summary> {@link PropertyGroupID#D25_GROUP}</summary>
 *                                                 <ul>
 *                                                     <li> {@link #D25_ENABLE} </li>
 *                                                     <li> {@link #D25_USER_ID} </li>
 *                                                     <li> {@link #D25_LENGTH1} </li>
 *                                                     <li> {@link #D25_LENGTH2} </li>
 *                                                     <li> {@link #D25_LENGTH_CONTROL} </li>
 *                                                 </ul>
 *                                             </details>
 *                                         </li>
 *                                         <li>
 *                                             <details>
 *                                                 <summary> {@link PropertyGroupID#EAN13_GROUP}</summary>
 *                                                 <ul>
 *                                                     <li> {@link #EAN13_ENABLE} </li>
 *                                                     <li> {@link #EAN13_USER_ID} </li>
 *                                                     <li> {@link #EAN13_SEND_CHECK} </li>
 *                                                     <li> {@link #EAN13_TO_ISBN} </li>
 *                                                     <li> {@link #EAN13_TO_ISSN} </li>
 *                                                     <li> {@link #EAN13_TO_GTIN} </li>
 *                                                     <li> {@link #EAN13_SEND_SYS} </li>
 *                                                     <li> {@link #EAN13_COMPOSITE_ENABLE} </li>
 *                                                 </ul>
 *                                             </details>
 *                                         </li>
 *                                         <li>
 *                                             <details>
 *                                                 <summary> {@link PropertyGroupID#EAN8_GROUP}</summary>
 *                                                 <ul>
 *                                                     <li> {@link #EAN8_ENABLE} </li>
 *                                                     <li> {@link #EAN8_USER_ID} </li>
 *                                                     <li> {@link #EAN8_SEND_CHECK} </li>
 *                                                     <li> {@link #EAN8_TO_EAN13} </li>
 *                                                     <li> {@link #EAN8_COMPOSITE_ENABLE} </li>
 *                                                 </ul>
 *                                             </details>
 *                                         </li>
 *                                         <li>
 *                                             <details>
 *                                                 <summary> {@link PropertyGroupID#GS1_14_GROUP}</summary>
 *                                                 <ul>
 *                                                     <li> {@link #GS1_14_ENABLE} </li>
 *                                                     <li> {@link #GS1_14_USER_ID} </li>
 *                                                     <li> {@link #GS1_14_GS1_128_MODE} </li>
 *                                                 </ul>
 *                                             </details>
 *                                         </li>
 *                                         <li>
 *                                             <details>
 *                                                 <summary> {@link PropertyGroupID#GS1_EXP_GROUP}</summary>
 *                                                 <ul>
 *                                                     <li> {@link #GS1_EXP_ENABLE} </li>
 *                                                     <li> {@link #GS1_EXP_USER_ID} </li>
 *                                                     <li> {@link #GS1_EXP_LENGTH1} </li>
 *                                                     <li> {@link #GS1_EXP_LENGTH2} </li>
 *                                                     <li> {@link #GS1_EXP_LENGTH_CONTROL} </li>
 *                                                     <li> {@link #GS1_EXP_GS1_128_MODE} </li>                                                    
 *                                                 </ul>
 *                                             </details>
 *                                         </li>
 *                                         <li>
 *                                             <details>
 *                                                 <summary> {@link PropertyGroupID#GS1_LIMIT_GROUP}</summary>
 *                                                 <ul>
 *                                                     <li> {@link #GS1_LIMIT_ENABLE} </li>
 *                                                     <li> {@link #GS1_LIMIT_USER_ID} </li>
 *                                                     <li> {@link #GS1_LIMIT_GS1_128_MODE} </li>
 *                                                 </ul>
 *                                             </details>
 *                                         </li>
 *                                         <li>
 *                                             <details>
 *                                                 <summary> {@link PropertyGroupID#I25_GROUP}</summary>
 *                                                 <ul>
 *                                                     <li> {@link #I25_ENABLE} </li>
 *                                                     <li> {@link #I25_USER_ID} </li>
 *                                                     <li> {@link #I25_LENGTH1} </li>
 *                                                     <li> {@link #I25_LENGTH2} </li>
 *                                                     <li> {@link #I25_LENGTH_CONTROL} </li>
 *                                                     <li> {@link #I25_ENABLE_CHECK} </li>
 *                                                     <li> {@link #I25_SEND_CHECK} </li>
 *                                                     <li> {@link #ITF14_ENABLE} </li>
 *                                                     <li> {@link #I25_AGGRESSIVENESS} </li>
 *                                                 </ul>
 *                                             </details>
 *                                         </li>
 *                                         <li>
 *                                             <details>
 *                                                 <summary> {@link PropertyGroupID#M25_GROUP}</summary>
 *                                                 <ul>
 *                                                     <li> {@link #M25_ENABLE} </li>
 *                                                     <li> {@link #M25_USER_ID} </li>
 *                                                     <li> {@link #M25_LENGTH1} </li>
 *                                                     <li> {@link #M25_LENGTH2} </li>
 *                                                     <li> {@link #M25_LENGTH_CONTROL} </li>
 *                                                 </ul>
 *                                             </details>
 *                                         </li>
 *                                         <li>
 *                                             <details>
 *                                                 <summary> {@link PropertyGroupID#MSI_GROUP}</summary>
 *                                                 <ul>
 *                                                     <li> {@link #MSI_ENABLE} </li>
 *                                                     <li> {@link #MSI_USER_ID} </li>
 *                                                     <li> {@link #MSI_LENGTH1} </li>
 *                                                     <li> {@link #MSI_LENGTH2} </li>
 *                                                     <li> {@link #MSI_LENGTH_CONTROL} </li>
 *                                                     <li> {@link #MSI_SEND_CHECK} </li>
 *                                                     <li> {@link #MSI_REQUIRE_2_CHECK} </li>
 *                                                     <li> {@link #MSI_CHECK_2_MOD_11} </li>
 *                                                     <li> {@link #MSI_AGGRESSIVENESS} </li>
 *                                                 </ul>
 *                                             </details>
 *                                         </li>
 *                                         <li>
 *                                             <details>
 *                                                 <summary> {@link PropertyGroupID#UPCA_GROUP}</summary>
 *                                                 <ul>
 *                                                     <li> {@link #UPCA_ENABLE} </li>
 *                                                     <li> {@link #UPCA_USER_ID} </li>
 *                                                     <li> {@link #UPCA_SEND_CHECK} </li>
 *                                                     <li> {@link #UPCA_SEND_SYS} </li>
 *                                                     <li> {@link #UPCA_TO_EAN13} </li>
 *                                                     <li> {@link #UPCA_COMPOSITE_ENABLE} </li>
 *                                                 </ul>
 *                                             </details>
 *                                         </li>
 *                                         <li>
 *                                             <details>
 *                                                 <summary> {@link PropertyGroupID#UPCE_GROUP}</summary>
 *                                                 <ul>
 *                                                     <li> {@link #UPCE_ENABLE} </li>
 *                                                     <li> {@link #UPCE_USER_ID} </li>
 *                                                     <li> {@link #UPCE_SEND_CHECK} </li>
 *                                                     <li> {@link #UPCE_SEND_SYS} </li>
 *                                                     <li> {@link #UPCE_TO_UPCA} </li>
 *                                                     <li> {@link #UPCE1_ENABLE} </li>
 *                                                     <li> {@link #UPCE_COMPOSITE_ENABLE} </li>
 *                                                 </ul>
 *                                             </details>
 *                                         </li>
 *                                         <li>
 *                                             <details>
 *                                                 <summary> {@link PropertyGroupID#UPC_EAN_EXT_GROUP}</summary>
 *                                                 <ul>
 *                                                     <li> {@link #EAN_EXT_REQUIRE} </li>
 *                                                     <li> {@link #EAN_EXT_ENABLE_2_DIGIT} </li>
 *                                                     <li> {@link #EAN_EXT_ENABLE_5_DIGIT} </li>
 *                                                     <li> {@link #UPC_EAN_AGGRESSIVENESS} </li>
 *                                                 </ul>
 *                                             </details>
 *                                         </li>
 *                                         <li>
 *                                             <details>
 *                                                 <summary> {@link PropertyGroupID#LINEAR_QUITE_ZONE_GROUP}</summary>
 *                                                 <ul>
 *                                                     <li> {@link #UPC_EAN_SHORT_QUIET_ZONES} </li>
 *                                                     <li> {@link #CODE39_SHORT_QUIET_ZONES} </li>
 *                                                     <li> {@link #CODE128_SHORT_QUIET_ZONES} </li>
 *                                                     <li> {@link #MSI_SHORT_QUIET_ZONES} </li>
 *                                                     <li> {@link #I25_SHORT_QUIET_ZONES} </li>
 *                                                     <li> {@link #CODABAR_SHORT_QUIET_ZONES} </li>
 *                                                     <li> {@link #CODE93_SHORT_QUIET_ZONES} </li>
 *                                                     <li> {@link #M25_SHORT_QUIET_ZONES} </li>
 *                                                 </ul>
 *                                             </details>
 *                                         </li>
 *                                     </ul>
 *                                 </details>
 *                             </li>
 *                             <li>
 *                                 <details>
 *                                     <summary> {@link PropertyGroupID#s2D_GROUP}</summary>
 *                                     <ul>
 *                                         <li>
 *                                             <details>
 *                                                 <summary> {@link PropertyGroupID#AZTEC_GROUP}</summary>
 *                                                 <ul>
 *                                                     <li> {@link #AZTEC_ENABLE} </li>
 *                                                     <li> {@link #AZTEC_USER_ID} </li>
 *                                                     <li> {@link #AZTEC_LENGTH1} </li>
 *                                                     <li> {@link #AZTEC_LENGTH2} </li>
 *                                                     <li> {@link #AZTEC_LENGTH_CONTROL} </li>
 *                                                     <li> {@link #AZTEC_CHARACTER_SET_MODE} </li>
 *                                                 </ul>
 *                                             </details>
 *                                         </li>
 *                                         <li>
 *                                             <details>
 *                                                 <summary> {@link PropertyGroupID#DATAMATRIX_GROUP}</summary>
 *                                                 <ul>
 *                                                     <li> {@link #DATAMATRIX_ENABLE} </li>
 *                                                     <li> {@link #DATAMATRIX_USER_ID} </li>
 *                                                     <li> {@link #DATAMATRIX_LENGTH1} </li>
 *                                                     <li> {@link #DATAMATRIX_LENGTH2} </li>
 *                                                     <li> {@link #DATAMATRIX_LENGTH_CONTROL} </li>
 *                                                     <li> {@link #DATAMATRIX_CHARACTER_SET_MODE} </li>    
 *                                                     <li> {@link #DATAMATRIX_OPERATING_MODE} </li>
 *                                                     <li> {@link #DATAMATRIX_MIRROR} </li>
 *                                                     <li> {@link #DATAMATRIX_GS1_ENABLE} </li>
 *                                                     <li> {@link #DATAMATRIX_AGGRESSIVENESS} </li>
 *                                                     <li> {@link #DATAMATRIX_DMRE} </li>
 *                                                     <li> {@link #DATAMATRIX_GS1_DL_ENABLE} </li>
 *                                                 </ul>
 *                                             </details>
 *                                         </li>
 *                                         <li>
 *                                             <details>
 *                                                 <summary> {@link PropertyGroupID#DOTCODE_GROUP}</summary>
 *                                                 <ul>
 *                                                     <li> {@link #DOTCODE_ENABLE} </li>
 *                                                     <li> {@link #DOTCODE_USER_ID} </li>
 *                                                     <li> {@link #DOTCODE_LENGTH1} </li>
 *                                                     <li> {@link #DOTCODE_LENGTH2} </li>
 *                                                     <li> {@link #DOTCODE_LENGTH_CONTROL} </li>
 *                                                     <li> {@link #DOTCODE_CHARACTER_SET_MODE} </li>    
 *                                                 </ul>
 *                                             </details>
 *                                         </li>
 *                                         <li>
 *                                             <details>
 *                                                 <summary> {@link PropertyGroupID#MAXICODE_GROUP}</summary>
 *                                                 <ul>
 *                                                     <li> {@link #MAXICODE_ENABLE} </li>
 *                                                     <li> {@link #MAXICODE_USER_ID} </li>
 *                                                     <li> {@link #MAXICODE_LENGTH1} </li>
 *                                                     <li> {@link #MAXICODE_LENGTH2} </li>
 *                                                     <li> {@link #MAXICODE_LENGTH_CONTROL} </li>
 *                                                 </ul>
 *                                             </details>
 *                                         </li>
 *                                         <li>
 *                                             <details>
 *                                                 <summary> {@link PropertyGroupID#MICROPDF417_GROUP}</summary>
 *                                                 <ul>
 *                                                     <li> {@link #MICROPDF417_ENABLE} </li>
 *                                                     <li> {@link #MICROPDF417_USER_ID} </li>
 *                                                     <li> {@link #MICROPDF417_LENGTH1} </li>
 *                                                     <li> {@link #MICROPDF417_LENGTH2} </li>
 *                                                     <li> {@link #MICROPDF417_LENGTH_CONTROL} </li>
 *                                                     <li> {@link #MICROPDF417_CHARACTER_SET_MODE} </li>    
 *                                                 </ul>
 *                                             </details>
 *                                         </li>
 *                                         <li>
 *                                             <details>
 *                                                 <summary> {@link PropertyGroupID#MICRO_QRCODE_GROUP}</summary>
 *                                                 <ul>
 *                                                     <li> {@link #MICRO_QR_ENABLE} </li>
 *                                                     <li> {@link #MICRO_QR_USER_ID} </li>
 *                                                     <li> {@link #MICRO_QR_LENGTH1} </li>
 *                                                     <li> {@link #MICRO_QR_LENGTH2} </li>
 *                                                     <li> {@link #MICRO_QR_LENGTH_CONTROL} </li>
 *                                                     <li> {@link #MICRO_QR_CHARACTER_SET_MODE} </li>
 *                                                 </ul>
 *                                             </details>
 *                                         </li>
 *                                         <li>
 *                                             <details>
 *                                                 <summary> {@link PropertyGroupID#PDF417_GROUP}</summary>
 *                                                 <ul>
 *                                                     <li> {@link #PDF417_ENABLE} </li>
 *                                                     <li> {@link #PDF417_USER_ID} </li>
 *                                                     <li> {@link #PDF417_LENGTH1} </li>
 *                                                     <li> {@link #PDF417_LENGTH2} </li>
 *                                                     <li> {@link #PDF417_LENGTH_CONTROL} </li>
 *                                                     <li> {@link #PDF417_CHARACTER_SET_MODE} </li>                                                    
 *                                                 </ul>
 *                                             </details>
 *                                         </li>
 *                                         <li>
 *                                             <details>
 *                                                 <summary> {@link PropertyGroupID#QRCODE_GROUP}</summary>
 *                                                 <ul>
 *                                                     <li> {@link #QRCODE_ENABLE} </li>
 *                                                     <li> {@link #QRCODE_USER_ID} </li>
 *                                                     <li> {@link #QRCODE_LENGTH1} </li>
 *                                                     <li> {@link #QRCODE_LENGTH2} </li>
 *                                                     <li> {@link #QRCODE_LENGTH_CONTROL} </li>
 *                                                     <li> {@link #QRCODE_CHARACTER_SET_MODE} </li>
 *                                                     <li> {@link #QRCODE_WIFI_ENABLE} </li>
 *                                                     <li> {@link #QRCODE_GS1_ENABLE} </li>
 *                                                     <li> {@link #QRCODE_S2D_ENABLE} </li>
 *                                                     <li> {@link #QRCODE_MIRROR} </li>
 *                                                     <li> {@link #QRCODE_ABSOLUTE_GRID} </li>
 *                                                     <li> {@link #QRCODE_GS1_DL_ENABLE} </li>
 *                                                 </ul>
 *                                             </details>
 *                                         </li>
 *                                         <li>
 *                                             <details>
 *                                                 <summary> {@link PropertyGroupID#COMPOSITE_GROUP}</summary>
 *                                                 <ul>
 *                                                     <li> {@link #COMPOSITE_ENABLE} </li>
 *                                                     <li> {@link #COMPOSITE_USER_ID} </li>
 *                                                     <li> {@link #COMPOSITE_EAN_UPC_MODE} </li>
 *                                                     <li> {@link #COMPOSITE_GS1_128_MODE} </li>
 *                                                     <li> {@link #COMPOSITE_LINEAR_TRANSMISSION_ENABLE} </li>
 *                                                 </ul>
 *                                             </details>
 *                                         </li>
 *                                         <li>
 *                                             <details>
 *                                                 <summary> {@link PropertyGroupID#HAN_XIN_GROUP}</summary>
 *                                                 <ul>
 *                                                     <li> {@link #HAN_XIN_ENABLE} </li>
 *                                                     <li> {@link #HAN_XIN_LENGTH1} </li>
 *                                                     <li> {@link #HAN_XIN_LENGTH2} </li>
 *                                                     <li> {@link #HAN_XIN_LENGTH_CONTROL} </li>
 *                                                     <li> {@link #HAN_XIN_USER_ID} </li>
 *                                                 </ul>
 *                                             </details>
 *                                         </li>
 *                                         <li>
 *                                             <details>
 *                                                 <summary> {@link PropertyGroupID#TLC39_GROUP}</summary>
 *                                                 <ul>
 *                                                     <li> {@link #TLC39_ENABLE} </li>
 *                                                     <li> {@link #TLC39_LENGTH1} </li>
 *                                                     <li> {@link #TLC39_LENGTH2} </li>
 *                                                     <li> {@link #TLC39_LENGTH_CONTROL} </li>
 *                                                     <li> {@link #TLC39_USER_ID} </li>
 *                                                     <li> {@link #TLC39_LINEAR_TRANSMISSION_ENABLE} </li>
 *                                                 </ul>
 *                                             </details>
 *                                         </li>
 *                                     </ul>
 *                                 </details>
 *                             </li>
 *                             <li>
 *                                 <details>
 *                                     <summary> {@link PropertyGroupID#POSTAL_GROUP}</summary>
 *                                     <ul>
 *                                         <li>
 *                                             <details>
 *                                                 <summary> {@link PropertyGroupID#POSTAL_AUSTRALIAN_GROUP}</summary>
 *                                                 <ul>
 *                                                     <li> {@link #AUSTRALIAN_POST_ENABLE} </li>
 *                                                     <li> {@link #AUSTRALIAN_CODE_USER_ID} </li>
 *                                                 </ul>
 *                                             </details>
 *                                         </li>
 *                                         <li>
 *                                             <details>
 *                                                 <summary> {@link PropertyGroupID#POSTAL_JAPAN_GROUP}</summary>
 *                                                 <ul>
 *                                                     <li> {@link #JAPANESE_POST_ENABLE} </li>
 *                                                     <li> {@link #JAPANESE_POST_CODE_USER_ID} </li>
 *                                                 </ul>
 *                                             </details>
 *                                         </li>
 *                                         <li>
 *                                             <details>
 *                                                 <summary> {@link PropertyGroupID#POSTAL_KIX_GROUP}</summary>
 *                                                 <ul>
 *                                                     <li> {@link #KIX_CODE_ENABLE} </li>
 *                                                     <li> {@link #KIX_CODE_USER_ID} </li>
 *                                                 </ul>
 *                                             </details>
 *                                         </li>
 *                                         <li>
 *                                             <details>
 *                                                 <summary> {@link PropertyGroupID#POSTAL_ROYAL_MAIL_GROUP}</summary>
 *                                                 <ul>
 *                                                     <li> {@link #ROYAL_MAIL_ENABLE} </li>
 *                                                     <li> {@link #ROYAL_MAIL_CODE_USER_ID} </li>
 *                                                     <li> {@link #ROYAL_MAIL_SEND_CHECK} </li>
 *                                                 </ul>
 *                                             </details>
 *                                         </li>
 *                                         <li>
 *                                             <details>
 *                                                 <summary> {@link PropertyGroupID#POSTAL_US_PLANET_GROUP}</summary>
 *                                                 <ul>
 *                                                     <li> {@link #US_PLANET_ENABLE} </li>
 *                                                     <li> {@link #US_PLANET_CODE_USER_ID} </li>
 *                                                 </ul>
 *                                             </details>
 *                                         </li>
 *                                         <li>
 *                                             <details>
 *                                                 <summary> {@link PropertyGroupID#POSTAL_US_POSTNET_GROUP}</summary>
 *                                                 <ul>
 *                                                     <li> {@link #US_POSTNET_ENABLE} </li>
 *                                                     <li> {@link #US_POSTNET_CODE_USER_ID} </li>
 *                                                 </ul>
 *                                             </details>
 *                                         </li>    
 *                                         <li>
 *                                             <details>
 *                                                 <summary> {@link PropertyGroupID#POSTAL_USPS_4STATE_GROUP}</summary>
 *                                                 <ul>
 *                                                     <li> {@link #USPS_4STATE_ENABLE} </li>
 *                                                     <li> {@link #USPS_4STATE_CODE_USER_ID} </li>
 *                                                 </ul>
 *                                             </details>
 *                                         </li>                                            
 *                                     </ul>
 *                                 </details>
 *                             </li>
 *                             <li>
 *                                 <details>
 *                                     <summary> {@link PropertyGroupID#DIGIMARC_GROUP}</summary>
 *                                     <ul>
 *                                         <li> {@link #DIGIMARC_ENABLE} </li>
 *                                         <li> {@link #DIGIMARC_DATAFORMAT} </li>
 *                                         <li> {@link #DIGIMARC_PRIORITY} </li>
 *                                         <li> {@link #DIGIMARC_USER_ID} </li>
 *                                     </ul>
 *                                 </details>
 *                             </li>
 *                             <li>
 *                                 <details>
 *                                     <summary> {@link PropertyGroupID#OCR_GROUP}</summary>
 *                                     <ul>
 *                                         <li> {@link #OCR_ENABLE} </li>
 *                                         <li> {@link #OCR_USER_ID} </li>
 *                                         <li> {@link #OCR_PASSPORT_ENABLE} </li>
 *                                         <li> {@link #OCR_ID_ENABLE} </li>
 *                                         <li> {@link #OCR_CONFIDENCE} </li>
 *                                         <li> {@link #OCR_MULTIFRAME} </li>
 *                                     </ul>
 *                                 </details>
 *                             </li>
 *                             <li>
 *                                 <details>
 *                                     <summary> {@link PropertyGroupID#INVERSE_GROUP}</summary>
 *                                     <ul>
 *                                         <li> {@link #INVERSE_1D_SYMBOLOGIES} </li>
 *                                         <li> {@link #INVERSE_2D_SYMBOLOGIES} </li>
 *                                     </ul>
 *                                 </details>
 *                             </li>
 *                         </ul>
 *                     </details>
 *                 </li>
 *                 <li>
 *                     <details>
 *                         <summary> {@link PropertyGroupID#SCANNER_OPTIONS_GROUP}</summary>
 *                         <ul>
 *                             <li> {@link #TARGET_MODE} </li>
 *                             <li> {@link #PICKLIST_ENABLE} </li>                                                
 *                             <li> {@link #TARGET_MODE_ENABLE} </li>
 *                             <li> {@link #TARGET_TIMEOUT} </li>
 *                             <li> {@link #TARGET_RELEASE_TIMEOUT} </li>
 *                             <li> {@link #DECODE_TIMEOUT} </li>
 *                             <li> {@link #ILLUMINATION_ENABLE} </li>                                                
 *                             <li> {@link #AIM_ENABLE} </li>
 *                             <li> {@link #DISPLAY_MODE_ENABLE} </li>
 *                             <li> {@link #IMAGE_CAPTURE_PROFILE} </li>
 *                             <li> {@link #CUSTOM_IMAGE_CAPTURE_PROFILE} </li>
 *                             <li> {@link #SCAN_MODE} </li>
 *                             <li> {@link #DOUBLE_READ_TIMEOUT} </li>
 *                             <li> {@link #ILLUMINATION_TYPE} </li>
 *                             <li> {@link #ILLUMINATION_TIME} </li>
 *                             <li> {@link #ENHANCE_DOF_ENABLE} </li>
 *                             <li> {@link #IMAGE_DECODE_TIMEOUT} </li>
 *                             <li> {@link #ENABLE_SCANNER} </li>
 *                             <li> {@link #SCANNER_CAMERA_INTEROPERABILITY} </li>
 *                         </ul>
 *                     </details>
 *                 </li>
 *                 <li>
 *                     <details>
 *                         <summary> {@link PropertyGroupID#INPUT_SELECTION_GROUP}</summary>
 *                         <ul>
 *                             <li> {@link #INPUT_TYPE} </li>
 *                             <li> {@link #PREVIEW_DISPLAY_MODE} </li>
 *                             <li> {@link #PREVIEW_DISPLAY_MODE_MANUAL_PORTRAIT_X} </li>
 *                             <li> {@link #PREVIEW_DISPLAY_MODE_MANUAL_PORTRAIT_Y} </li>
 *                             <li> {@link #PREVIEW_DISPLAY_MODE_MANUAL_PORTRAIT_WIDTH} </li>
 *                             <li> {@link #PREVIEW_DISPLAY_MODE_MANUAL_PORTRAIT_HEIGHT} </li>
 *                             <li> {@link #PREVIEW_DISPLAY_MODE_MANUAL_LANDSCAPE_X} </li>
 *                             <li> {@link #PREVIEW_DISPLAY_MODE_MANUAL_LANDSCAPE_Y} </li>
 *                             <li> {@link #PREVIEW_DISPLAY_MODE_MANUAL_LANDSCAPE_WIDTH} </li>
 *                             <li> {@link #PREVIEW_DISPLAY_MODE_MANUAL_LANDSCAPE_HEIGHT} </li>
 *                             <li> {@link #PREVIEW_ZOOM_LEVEL} </li>
 *                         </ul>
 *                     </details>
 *                 </li>
 *                 <li>
 *                     <details>
 *                         <summary> {@link PropertyGroupID#SNAP_OCR_GROUP}</summary>
 *                         <ul>
 *                             <li> {@link #SNAP_OCR_ENABLE} </li>
 *                             <li> {@link #SNAP_OCR_FIRST_SELECTION_MODE} </li>
 *                             <li> {@link #SNAP_OCR_SCANNING_POLICY} </li>
 *                             <li> {@link #SNAP_OCR_ROI_SETTINGS} </li>
 *                             <li>
 *                                 <details>
 *                                     <summary> {@link PropertyGroupID#SNAP_OCR_RESULT_SETTINGS_GROUP}</summary>
 *                                     <ul>
 *                                         <li> {@link #SNAP_OCR_RESULTS_COMBINATION} </li>
 *                                         <li> {@link #SNAP_OCR_RESULT_SEPARATOR} </li>
 *                                         <li> {@link #SNAP_OCR_REGEX_FILTER} </li>
 *                                         <li> {@link #SNAP_OCR_ROI_PREFIX_VISIBILITY} </li>
 *                                     </ul>
 *                                 </details>
 *                             </li>
 *                             <li>
 *                                 <details>
 *                                     <summary> {@link PropertyGroupID#SNAP_OCR_UI_CUSTOMIZATION_GROUP}</summary>
 *                                     <ul>
 *                                         <li> {@link #SNAP_OCR_COLOR_BLOCK} </li>
 *                                         <li> {@link #SNAP_OCR_COLOR_TEXT} </li>
 *                                         <li> {@link #SNAP_OCR_REFERENCE_ROI_VISIBILITY} </li>
 *                                     </ul>
 *                                 </details>
 *                             </li>
 *                         </ul>
 *                     </details>
 *                 </li>
 *                 <li>
 *                     <details>
 *                         <summary> {@link PropertyGroupID#FORMATTING_GROUP}</summary>
 *                         <ul>
 *                             <li>
 *                                 <details>
 *                                     <summary> {@link PropertyGroupID#STANDARD_FORMATTING_GROUP}</summary>
 *                                         <ul>
 *                                             <li> {@link #LABEL_PREFIX} </li>
 *                                             <li> {@link #LABEL_SUFFIX} </li>
 *                                             <li> {@link #GS_SUBSTITUTION} </li>
 *                                             <li> {@link #REMOVE_NON_PRINTABLE_CHARS} </li>
 *                                             <li> {@link #SEND_CODE_ID} </li>
 *                                             <li> {@link #ECI_POLICY} </li>
 *                                             <li> {@link #GS1_CHECK} </li>
 *                                             <li> {@link #GS1_STRING_FORMAT} </li>
 *                                             <li> {@link #GTIN_FORMAT} </li>
 *                                             <li> {@link #GS1_LABEL_SET_TRANSMIT_MODE} </li>
 *                                             <li> {@link #GS1_LABEL_SET_PREFIX} </li>
 *                                             <li> {@link #GS1_2D_CONVERSION} </li>
 *                                             <li> {@link #HEX_FORMAT} </li>
 *                                         </ul>
 *                                 </details>
 *                             </li>
 *                         </ul>
 *                     </details>
 *                 </li>
 *                 <li>
 *                     <details>
 *                         <summary> {@link PropertyGroupID#PRESENTATION_MODE_GROUP}</summary>
 *                         <ul>
 *                             <li> {@link #PRESENTATION_MODE_ENABLE} </li>
 *                             <li> {@link #PRESENTATION_MODE_AIMER_ENABLE} </li>                                                
 *                             <li> {@link #PRESENTATION_MODE_SENSITIVITY} </li>
 *                         </ul>
 *                     </details>
 *                 </li>
 *                 <li>
 *                     <details>
 *                         <summary> {@link PropertyGroupID#MULTISCAN_GROUP}</summary>
 *                         <ul>
 *                             <li> {@link #MULTISCAN_ENABLE} </li>                                                
 *                             <li> {@link #MULTISCAN_REQUIRED_LABELS} </li>
 *                             <li> {@link #MULTISCAN_NOTIFICATION_ENABLE} </li>
 *                             <li> {@link #MULTISCAN_PARTIAL_RESULT_MODE} </li>                            
 *                         </ul>
 *                     </details>
 *                 </li>
 *                 <li>
 *                     <details>
 *                         <summary> {@link PropertyGroupID#WEDGE_GROUP}</summary>
 *                         <ul>
 *                             <li> {@link #WEDGE_INTENT_ENABLE} </li>
 *                             <li> {@link #WEDGE_INTENT_DELIVERY_MODE} </li>
 *                             <li> {@link #WEDGE_INTENT_ACTION_NAME} </li>                                                
 *                             <li> {@link #WEDGE_INTENT_CATEGORY_NAME} </li>
 *                             <li> {@link #WEDGE_INTENT_EXTRA_BARCODE_TYPE} </li>
 *                             <li> {@link #WEDGE_INTENT_EXTRA_BARCODE_STRING} </li>
 *                             <li> {@link #WEDGE_INTENT_EXTRA_BARCODE_DATA} </li>
 *                             <li> {@link #WEDGE_INTENT_EXCLUDE_EMPTY_VALUES} </li>
 *                             <li> {@link #WEDGE_INTENT_EXTRA_BARCODE_USER_ID} </li>
 *                             <li> {@link #WEDGE_INTENT_EXTRA_BARCODE_AIM_ID} </li>
 *                             <li> {@link #WEDGE_INTENT_EXTRA_BARCODE_CROP} </li>
 *                             <li> {@link #WEDGE_WEB_ENABLE} </li>
 *                         </ul>
 *                     </details>
 *                 </li>
 *                 <li>
 *                     <details>
 *                         <summary> {@link PropertyGroupID#DECODING_NOTIFICATION_GROUP}</summary>
 *                         <ul>
 *                             <li> {@link #GOOD_READ_COUNT} </li>
 *                             <li> {@link #GOOD_READ_DURATION} </li>                                                
 *                             <li> {@link #GOOD_READ_INTERVAL} </li>
 *                             <li> {@link #GOOD_READ_AUDIO_VOLUME} </li>
 *                             <li> {@link #GOOD_READ_AUDIO_FILE} </li>
 *                             <li> {@link #GOOD_READ_AUDIO_MODE} </li>
 *                             <li> {@link #GOOD_READ_AUDIO_CHANNEL} </li>                            
 *                             <li> {@link #DISPLAY_NOTIFICATION_ENABLE} </li>
 *                             <li> {@link #GOOD_READ_TIMEOUT} </li>
 *                         </ul>
 *                     </details>
 *                 </li>
 *                 <li>
 *                     <details>
 *                         <summary> {@link PropertyGroupID#FRAME_CAPTURE_CONFIGURATION_GROUP}</summary>
 *                         <ul>
 *                             <li> {@link #FRAME_CAPTURE_ENABLE} </li>
 *                             <li> {@link #FRAME_CAPTURE_FILE_PATH} </li>                                                
 *                             <li> {@link #FRAME_CAPTURE_FORMAT} </li>
 *                             <li> {@link #FRAME_CAPTURE_MODE} </li>
 *                             <li> {@link #FRAME_CAPTURE_STORAGE_ENABLE} </li>                            
 *                         </ul>
 *                     </details>
 *                 </li>
 *                 <li>
 *                     <details>
 *                         <summary> {@link PropertyGroupID#GOOD_READ_GROUP}</summary>
 *                         <ul>
 *                             <li> {@link #GOOD_READ_ENABLE} </li>
 *                             <li> {@link #GREEN_SPOT_ENABLE} </li>                                                
 *                             <li> {@link #GOOD_READ_LED_ENABLE} </li>
 *                             <li> {@link #GOOD_READ_VIBRATE_ENABLE} </li>
 *                             <li>
 *                                 <details>
 *                                 <summary> {@link PropertyGroupID#GOOD_READ_OVERLAY_GROUP}</summary>
 *                                 <ul>
 *                                     <li> {@link #GOOD_READ_OVERLAY_ENABLE} </li>
 *                                     <li> {@link #GOOD_READ_OVERLAY_COLOR} </li>
 *                                     <li> {@link #GOOD_READ_OVERLAY_SHAPE_POLICY} </li>
 *                                     <li> {@link #GOOD_READ_OVERLAY_CUSTOM_SHAPE_NAME_PROFILE} </li>
 *                                     <li> {@link #GOOD_READ_OVERLAY_PORTRAIT_POSITION_POLICY} </li>
 *                                     <li> {@link #GOOD_READ_OVERLAY_PORTRAIT_CUSTOM_POSITION_X} </li>
 *                                     <li> {@link #GOOD_READ_OVERLAY_PORTRAIT_CUSTOM_POSITION_Y} </li>
 *                                     <li> {@link #GOOD_READ_OVERLAY_PORTRAIT_DISPLAY_POLICY} </li>
 *                                     <li> {@link #GOOD_READ_OVERLAY_PORTRAIT_CUSTOM_SIZE_MAX_WIDTH} </li>
 *                                     <li> {@link #GOOD_READ_OVERLAY_PORTRAIT_CUSTOM_SIZE_MAX_HEIGHT} </li>
 *                                     <li> {@link #GOOD_READ_OVERLAY_LANDSCAPE_POSITION_POLICY} </li>
 *                                     <li> {@link #GOOD_READ_OVERLAY_LANDSCAPE_CUSTOM_POSITION_X} </li>
 *                                     <li> {@link #GOOD_READ_OVERLAY_LANDSCAPE_CUSTOM_POSITION_Y} </li>
 *                                     <li> {@link #GOOD_READ_OVERLAY_LANDSCAPE_DISPLAY_POLICY} </li>
 *                                     <li> {@link #GOOD_READ_OVERLAY_LANDSCAPE_CUSTOM_SIZE_MAX_WIDTH} </li>
 *                                     <li> {@link #GOOD_READ_OVERLAY_LANDSCAPE_CUSTOM_SIZE_MAX_HEIGHT} </li>
 *                                     <li> {@link #GOOD_READ_OVERLAY_TRANSPARENCY} </li>
 *                                     <li> {@link #GOOD_READ_OVERLAY_PRESERVE_COLORS} </li>
 *                                     <li> {@link #GOOD_READ_OVERLAY_BLACK_AS_TRANSPARENT} </li>
 *                                </ul>
 *                                </details>
 *                            </li>
 *                         </ul>
 *                     </details>
 *                 </li>
 *                 <li>
 *                     <details>
 *                         <summary> {@link PropertyGroupID#KEYBOARD_WEDGE_GROUP}</summary>
 *                         <ul>
 *                             <li> {@link #WEDGE_KEYBOARD_ENABLE} </li>
 *                             <li> {@link #WEDGE_KEYBOARD_ONLY_ON_FOCUS} </li>
 *                             <li> {@link #WEDGE_KEYBOARD_DELIVERY_MODE} </li>
 *                             <li> {@link #WEDGE_KEYBOARD_NON_PRINTABLE_KEY_EVENT_DELAY} </li>
 *                         </ul>
 *                     </details>
 *                 </li>
 *                 <li>
 *                     <details>
 *                         <summary> {@link PropertyGroupID#EXT_SCANNER_SOURCE_GROUP}</summary>
 *                         <ul>
 *                             <li> {@link #EXT_SCANNER_SOURCE_ENABLE} </li>
 *                             <li> {@link #EXT_SCANNER_SOURCE_STANDARD_FORMATTER_ENABLE} </li>
 *                         </ul>
 *                     </details>
 *                 </li>
 *                 <li>
 *                     <details>
 *                         <summary> {@link PropertyGroupID#CAMERA_WEDGE_GROUP}</summary>
 *                         <ul>
 *                             <li> {@link #CAMERA_WEDGE_ENABLE} </li>
 *                             <li> {@link #CAMERA_WEDGE_BARCODE_TYPE} </li>
 *                             <li> {@link #CAMERA_WEDGE_MAX_BARCODE_PERSISTENCE} </li>
 *                             <li> {@link #CAMERA_WEDGE_MIN_BARCODE_PERSISTENCE} </li>
 *                             <li> {@link #CAMERA_WEDGE_BARCODE_ORIENTATION} </li>
 *                             <li> {@link #CAMERA_WEDGE_BARCODE_SIZE} </li>
 *                             <li> {@link #CAMERA_WEDGE_BARCODE_POSITION} </li>
 *                             <li> {@link #CAMERA_WEDGE_BARCODE_CUSTOM_POSITION_X} </li>
 *                             <li> {@link #CAMERA_WEDGE_BARCODE_CUSTOM_POSITION_Y} </li>
 *                             <li> {@link #CAMERA_WEDGE_BACKGROUND_COLOR} </li>
 *                             <li> {@link #CAMERA_WEDGE_BARCODE_COLOR} </li>
 *                         </ul>
 *                     </details>
 *                 </li>
 *                 <li>
 *                     <details>
 *                         <summary> {@link PropertyGroupID#DECODE_RESULT_CROP_GROUP}</summary>
 *                         <ul>
 *                             <li> {@link #DECODE_RESULT_CROP_BARCODE_ENABLE} </li>
 *                             <li> {@link #DECODE_RESULT_CROP_SNAP_OCR_ENABLE} </li>
 *                             <li> {@link #DECODE_RESULT_CROP_MARGIN} </li>
 *                             <li> {@link #DECODE_RESULT_CROP_ENTIRE_FRAME} </li>
 *                         </ul>
 *                     </details>
 *                 </li>
 *             </ul>
 *         </details>
 *     </li>
 *
 *     <li>
 *     <details>
 *         <summary> {@link PropertyGroupID#KEYBOARD_GROUP}</summary>
 *         <ul>
 *            <li> {@link #KEYBOARD_LOCK_INPUT} </li>
 *            <li> {@link #PHYSICAL_KEYBOARD_POLICY} </li>
 *            <li> {@link #PHYSICAL_KEYBOARD_PROFILE} </li>
 *            <li> {@link #VIRTUAL_KEYBOARD_PROFILE} </li>
 *            <li> {@link #VIRTUAL_KEYBOARD_GBOARD_ENABLED} </li>
 *            <li> {@link #VIRTUAL_KEYBOARD_VOICE_TYPING_ENABLED} </li>
 *            <li> {@link #VIRTUAL_KEYBOARD_ANDROID_ENABLED} </li>
 *            <li> {@link #VIRTUAL_KEYBOARDS_CUSTOM_ENABLED} </li>
 *         </ul>
 *         <ul>
 *            <li>
 *            <details>
 *               <summary> {@link PropertyGroupID#KEYBOARD_TRIGGERS_GROUP}</summary>
 *               <ul>
 *                  <li> {@link #KEYBOARD_LEFT_TRIGGER} </li>
 *                  <li> {@link #KEYBOARD_RIGHT_TRIGGER} </li>
 *                  <li> {@link #KEYBOARD_FRONT_TRIGGER} </li>
 *                  <li> {@link #KEYBOARD_PISTOL_TRIGGER} </li>
 *                  <li> {@link #KEYBOARD_AUTOSCAN_TRIGGER} </li>
 *                  <li> {@link #KEYBOARD_AUTOSCAN_TRIGGER_RANGE} </li>
 *                  <li> {@link #KEYBOARD_MOTION_TRIGGER} </li>
 *                  <li> {@link #KEYBOARD_MOTION_TRIGGER_SENSITIVITY} </li>
 *                  <li> {@link #KEYBOARD_MOTION_TRIGGER_VIBRATION} </li>
 *                  <li> {@link #KEYBOARD_PTT_TRIGGER} </li>
 *                  <li> {@link #KEYBOARD_LEFT_TRIGGER_ACTION_IN_SUSPEND} </li>
 *                  <li> {@link #KEYBOARD_RIGHT_TRIGGER_ACTION_IN_SUSPEND} </li>
 *                  <li> {@link #KEYBOARD_PISTOL_TRIGGER_ACTION_IN_SUSPEND} </li>
 *                  <li> {@link #KEYBOARD_FRONT_TRIGGER_ACTION_IN_SUSPEND} </li>
 *                  <li> {@link #KEYBOARD_PTT_TRIGGER_ACTION_IN_SUSPEND} </li>
 *                </ul>
 *            </details>
 *            </li>
 *            <li>
 *            <details>
 *               <summary> {@link PropertyGroupID#KEYBOARD_ADVANCED_GROUP}</summary>
 *               <ul>
 *                  <li> {@link #KEYBOARD_BACKLIGHT} </li>
 *                  <li> {@link #KEYBOARD_BACKLIGHT_BRIGHTNESS} </li>
 *                  <li> {@link #KEYBOARD_BACKLIGHT_TIMEOUT} </li>
 *                  <li> {@link #KEYBOARD_MULTITAP_DELAY} </li>
 *               </ul>
 *            </details>
 *            </li>
 *            <li>
 *            <details>
 *               <summary> {@link PropertyGroupID#KEYBOARD_PTT_GROUP}</summary>
 *               <ul>
 *                  <li> {@link #KEYBOARD_PTT_SUPPORTED_WT_APPLICATIONS} </li>
 *                  <li> {@link #KEYBOARD_PTT_ACTIVE_WT_PACKAGE} </li>
 *                  <li> {@link #KEYBOARD_PTT_NOTIFICATION_ENABLED} </li>
 *                  <li> {@link #KEYBOARD_PTT_BYPASS_KEYGUARD_ENABLED} </li>
 *               </ul>
 *            </details>
 *            </li>
 *         </ul>
 *     </details>
 *     </li>
 *
 *     <li>
 *     <details>
 *         <summary> {@link PropertyGroupID#TOUCH_GROUP}</summary>
 *         <ul>
 *            <li> {@link #TOUCH_LOCK_INPUT} </li>
 *            <li> {@link #TOUCH_MODE_SENSITIVITY} </li>
 *            <li> {@link #TOUCH_MODE} </li>
 *         </ul>
 *     </details>
 *     </li>
 *
 *     <li>
 *     <details>
 *         <summary> {@link PropertyGroupID#POWER_GROUP}</summary>
 *         <ul>
 *            <li> {@link #POWER_SOURCE_USB} </li>
 *         </ul>
 *         <ul>
 *            <li>
 *            <details>
 *               <summary> {@link PropertyGroupID#POWER_OFF_CHARGING_MODE_GROUP}</summary>
 *               <ul>
 *                  <li> {@link #POWER_OFF_CHARGING_MODE_THRESHOLD} </li>
 *                  <li> {@link #POWER_OFF_CHARGING_MODE_POLICY} </li>
 *               </ul>
 *            </details>
 *            </li>
 *            <li>
 *            <details>
 *               <summary> {@link PropertyGroupID#POWER_CHARGING_MODE_GROUP}</summary>
 *               <ul>
 *                  <li> {@link #POWER_BATTERY_CHARGING_PROFILE} </li>
 *                  <li> {@link #POWER_BATTERY_CHARGING_PROFILE_PERSISTENCE_POLICY} </li>
 *                  <li> {@link #POWER_CHARGING_SOURCES} </li>
 *               </ul>
 *            </details>
 *            </li>
 *            <li>
 *            <details>
 *               <summary> {@link PropertyGroupID#POWER_SUSPEND_TIMEOUT_GROUP}</summary>
 *               <ul>
 *                  <li> {@link #POWER_SUSPEND_EXTERNAL_TIMEOUT} </li>
 *                  <li> {@link #POWER_SUSPEND_INTERNAL_TIMEOUT} </li>
 *               </ul>
 *            </details>
 *            </li>
 *            <li>
 *            <details>
 *               <summary> {@link PropertyGroupID#POWER_POCKET_MODE_GROUP}</summary>
 *               <ul>
 *                  <li> {@link #POWER_POCKET_MODE_ENABLED} </li>
 *                  <li> {@link #POWER_POCKET_MODE_POLICY} </li>
 *                  <li> {@link #POWER_POCKET_MODE_DELAY} </li>
 *                  <li> {@link #POWER_POCKET_MODE_LOCK_TIMEOUT} </li>
 *               </ul>
 *            </details>
 *            </li>
 *            <li>
 *            <details>
 *               <summary> {@link PropertyGroupID#POWER_SMART_CHARGE_GROUP}</summary>
 *               <ul>
 *                  <li> {@link #POWER_SMART_CHARGE_ENABLE} </li>
 *                  <li> {@link #POWER_SMART_CHARGE_DISCHARGE_DELAY} </li>
 *                  <li> {@link #POWER_SMART_CHARGE_WORK_TIMES} </li>
 *               </ul>
 *            </details>
 *            </li>
 *            <li>
 *            <details>
 *               <summary> {@link PropertyGroupID#POWER_WAKEUP_SOURCES_GROUP}</summary>
 *               <ul>
 *                  <li> {@link #POWER_WAKEUP_POWER_IN} </li>
 *                  <li> {@link #POWER_WAKEUP_LEFT_TRIGGER} </li>
 *                  <li> {@link #POWER_WAKEUP_RIGHT_TRIGGER} </li>
 *                  <li> {@link #POWER_WAKEUP_PISTOL_TRIGGER} </li>
 *                  <li> {@link #POWER_WAKEUP_FRONT_TRIGGER} </li>
 *                  <li> {@link #POWER_WAKEUP_WIFI} </li>
 *                  <li> {@link #POWER_WAKEUP_WWAN} </li>
 *                  <li> {@link #POWER_WAKEUP_ACCELEROMETER} </li>
 *                  <li> {@link #POWER_WAKEUP_TOUCH} </li>
 *                  <li> {@link #POWER_WAKEUP_AUTOSCAN_TRIGGER} </li>
 *                  <li> {@link #POWER_WAKEUP_PTT_TRIGGER} </li>
 *               </ul>
 *            </details>
 *            </li>
 *            <li>
 *            <details>
 *               <summary> {@link PropertyGroupID#POWER_ENTERPRISE_BATTERY_SAVER_GROUP}</summary>
 *               <ul>
 *                  <li> {@link #POWER_ENTERPRISE_BATTERY_SAVER_ENABLED} </li>
 *                  <li> {@link #POWER_ENTERPRISE_BATTERY_SAVER_IGNORE_POWER} </li>
 *                  <li> {@link #POWER_ENTERPRISE_BATTERY_SAVER_PROFILES} </li>
 *                  <li> {@link #POWER_ENTERPRISE_BATTERY_SAVER_ACTIVATION_ITEMS} </li>
 *               </ul>
 *            </details>
 *            </li>
 *         </ul>
 *     </details>
 *     </li>
 *
 *     <li>
 *     <details>
 *         <summary> {@link PropertyGroupID#CRADLE_GROUP}</summary>
 *         <ul>
 *            <li> {@link #CRADLE_FW_UPDATE_POLICY} </li>
 *            <li> {@link #CRADLE_UNLOCK_POLICY} </li>
 *            <li> {@link #CRADLE_UNLOCK_KEY_POLICY} </li>
 *            <li> {@link #CRADLE_FAILURE_POLICY} </li>
 *            <li> {@link #CRADLE_UNLOCK_NOTIFICATION_POLICY} </li>
 *         </ul>
 *     </details>
 *     </li>
 *
 *     <li>
 *     <details>
 *         <summary> {@link PropertyGroupID#WIFI_GROUP}</summary>
 *         <ul>
 *         <li>
 *         <details>
 *             <summary> {@link PropertyGroupID#WIFI_MODULE_SETTINGS_GROUP}</summary>
 *             <ul>
 *                 <li> {@link #WIFI_802_DOT_11_MODE} </li>
 *                 <li> {@link #WIFI_BAND_SELECTION} </li>
 *                 <li> {@link #WIFI_BAND} </li>
 *                 <li> {@link #WIFI_POWER_SAVE} </li>
 *                 <li> {@link #WIFI_VERBOSE_WIFI_MODULE_LOG} </li>
 *                 <li> {@link #WIFI_MAC_RANDOMIZATION} </li>
 *                 <li> {@link #WIFI_NO_INTERNET_EXPECTED} </li>
 *                 <li>
 *                 <details>
 *                     <summary> {@link PropertyGroupID#WIFI_CHANNELS_GROUP}</summary>
 *                     <ul>
 *                         <li> {@link #WIFI_COUNTRY_CODE} </li>
 *                         <li> {@link #WIFI_UNLOCK_CHANNELS} </li>
 *                         <li>
 *                         <details>
 *                             <summary> {@link PropertyGroupID#WIFI_CHANNELS_GROUP_2_4GHZ}</summary>
 *                             <ul>
 *                                 <li> {@link #WIFI_CHANNEL_1} </li>
 *                                 <li> {@link #WIFI_CHANNEL_2} </li>
 *                                 <li> {@link #WIFI_CHANNEL_3} </li>
 *                                 <li> {@link #WIFI_CHANNEL_4} </li>
 *                                 <li> {@link #WIFI_CHANNEL_5} </li>
 *                                 <li> {@link #WIFI_CHANNEL_6} </li>
 *                                 <li> {@link #WIFI_CHANNEL_7} </li>
 *                                 <li> {@link #WIFI_CHANNEL_8} </li>
 *                                 <li> {@link #WIFI_CHANNEL_9} </li>
 *                                 <li> {@link #WIFI_CHANNEL_10} </li>
 *                                 <li> {@link #WIFI_CHANNEL_11} </li>
 *                                 <li> {@link #WIFI_CHANNEL_12} </li>
 *                                 <li> {@link #WIFI_CHANNEL_13} </li>
 *                             </ul>
 *                         </details>
 *                         </li>
 *                         <li>
 *                         <details>
 *                             <summary> {@link PropertyGroupID#WIFI_CHANNELS_GROUP_5GHZ}</summary>
 *                             <ul>
 *                                 <li> {@link #WIFI_CHANNEL_36} </li>
 *                                 <li> {@link #WIFI_CHANNEL_40} </li>
 *                                 <li> {@link #WIFI_CHANNEL_44} </li>
 *                                 <li> {@link #WIFI_CHANNEL_48} </li>
 *                                 <li> {@link #WIFI_CHANNEL_52} </li>
 *                                 <li> {@link #WIFI_CHANNEL_56} </li>
 *                                 <li> {@link #WIFI_CHANNEL_60} </li>
 *                                 <li> {@link #WIFI_CHANNEL_64} </li>
 *                                 <li> {@link #WIFI_CHANNEL_100} </li>
 *                                 <li> {@link #WIFI_CHANNEL_104} </li>
 *                                 <li> {@link #WIFI_CHANNEL_108} </li>
 *                                 <li> {@link #WIFI_CHANNEL_112} </li>
 *                                 <li> {@link #WIFI_CHANNEL_116} </li>
 *                                 <li> {@link #WIFI_CHANNEL_120} </li>
 *                                 <li> {@link #WIFI_CHANNEL_124} </li>
 *                                 <li> {@link #WIFI_CHANNEL_128} </li>
 *                                 <li> {@link #WIFI_CHANNEL_132} </li>
 *                                 <li> {@link #WIFI_CHANNEL_136} </li>
 *                                 <li> {@link #WIFI_CHANNEL_140} </li>
 *                                 <li> {@link #WIFI_CHANNEL_144} </li>
 *                                 <li> {@link #WIFI_CHANNEL_149} </li>
 *                                 <li> {@link #WIFI_CHANNEL_153} </li>
 *                                 <li> {@link #WIFI_CHANNEL_157} </li>
 *                                 <li> {@link #WIFI_CHANNEL_161} </li>
 *                                 <li> {@link #WIFI_CHANNEL_165} </li>
 *                                 <li> {@link #WIFI_CHANNEL_169} </li>
 *                                 <li> {@link #WIFI_CHANNEL_173} </li>
 *                             </ul>
 *                         </details>
 *                         </li>
 *                     </ul>
 *                 </details>
 *                 </li>
 *             </ul>
 *         </details>
 *         </li>
 *         <li>
 *         <details>
 *              <summary> {@link PropertyGroupID#WIFI_ROAMING_SETTINGS_GROUP}</summary>
 *             <ul>
 *                 <li> {@link #WIFI_ROAMING_PROFILE} </li>
 *                 <li> {@link #WIFI_ROAMING_RSSI_THRESHOLD} </li>
 *                 <li> {@link #WIFI_ROAMING_RSSI_DIFFERENCE} </li>
 *                 <li> {@link #WIFI_ROAMING_RETRY_TIMES} </li>
 *                 <li> {@link #WIFI_ROAMING_RECALCULATION_INTERVAL} </li>
 *                 <li> {@link #WIFI_ROAMING_BEACON_PERIOD} </li>
 *                 <li> {@link #WIFI_BSSID_SCAN_STABLE_TIME} </li>
 *             </ul>
 *         </details>
 *         </li>
 *         <li>
 *         <details>
 *             <summary> {@link PropertyGroupID#WIFI_SCAN_SETTINGS_GROUP}</summary>
 *             <ul>
 *                 <li>
 *                 <details>
 *                     <summary> {@link PropertyGroupID#WIFI_SCAN_TIMINGS_GROUP}</summary>
 *                     <ul>
 *                         <li> {@link #WIFI_SCAN_INTERVAL} </li>
 *                         <li> {@link #WIFI_SCAN_INTERVAL_MAX} </li>
 *                         <li> {@link #WIFI_CONNECTED_SCAN_INTERVAL} </li>
 *                         <li> {@link #WIFI_CONNECTED_SCAN_INTERVAL_MAX} </li>
 *                     </ul>
 *                 </details>
 *                 </li>
 *             </ul>
 *         </details>
 *         </li>
 *         </ul>
 *     </details>
 *     </li>
 *
 *     <li>
 *     <details>
 *         <summary> {@link PropertyGroupID#ETHERNET_GROUP}</summary>
 *         <ul>
 *            <li> {@link #ETHERNET_ENABLED} </li>
 *         </ul>
 *         <ul>
 *            <li>
 *            <details>
 *               <summary> {@link PropertyGroupID#ETHERNET_SETTINGS_GROUP}</summary>
 *               <ul>
 *                  <li> {@link #ETHERNET_USE_DHCP} </li>
 *                  <li> {@link #ETHERNET_STATIC_ADDRESS} </li>
 *                  <li> {@link #ETHERNET_GATEWAY_ADDRESS} </li>
 *                  <li> {@link #ETHERNET_SUBNET_PREFIX_LENGTH} </li>
 *                  <li> {@link #ETHERNET_DNS1_ADDRESS} </li>
 *                  <li> {@link #ETHERNET_DNS2_ADDRESS} </li>
 *                  <li> {@link #ETHERNET_PROXY_ENABLED} </li>
 *                  <li> {@link #ETHERNET_PROXY_HOSTNAME} </li>
 *                  <li> {@link #ETHERNET_PROXY_PORT} </li>
 *                  <li> {@link #ETHERNET_PROXY_BYPASS} </li>
 *               </ul>
 *            </details>
 *            </li>
 *         </ul>
 *     </details>
 *     </li>
 *
 *     <li>
 *     <details>
 *         <summary> {@link PropertyGroupID#DUAL_SIM_MGMT_GROUP}</summary>
 *         <ul>
 *            <li> {@link #DUALSIM_AVAILABLE} </li>
 *            <li> {@link #DUALSIM_SIM1_ENABLE} </li>
 *            <li> {@link #DUALSIM_SIM2_ENABLE} </li>
 *            <li> {@link #DUALSIM_CURRENT_DATA} </li>
 *            <li> {@link #DUALSIM_CURRENT_CALLS} </li>
 *            <li> {@link #DUALSIM_CURRENT_SMS} </li>
 *            <li> {@link #DUALSIM_PREFERRED_DATA} </li>
 *            <li> {@link #DUALSIM_PREFERRED_CALLS} </li>
 *            <li> {@link #DUALSIM_PREFERRED_SMS} </li>
 *         </ul>
 *     </details>
 *     </li>
 *
 *     <li>
 *     <details>
 *         <summary> {@link PropertyGroupID#BLUETOOTH_GROUP}</summary>
 *         <ul>
 *            <li> {@link #BT_DISCOVERABILITY} </li>
 *            <li> {@link #BT_PAIRING_POLICY} </li>
 *            <li> {@link #BT_SILENT_PAIRING_TRUSTED_ENABLED} </li>
 *            <li> {@link #BT_SILENT_PAIRING_WHITELISTING_ENABLE} </li>
 *            <li> {@link #BT_SILENT_PAIRING_WHITELISTING} </li>
 *         </ul>
 *     </details>
 *     </li>
 *
 *     <li>
 *     <details>
 *         <summary> {@link PropertyGroupID#USB_GROUP}</summary>
 *         <ul>
 *            <li> {@link #USB_DATA} </li>
 *            <li> {@link #USB_DEFAULT_FUNCTION} </li>
 *            <li> {@link #USB_CURRENT_FUNCTION} </li>
 *            <li> {@link #USB_CLIENT_DATA} </li>
 *            <li> {@link #USB_HOST_DATA} </li>
 *            <li> {@link #USB_HOST_WHITELISTING} </li>
 *            <li> {@link #USB_PREDEFINED_HOST_WHITELISTING} </li>
 *         </ul>
 *     </details>
 *     </li>
 *
 *     <li>
 *     <details>
 *         <summary> {@link PropertyGroupID#DATE_AND_TIME_GROUP}</summary>
 *         <ul>
 *            <li> {@link #DATE_AND_TIME_AUTO_TIME} </li>
 *            <li> {@link #DATE_AND_TIME_AUTO_TIME_ZONE} </li>
 *            <li> {@link #DATE_AND_TIME_TIMEZONE_ID} </li>
 *            <li> {@link #DATE_AND_TIME_TIME_24H_FORMAT} </li>
 *            <li> {@link #DATE_AND_TIME_NTP_SERVER} </li>
 *            <li> {@link #DATE_AND_TIME_NTP_SERVER_2} </li>
 *            <li> {@link #DATE_AND_TIME_NTP_TIMEOUT} </li>
 *         </ul>
 *     </details>
 *     </li>
 *
 *     <li>
 *     <details>
 *         <summary> {@link PropertyGroupID#DEVICE_INFO_GROUP}</summary>
 *         <ul>
 *            <li> {@link #DEVICE_NAME_BASE} </li>
 *            <li> {@link #DEVICE_NAME_SUFFIX} </li>
 *         </ul>
 *     </details>
 *     </li>
 *
 *     <li>
 *     <details>
 *         <summary> {@link PropertyGroupID#DISPLAY_GROUP}</summary>
 *         <ul>
 *            <li> {@link #SCREEN_BRIGHTNESS} </li>
 *         </ul>
 *     </details>
 *     </li>
 *
 *     <li>
 *     <details>
 *         <summary> {@link PropertyGroupID#UI_SETTINGS_GROUP}</summary>
 *         <ul>
 *            <li> {@link #STATUS_BAR_HIDDEN} </li>
 *            <li> {@link #STATUS_BAR_ENABLED} </li>
 *            <li> {@link #STATUS_BAR_ON_LOCK_SCREEN_ENABLED} </li>
 *            <li> {@link #NAVIGATION_BAR_HIDDEN} </li>
 *            <li> {@link #RECENT_APPS_ENABLED} </li>
 *            <li> {@link #SPLIT_SCREEN_APP_HIDDEN} </li>
 *            <li> {@link #TASK_BAR_HIDDEN} </li>
 *            <li> {@link #NOTIFICATION_PANEL_ON_HOME_SCREEN_ENABLED} </li>
 *            <li> {@link #NOTIFICATION_PANEL_ON_LOCK_SCREEN_POLICY} </li>
 *            <li> {@link #NOTIFICATION_MANAGE_BUTTON_HIDDEN} </li>
 *            <li> {@link #NOTIFICATION_LONG_PRESS_ENABLED} </li>
 *            <li> {@link #NOTIFICATION_MONITORED_NETWORK_HIDDEN} </li>
 *            <li> {@link #QUICK_SETTINGS_PANEL_TILES} </li>
 *            <li> {@link #QUICK_SETTINGS_PANEL_EDIT_HIDDEN} </li>
 *            <li> {@link #QUICK_SETTINGS_PANEL_GEAR_HIDDEN} </li>
 *            <li> {@link #QUICK_SETTINGS_TILES_HOTSPOT_HIDDEN} </li>
 *            <li> {@link #QUICK_SETTINGS_TILES_AIRPLANE_MODE_HIDDEN} </li>
 *            <li> {@link #QUICK_SETTINGS_TILES_DND_HIDDEN} </li>
 *            <li> {@link #ANDROID_SETTINGS_SEARCH_BAR_HIDDEN} </li>
 *            <li> {@link #HOTSPOT_SETTING_DIMMED} </li>
 *            <li> {@link #AIRPLANE_MODE_SETTING_DIMMED} </li>
 *            <li> {@link #DO_NOT_DISTURB_SETTING_DIMMED} </li>
 *            <li> {@link #RESET_OPTIONS_SETTINGS_DIMMED} </li>
 *            <li> {@link #ACCESSIBILITY_SETTINGS_DIMMED} </li>
 *            <li> {@link #NOTIFICATION_APP_SETTINGS_DIMMED} </li>
 *            <li> {@link #LONG_PRESS_HOME_BUTTON_SETTING_DIMMED} </li>
 *            <li> {@link #NOTIFICATION_DOTS_SETTING_DIMMED} </li>
 *            <li> {@link #PHYSICAL_KEYBOARD_SHORTCUTS_SETTING_DIMMED} </li>
 *            <li> {@link #AUTO_SYNC_APP_DATA_SETTING_DIMMED} </li>
 *            <li> {@link #WIFI_NETWORK_SHARE_DIMMED} </li>
 *            <li> {@link #SCREENSAVER_ENABLED} </li>
 *            <li> {@link #SCREENSAVER_SETTING_DIMMED} </li>
 *            <li> {@link #SCREENSAVER_POLICY} </li>
 *            <li> {@link #SCREENSAVER_COMPONENT} </li>
 *            <li> {@link #SCREENSAVER_DATALOGIC} </li>
 *         </ul>
 *     </details>
 *     </li>
 *
 *     <li>
 *     <details>
 *         <summary> {@link PropertyGroupID#UX_SETTINGS_GROUP}</summary>
 *         <ul>
 *            <li> {@link #DESKTOP_MODE_POLICY} </li>
 *            <li> {@link #SCREENSHOT_ENABLED} </li>
 *            <li> {@link #ROTATION_180_ENABLED} </li>
 *            <li> {@link #HOTSPOT_ENABLED} </li>
 *            <li> {@link #DO_NOT_DISTURB_POLICY} </li>
 *            <li> {@link #EMERGENCY_SOS_ENABLED} </li>
 *            <li> {@link #QUICKLY_OPEN_CAMERA_ENABLED} </li>
 *            <li> {@link #LONG_PRESS_HOME_BUTTON_ENABLED} </li>
 *            <li> {@link #PHYSICAL_KEYBOARD_SHORTCUTS_ENABLED} </li>
 *            <li> {@link #AUTO_SYNC_APP_DATA_ENABLED} </li>
 *            <li> {@link #NOTIFICATION_DOTS_ENABLED} </li>
 *            <li> {@link #NOTIFICATION_LED_ENABLED}</li>
 *            <li> {@link #BATTERY_LED_ENABLED} </li>
 *            <li> {@link #CLIPBOARD_POLICY} </li>
 *            <li> {@link #CAPTIVE_PORTAL_POLICY} </li>
 *            <li> {@link #CAST_ENABLED} </li>
 *            <li> {@link #QUICKSHARE_ENABLED} </li>
 *            <li> {@link #CHROMEBOOK_ENABLED} </li>
 *            <li> {@link #ANDROID_AUTO_ENABLED} </li>
 *            <li> {@link #CRADLE_APP_ON_INSERT} </li>
 *            <li> {@link #CRADLE_APP_ON_EXTRACT} </li>
 *            <li> {@link #DESKTOP_MODE_APP_EXTERNAL_SCREEN_ON_INSERT} </li>
 *         </ul>
 *     </details>
 *     </li>
 *
 *     <li>
 *     <details>
 *         <summary> {@link PropertyGroupID#PROFILES_GROUP}</summary>
 *         <ul>
 *            <li> {@link #PROFILES_AUTO_SWITCHING_NOTIFICATION_ENABLE} </li>
 *         </ul>
 *     </details>
 *     </li>
 *
 *     <li>
 *     <details>
 *         <summary> {@link PropertyGroupID#SYSTEM_GROUP}</summary>
 *         <ul>
 *            <li> {@link #VIRTUAL_RAM_SWAP_POLICY} </li>
 *         </ul>
 *     </details>
 *     </li>
 *
 *     <li>
 *     <details>
 *         <summary> {@link PropertyGroupID#DEVELOPER_OPTIONS_GROUP}</summary>
 *         <ul>
 *            <li> {@link #USB_DEBUG_ENABLE} </li>
 *            <li> {@link #WIFI_DEBUG_ENABLE} </li>
 *            <li> {@link #LOGGER_BUFFER_SIZE} </li>
 *         </ul>
 *     </details>
 *     </li>
 *
 *     </details>
 *     </li>
 *   </ul>

 *   </details>
 *   </li>
 * </ul>
 */


public class PropertyID {
   /**
     * @hide
     * WIFI Settings definitions
     */
    public final static int WIFI_UNKNOWN = PropertyGroupID.WIFI_MIB_BASE + 0;
    /**
      * Interval between scans when the device is on and disconnected.
      * Scan interval and Scan interval max control the Wi-Fi scan intervals when the device has the screen on and
      * it is not connected to any Wi-Fi network. The scans are issued in this way: the first scan is done when
      * the device is woken up from a standby state, then the next scans are done in an exponential backoff fashion.
      * The second scan will be done after x seconds, then after 2 * x, then 4 * x... and so on, until it reaches
      * the maximum value defined by {@link #WIFI_SCAN_INTERVAL_MAX}.
      * <p>
      * The class of the property is {@link NumericProperty}.
      */
    public final static int WIFI_SCAN_INTERVAL = PropertyGroupID.WIFI_MIB_BASE + 0x0001;
    /**
      * Maximum interval between scans when the device is on and disconnected.
      * Scan interval and Scan interval max control the Wi-Fi scan intervals when the device has the screen on and
      * it is not connected to any Wi-Fi network. The scans are issued in this way: the first scan is done when
      * the device is woken up from a standby state, then the next scans are done in an exponential backoff fashion.
      * The second scan will be done after x seconds, then after 2 * x, then 4 * x... and so on, until it reaches
      * the maximum value defined by {@link #WIFI_SCAN_INTERVAL_MAX}.
      * <p>
      * The class of the property is {@link NumericProperty}.
     */
    public final static int WIFI_SCAN_INTERVAL_MAX = PropertyGroupID.WIFI_MIB_BASE + 0x0002;
    /**
      * Interval between scans when the device is on and connected.
      * Connected scan interval and Connected scan interval max control the Wi-Fi scan intervals when the device
      * has the screen on and it is connected to any Wi-Fi network. The scans are issued in this way: the first
      * scan is done when the device is woken up from a standby state, then the next scans are done in an exponential
      * backoff fashion. The second scan will be done after x seconds, then after 2 * x, then 4 * x... and so on,
      * until it reaches the maximum defined by {@link #WIFI_CONNECTED_SCAN_INTERVAL_MAX}.
      * <p>
      * The class of the property is {@link NumericProperty}.
      */
    public final static int WIFI_CONNECTED_SCAN_INTERVAL = PropertyGroupID.WIFI_MIB_BASE + 0x0003;
    /**
      * Maximum interval between scans when the device is on and connected.
      * Connected scan interval and Connected scan interval max control the Wi-Fi scan intervals when the device
      * has the screen on and it is connected to any Wi-Fi network. The scans are issued in this way: the first scan
      * is done when the device is woken up from a standby state, then the next scans are done in an exponential
      * backoff fashion. The second scan will be done after x seconds, then after 2 * x, then 4 * x... and so on,
      * until it reaches the maximum value defined by {@link #WIFI_CONNECTED_SCAN_INTERVAL_MAX}.
      * <p>
      * The class of the property is {@link NumericProperty}.
      */
    public final static int WIFI_CONNECTED_SCAN_INTERVAL_MAX = PropertyGroupID.WIFI_MIB_BASE + 0x0004;
    /**
      * Selects the 802.11 mode to be used (b/g/n/a/ac/ax).
      * This parameter controls the 802.11 mode the device will be using.
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values for this property are defined by enum {@link Wifi802Dot11Mode}.
      */
    public final static int WIFI_802_DOT_11_MODE = PropertyGroupID.WIFI_MIB_BASE + 0x000D;
    /**
      * Selects the band used by the device (2.4/5 GHz).
      * This parameter controls the band the device will be using.
      * When one band is disabled, the device won’t transmit anything on that band.
      * On new device models, starting from M30/M35, this parameter is substituted by {@link PropertyID#WIFI_BAND}.
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link WifiBandSelection}
      */
    public final static int WIFI_BAND_SELECTION = PropertyGroupID.WIFI_MIB_BASE + 0x000E;
    /**
      * Selects the power saving mode used.
      * This parameter enables the power save mode and controls which kind of power save is used.
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link WifiPowerSave}.
      * The default value is set to {@link WifiPowerSave#WIFI_POWER_SAVE_ENABLED}, if you notice a degradation in the VoIP call performance
      * change the value to {WifiPowerSave#WIFI_POWER_SAVE_ENABLED_VOIP_CALLS}.
      */
    public final static int WIFI_POWER_SAVE = PropertyGroupID.WIFI_MIB_BASE + 0x000F;
    /**
      * Enables the verbose Wi-Fi module logging.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WIFI_VERBOSE_WIFI_MODULE_LOG = PropertyGroupID.WIFI_MIB_BASE + 0x0012;
    /**
      * Signal threshold for triggering the roaming background scan.
      * This parameter controls the signal threshold for triggering the roaming procedure.
      * When the access point signal drops under the threshold, the device will begin scanning
      * in background for suitable networks to roam to.
      * <p>
      * The class of the property is {@link NumericProperty}.
      */
    public final static int WIFI_ROAMING_RSSI_THRESHOLD = PropertyGroupID.WIFI_MIB_BASE + 0x0013;
    /**
      * Signal difference between the current AP and the target AP for roaming.
      * This parameter controls the signal difference between the current access point the device
      * is connected to and the target access point the device wants to roam to.
      * If the target AP signal is higher than the current by at least the value of this parameter,
      * the device will roam.
      * <p>
      * The class of the property is {@link NumericProperty}.
      */
    public final static int WIFI_ROAMING_RSSI_DIFFERENCE = PropertyGroupID.WIFI_MIB_BASE + 0x0014;
    /**
      * Enables roaming profiles.
      * A roaming profile can be one of four presets: standard, aggressive, slow and custom.
      * Each preset should have a direct impact on the Roaming RSSI Threshold and Difference, and those settings should not
      * be editable if any preset other than custom is selected. 
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link WifiRoamingProfile}.
      */
    public final static int WIFI_ROAMING_PROFILE = PropertyGroupID.WIFI_MIB_BASE + 0x001A;
    /**
      * @hide
      * This parameters controls the channels that will be disabled on the device.
      * When a channel is disabled, the device won’t be able to communicate on that specific channel
      * and thus won’t see any AP using that channel.
      */
    private final static int WIFI_CHANNEL_BASE = PropertyGroupID.WIFI_MIB_BASE + 0x001B;
    /**
      * This parameters controls the Channels 1 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WIFI_CHANNEL_1 = WIFI_CHANNEL_BASE + 0x0001;
    /**
      * This parameters controls the Channels 2 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WIFI_CHANNEL_2 = WIFI_CHANNEL_BASE + 0x0002;
    /**
      * This parameters controls the Channels 3 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WIFI_CHANNEL_3 = WIFI_CHANNEL_BASE + 0x0003;
    /**
      * This parameters controls the Channels 4 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WIFI_CHANNEL_4 = WIFI_CHANNEL_BASE + 0x0004;
    /**
      * This parameters controls the Channels 5 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WIFI_CHANNEL_5 = WIFI_CHANNEL_BASE + 0x0005;
    /**
      * This parameters controls the Channels 6 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WIFI_CHANNEL_6 = WIFI_CHANNEL_BASE + 0x0006;
    /**
      * This parameters controls the Channels 7 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WIFI_CHANNEL_7 = WIFI_CHANNEL_BASE + 0x0007;
    /**
      * This parameters controls the Channels 8 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WIFI_CHANNEL_8 = WIFI_CHANNEL_BASE + 0x0008;
    /**
      * This parameters controls the Channels 9 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WIFI_CHANNEL_9 = WIFI_CHANNEL_BASE + 0x0009;
    /**
      * This parameters controls the Channels 10 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WIFI_CHANNEL_10 = WIFI_CHANNEL_BASE + 0x000A;
    /**
      * This parameters controls the Channels 11 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WIFI_CHANNEL_11 = WIFI_CHANNEL_BASE + 0x000B;
    /**
      * This parameters controls the Channels 12 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WIFI_CHANNEL_12 = WIFI_CHANNEL_BASE + 0x000C;
    /**
      * This parameters controls the Channels 13 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WIFI_CHANNEL_13 = WIFI_CHANNEL_BASE + 0x000D;
    /**
      * This parameters controls the Channels 36 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WIFI_CHANNEL_36 = WIFI_CHANNEL_BASE + 0x0024; //36
    /**
      * This parameters controls the Channels 40 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WIFI_CHANNEL_40 = WIFI_CHANNEL_BASE + 0x0028; //40
    /**
      * This parameters controls the Channels 44 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WIFI_CHANNEL_44 = WIFI_CHANNEL_BASE + 0x002C; //44
    /**
      * This parameters controls the Channels 48 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WIFI_CHANNEL_48 = WIFI_CHANNEL_BASE + 0x0030; //48
    /**
      * This parameters controls the Channels 52 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WIFI_CHANNEL_52 = WIFI_CHANNEL_BASE + 0x0034; //52
    /**
      * This parameters controls the Channels 56 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WIFI_CHANNEL_56 = WIFI_CHANNEL_BASE + 0x0038; //56
    /**
      * This parameters controls the Channels 60 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WIFI_CHANNEL_60 = WIFI_CHANNEL_BASE + 0x003c; //60
    /**
      * This parameters controls the Channels 64 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WIFI_CHANNEL_64 = WIFI_CHANNEL_BASE + 0x0040; //64
    /**
      * This parameters controls the Channels 100 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WIFI_CHANNEL_100 = WIFI_CHANNEL_BASE + 0x0064; //100
    /**
      * This parameters controls the Channels 104 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WIFI_CHANNEL_104 = WIFI_CHANNEL_BASE + 0x0068; //104
    /**
      * This parameters controls the Channels 108 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WIFI_CHANNEL_108 = WIFI_CHANNEL_BASE + 0x006c; //108
    /**
      * This parameters controls the Channels 112 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      */
    public final static int WIFI_CHANNEL_112 = WIFI_CHANNEL_BASE + 0x0070; //112
    /**
      * This parameters controls the Channels 116 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WIFI_CHANNEL_116 = WIFI_CHANNEL_BASE + 0x0074; //116
    /**
      * This parameters controls the Channels 120 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WIFI_CHANNEL_120 = WIFI_CHANNEL_BASE + 0x0078; //120
    /**
      * This parameters controls the Channels 124 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WIFI_CHANNEL_124 = WIFI_CHANNEL_BASE + 0x007c; //124
    /**
      * This parameters controls the Channels 128 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      */
    public final static int WIFI_CHANNEL_128 = WIFI_CHANNEL_BASE + 0x0080; //128
    /**
      * This parameters controls the Channels 132 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WIFI_CHANNEL_132 = WIFI_CHANNEL_BASE + 0x0084; //132
    /**
      * This parameters controls the Channels 136 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WIFI_CHANNEL_136 = WIFI_CHANNEL_BASE + 0x0088; //136
    /**
      * This parameters controls the Channels 140 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      */
    public final static int WIFI_CHANNEL_140 = WIFI_CHANNEL_BASE + 0x008c; //140
    /**
      * This parameters controls the Channels 144 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WIFI_CHANNEL_144 = WIFI_CHANNEL_BASE + 0x0090; //144
    /**
      * This parameters controls the Channels 149 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WIFI_CHANNEL_149 = WIFI_CHANNEL_BASE + 0x0095; //149
    /**
      * This parameters controls the Channels 153 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WIFI_CHANNEL_153 = WIFI_CHANNEL_BASE + 0x0099; //153
    /**
      * This parameters controls the Channels 157 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WIFI_CHANNEL_157 = WIFI_CHANNEL_BASE + 0x009d; //157
    /**
      * This parameters controls the Channels 161 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WIFI_CHANNEL_161 = WIFI_CHANNEL_BASE + 0x00a1; //161
    /**
      * This parameters controls the Channels 165 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WIFI_CHANNEL_165 = WIFI_CHANNEL_BASE + 0x00a5; //165
    /**
      * This parameters controls the Channels 169 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WIFI_CHANNEL_169 = WIFI_CHANNEL_BASE + 0x00a9; //169
    /**
      * This parameters controls the Channels 173 that can be enabled or disabled on the device.
      * When this channel is disabled, the device won’t be able to communicate on it
      * and thus won’t see any AP using that channel.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WIFI_CHANNEL_173 = WIFI_CHANNEL_BASE + 0x00ad; //173
    /**
      * This parameter reports the current Wi-Fi country-code.
      * The value is calculated by the device according to the connected AP,
      * so this property cannot be set.
      * <p>
      * The class of the property is {@link TextProperty}.
      */
    public final static int WIFI_COUNTRY_CODE = PropertyGroupID.WIFI_MIB_BASE + 0x0100;
    /**
      * This parameter enables the Wi-Fi channels selection regardless of the current country-code.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WIFI_UNLOCK_CHANNELS = PropertyGroupID.WIFI_MIB_BASE + 0x0101;
    /**
     * Number of roaming retries before aborting the roaming procedure.
     * This parameter controls how many times the device will try to find a new access point
     * to roam to, before giving up and aborting the current roaming event.
     * <p>
     * The class of the property is {@link NumericProperty}.
     */
    public final static int WIFI_ROAMING_RETRY_TIMES = PropertyGroupID.WIFI_MIB_BASE + 0x0102;
    /**
     * Minimum time interval between roaming threshold calculations.
     * This parameter controls how frequently the device recalculates the roaming trigger
     * threshold in case there are no other interruptions (i.e. scans).
     * <p>
     * The class of the property is {@link NumericProperty}.
     */
    public final static int WIFI_ROAMING_RECALCULATION_INTERVAL = PropertyGroupID.WIFI_MIB_BASE + 0x0103;
    /**
     * Interval between beacon listening.
     * A live AP transmits beacons at periodic intervals (typically every 102.4 ms) to be
     * recognized by other devices. This parameter controls how frequently the device listens
     * to the access point beacon frame.
     * <p>
     * The class of the property is {@link NumericProperty}.
     */
    public final static int WIFI_ROAMING_BEACON_PERIOD = PropertyGroupID.WIFI_MIB_BASE + 0x0104;
    /**
     * This parameter enables/disables the random MAC feature.
     * This adds some security in case of public networks, as the device real MAC address is hidden
     * and a randomly generated one is used instead. This can cause problems in case your device needs
     * a fixed MAC address (for example, MAC authentication or specific DHCP rules).
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int WIFI_MAC_RANDOMIZATION = PropertyGroupID.WIFI_MIB_BASE + 0x0105;
    /**
     * Controls the behaviour when the current Wi-Fi profile doesn't have an Internet connectivity.
     * <p>
     * The class of the property is {@link EnumProperty}.
     * The allowed values are defined by enum {@link WifiNoInternetExpected}.
     */
    public final static int WIFI_NO_INTERNET_EXPECTED = PropertyGroupID.WIFI_MIB_BASE + 0x0106;

    /**
     * Selects the bands used by the device (2.4/5/6 GHz).
     * This parameter controls the bands the device will be using.
     * When one band is not enabled, the device won’t transmit anything on that band.
     * <p>
     * The class of the property is {@link MultipleChoiceProperty}.
     * The allowed values are a subset of the combinations of the values defined by {@link WifiBandFlags}.
     */
    public final static int WIFI_BAND = PropertyGroupID.WIFI_MIB_BASE + 0x0107;
    /**
     * The WIFI_BSSID_SCAN_STABLE_TIME (in seconds) means that after this period of time, the device will no longer scan this BSSID channel. 
     * When a device moves between areas covered by multiple access points, it continuously scans for available networks 
     * and evaluates their stability and signal strength. The device will clear the BSSID and its channel once it identifies 
     * the BSSID last scan update time is more than the value of this parameter, so that the next roaming scan would scan updated BSSIDs.
     * <p>
     * The class of the property is {@link NumericProperty}.
     * The allowed values are between 10 and 200.
     */
    public final static int WIFI_BSSID_SCAN_STABLE_TIME = PropertyGroupID.WIFI_MIB_BASE + 0x0108;

    /**
      * @hide
      * DateAndTime Settings definitions
      */
    public final static int DATE_AND_TIME_UNKNOWN = PropertyGroupID.DNT_MIB_BASE + 0;
    /** 
      * Value to specify if the user prefers the date, time and time zone to be automatically fetched from the network (NITZ). 
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int DATE_AND_TIME_AUTO_TIME = PropertyGroupID.DNT_MIB_BASE + 0x0001;
    /** 
      * Value to specify if the user prefers the time zone to be automatically fetched from the network (NITZ).
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int DATE_AND_TIME_AUTO_TIME_ZONE = PropertyGroupID.DNT_MIB_BASE + 0x0002;
    /** 
      *  Sets the system's persistent default time zone.
      *  The id must be one of the Olson ids from the list returned by TimeZone.getAvailableIDs().
      *  <p>
      *     Android documentation
      *     <a href="https://developer.android.com/reference/java/util/TimeZone">Timezone</a> 
      *     provide helpful information about time zone IDs.
      *  <p>
      * <p>
      * The class of the property is {@link TextProperty}.
      */
    public final static int DATE_AND_TIME_TIMEZONE_ID = PropertyGroupID.DNT_MIB_BASE + 0x0003;
    /**
      * Display times in 24H format, if false display times in 12H format.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int DATE_AND_TIME_TIME_24H_FORMAT = PropertyGroupID.DNT_MIB_BASE + 0x0004;
    /**
      * Primary NTP server address that will be used if DATE_AND_TIME_AUTO_TIME is enabled.
      * <p>
      * The class of the property is {@link TextProperty}.
      */
    public final static int DATE_AND_TIME_NTP_SERVER = PropertyGroupID.DNT_MIB_BASE + 0x0005;
    /**
      * Secondary NTP server address that will be used if DATE_AND_TIME_NTP_SERVER is not reacheable and DATE_AND_TIME_AUTO_TIME is enabled.
      * <p>
      * The class of the property is {@link TextProperty}.
      */
    public final static int DATE_AND_TIME_NTP_SERVER_2 = PropertyGroupID.DNT_MIB_BASE + 0x0006;
    /**
      * NTP server connection timeout expressed in milliseconds.
      * <p>
      * The class of the property is {@link NumericProperty}.
      */
    public final static int DATE_AND_TIME_NTP_TIMEOUT = PropertyGroupID.DNT_MIB_BASE + 0x0007;

    //
    // Power Settings definitions
    //
    /** 
      * The charging threshold (%) for automatic exit from charging mode.
      * <p>
      * The class of the property is {@link NumericProperty}.
      */
    public final static int POWER_OFF_CHARGING_MODE_THRESHOLD = PropertyGroupID.POWER_MIB_BASE + 0x0001;
    /** 
      * Policy for automatic exit from charging mode.
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link OffChargingModePolicy}.
      */
    public final static int POWER_OFF_CHARGING_MODE_POLICY = PropertyGroupID.POWER_MIB_BASE + 0x0002;

   /** 
    * Controls whether the USB is enabled as a power-source.
    */
    public final static int POWER_SOURCE_USB = PropertyGroupID.POWER_MIB_BASE + 0x0003;

   /**
    * This parameter controls whether the Power button trigger can be used as device wake-up source.
    * <p>
    * The class of the property is {@link BooleanProperty}.
    */
   public final static int POWER_WAKEUP_POWER_KEY = PropertyGroupID.POWER_MIB_BASE + 0x0005;
   /**
    * This parameter controls whether a Real-Time clock alarm trigger can be used as device wake-up source.
    * <p>
    * The class of the property is {@link BooleanProperty}.
    */
   public final static int POWER_WAKEUP_RTC_ALARM = PropertyGroupID.POWER_MIB_BASE + 0x0006;
   /**
    * ContrThis parameter controlsols whether a generic charging power source trigger can be used as device wake-up source.
    * <p>
    * The class of the property is {@link BooleanProperty}.
    */
   public final static int POWER_WAKEUP_POWER_IN = PropertyGroupID.POWER_MIB_BASE + 0x0007;
   /**
    * ContrThis parameter controlsols whether the left trigger button trigger can be used as device wake-up source.
    * <p>
    * The class of the property is {@link BooleanProperty}.
    */
   public final static int POWER_WAKEUP_LEFT_TRIGGER = PropertyGroupID.POWER_MIB_BASE + 0x0008;
   /**
    * This parameter controls whether the right trigger button trigger can be used as device wake-up source.
    * <p>
    * The class of the property is {@link BooleanProperty}.
    */
   public final static int POWER_WAKEUP_RIGHT_TRIGGER = PropertyGroupID.POWER_MIB_BASE + 0x0009;
   /**
    * This parameter controls whether the back trigger button trigger can be used as device wake-up source.
    * <p>
    * The class of the property is {@link BooleanProperty}.
    */
   public final static int POWER_WAKEUP_PISTOL_TRIGGER = PropertyGroupID.POWER_MIB_BASE + 0x000A;
   /**
    * This parameter controls whether the front trigger button trigger can be used as device wake-up source.
    * <p>
    * The class of the property is {@link BooleanProperty}.
    */
   public final static int POWER_WAKEUP_FRONT_TRIGGER = PropertyGroupID.POWER_MIB_BASE + 0x000B;
   /**
    * This parameter controls whether Wifi data trigger can be used as device wake-up source.
    * <p>
    * The class of the property is {@link BooleanProperty}.
    */
   public final static int POWER_WAKEUP_WIFI = PropertyGroupID.POWER_MIB_BASE + 0x000C;
   /**
    * This parameter controls whether cellular data or call trigger can be used as device wake-up source.
    * <p>
    * The class of the property is {@link BooleanProperty}.
    */
   public final static int POWER_WAKEUP_WWAN = PropertyGroupID.POWER_MIB_BASE + 0x000D;
   /**
    * This parameter controls whether the accelerometer sensor trigger can be used as device wake-up source.
    * <p>
    * The class of the property is {@link BooleanProperty}.
    */
   public final static int POWER_WAKEUP_ACCELEROMETER = PropertyGroupID.POWER_MIB_BASE + 0x000E;
   /**
    * This parameter controls whether a touch event on the screen can be used as device wake-up source.
    * <p>
    * The class of the property is {@link BooleanProperty}.
    */
   public final static int POWER_WAKEUP_TOUCH = PropertyGroupID.POWER_MIB_BASE + 0x000F;
   /**
    * This parameter controls whether a autoScan trigger can be used as device wake-up source.
    * <p>
    * The class of the property is {@link BooleanProperty}.
    */
   public final static int POWER_WAKEUP_AUTOSCAN_TRIGGER = PropertyGroupID.POWER_MIB_BASE + 0x0010;
   /**
    * This parameter defines the screen off timeout, in msecs, when the device is powered by an external AC power.
    * <p>
    * The class of the property is {@link NumericProperty}.
    * The allowed values are between 0 and MAX_INT. 0 means never.
    */
   public final static int POWER_SUSPEND_EXTERNAL_TIMEOUT = PropertyGroupID.POWER_MIB_BASE + 0x0011;
    /**
     * This parameter defines the screen off timeout, in msecs, when the device is powered by internal battery.
     * <p>
     * The class of the property is {@link NumericProperty}.
     * The allowed values are between 0 and MAX_INT. 0 means never.
     */
   public final static int POWER_SUSPEND_INTERNAL_TIMEOUT = PropertyGroupID.POWER_MIB_BASE + 0x0012;
    /**
     * This parameter defines the battery charging profile.
     * <p>
     * The class of the property is {@link EnumProperty}.
     * The allowed values are defined by enum {@link BatteryChargingProfile}.
     */
    public final static int POWER_BATTERY_CHARGING_PROFILE = PropertyGroupID.POWER_MIB_BASE + 0x0013;
    /**
     * Selects the device charging sources.
     * This parameter controls the charging source the device will be using.
     * All charging sources could be disabled.
     * <p>
     * The class of the property is {@link MultipleChoiceProperty}.
     * The allowed values are all the combinations of the values defined by {@link ChargingSourcesFlags}.
     */
    public final static int POWER_CHARGING_SOURCES = PropertyGroupID.POWER_MIB_BASE + 0x0014;

    /**
     * Selects the battery charging profile persistence policy.
     * This parameter controls the policy for configuring the battery charging profile.
     * Depending on this property, when the user changes the battery, that battery will be charged with the profile
     * configured by the device or the profile stored in the battery memory.
     * The behaviour is the same regardless of whether the battery is changed with a battery swap or during a device power-off.
     * <p>
     * The class of the property is {@link EnumProperty}.
     * The allowed values are defined by enum {@link BatteryChargingProfilePersistencePolicy}.
     */
    public final static int POWER_BATTERY_CHARGING_PROFILE_PERSISTENCE_POLICY = PropertyGroupID.POWER_MIB_BASE + 0x0015;

    /**
    * This parameter controls whether the push to talk button trigger can be used as device wake-up source.
    * <p>
    * The class of the property is {@link BooleanProperty}.
    */
    public final static int POWER_WAKEUP_PTT_TRIGGER = PropertyGroupID.POWER_MIB_BASE + 0x0016;

    /**
     * Activates the Pocket-Mode feature. When this feature is enabled, the device will automatically
     * go into sleep mode when the display sensor detects any nearby object (e.g. into a pocket).
     * The device will reactivate once the object is no longer detected.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int POWER_POCKET_MODE_ENABLED = PropertyGroupID.POWER_MIB_BASE + 0x0017;

    /**
     * Configures the Pocket-Mode behaviour policy.
     * <p>
     * The class of the property is {@link EnumProperty}.
     * The allowed values are defined by enum {@link PocketModePolicy}.
     */
    public final static int POWER_POCKET_MODE_POLICY = PropertyGroupID.POWER_MIB_BASE + 0x0018;

    /**
     * Once a nearby object is detected, the Pocket-Mode will triggered after a brief delay.
     * This pause serves as a "debounce" period to prevent accidental activations. The duration of
     * the interval is measured in milliseconds.
     * <p>
     * The class of the property is {@link NumericProperty}.
     */
    public final static int POWER_POCKET_MODE_DELAY = PropertyGroupID.POWER_MIB_BASE + 0x0019;

    /**
     * When the {@link PocketModePolicy#PROGRESSIVE_DEVICE_LOCK} policy is selected, this value is
     * used to configure the amount of time that needs to pass before the device switches from
     * "display off" to "suspend". The duration of the interval is measured in milliseconds.
     * <p>
     * The class of the property is {@link NumericProperty}.
     */
    public final static int POWER_POCKET_MODE_LOCK_TIMEOUT = PropertyGroupID.POWER_MIB_BASE + 0x001A;

    /**
     * This property enables or disables the smart charge feature.
     * <p>
     * Enabling the smart charge feature helps prevent battery degradation by managing the battery charging process intelligently.
     * <p>
     * When enabled, users can customize the battery charging process according to their working hours.
     * <p>
     * The Smart Charge feature can be configured with the following properties:
     *  <ul>
     *    <li>{@link #POWER_SMART_CHARGE_DISCHARGE_DELAY} - Time the battery remains at 100% charge before discharging to a safe level.</li>
     *    <li>{@link #POWER_SMART_CHARGE_WORK_TIMES} - Schedule of working hours is evaluated to plan fully charging the battery before the next working period.</li>
     *  </ul>
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int POWER_SMART_CHARGE_ENABLE = PropertyGroupID.POWER_MIB_BASE + 0x001B;

    /**
     * This property defines the maximum time to keep the battery at 100% charge, while charging.
     * <p>
     * Once fully charged, the device will stay at 100% for the duration configured by this property.
     * After this period, the device will discharge to a safe level and recharge as a new working window approaches.
     * The duration is measured in seconds.
     * <p>
     * This property is effective if the smart charging is enabled using {@link #POWER_SMART_CHARGE_ENABLE}.
     * <p>
     * The class of the property is {@link NumericProperty}.
     */
    public final static int POWER_SMART_CHARGE_DISCHARGE_DELAY = PropertyGroupID.POWER_MIB_BASE + 0x001C;

    /**
     * This property defines the working hours for the smart chaging evaluation.
     * <p>
     * Based on the working hours, the device will optimize the battery charging to provide a fully charged battery,
     * before next working shift, thereby reducing battery life degradation.
     * <p>
     * This property is effective if the smart charging is enabled using {@link #POWER_SMART_CHARGE_ENABLE}.
     * <p>
     * The class of the property is {@link BlobProperty}.
     * The specific implementation for this type of blob is {@link WorkSchedule}.
     */
    public final static int POWER_SMART_CHARGE_WORK_TIMES = PropertyGroupID.POWER_MIB_BASE + 0x001D;

    /**
     * When set to true, it enables the enterprise battery saver.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int POWER_ENTERPRISE_BATTERY_SAVER_ENABLED = PropertyGroupID.POWER_MIB_BASE + 0x0020;

    /**
     * When set to true, it allows entering the battery saver mode even when the device is connected to a power source.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int POWER_ENTERPRISE_BATTERY_SAVER_IGNORE_POWER = PropertyGroupID.POWER_MIB_BASE + 0x0021;

    /**
     * List of the profiles installed in the enterprise battery saver.
     * <p>
     * The class of the property is {@link BlobProperty}.
     * The specific implementation for this type of blob is {@link EnterpriseBatterySaverProfiles}.
     */
    public final static int POWER_ENTERPRISE_BATTERY_SAVER_PROFILES = PropertyGroupID.POWER_MIB_BASE + 0x0022;

    /**
     * List of the activation items installed in the enterprise battery saver.
     * <p>
     * The class of the property is {@link BlobProperty}.
     * The specific implementation for this type of blob is {@link EnterpriseBatterySaverActivationItems}.
     */
    public final static int POWER_ENTERPRISE_BATTERY_SAVER_ACTIVATION_ITEMS = PropertyGroupID.POWER_MIB_BASE + 0x0023;

    //
    // USB Settings definitions
    //

    /**
     * Enables/disables USB data transmission.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int USB_DATA = PropertyGroupID.USB_MIB_BASE + 0x0001;

    /**
      * Default USB data function. It is the USB Transfer Protocol setup every time a USB is plugged-in to the device.
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link UsbFunction}.
      */
    public final static int USB_DEFAULT_FUNCTION = PropertyGroupID.USB_MIB_BASE + 0x0002;
    /**
      * Current USB data function. It is the USB Transfer Protocol used to change the Default USB data function 
      * just for the current USB transfer (until the USB will be plugged-out from the device).
      * When the USB will be plugged-out, then USB will be plugged-in again, 
      * the Default USB data function is used for setup new USB transfer.
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link UsbFunction}.
      */
    public final static int USB_CURRENT_FUNCTION = PropertyGroupID.USB_MIB_BASE + 0x0003;
    /**
      * Enables/disables USB data transmission when device works as client.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int USB_CLIENT_DATA = PropertyGroupID.USB_MIB_BASE + 0x0004;
    /**
     * Enables/disables USB data transmission when device works as host.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int USB_HOST_DATA = PropertyGroupID.USB_MIB_BASE + 0x0005;
    /**
     * Contains the editable list of whitelisted USB devices. This list can be edited adding or removing elements through SDK or DLSettings.
     * This list survives only a reboot.
     * <p>
     * The class of the property is {@link BlobProperty}.
     * The specific implementation for this type of blob is {@link UsbHostWhitelisting}.<br>
     * To set this property by intent ({@link Intents#ACTION_CONFIGURATION_COMMIT}) use the serialized form:<br>
     * <pre>
     * [["vid","pid","name","description","persistence"],["vid","pid","name","description","persistence"]]
     * </pre>
     * <ul>
     *  <li><b>vid</b>: device vid, in hexadecimal form. Admitted values in range (0000 - FFFF);
     *  <li><b>pid</b>: device pid, in hexadecimal form. Admitted values in range (0000 - FFFF);
     *  <li><b>name</b>: device name;
     *  <li><b>description</b>: device description;
     *  <li><b>persistence</b>: persistence. Only {@link WhitelistingPersistence#REBOOT} is allowed.
     * </ul>
     * <br>
     * 
     * Using commit intent by android app, character <code>  <mark>"</mark>   </code>  must be escaped as <code>   <mark>\"</mark></code>.<br><br>
     * <b>To whiteslist two devices, for example 'mouse' and 'keyboard':</b>
     * <pre>
     * Intent intent = new Intent(Intents.ACTION_CONFIGURATION_COMMIT);
     * HashMap map = new HashMap();
     * map.put(PropertyID.USB_HOST_WHITELISTING, "[[\"04fb\",\"96a2\",\"mouse\",\"usb\",\"REBOOT\"],[\"05fb\",\"26a2\",\"keyboard\",\"usb\",\"REBOOT\"]]");
     * intent.putExtra(Intents.EXTRA_CONFIGURATION_CHANGED_MAP, map);
     * mContext.sendBroadcast(intent);
     * </pre>
     * <b>To delete all devices:</b>
     * <pre>
     * Intent intent = new Intent(Intents.ACTION_CONFIGURATION_COMMIT);
     * HashMap map = new HashMap();
     * map.put(PropertyID.USB_HOST_WHITELISTING, "[]");
     * intent.putExtra(Intents.EXTRA_CONFIGURATION_CHANGED_MAP, map);
     * mContext.sendBroadcast(intent);
     * </pre>
     * <br><br>
     * 
     * Using the commit intent by shell, characters <code>   <mark>,</mark>   </code><code>   <mark>"</mark>   </code> and <mark>space</mark> must be escaped as <code>   <mark>"\,"</mark>   </code><code>   <mark>\"</mark>   </code>and<code>   <mark>" "</mark>   </code> respectively.<br><br>
     * <b>To whitelist two devices, for example 'mouse' and 'keyboard', with the commit intent:</b>
     * <pre>
     * adb shell am broadcast 
     * -a com.datalogic.device.intent.action.configuration.COMMIT 
     * --es com.datalogic.device.intent.extra.configuration.CHANGED_MAP 'USB_HOST_WHITELISTING=[[\"04fb\""\,"\"96a2\""\,"\"mouse\""\,"\"usb" "mouse\""\,"\"REBOOT\"]"\,"[\"06b2\""\,"\"f9a2\""\,"\"keyboard\""\,"\"usb" "keyboard\""\,"\"REBOOT\"]]'
     * </pre>
     * <b>To delete all devices:</b>
     * <pre>
     * adb shell am broadcast 
     * -a com.datalogic.device.intent.action.configuration.COMMIT 
     * --es com.datalogic.device.intent.extra.configuration.CHANGED_MAP 'USB_HOST_WHITELISTING=[]'
     * </pre>
     * 
     */
    public final static int USB_HOST_WHITELISTING = PropertyGroupID.USB_MIB_BASE + 0x0006;
    /**
     * Contains the not editable list of whitelisted USB devices.
     * This list survives a reboot, a/o enterprise reset a/o factory reset.
     * <p>
     * The class of the property is {@link BlobProperty}.
     * The specific implementation for this type of blob is {@link UsbHostWhitelisting}.
     */
    public final static int USB_PREDEFINED_HOST_WHITELISTING = PropertyGroupID.USB_MIB_BASE + 0x0007;

    //
    // Cradle Settings definitions
    //

    /**
     * Cradle firmware update policy.
     * <p>
     * The class of the property is {@link EnumProperty}.
     * The allowed values are defined by enum {@link FirmwareUpdatePolicy}.
     */
    public final static int CRADLE_FW_UPDATE_POLICY = PropertyGroupID.CRADLE_MIB_BASE + 0x0001;
    /**
     * Cradle unlock policy.
     * <p>
     * The class of the property is {@link EnumProperty}.
     * The allowed values are defined by enum {@link UnlockPolicy}.
     */
    public final static int CRADLE_UNLOCK_POLICY = PropertyGroupID.CRADLE_MIB_BASE + 0x0002;
    /**
     * Cradle unlock key policy.
     * <p>
     * The class of the property is {@link EnumProperty}.
     * The allowed values are defined by enum {@link UnlockKeyPolicy}.
     */
    public final static int CRADLE_UNLOCK_KEY_POLICY = PropertyGroupID.CRADLE_MIB_BASE + 0x0003;
    /**
     * Cradle failure policy.
     * <p>
     * The class of the property is {@link EnumProperty}.
     * The allowed values are defined by enum {@link FailurePolicy}.
     */
    public final static int CRADLE_FAILURE_POLICY = PropertyGroupID.CRADLE_MIB_BASE + 0x0004;
    /**
     * Enable the unlock notification only when the device is inserted in the specific cradle model.
     * <p>
     * The class of the property is {@link EnumProperty}.
     * The allowed values are defined by enum {@link UnlockNotificationPolicy}.
     */
    public final static int CRADLE_UNLOCK_NOTIFICATION_POLICY = PropertyGroupID.CRADLE_MIB_BASE + 0x0005;

    //
    // Ethernet Settings definitions
    //

    /**
      * This parameter enables/disables the Ethernet sub-system.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int ETHERNET_ENABLED = PropertyGroupID.ETHERNET_MIB_BASE + 0x0001;
    /**
      * Controls whether the device will obtain its IP settings automatically, using DHCP,
      * or manually, by an administrator using the relevant parameters, when connecting to a network through an Ethernet-equipped cradle.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int ETHERNET_USE_DHCP = PropertyGroupID.ETHERNET_MIB_BASE + 0x0002;
    /**
     * This parameter is used to enter the static IP address of the device when connecting to a network through an Ethernet-equipped cradle.
     * <p>
     * The class of the property is {@link TextProperty}.
     */
    public final static int ETHERNET_STATIC_ADDRESS = PropertyGroupID.ETHERNET_MIB_BASE + 0x0003;
    /**
     * This parameter is used to enter the IP address of the default gateway when connecting to a network through an Ethernet-equipped cradle.
     * <p>
     * The class of the property is {@link TextProperty}.
     */
    public final static int ETHERNET_GATEWAY_ADDRESS = PropertyGroupID.ETHERNET_MIB_BASE + 0x0004;
    /**
     * Prefix length specifies the number of bits in the IP address that are to be used as the subnet mask.
     * <p>
     * The class of the property is {@link NumericProperty}.
     * The allowed values are between 0 and 32.
     */
    public final static int ETHERNET_SUBNET_PREFIX_LENGTH = PropertyGroupID.ETHERNET_MIB_BASE + 0x0005;
    /**
     * This parameter is used to enter the primary domain name server used when connecting to a network through an Ethernet-equipped cradle.
     * <p>
     * The class of the property is {@link TextProperty}.
     */
    public final static int ETHERNET_DNS1_ADDRESS = PropertyGroupID.ETHERNET_MIB_BASE + 0x0006;
    /**
     * This parameter is used to enter the secondary domain name server used when connecting to a network through an Ethernet-equipped cradle.
     * <p>
     * The class of the property is {@link TextProperty}.
     */
    public final static int ETHERNET_DNS2_ADDRESS = PropertyGroupID.ETHERNET_MIB_BASE + 0x0007;
    /**
     * Controls whether an Ethernet Proxy is used by the device when connecting to a network through an Ethernet-equipped cradle.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int ETHERNET_PROXY_ENABLED = PropertyGroupID.ETHERNET_MIB_BASE + 0x0008;
    /**
     * Used to enter the Host Name of the Proxy server through which network communications will pass when connecting to a network through an Ethernet-equipped cradle.
     * <p>
     * The class of the property is {@link TextProperty}.
     */
    public final static int ETHERNET_PROXY_HOSTNAME = PropertyGroupID.ETHERNET_MIB_BASE + 0x0009;
    /**
     * Used to enter the two-digit Port number for accessing the Proxy server through which network communications will pass when connecting to a network through an Ethernet-equipped cradle.
     * <p>
     * The class of the property is {@link NumericProperty}.
     * The allowed values are between 0 to 65535.
     */
    public final static int ETHERNET_PROXY_PORT = PropertyGroupID.ETHERNET_MIB_BASE + 0x000A;
    /**
     * Used to enter the host name(s) and/or IP address(es) for direct access by the device, bypassing the Proxy server specified in the Proxy Host Name parameter.
     * <p>
     * The class of the property is {@link TextProperty}.
     */
    public final static int ETHERNET_PROXY_BYPASS = PropertyGroupID.ETHERNET_MIB_BASE + 0x000B;

    //
    // DualSim Settings definitions
    //
    /**
      * This parameter reports the availability of SIM card 1 and SIM card 2.
      * The value is calculated by the device according to the availability of the SIM cards, so this property cannot be set.
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link DualSimStatus}.
      */
    public final static int DUALSIM_AVAILABLE = PropertyGroupID.DUAL_SIM_MIB_BASE + 0x0001;
    /**
      * This parameters controls the SIM card Slot 1 that can be enabled or disabled on the device.
      * When this slot is disabled, the SIM card cannot be used for voice calls, mobile data and SMS.
      * <p>
      * The class of the property is {@link NumericProperty}.
      */
    public final static int DUALSIM_SIM1_ENABLE = PropertyGroupID.DUAL_SIM_MIB_BASE + 0x0002;
    /**
      * This parameters controls the SIM card Slot 2 that can be enabled or disabled on the device.
      * When this slot is disabled, the SIM card cannot be used for voice calls, mobile data and sms communication.
      * <p>
      * The class of the property is {@link NumericProperty}.
      */
    public final static int DUALSIM_SIM2_ENABLE = PropertyGroupID.DUAL_SIM_MIB_BASE + 0x0003;
    /**
      * This parameter reports the current SIM card privileged by the device for mobile data.
      * The value is calculated by the device according to the availablity of the SIM card preferred by
      * the user (set by {@link #DUALSIM_PREFERRED_DATA}), so this property cannot be set.
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link DualSimPreferredData}.
      */
    public final static int DUALSIM_CURRENT_DATA = PropertyGroupID.DUAL_SIM_MIB_BASE + 0x0004;
    /**
      * This parameter reports the current SIM card privileged by the device for voice calls.
      * The value is calculated by the device according to the availablity of the SIM card preferred by
      * the user (set by {@link #DUALSIM_PREFERRED_CALLS}), so this property cannot be set.
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link DualSimPreferredCallsAndSms}.
      */
    public final static int DUALSIM_CURRENT_CALLS = PropertyGroupID.DUAL_SIM_MIB_BASE + 0x0005;
    /**
      * This parameter reports the current SIM card privileged by the device for SMS.
      * The value is calculated by the device according to the availablity of the SIM card preferred by
      * the user (set by {@link #DUALSIM_PREFERRED_SMS}), so this property cannot be set.
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link DualSimPreferredCallsAndSms}.
      */
    public final static int DUALSIM_CURRENT_SMS = PropertyGroupID.DUAL_SIM_MIB_BASE + 0x0006;
    /**
      * This parameter controls the privileged SIM card to be used for mobile data.
      * The actual SIM card used by the device is retrieved by the property ({@link #DUALSIM_CURRENT_DATA}).
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link DualSimPreferredCallsAndSms}.
      */
    public final static int DUALSIM_PREFERRED_DATA = PropertyGroupID.DUAL_SIM_MIB_BASE + 0x0007;
    /**
      * This parameter controls the privileged SIM card to be used for voice calls.
      * The actual SIM card used by the device is retrieved by the property ({@link #DUALSIM_CURRENT_CALLS}).
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link DualSimPreferredCallsAndSms}.
      */
    public final static int DUALSIM_PREFERRED_CALLS = PropertyGroupID.DUAL_SIM_MIB_BASE + 0x0008;
    /**
      * This parameter controls the privileged SIM card to be used for SMS.
      * The actual SIM card used by the device is retrieved by the property ({@link #DUALSIM_CURRENT_SMS}).
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link DualSimPreferredCallsAndSms}.
      */
    public final static int DUALSIM_PREFERRED_SMS = PropertyGroupID.DUAL_SIM_MIB_BASE + 0x0009;

    //
    // Touch Settings definitions
    //

    /**
      * This is the property used to configure the touch controller.
      * On new device models, starting from M30/M35, this parameter is replaced by {@link PropertyID#TOUCH_MODE}.
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link TouchMode}.
      * @deprecated Use {@link PropertyID#TOUCH_MODE} and {@link TouchModeFlags} instead.
      */
    public final static int TOUCH_MODE_SENSITIVITY = PropertyGroupID.TOUCH_MIB_BASE + 0x0001;

    /**
     * This parameter locks or unlocks the input from touch screen.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int TOUCH_LOCK_INPUT = PropertyGroupID.TOUCH_MIB_BASE + 0x0002;

    /**
     * This is the property used to configure the touch controller.
     * <p>
     * The class of the property is {@link MultipleChoiceProperty}.
     * The allowed values are a subset of the combinations of the values defined by {@link TouchModeFlags}.
     */
    public final static int TOUCH_MODE = PropertyGroupID.TOUCH_MIB_BASE + 0x0003;

    //
    // UI Settings definitions
    //

    /**
      * This parameter hide/unhide the status bar.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int STATUS_BAR_HIDDEN = PropertyGroupID.UI_SETTINGS_GROUP + 0x0001;

    /**
      * This parameter hide/unhide the navigation bar.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int NAVIGATION_BAR_HIDDEN = PropertyGroupID.UI_SETTINGS_GROUP + 0x0002;

    /**
     * <b>Administrative Settings:</b> For devices managed by an organization,
     * administrative policies might require to restrict the user to access to notification shade.
     * <p>
     * Disabling the pull-down of the notification panel means preventing users from accessing the notification shade
     * by swiping down from the top of the screen. 
     * The notification bar, when pulled down, typically reveals notifications, quick settings, and other important information.
     * Disabling this functionality can have several implications:
     * <p>
     * 1) <b>Restricting Access to Notifications</b>: Users will not be able to view incoming notifications directly from the notification shade,
     * which might be used to prevent users to inract with them.
     * <p>
     * 2) <b>Limiting Quick Settings Access</b>: Quick settings for functions like Wi-Fi, Bluetooth, flashlight, and more, which are usually accessible from the pull-down menu, will be inaccessible.
     * This can be useful in controlled environments where device settings should not be easily altered by users.
     * <p>
     * 3) <b>Enhancing Security</b>: it can prevent unauthorized access to certain device functions and settings when the device is locked.
     * This setting might be used in corporate environments, on shared or public devices, or in situations where minimizing interruptions and controlling device functionality is important.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int STATUS_BAR_ENABLED = PropertyGroupID.UI_SETTINGS_GROUP + 0x0003;

    /**
     * <b>Administrative Settings:</b> For devices managed by an organization,
     * administrative policies might require to restrict the user to access to notification shade.
     * <p>
     * This property has the same effect of {@link #STATUS_BAR_ENABLED}, but its restriction is limited only on the lock screen.
     * So, when the device is in home screen, the user is able to pull down the notification shade.
     * <p>
     * it can prevent unauthorized access to certain device functions and settings when the device is locked.
     * This setting might be used in corporate environments, on shared or public devices, to prevent unauthorized access to notifications 
     * or to certain device functions and settings when the device is locked.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int STATUS_BAR_ON_LOCK_SCREEN_ENABLED = PropertyGroupID.UI_SETTINGS_GROUP + 0x0004;

    /**
     * <b>Administrative Settings:</b> For devices managed by an organization,
     * administrative policies might require to restric the user to pull down the Notification & Quick Settings panel.
     * <p>
     * Blocking the Notification Panel means preventing the ability to swipe down
     * from the top of the screen to access the notification panel and quick settings.
     * So, restricting the user to interact with notifications and quick access tiles for frequently settings and toggles.
     * <p>
     * This can be configured for ensuring controlled access to device notifications and settings on the device.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int NOTIFICATION_PANEL_ON_HOME_SCREEN_ENABLED = PropertyGroupID.UI_SETTINGS_GROUP + 0x0005;
    
    /**
     * <b>Administrative Settings:</b> For devices managed by an organization,
     * administrative policies might require to restric the user to pull down the Notification & Quick Settings panel.
     * <p>
     * This property has the same effect of {@link #NOTIFICATION_PANEL_ON_HOME_SCREEN_ENABLED}, but its restriction is limited only on the lock screen.
     * So, when the device is in home screen, the user is able to pull down the notification shade.
     * <p>
     * it can prevent unauthorized access to certain device functions and settings when the device is locked.
     * This setting might be used in corporate environments, on shared or public devices, to prevent unauthorized access to notifications 
     * or to certain device functions and settings when the device is locked.
     * <p>    
     * <p>
     * The class of the property is {@link NotificationPanelPolicy}.
     */
    public final static int NOTIFICATION_PANEL_ON_LOCK_SCREEN_POLICY = PropertyGroupID.UI_SETTINGS_GROUP + 0x0006;

    /**
     * <b>Administrative Settings:</b> For devices managed by an organization,
     * administrative policies might require to restrict the user to access to notification settings.
     * <p>
     * Hiding the Manage button in Notification bar pull down panel means preventing users from accessing the settings and options associated with individual notifications.
     * The 'Manage' button typically appears when the user expand a notification, allowing the user to modify notification settings for the app that sent it.
     * <p>
     * Disabling this functionality means that users will not be able to directly adjust notification settings from the notification bar.
     * They would need to go into the main Settings menu to make any changes to how notifications are handled for different apps.
     * This restriction can be used to ensure consistent notification settings or to prevent accidental changes by users.
     * <p>
     * This parameter only prevents accessing the notification settings through Manage button, since it's hidden.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int NOTIFICATION_MANAGE_BUTTON_HIDDEN = PropertyGroupID.UI_SETTINGS_GROUP + 0x0007;

    /**
     * <b>Administrative Settings:</b> For devices managed by an organization,
     * administrative policies might require to restrict the user to access to notification settings.
     * <p>
     * Long press on the notifications allows the user to access the quick settings and options associated with notifications.
     * <p>
     * Disabling this functionality means that users will not be able to directly adjust notification settings from the notification bar.
     * They would need to go into the main Settings menu to make any changes to how notifications are handled for different apps.
     * <p>
     * This parameter only prevents accessing the notification settings through long pressing on the notification.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int NOTIFICATION_LONG_PRESS_ENABLED = PropertyGroupID.UI_SETTINGS_GROUP + 0x0008;

    /**
     * <b>Administrative Settings:</b> For devices managed by an organization,
     * administrative policies might require to hide some kind of notifications, such as monitored network.
     * <p>
     * Hiding managed network notifications means preventing the device from displaying alerts or
     * notifications related to managed networks. Managed networks are typically Wi-Fi networks that are administratively
     * controlled and may have specific configurations or restrictions.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int NOTIFICATION_MONITORED_NETWORK_HIDDEN = PropertyGroupID.UI_SETTINGS_GROUP + 0x0009;

    /**
     * <b>Administrative Settings:</b> For devices managed by an organization,
     * administrative policies might require to restrict the user
     * from changing the configuration of Quick Settings tiles.
     * <p>
     * Tiles are interactive icons that appear in the Notification Quick Settings panel of the device.
     * They provide users with quick access to commonly used device settings
     * without the need to navigate through the full settings menu.
     * <p>
     * This parameter allows to create a custom configuration of Quick Settings tiles
     * by defining the tiles which should be shown to the user.
     * Configuring the tiles can prevent users from accessing to certain features.
     * This is done to restrict and limit the users' capability to enhance security,
     * device management, and prevent unauthorized or unintended changes.
     * <p>
     * The class of the property is {@link TextProperty}.
     * This property is a string structured as a comma-separated list containing the tile names to be shown.
     * If the list contains an invalid tile name, that tile will be ignored, while the others will be displayed in the UI.
     * Since it's not possible to remove all the tiles from the UI, an empty string will not be accepted,
     * therefore at least one valid tile name must be included in the list.
     * Otherwise, the configuration will be discarded.
     * <p>
     * <b>Examples:</b>
     * <ul>
     *  <li> "airplane,internet,battery" sets airplane mode, internet, and battery saver;
     *  <li> "airplane,foo,bar,internet" sets only airplane and internet, while 'foo' and 'bar' are discarded because they are not valid tile names;
     *  <li> "" is not allowed, therefore this configuration will be rejected;
     *  <li> "foo" is discarded because it is not a valid tile name. Since no valid tile names are in the list, this configuration will be rejected;
     *  <li> "default" resets tiles to the default list. It's a special value managed by Android;
     * </ul>
     * <p>
     * <br>
     * Android offers two types of tiles in the Quick Settings panel: System and App tiles.<br>
     * System tiles are built into the Android operating system and provide essential device functionalities.
     * In contrast, App or Custom tiles offer quick access to functionalities provided by applications, such as Google Mobile Services (GMS).
     * Therefore, they can be customized and added by installing third-party applications that provide this capability.
     * <p>
     * The list below shows the tiles available in Android 13.
     * Please note that not all tiles in this list are supported by Datalogic devices, as this varies by model.
     * Use the APIs {@link QuickSettingsTiles#getAvailableSystemTiles} and {@link QuickSettingsTiles#getAvailableCustomTiles}
     * to retrieve the lists of system and custom tiles available at runtime on a Datalogic device.
     * <p>
     * <b>Note on Tile Visibility and Interaction:</b>
     * <p>
     * The Quick Settings panel includes two categories for tiles:
     * <ul>
     *  <li><b>Visible Tiles:</b> Tiles accessible to the user by scrolling down the notification panel.
     *  <li><b>Additional Tiles:</b> Tiles not visible by default but can be dragged to the visible list by the user for quick access.
     * </ul>
     * <p>
     * When tiles are disabled, they are removed from both the visible and additional tiles lists.
     * Users cannot interact with disabled tiles, nor can they trigger actions or drag them into the visible list.
     * When a disabled tile is enabled again, it is added to the additional tiles list,
     * but not automatically to the visible tiles list.
     * The user can configure that tile to be visible by dragging it from the additional tiles list
     * to the visible tiles list using the pen icon in the bottom right corner of the Quick Settings panel.
     * Alternatively, this can be done programmatically by configuring the visible tiles
     * through the Visible Tiles property.
     * </p>
     * <p>
     * <b>System tiles:</b>
     * <ul>
     *  <li> Internet: 'internet'
     *  <li> Bluetooth: 'bt'
     *  <li> Flashlight: 'flashlight'
     *  <li> Do Not Disturb: 'dnd'
     *  <li> Alarm: 'alarm'
     *  <li> Airplane: 'airplane'
     *  <li> Device Controls: 'controls'
     *  <li> Wallet: 'wallet'
     *  <li> Auto-rotate: 'rotation'
     *  <li> Battery Save: 'battery'
     *  <li> Screen Cast: 'cast'
     *  <li> Screen Record: 'screenrecord'
     *  <li> Mic Access: 'mictoggle'
     *  <li> Camera Access: 'cameratoggle'
     *  <li> Stylus/Glove Touch: 'touch_stylus'
     *  <li> Location: 'location'
     *  <li> Hotspot: 'hotspot'
     *  <li> Color Inversion: 'inversion'
     *  <li> Data Saver: 'saver'
     *  <li> Dark Theme: 'dark'
     *  <li> Work Apps: 'work'
     *  <li> Night Light: 'night'
     *  <li> Extra Dim: 'reduce_brightness'
     *  <li> QR Code Scanner: 'qr_code_scanner'
     *  <li> One Handed: 'onehanded'
     *  <li> Color Correction: 'color_correction'
     *  <li> Screen Saver: 'dream'
     *  <li> Font Size: 'font_scaling'
     * </ul>
     *
     * <br>
     * <b>Google custom tiles:</b>
     * <ul>
     *  <li> Nearby Share: 'custom(com.google.android.gms/.nearby.sharing.SharingTileService)'
     *  <li> Storage: 'custom(com.google.android.apps.nbu.files/.quicksettings.StorageAssistantTileService)'
     *  <li> Focus Mode: 'custom(com.google.android.apps.wellbeing/.focusmode.quicksettings.FocusModeTileService)'
     *  <li> Bedtime mode: 'custom(com.google.android.apps.wellbeing/.screen.ui.GrayscaleTileService)'
     *  <li> Calculator: 'custom(com.google.android.calculator/com.android.calculator2.CalculatorTileService)'
     * </ul>
     *
     * <br>
     * <b>Other tiles:</b>
     * <ul>
     *  <li> Memory Usage: 'custom(com.android.permissioncontroller/.permission.service.SafetyCenterQsTileService)'
     * </ul>
     */
    public final static int QUICK_SETTINGS_PANEL_TILES = PropertyGroupID.UI_SETTINGS_GROUP + 0x000A;

    /**
     * <b>Administrative Settings:</b> For devices managed by an organization,
     * administrative policies might require to restrict the user to configure the Quick Settings tiles.
     * <p>
     * If this setting is enabled, the edit icon of quick settings panel is hidden and the user is prevented to add, remove or change the order of tiles.
     * This property might be used to restrict the user to access to quick settings configuration.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int QUICK_SETTINGS_PANEL_EDIT_HIDDEN = PropertyGroupID.UI_SETTINGS_GROUP + 0x000C;
    
    /**
     * <b>Administrative Settings:</b> For devices managed by an organization,
     * administrative policies might require to restrict the user to change settings options.
     * <p>
     * If this setting is enabled, the gear icon of quick settings panel is hidden and the user is prevented to launch Android Settings from that button.
     * This property might be used to restrict the user to access to settings configuration.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int QUICK_SETTINGS_PANEL_GEAR_HIDDEN = PropertyGroupID.UI_SETTINGS_GROUP + 0x000D;

    /**
     * <b>Administrative Settings:</b> For devices managed by an organization,
     * administrative policies might require to restrict the use of the Hotspot feature.
     * <p>
     * If this parameter is enabled, the toggle button to enable or disable the Hotspot feature
     * is no longer visible in the quick settings menu.
     * The quick settings menu is the area that appears when the user swipes down from the top of the screen.
     * So the user is not able to enable or disable the hotspot feature from there.
     * <p>
     * When the Hotspot tile was previously hidden and this property value changes to disabled,
     * then the tile becomes accessible to the users again in the quick settings menu.
     * But, the tile is not automatically added to the visible tile list.
     * Therefore, in order to be visible, that tile shall be added to {@link #QUICK_SETTINGS_PANEL_TILES}.
     * <p>
     * The user would still be able to access and control the hotspot feature from the main Settings.
     * Therefore, this parameter can be use with {@link #HOTSPOT_SETTING_DIMMED},
     * to prevent the user to change the configuration of this feature.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int QUICK_SETTINGS_TILES_HOTSPOT_HIDDEN = PropertyGroupID.UI_SETTINGS_GROUP + 0x000E;

    /**
     * <b>Administrative Settings:</b> For devices managed by an organization,
     * administrative policies might require to restrict the use of the Airplane mode.
     * <p>
     * If this parameter is enabled, the toggle button to enable or disable the Airplane mode
     * is no longer visible in the quick settings menu.
     * The quick settings menu is the area that appears when the user swipes down from the top of the screen.
     * So the user is not able to enable or disable the hotspot feature from there.
     * <p>
     * When the Airplane mode tile was previously hidden and this property value changes to disabled,
     * then the tile becomes accessible to the users again in the quick settings menu.
     * But, the tile is not automatically added to the visible tile list.
     * Therefore, in order to be visible, that tile shall be added to {@link #QUICK_SETTINGS_PANEL_TILES}.
     * <p>
     * The user would still be able to access and control the hotspot feature from the main Settings.
     * Therefore, this parameter can be use with {@link #AIRPLANE_MODE_SETTING_DIMMED},
     * to prevent the user to change the configuration of this feature.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int QUICK_SETTINGS_TILES_AIRPLANE_MODE_HIDDEN = PropertyGroupID.UI_SETTINGS_GROUP + 0x000F;

    /**
     * <b>Administrative Settings:</b> For devices managed by an organization,
     * administrative policies might require to restrict the use of the Do Not Disturb mode.
     * <p>
     * If this parameter is enabled, the toggle button to enable or disable the Do Not Disturb mode
     * is no longer visible in the quick settings menu.
     * The quick settings menu is the area that appears when the user swipes down from the top of the screen.
     * So the user is not able to enable or disable the hotspot feature from there.
     * <p>
     * When the Do Not Disturb tile was previously hidden and this property value changes to disabled,
     * then the tile becomes accessible to the users again in the quick settings menu.
     * But, the tile is not automatically added to the visible tile list.
     * Therefore, in order to be visible, that tile shall be added to {@link #QUICK_SETTINGS_PANEL_TILES}.
     * <p>
     * The user would still be able to access and control the hotspot feature from the main Settings.
     * Therefore, this parameter can be use with {@link #DO_NOT_DISTURB_SETTING_DIMMED},
     * to prevent the user to change the configuration of this feature.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int QUICK_SETTINGS_TILES_DND_HIDDEN = PropertyGroupID.UI_SETTINGS_GROUP + 0x0010;

    /**
     * <b>Administrative Settings:</b> For devices managed by an organization,
     * administrative policies might require to restrict the user to access to recent apps view.
     * <p>
     * Hiding the Recent Apps means restricting the users to view and switch between recently used applications.
     * The Recent Apps are usually displayed when pressing a button on the navigation bar at the bottom of the screen.
     * Pressing the button opens a list of recently opened apps.
     * <p>
     * Disabling this functionality means the user will always see an empty list of apps, which
     * means they won't be able to quickly switch between or close recent apps using this button.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int RECENT_APPS_ENABLED = PropertyGroupID.UI_SETTINGS_GROUP + 0x0011;

    /**
     * <b>Administrative Settings:</b> For devices managed by an organization,
     * administrative policies might require to restrict the user to use multiple Apps in split screen mode.
     * <p>
     * Hiding the Split Screen button means preventing the user to run two apps simultaneously in a split-screen view.
     * When this parameter is disabled, users can open the Recent Apps menu, select an app, and choose the option to view it in split-screen mode alongside another app. 
     * When this parameter is enabled, users can't using the split-screen mode, meaning they can only use one app at a time and cannot view or 
     * interact with multiple apps simultaneously on the screen.
     * <p>
     * This parameter only prevents activation of the split-screen feature through Settings UI.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int SPLIT_SCREEN_APP_HIDDEN = PropertyGroupID.UI_SETTINGS_GROUP + 0x0012;

    /**
     * <b>Administrative Settings:</b> For devices managed by an organization,
     * administrative policies might require to restrict the user to search settings options.
     * <p>
     * If this setting is enabled, the search bar is hidden from Android Settings and the user is prevented to search specific settings.
     * This property might be used to restrict the user to change part of configuration.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int ANDROID_SETTINGS_SEARCH_BAR_HIDDEN = PropertyGroupID.UI_SETTINGS_GROUP + 0x0013;

    /**
     * <b>Administrative Settings:</b> For devices managed by an organization,
     * administrative policies might require to restrict the use of the Hotspot feature.
     * <p>
     * If this parameter is enabled, the setting to enable or disable the Hotspot feature is "dimmed" in the Settings.
     * It means that the option is grayed out and it cannot be interacted with through UI.
     * This indicates to the user that the feature is currently not accessible and the user is not able to change its state.
     * For enabling o disabling it, please refer to parameter {@link #HOTSPOT_ENABLED}.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int HOTSPOT_SETTING_DIMMED = PropertyGroupID.UI_SETTINGS_GROUP + 0x0014;

    /**
     * <b>Administrative Settings:</b> For devices managed by an organization,
     * administrative policies might require to restrict the use of the Airplane mode.
     * <p>
     * If this parameter is enabled, the setting to enable or disable the Airplane mode is "dimmed" in the Settings.
     * It means that the option is grayed out and it cannot be interacted with through UI.
     * This indicates to the user that the feature is currently not accessible and the user is not able to change its state.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int AIRPLANE_MODE_SETTING_DIMMED = PropertyGroupID.UI_SETTINGS_GROUP + 0x0015;

    /**
     * <b>Administrative Settings:</b> For devices managed by an organization,
     * administrative policies might require to restrict the use of the Do Not Disturb mode.
     * <p>
     * If this parameter is enabled, the setting to enable or disable the Do Not Disturb mode is "dimmed" in the Settings.
     * It means that the option is grayed out and it cannot be interacted with through UI.
     * This indicates to the user that the feature is currently not accessible and the user is not able to change its state.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int DO_NOT_DISTURB_SETTING_DIMMED = PropertyGroupID.UI_SETTINGS_GROUP + 0x0016;

    /**
     * <b>Administrative Settings:</b> For devices managed by an organization,
     * administrative policies might require to restrict the user to trigger the devices resets.
     * <p>
     * Reset settings refer to various options that allow to restore the device to a previous or default state,
     * clearing personal data, or preparing the device for a new user.
     * <p>
     * If this parameter is enabled, the "Reset option" in the Settings menu is "dimmed".
     * It means that the option is grayed out and it cannot be interacted with through UI.
     * This indicates to the user that the feature is currently not accessible
     * and the user is not able to trigger any reset option.
     * <p>
     * When this property is enabled, the properties under "Reset option" menu are still accessible
     * through the Search Bar in Android Settings. Therefore, it is recommended to also hide
     * the Search Bar in the Settings using property {@link #ANDROID_SETTINGS_SEARCH_BAR_HIDDEN}.
     * This ensures that access to the settings remains controlled and aligned
     * with the desired configurations of the device.
     * <p>
     * This parameter only prevents the user to trigger any reset through Settings UI.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int RESET_OPTIONS_SETTINGS_DIMMED = PropertyGroupID.UI_SETTINGS_GROUP + 0x0017;

    /**
     * <b>Administrative Settings:</b> For devices managed by an organization,
     * administrative policies might require to restrict the user to configure the accessibility settings.
     * <p>
     * Accessibility settings refer to a set of features and options designed to make the device easier
     * to use for individuals with disabilities or impairments
     * <p>
     * If this parameter is enabled, the "Accessibility" in the Settings is "dimmed".
     * It means that the option is grayed out and it cannot be interacted with through UI.
     * This indicates to the user that the feature is currently not accessible
     * and the user is not able to configure the accessibility settings.
     * <p>
     * When this property is enabled, the properties under "Accessibility" menu are still accessible
     * through the Search Bar in Android Settings. Therefore, it is recommended to also hide
     * the Search Bar in the Settings using property {@link #ANDROID_SETTINGS_SEARCH_BAR_HIDDEN}.
     * This ensures that access to the settings remains controlled and aligned
     * with the desired configurations of the device.
     * <p>
     * This parameter only prevents the user to change the status of accessibility options through Settings UI.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int ACCESSIBILITY_SETTINGS_DIMMED = PropertyGroupID.UI_SETTINGS_GROUP + 0x0018;

    /**
     * <b>Administrative Settings:</b> For devices managed by an organization,
     * administrative policies might require to restrict the user to configure the notification settings.
     * <p>
     * Notification App settings refer to the options available to manage how different apps send notifications to the user.
     * <p>
     * If this parameter is enabled, the notification settings options are "dimmed" in the Settings.
     * It means that the option is grayed out and it cannot be interacted with through UI.
     * This indicates to the user that the feature is currently not accessible and the user is not able to configure the notification options.
     * <p>
     * This parameter only prevents the user to change the configuration of notifications through Settings UI.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int NOTIFICATION_APP_SETTINGS_DIMMED = PropertyGroupID.UI_SETTINGS_GROUP + 0x0019;

    /**
     * <b>Administrative Settings:</b> For devices managed by an organization,
     * administrative policies might require to restrict the user to configure the long press action on the home button.
     * <p>
     * If this parameter is enabled, the setting to enable or disable the long press action on the home button is "dimmed" in the Settings.
     * It means that the option is grayed out and it cannot be interacted with through UI.
     * This indicates to the user that the feature is currently not accessible and the user is not able to change its state.
     * <p>
     * This parameter only prevents the user to change the long press action on the home button in Settings UI.
     * For configuring the action, please refer to parameter {@link #LONG_PRESS_HOME_BUTTON_ENABLED}.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int LONG_PRESS_HOME_BUTTON_SETTING_DIMMED = PropertyGroupID.UI_SETTINGS_GROUP + 0x001B;

    /**
     * <b>Administrative Settings:</b> For devices managed by an organization,
     * administrative policies might require to restrict the user to configure the notification dot.
     * <p>
     * If this parameter is enabled, the setting to enable or disable the notification dot is "dimmed" in the Settings.
     * It means that the option is grayed out and it cannot be interacted with through UI.
     * This indicates to the user that the feature is currently not accessible and the user is not able to change its state.
     * <p>
     * This parameter only prevents the user to change the notification dot in Settings UI.
     * For enabling o disabling it, please refer to parameter {@link #NOTIFICATION_DOTS_ENABLED}.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int NOTIFICATION_DOTS_SETTING_DIMMED = PropertyGroupID.UI_SETTINGS_GROUP + 0x001D;

    /**
     * <b>Administrative Settings:</b> For devices managed by an organization,
     * administrative policies might require to restrict the user to configure the keyboard combinations.
     * <p>
     * If this parameter is enabled, the setting to enable or disable the keyboard combinations is "dimmed" in the Settings.
     * It means that the option is grayed out and it cannot be interacted with through UI.
     * This indicates to the user that the feature is currently not accessible and the user is not able to change its state.
     * <p>
     * This parameter only prevents the user to change the keyboard combinations in Settings UI.
     * For enabling o disabling it, please refer to parameter {@link #PHYSICAL_KEYBOARD_SHORTCUTS_ENABLED}.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int PHYSICAL_KEYBOARD_SHORTCUTS_SETTING_DIMMED = PropertyGroupID.UI_SETTINGS_GROUP + 0x001F;

    /**
     * <b>Administrative Settings:</b> For devices managed by an organization,
     * administrative policies might require to restrict the automatic synchronization of data.
     * <p>
     * If this parameter is enabled, the setting to enable or disable the automatic synchronization of data is "dimmed" in the Settings.
     * It means that the option is grayed out and it cannot be interacted with through UI.
     * This indicates to the user that the feature is currently not accessible and the user is not able to change its state.
     * <p>
     * This parameter only prevents the user to change the automatic synchronization of data in Settings UI.
     * For enabling o disabling it, please refer to parameter {@link #AUTO_SYNC_APP_DATA_ENABLED}.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int AUTO_SYNC_APP_DATA_SETTING_DIMMED = PropertyGroupID.UI_SETTINGS_GROUP + 0x0021;

    /**
     * This parameter hides the taskbar.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int TASK_BAR_HIDDEN = PropertyGroupID.UI_SETTINGS_GROUP + 0x0022;

    /**
     * <b>Administrative Settings:</b> For devices managed by an organization,
     * administrative policies might require to restrict the WiFi connection or options.
     * <p>
     * If this parameter is enabled, the Wi-Fi sharing option is disabled in the user interface.
     * This means the `Share` functionality (e.g., displaying a QR code or the network password) is grayed out
     * and it cannot be interacted with through UI.
     * This indicates to the user that the feature is currently not accessible and the user is not able to change its state.
     * <p>
     * This restriction only prevents the *sharing* of the Wi-Fi network; it does not affect the device's ability 
     * to connect to and use the Wi-Fi network itself.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int WIFI_NETWORK_SHARE_DIMMED = PropertyGroupID.UI_SETTINGS_GROUP + 0x0023;
    
    /**
     * This property refers to enable or disable screensaver.
     * <p>
     * Enabling the screensaver helps prevent screen burn-in by ensuring that static images are not displayed for prolonged periods.
     * This distributes pixel usage more evenly, reducing the risk of permanent image retention on the display.
     * <p>
     * When enabled, users can customize the screensaver according to their preferences.
     * <p>
     * Beside the enabling, the screensaver can be configured with the following properties:
     * <ul>
     * <li> {@link #SCREENSAVER_POLICY} determines when screensaver is activated;</li>
     * <li> {@link #SCREENSAVER_COMPONENT} determines which screensaver app is used; </li>
     * <li> {@link #SCREENSAVER_DATALOGIC} contains the list of screensavers managed by `Datalogic Screensaver` application. </li> 
     * </ul>
     * <p>
     * The user would still be able to access and control this configuration from the main Settings,
     * or dedicated tile in quick settings panel.
     * Therefore, this parameter can be use with {@link #SCREENSAVER_SETTING_DIMMED}
     * to prevent the user to change the configuration of this feature.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int SCREENSAVER_ENABLED = PropertyGroupID.UI_SETTINGS_GROUP + 0x0024;

    /**
     * <b>Administrative Settings:</b> For devices managed by an organization,
     * administrative policies might require to restrict the activation and the configuration of the screensaver.
     * <p>
     * If this parameter is enabled, the setting to enable or disable screen saver is "dimmed" in the Settings.
     * It means that the option is grayed out and it cannot be interacted with through UI.
     * This indicates to the user that the feature is currently not accessible and the user is not able to change its state.
     * <p>
     * This parameter only prevents the user to change screen saver settings in Settings UI.
     * For enabling o disabling it, please refer to parameter {@link #SCREENSAVER_ENABLED}.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int SCREENSAVER_SETTING_DIMMED = PropertyGroupID.UI_SETTINGS_GROUP + 0x0025;

    /**
     * This property determines when screensaver is activated.
     * <p>
     * The screensaver can be configured to activate under various conditions,
     * such as when it is charging, or when is inserted into a cradle.
     * <p>
     * This property is effective if the screensaver is enabled using {@link #SCREENSAVER_ENABLED}.
     * <p>
     * The user would still be able to access and control this configuration from the Android Settings.
     * Therefore, this parameter can be use with {@link #SCREENSAVER_SETTING_DIMMED}
     * to prevent the user to change the configuration of this feature.
     * <p>
     * The class of the property is {@link EnumProperty}.
     * The allowed values are defined by enum {@link ScreensaverPolicy}.
     */
    public final static int SCREENSAVER_POLICY = PropertyGroupID.UI_SETTINGS_GROUP + 0x0026;

    /**
     * <b>Administrative Settings:</b> For devices managed by an organization,
     * administrative policies might require restricting the user from selecting the app for the screensaver.
     * <p>
     * This property allows the user to select the app that will manage the screensaver.
     * The value of the property should be a string in the format `package_name/activity_name`,
     * where `package_name` is the screensaver app and `activity_name` is the name of the specific app activity
     * that manages the screensaver.
     * For example, if `SCREENSAVER_COMPONENT="com.google.android.deskclock/com.android.deskclock.Screensaver"`,
     * the clock screensaver will be launched.
     * To use `Datalogic Screensaver` set `SCREENSAVER_COMPONENT="com.datalogic.android.datalogicscreensaver/com.datalogic.android.datalogicscreensaver.ScreensaverService"`
     * The screensaver app can also be selected under `Display -> Screen saver` in Android settings.
     * Any app can be used to manage the screensaver if it extends a `DreamService`.
     * <p>
     * For more information, refer to the Android documentation:
     * <a href="https://developer.android.com/reference/android/service/dreams/DreamService">DreamService</a>.
     * <p>
     * For enabling or disabling the screensaver, please refer to the parameter {@link #SCREENSAVER_ENABLED}.
     * To change the policy to start the screensaver, please refer to the parameter {@link #SCREENSAVER_POLICY}.
     * This parameter can be used with {@link #SCREENSAVER_SETTING_DIMMED} to prevent
     * the user from changing the configuration of this feature.
     * <p>
     * The class of the property is {@link TextProperty}.
     */
    public final static int SCREENSAVER_COMPONENT = PropertyGroupID.UI_SETTINGS_GROUP + 0x0027;

    /**
     * Contains an editable list of screensavers managed by the Datalogic Screensaver application.
     * This list can be modified at runtime by adding or removing elements via the SDK or Datalogic Screensaver settings. <br>
     * The type of this property is {@link BlobProperty} and the concrete implementation is {@link DatalogicScreensaver}.<br>
     *
     * To use Datalogic Screensaver, {@link #SCREENSAVER_COMPONENT} must be set to
     * "com.datalogic.android.datalogicscreensaver/com.datalogic.android.datalogicscreensaver.ScreensaverService".
     * <p>
     * Datalogic Screensaver continuously cycles through the screensaver list to display a carousel of screensavers.
     * Each screensaver is represented by a {@link ScreensaverItem} which can either be an animated image or a video.
     * A {@link ScreensaverItem} has the following parameters:
     * <ul>
     *   <li><b>file</b>: The file name with extension. The file must be either an image or a video; otherwise, it will be ignored.</li>
     *   <li><b>background</b>: The background color in the format "#RRGGBB" or "#AARRGGBB" as used by Android (<a href=https:\/\/developer.android.com\/reference\/android\/graphics\/Color#parseColor(java.lang.String)>Color.parseColor</a>). This parameter is used only for images.</li>
     *   <li><b>duration</b>: The screensaver duration in seconds. Valid values are between {@link DatalogicScreensaver#DURATION_MIN_S} (0s) and {@link DatalogicScreensaver#DURATION_MAX_S} (1h).
     *       Values outside this range will be rounded to the nearest bound. This parameter is used only for images.</li>
     *   <li><b>animation</b>: The animation type defined by the {@link ScreensaverAnimation} enumeration.
     *       This parameter is used only for images.</li>
     * </ul>
     * Screensaver files must be located in the directory <i>"/sdcard/DCIM/Screensavers"</i>.
     * During execution, Datalogic Screensaver searches for the file in this directory and displays it only if found. <br>
     * If the screensaver is an image, Datalogic Screensaver displays it over a single-colored background for the specified duration.
     * Images with a duration of 0 are ignored. <br>
     * If the screensaver is a video, it is displayed unscaled over the default background
     * ({@link DatalogicScreensaver#DEFAULT_BACKGROUND_COLOR}) for the entire duration of the video. In this case, the background color,
     * duration, and animation parameters are ignored. So, to clearness use these default values:
     * <ul>
     *  <li><b>background</b>: {@link DatalogicScreensaver#DEFAULT_BACKGROUND_COLOR};
     *  <li><b>duration</b>: {@link DatalogicScreensaver#DURATION_MIN_S};
     *  <li><b>animation</b>: {@link ScreensaverAnimation#UNDEFINED}.
     * </ul>
     * 
     * Using commit intent by android app, character <code>  <mark>"</mark>   </code>  must be escaped as <code>   <mark>\"</mark></code>.<br><br>
     * <b> For example, to add two screensavers, an image and a video: </b>
     * <pre>
     * Intent intent = new Intent(Intents.ACTION_CONFIGURATION_COMMIT);
     * HashMap map = new HashMap();
     * map.put(PropertyID.SCREENSAVER_DATALOGIC, "[[\"image.jpg\",\"#000000FF\",\"60\",\"ZIG_ZAG\"],[\"video.jpg\",\"#00000000\",\"0\",\"UNDEFINED\"]]");
     * intent.putExtra(Intents.EXTRA_CONFIGURATION_CHANGED_MAP, map);
     * mContext.sendBroadcast(intent);
     * </pre>
     * <b>To delete all devices:</b>
     * <pre>
     * Intent intent = new Intent(Intents.ACTION_CONFIGURATION_COMMIT);
     * HashMap map = new HashMap();
     * map.put(PropertyID.SCREENSAVER_DATALOGIC, "[]");
     * intent.putExtra(Intents.EXTRA_CONFIGURATION_CHANGED_MAP, map);
     * mContext.sendBroadcast(intent);
     * </pre>
     * <br><br>
     * 
     * To set this property via intent ({@link Intents#ACTION_CONFIGURATION_COMMIT}), use the following serialized format:<br>
     * <pre>
     * [["file","background","duration","animation"],["file","background","duration","animation"]]
     * </pre>
     * <br>
     * Using the commit intent by shell, characters <code>   <mark>,</mark>   </code><code>   <mark>"</mark>   </code> and <mark>space</mark> must be escaped as <code>   <mark>"\,"</mark>   </code><code>   <mark>\"</mark>   </code>and<code>   <mark>" "</mark>   </code> respectively.<br><br>
     *
     * For example, to add two screensavers, an image and a video, with the commit intent:
     * <pre>
     * adb shell am broadcast \
     * -a com.datalogic.device.intent.action.configuration.COMMIT \
     * --es com.datalogic.device.intent.extra.configuration.CHANGED_MAP 'SCREENSAVER_DATALOGIC=[[\"image.jpg\""\,"\"#0000FF\""\,"10"\,"\"ZIG_ZAG\"]"\,"[\"video.mp4\""\,"\"#00000000\""\,"0"\,"\"ZIG_ZAG\"]]'
     * </pre>
     *
     * To delete all screensavers:
     * <pre>
     * adb shell am broadcast \
     * -a com.datalogic.device.intent.action.configuration.COMMIT \
     * --es com.datalogic.device.intent.extra.configuration.CHANGED_MAP 'SCREENSAVER_DATALOGIC=[]'
     * </pre>
     */
    public final static int SCREENSAVER_DATALOGIC = PropertyGroupID.UI_SETTINGS_GROUP + 0x0028;


    //
    // UX Settings definitions
    //

    /**
     * <b>Administrative Settings:</b> For devices managed by an organization,
     * administrative policies might require to control the desktop mode configuration.
     * <p>
     * This parameter controls the desktop mode feature, that allows the device to be provide a
     * desktop-like experience, when it connected to an external display, a mouse and a keyboard,
     * through a dedicated docking station.
     * <p>
     * This feature offers several configuration modes, typically to optimized the user interface
     * for larger screens or to provide an user experience similar to a desktop computer:
     * <p>
     * <b>Mirroring Mode</b>: this mode is the simplest connection mode.
     * The screen of the device is duplicated exactly on the external monitor,
     * typically with portrait orientation.
     * There are no differences between the device screen and the external monitor.
     * This mode does not provide neither an optimized resolution for the external monitor
     * nor a desktop-like user experience.
     * <p>
     * <b>External Mode</b>: this mode is optimized for the external display resolution and orientation.
     * The screen of the device is duplicated exactly on the external monitor, as for the Mirroring Mode,
     * but typically the user interface is adapted to the resolution of the external monitor with
     * landscape orientation.
     * There are still no differences between the device screen and the external monitor.
     * The resolution is optimized for the external monitor, opposite to the Mirroring Mode,
     * but  the user experience is still not desktop-like.
     * It offers a better visual experience compared to Mirroring Mode, more comfortable
     * for viewing videos or multimedia content.
     * However, it does not modify the Apps interfaces for a full desktop experience.
     * <p>
     * <b>Dual Display Mode </b>: this mode transforms the device into a desktop-like experience.
     * This mode is designed to make full use of the external monitor and includes a user interface
     * similar to that of a desktop operating system.
     * The screen of the device and the external monitor are separated, each with its own content and layout.
     * The external monitor displays a desktop-like interface, which can include a taskbar, while
     * the screen device displays the Android interface and it could be used as a secondary screen.
     * It provides a complete desktop experience, similar to a traditional computer.
     * Ideal for productivity tasks such as document editing, web browsing,
     * and using Apps that require a larger interface.
     * <p>
     * The class of the property is {@link DesktopModePolicy}.
     */
    public final static int DESKTOP_MODE_POLICY = PropertyGroupID.UX_SETTINGS_GROUP + 0x0001;

    /**
     * <b>Administrative Settings:</b> For devices managed by an organization,
     * administrative policies might require to restrict the user to activate the "Do Not Disturb" mode.
     * <p>
     * "Do Not Disturb" (DND) is a feature provided by Android that allows you to silence all or specific types
     * of notifications, calls, and alerts, helping you avoid interruptions.
     * <p>
     * This parameter allows to control the "Do Not Disturb" status.
     * <p>
     * Disabling "Do Not Disturb" will ensure that the device resumes normal operation regarding notifications and alerts,
     * allowing you to receive all incoming sounds, vibrations, and notifications without restriction.
     * <p>
     * The class of the property is {@link DoNotDisturbPolicy}.
     */
    public final static int DO_NOT_DISTURB_POLICY = PropertyGroupID.UX_SETTINGS_GROUP + 0x0007;

    /**
     * <b>Administrative Settings:</b> For devices managed by an organization,
     * administrative policies might require to restrict the user to take screenshots.
     * <p>
     * Disabling the functionality of screenshots means preventing users from capturing images of the current screen.
     * Normally, users can take screenshots by pressing a combination of physical buttons or using gestures.
     * Disabling this functionality can have several implications:
     * <p>
     * 1) <b>Protecting Sensitive Information</b>: it can help protect sensitive information displayed on the screen from being easily captured and shared.
     * This is particularly important in secure environments or when dealing with confidential data.
     * <p>
     * 2) <b>Enhancing Security and Privacy</b>: it can reduce the risk of accidental or intentional data leakage, enhancing the overall security and privacy of the device.
     * <p>
     * 3) <b>Compliance with Policies</b>: In certain corporate or regulatory environments, disabling screenshots might be required to comply with data protection policies
     * or to prevent the unauthorized distribution of proprietary information.
     * <p>
     * This setting might be used in corporate environments, on devices handling sensitive information, or in applications where privacy is a high priority.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int SCREENSHOT_ENABLED = PropertyGroupID.UX_SETTINGS_GROUP + 0x0008;

    /**
     * <b>Administrative Settings:</b> For devices managed by an organization,
     * administrative policies might require to restrict the user to access to clipbord functionality.
     * <p>
     * The clipboard is a temporary storage area used to hold data that has been cut or copied
     * from one location so that it can be pasted into another location.
     * Disabling the clipboard means preventing users from copying and pasting text or other content.
     * In particular, it can have several implications:
     * <p>
     * 1) <b>Preventing Copy and Paste</b>: Users will not be able to copy text, images, or other data from one app or document and paste it into another.
     * This restriction might be applied to enhance security, especially in environments where data leakage is a concern.
     * <p>
     * 2) <b>Limiting Data Sharing</b>: it becomes more difficult to transfer information between apps,
     * which can help prevent unauthorized sharing of sensitive data.
     * <p>
     * 3) <b>Reducing Risk of Malware</b>: it can help mitigate certain types of malware that exploit clipboard data to steal information or inject malicious content.
     * This setting might be used in corporate environments, on shared devices, or in other situations where controlling data movement is critical.
     * <p>
     * The class of the property is {@link ClipboardPolicy}.
     */
    public final static int CLIPBOARD_POLICY = PropertyGroupID.UX_SETTINGS_GROUP + 0x0009;

    /**
     * <b>Administrative Settings:</b> For devices managed by an organization,
     * administrative policies might require to prevent the 180-degree rotation for a better user experience.
     * <p>
     * Disabling the functionality of 180-degree vertical rotation means preventing the screen from rotating upside down
     * when the device is turned to a completely inverted position. Typically, smartphones can rotate their display in four directions:
     * 0 degrees (standard portrait), 90 degrees (landscape), 180 degrees (upside-down portrait), and 270 degrees (reverse landscape).
     * Disabling the 180-degree vertical rotation, the screen will remain in the standard portrait orientation or rotate only to landscape modes,
     * avoiding the upside-down view. This provides a more consistent and predictable user experience.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int ROTATION_180_ENABLED = PropertyGroupID.UX_SETTINGS_GROUP + 0x000A;

    /**
     * <b>Administrative Settings:</b> For devices managed by an organization,
     * administrative policies might require to restrict the user to connect to other devices via Cast.
     * <p>
     * Android Cast the feature that allows the device to wirelessly stream or mirror its screen and audio to other devices,
     * such as TVs, smart displays, or streaming devices like Chromecast.
     * <p>
     * So, if this parameter is enabled, Android Cast is disabled and the device will no longer search for
     * or connect to these devices for screen mirroring or media streaming purposes.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int CAST_ENABLED = PropertyGroupID.UX_SETTINGS_GROUP + 0x000B;

    /**
     * <b>Administrative Settings:</b> For devices managed by an organization,
     * administrative policies might require to restrict the user to connect to other devices via Android Quick Share.
     * <p>
     * Android Quick Share is the feature that allows the user to quickly and easily share files, photos, videos, and other content with nearby devices.
     * Android Quick Share uses wireless technologies like Bluetooth and Wi-Fi Direct to establish a direct connection between devices, enabling fast and seamless file transfers.
     * <p>
     * So, if this parameter is enabled, Android Quick Share is disabled and the device will no longer be able to initiate or receive these quick file transfers,
     * which can enhance privacy and security by preventing unwanted sharing of user content.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int QUICKSHARE_ENABLED = PropertyGroupID.UX_SETTINGS_GROUP + 0x000C;

    /**
     * <b>Administrative Settings:</b> For devices managed by an organization,
     * administrative policies might require to restrict the user to connect to other devices via Android Chromebook.
     * <p>
     * Android Chromebook is the feature that allows the device to connect and interact with other devices for sharing notifications, text messages, and other data.
     * <p>
     * So, if this parameter is enabled, Android Chromebook is disabled and the device will no longer be able for these synchronization and sharing features,
     * which can enhance privacy and security by preventing unwanted sharing of user content.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int CHROMEBOOK_ENABLED = PropertyGroupID.UX_SETTINGS_GROUP + 0x000D;

    /**
     * <b>Administrative Settings:</b> For devices managed by an organization,
     * administrative policies might require to restrict the user to connect to Android Auto.
     * <p>
     * Android Auto is the feature that allows the device to connect and interface with your car's infotainment system.
     * Android Auto provides a simplified, driver-friendly interface for accessing navigation, music, phone calls, messages, and other apps while driving.
     * <p>
     * So, if this parameter is enabled, Android Auto is disabled and the device will no longer be able for these synchronization and sharing features,
     * which can enhance privacy and security by preventing unwanted sharing of user content.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int ANDROID_AUTO_ENABLED = PropertyGroupID.UX_SETTINGS_GROUP + 0x000E;

    /**
     * <b>Administrative Settings:</b> For devices managed by an organization,
     * administrative policies might require to restrict the usage of Captive Portal.
     * <p>
     * Captive Portal is the feature that detects and manages network connections requiring user interaction,
     * such as logging in or accepting terms and conditions.
     * A captive portal is typically encountered in public Wi-Fi networks, like those in cafes, airports, or hotels,
     * where the user is redirected to a web page to enter credentials or agree to terms before accessing the internet.
     * <p>
     * So, according to the mode selected with this property, networks requiring this kind of authentication can be automatically disconnected,
     * or user could be or not be prompted to authenticate in order to have access to internet. 
     * <p>
     * The class of the property is {@link CaptivePortalPolicy}.
     * <p>
     * <b>Note on Captive Portal and Wi-Fi Settings:</b>
     * When the Captive Portal is set to {@link CaptivePortalPolicy#DISCONNECTED},
     * while the Wi-Fi module property {@link #WIFI_NO_INTERNET_EXPECTED} is configured to either
     * {@link WifiNoInternetExpected#RECONNECT_VERBOSE} or {@link WifiNoInternetExpected#RECONNECT_QUIET} a conflict arises.
     * In this scenario, the device attempts to auto-reconnect to a network that has no internet access,
     * leading to a repetitive cycle of "Connecting > ... > Checking for internet access > back to Connecting".
     * This behavior can be visually distracting to users, as the Wi-Fi icon keeps changing,
     * creating an unintended and somewhat humorous appearance.
     * <p>
     * To ensure coherent functionality, it is crucial that when the Captive Portal is set to {@link CaptivePortalPolicy#DISCONNECTED},
     * the {@link #WIFI_NO_INTERNET_EXPECTED} property is also set to {@link WifiNoInternetExpected#DONT_RECONNECT}.
     * This alignment prevents the device from continually trying to connect to a network
     * that is known to have no internet access, thus improving the user experience and
     * eliminating unnecessary distractions.
     */
    public final static int CAPTIVE_PORTAL_POLICY = PropertyGroupID.UX_SETTINGS_GROUP + 0x000F;

    /**
     * <b>Administrative Settings:</b> For devices managed by an organization,
     * administrative policies might require to disable the automatic synchronization of data.
     * <p>
     * Hotspot enabled refers to enable or disable wifi tethering.
     * <p>
     * When hotspot is enabled, the devices allows other devices to connect to its internet connection.
     * <p>
     * The user would still be able to access and control this configuration from the main Settings,
     * or dedicated tile in quick settings panel.
     * Therefore, this parameter can be use with {@link #HOTSPOT_SETTING_DIMMED} and {@link #QUICK_SETTINGS_TILES_HOTSPOT_HIDDEN},
     * to prevent the user to change the configuration of this feature.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int HOTSPOT_ENABLED = PropertyGroupID.UX_SETTINGS_GROUP + 0x0010;

    /**
     * <b>Administrative Settings:</b> For devices managed by an organization,
     * administrative policies might require to disable the automatic synchronization of data.
     * <p>
     * Battery LED enabled refers to enable or disable automatic battery LED control.
     * <p>
     * When battery LED is enabled, the devices automatically control the battery LED.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int BATTERY_LED_ENABLED = PropertyGroupID.UX_SETTINGS_GROUP + 0x0011;

    /**
     * <b>Administrative Settings:</b> For devices managed by an organization,
     * administrative policies might require to disable the emergency SOS call.
     * <p>
     * Emergency SOS refers to enable or disable that feature designed to help users quickly contact
     * emergency services and notify their emergency contacts in critical situations.<br>
     * This feature can be activated by pressing the power button multiple times in rapid succession
     * (usually five times).
     * It can be undesired, so IT admins could prefer to disable it.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int EMERGENCY_SOS_ENABLED = PropertyGroupID.UX_SETTINGS_GROUP + 0x0012;

    /**
     * <b>Administrative Settings:</b> For devices managed by an organization,
     * administrative policies might require to disable the open camera shortcut.
     * <p>
     * Quickly open camera enabled refers to enable or disable that feature allowing the users
     * to access the camera app swiftly.
     * This feature can be activated by double-pressing the power button.
     * It can be undesired, so IT admins could prefer to disable it.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int QUICKLY_OPEN_CAMERA_ENABLED = PropertyGroupID.UX_SETTINGS_GROUP + 0x0013;

    /**
     * <b>Administrative Settings:</b> For devices managed by an organization,
     * administrative policies might require to control the notification LED.
     * <p>
     * Notification LED enabled refers to enable or disable the LED for visual notifications.
     * The user would still be able to access and control this configuration from the main Settings.
     * When enabled, the LED blinks to alert the user of incoming notifications, missed calls, or other important events.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int NOTIFICATION_LED_ENABLED = PropertyGroupID.UX_SETTINGS_GROUP + 0x0014;
    /**
     * <b>Administrative Settings:</b> For devices managed by an organization,
     * administrative policies might require to prevent the user to interact with Google Assistant.
     * <p>
     * If this parameter is disabled, the long press action on the home button doesn't take any effect.
     * That means pressing and holding the home button will no longer activate the Google Assistant.
     * <p>
     * Administrators might want to disable this feature to avoid accidental triggers, save battery life,
     * or because they prefer to prevent the users to access to the associated service (like Google Assistant).
     * <p>
     * The user would still be able to access and control this configuration from the main Settings.
     * Therefore, this parameter can be use with {@link #LONG_PRESS_HOME_BUTTON_SETTING_DIMMED},
     * to prevent the user to change the configuration of this feature.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int LONG_PRESS_HOME_BUTTON_ENABLED = PropertyGroupID.UX_SETTINGS_GROUP + 0x0015;

    /**
     * <b>Administrative Settings:</b> For devices managed by an organization,
     * administrative policies might require to hide the notification dot.
     * <p>
     * The notification dot refers to the small dot that appears on app icons
     * when there are unread notifications for those apps.
     * <p>
     * When notification dots are enabled, a small dot will appear on the top right corner of an app's icon on the home screen,
     * as visual indicator that alerts for pending notifications.
     * <p>
     * When notification dots are disabled, these small dots will no longer appear on app icons,
     * meaning the user won't have this visual indication of unread notifications directly on the app icons.
     * <p>
     * The user would still be able to access and control this configuration from the main Settings.
     * Therefore, this parameter can be use with {@link #NOTIFICATION_DOTS_SETTING_DIMMED},
     * to prevent the user to change the configuration of this feature.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int NOTIFICATION_DOTS_ENABLED = PropertyGroupID.UX_SETTINGS_GROUP + 0x0016;

    /**
     * <b>Administrative Settings:</b> For devices managed by an organization,
     * administrative policies might require to disable keyboard combinations.
     * <p>
     * When physical keyboard shortcuts are enabled, the user can use keyboard combinations to perform various actions quickly.
     * This feature enhances productivity by allowing users to navigate and control their device more efficiently using familiar keyboard shortcuts.
     * <p>
     * When physical keyboard shortcuts are disabled, these combinations will not perform any actions on the device.
     * This might
     * <p>
     * The user would still be able to access and control this configuration from the main Settings.
     * Therefore, this parameter can be use with {@link #PHYSICAL_KEYBOARD_SHORTCUTS_SETTING_DIMMED},
     * to prevent the user to change the configuration of this feature.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int PHYSICAL_KEYBOARD_SHORTCUTS_ENABLED = PropertyGroupID.UX_SETTINGS_GROUP + 0x0017;

    /**
     * <b>Administrative Settings:</b> For devices managed by an organization,
     * administrative policies might require to disable the automatic synchronization of data.
     * <p>
     * Auto sync app data refers to enable or disable the automatic synchronization of data between the device and online accounts for various apps.
     * <p>
     * When auto sync is enabled, apps automatically sync data like emails, contacts, calendar events, and other app-specific information with their respective online services.
     * This ensures that the information on the device is up-to-date with the data on the server.
     * <p>
     * When auto sync is disabled, apps will not automatically sync data in the background.
     * <p>
     * The user would still be able to access and control this configuration from the main Settings.
     * Therefore, this parameter can be use with {@link #AUTO_SYNC_APP_DATA_SETTING_DIMMED},
     * to prevent the user to change the configuration of this feature.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int AUTO_SYNC_APP_DATA_ENABLED = PropertyGroupID.UX_SETTINGS_GROUP + 0x0018;

    /**
     * This property allows to define an app to be launched on the main screen (device display)
     * when the device is inserted into a cradle.
     * <p>
     * The value of the property should be a string in the format `package_name/activity_name`,
     * where `package_name` is the app to be launched and `activity_name` is the name of the specific app activity to be launched.
     * For example if CRADLE_APP_ON_INSERT="com.datalogic.scan/.MainActivity", the `MainActivity` of `Scan Demo` app will be
     * launched upon insertion event.
     * <p>
     * The app will be displayed in the main screen (device display)
     * Note:
     * This property complements {@link #CRADLE_APP_ON_EXTRACT} which launches an app upon extraction event.
     * It behaves similarly to {@link #DESKTOP_MODE_APP_EXTERNAL_SCREEN_ON_INSERT} which is specific to `Desktop Mode`.
     * <p>
     * The class of the property is {@link TextProperty}.
     */
    public final static int CRADLE_APP_ON_INSERT = PropertyGroupID.UX_SETTINGS_GROUP + 0x001A;

    /**
     * This property allows to define an app to be launched on the main screen (device display)
     * when the device is extracted from a cradle.
     * <p>
     * The value of the property should be a string in the format `package_name/activity_name`,
     * where `package_name` is the app to be launched and `activity_name` is the name of the specific app activity to be launched.
     * For example if CRADLE_APP_ON_EXTRACT="com.datalogic.scan/.MainActivity", the `MainActivity` of `Scan Demo` app will be
     * launched upon insertion event.
     * <p>
     * The app will be displayed in the main screen
     * Note:
     * This property complements {@link #CRADLE_APP_ON_INSERT} which launches an app upon insertion event.
     * It behaves similarly to {@link #DESKTOP_MODE_APP_EXTERNAL_SCREEN_ON_INSERT} which is specific to `Desktop Mode`.
     * <p>
     * The class of the property is {@link TextProperty}.
     */
    public final static int CRADLE_APP_ON_EXTRACT = PropertyGroupID.UX_SETTINGS_GROUP + 0x001B;

    /**
     * This property allows to define an app to be launched on the external screen (secondary display)
     * when the device is inserted in a Docking Station.
     * <p>
     * The value of the property should be a string in the format `package_name/activity_name`,
     * where `package_name` is the app to be launched and `activity_name` is the name of the specific app activity to be launched.
     * For example if DESKTOP_MODE_APP_EXTERNAL_SCREEN_ON_INSERT="com.datalogic.scan/.MainActivity", the `MainActivity` of `Scan Demo` app will be
     * launched upon insertion event.
     * <p>
     * The app will be displayed on the external screen only and only if {@link #DESKTOP_MODE_POLICY}
     * is set to {@link DesktopModePolicy#DUAL_SCREEN}. Otherwise, the external screen will show
     * the app set by {@link #CRADLE_APP_ON_INSERT} because the external display is mirroring the
     * main display.
     * Note:
     * It behaves similarly to {@link #CRADLE_APP_ON_INSERT} and {@link #CRADLE_APP_ON_EXTRACT} which are
     * not specific to `Desktop Mode' but are related only to insertion and extraction events.
     * <p>
     * The class of the property is {@link TextProperty}.
     */
    public final static int DESKTOP_MODE_APP_EXTERNAL_SCREEN_ON_INSERT = PropertyGroupID.UX_SETTINGS_GROUP + 0x001C;

    //
    // Developer Options definitions
    //

    /**
      * This parameter enables/disables the debug mode, over USB, when USB is connected.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int USB_DEBUG_ENABLE = PropertyGroupID.DEVELOPER_OPTIONS_GROUP + 0x0001;

    /**
      * This parameter sets the size of the log.
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link LoggerBufferSize}.
      */
    public final static int LOGGER_BUFFER_SIZE = PropertyGroupID.DEVELOPER_OPTIONS_GROUP + 0x0002;

    /**
      * This parameter enables/disables the debug mode, over Wi-Fi, when Wi-Fi is connected.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WIFI_DEBUG_ENABLE = PropertyGroupID.DEVELOPER_OPTIONS_GROUP + 0x0003;

    //
    // Display setting definitions
    //

    /**
     * This parameter sets the Brightness level of the screen. The allowed values are between 0 and 255.
      * <p>
      * The class of the property is {@link NumericProperty}.
      */
    public final static int SCREEN_BRIGHTNESS = PropertyGroupID.DISPLAY_GROUP + 0x0001;

   //
   // Keyboard definitions
   //

   /**
    * This parameter enables the Left trigger.
    * <p>
    * The class of the property is {@link BooleanProperty}.
    */
   public final static int KEYBOARD_LEFT_TRIGGER = PropertyGroupID.KEYBOARD_GROUP + 0x0001;

    /**
     * This parameter enables the Right trigger.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int KEYBOARD_RIGHT_TRIGGER = PropertyGroupID.KEYBOARD_GROUP + 0x0002;

    /**
     * This parameter enables the Front trigger.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int KEYBOARD_FRONT_TRIGGER = PropertyGroupID.KEYBOARD_GROUP + 0x0003;

    /**
     * This parameter enables the Pistol trigger.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int KEYBOARD_PISTOL_TRIGGER = PropertyGroupID.KEYBOARD_GROUP + 0x0004;

    /**
     * This parameter enables the Autoscan trigger.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int KEYBOARD_AUTOSCAN_TRIGGER = PropertyGroupID.KEYBOARD_GROUP + 0x0005;

    /**
     * This parameter sets the Autoscan trigger range.
     * <p>
     * The class of the property is {@link EnumProperty}.
     * The allowed values are defined by enum {@link AutoScanTriggerRange}.
     */
    public final static int KEYBOARD_AUTOSCAN_TRIGGER_RANGE = PropertyGroupID.KEYBOARD_GROUP + 0x0006;

    /**
     * This parameter enables the Motion trigger.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int KEYBOARD_MOTION_TRIGGER = PropertyGroupID.KEYBOARD_GROUP + 0x0007;

    /**
     * This parameter defines the sensitivity for motion detection.
     * <p>
     * The class of the property is {@link EnumProperty}.
     * The allowed values are defined by enum {@link MotionTriggerSensitivity}.
     */
    public final static int KEYBOARD_MOTION_TRIGGER_SENSITIVITY = PropertyGroupID.KEYBOARD_GROUP + 0x0008;

    /**
     * This parameter enables or disables the vibration when a motion is detected.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int KEYBOARD_MOTION_TRIGGER_VIBRATION = PropertyGroupID.KEYBOARD_GROUP + 0x0009;

    /**
     * This parameter enables or disables the push to talk button
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int KEYBOARD_PTT_TRIGGER = PropertyGroupID.KEYBOARD_GROUP + 0x000F;

    /**
     * This parameter locks or unlocks the input from keyboard and physical buttons.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int KEYBOARD_LOCK_INPUT = PropertyGroupID.KEYBOARD_GROUP + 0x000A;

    /**
     * This parameter enables or disables the keyboard backlight control.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int KEYBOARD_BACKLIGHT = PropertyGroupID.KEYBOARD_GROUP + 0x000B;

    /**
     * This parameter sets the keyboard backlight brightness.
     * This is parameter is enabled only when {@link #KEYBOARD_BACKLIGHT} is enabled.
     * <p>
     * The class of the property is {@link NumericProperty}.
     */
    public final static int KEYBOARD_BACKLIGHT_BRIGHTNESS = PropertyGroupID.KEYBOARD_GROUP + 0x000C;

    /**
     * This parameter sets the keyboard backlight inactivity timeout. In case of inactivity, the keyboard backlight will turn off after this amount of time.
     * This parameter is enabled only when {@link #KEYBOARD_BACKLIGHT} is enabled.
     * <p>
     * The class of the property is {@link NumericProperty}.
     */
    public final static int KEYBOARD_BACKLIGHT_TIMEOUT = PropertyGroupID.KEYBOARD_GROUP + 0x000D;

    /**
     * This parameter sets the keyboard multitap delay used to define after how much time from the first multitap key press the associated character will be submitted to the UI.
     * <p>
     * The class of the property is {@link NumericProperty}.
     */
    public final static int KEYBOARD_MULTITAP_DELAY = PropertyGroupID.KEYBOARD_GROUP + 0x000E;

    /**
     * This parameter contains the list of supported Walkie-Talkie applications can be used with the Push-to-Talk button.
     * <p>
     * The class of the property is {@link BlobProperty}.
     * The specific implementation for this type of blob is {@link SupportedWtApplications}.
     */
    public final static int KEYBOARD_PTT_SUPPORTED_WT_APPLICATIONS = PropertyGroupID.KEYBOARD_GROUP + 0x0010;

    /**
     * This parameter sets the package name of the Walkie-Talkie application to be used with the Push-to-Talk button.
     * <p>
     * The class of the property is {@link TextProperty}.
     * <p>
     * Set the input value to "none" not to associate any Walkie-Talkie App with the PTT button; 
     * Otherwise set the input value with one of the package names retrieved from the list of supported Walkie-Talkie Apps 
     * through the {@link #KEYBOARD_PTT_SUPPORTED_WT_APPLICATIONS} property.
     */
    public final static int KEYBOARD_PTT_ACTIVE_WT_PACKAGE = PropertyGroupID.KEYBOARD_GROUP + 0x0011;

    /**
     * This parameter is used to enable or disable the Push-to-Talk notification.
     * <p>
     * The class of the property is {@link BooleanProperty}
     */
    public final static int KEYBOARD_PTT_NOTIFICATION_ENABLED = PropertyGroupID.KEYBOARD_GROUP + 0x0012;

    /**
     * This parameter is used to enable or disable the viability of PUSH_TO_TALK functionality while the KeyGuard is on.
     * <p>
     * The class of the property is {@link BooleanProperty}
     */
    public final static int KEYBOARD_PTT_BYPASS_KEYGUARD_ENABLED = PropertyGroupID.KEYBOARD_GROUP + 0x0013;

    /**
     * This parameter defines the behaviour of Left Trigger button when the device is in suspend mode.
     * This takes effect only if the Left Trigger is enabled ({@link #KEYBOARD_LEFT_TRIGGER})
     * and it has been configured as wakeup source ({@link #POWER_WAKEUP_LEFT_TRIGGER}).
     * <p>
     * If this property is disabled, when the Left Trigger button is pressed in suspend mode,
     * then only the wakeup event will be triggered for waking the device up from the suspend mode.
     * So, in order to trigger the functional action (e.g. decoding as default),
     * the user shall press the button again after the device has been resumed from the suspend mode.
     * <p>
     * If this property is enabled, when the Left Trigger button is pressed in suspend mode,
     * then both the wakeup event and the action event will be triggered
     * for waking the device up from the suspend mode and for executing the action.
     * So, in order to trigger the functional action (e.g. decoding as default),
     * the user is required to press the button just once, because it will wake the device up
     * from the suspend mode and it will also perform the action.
     * <p>
     * <b>Disclaimer</b>: if the device is locked by keyguard, then the action will be performed
     * only if it can be executed in accordance with the current status of keyguard.
     * <p>
     * For example Push To Talk action can be executed or discarded with the keyguard active
     * in accordance with the property ({@link #KEYBOARD_PTT_BYPASS_KEYGUARD_ENABLED}).
     * While decoding action is always discarded with the keyguard active.
     * <p>
     * The default value is disabled.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int KEYBOARD_LEFT_TRIGGER_ACTION_IN_SUSPEND = PropertyGroupID.KEYBOARD_GROUP + 0x0014;

    /**
     * This parameter defines the behaviour of Right Trigger button when the device is in suspend mode.
     * This takes effect only if the Right Trigger is enabled ({@link #KEYBOARD_RIGHT_TRIGGER})
     * and it has been configured as wakeup source ({@link #POWER_WAKEUP_RIGHT_TRIGGER}).
     * <p>
     * If this property is disabled, when the Right Trigger button is pressed in suspend mode,
     * then only the wakeup event will be triggered for waking the device up from the suspend mode.
     * So, in order to trigger the functional action (e.g. decoding as default),
     * the user shall press the button again after the device has been resumed from the suspend mode.
     * <p>
     * If this property is enabled, when the Right Trigger button is pressed in suspend mode,
     * then both the wakeup event and the action event will be triggered
     * for waking the device up from the suspend mode and for executing the action.
     * So, in order to trigger the functional action (e.g. decoding as default),
     * the user is required to press the button just once, because it will wake the device up
     * from the suspend mode and it will also perform the action.
     * <p>
     * <b>Disclaimer</b>: if the device is locked by keyguard, then the action will be performed
     * only if it can be executed in accordance with the current status of keyguard.
     * <p>
     * For example Push To Talk action can be executed or discarded with the keyguard active
     * in accordance with the property ({@link #KEYBOARD_PTT_BYPASS_KEYGUARD_ENABLED}).
     * While decoding action is always discarded with the keyguard active.
     * <p>
     * The default value is disabled.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int KEYBOARD_RIGHT_TRIGGER_ACTION_IN_SUSPEND = PropertyGroupID.KEYBOARD_GROUP + 0x0015;

    /**
     * This parameter defines the behaviour of Pistol Trigger button when the device is in suspend mode.
     * This takes effect only if the Pistol Trigger is enabled ({@link #KEYBOARD_PISTOL_TRIGGER})
     * and it has been configured as wakeup source ({@link #POWER_WAKEUP_PISTOL_TRIGGER}).
     * <p>
     * If this property is disabled, when the Pistol Trigger button is pressed in suspend mode,
     * then only the wakeup event will be triggered for waking the device up from the suspend mode.
     * So, in order to trigger the functional action (e.g. decoding as default),
     * the user shall press the button again after the device has been resumed from the suspend mode.
     * <p>
     * If this property is enabled, when the Pistol Trigger button is pressed in suspend mode,
     * then both the wakeup event and the action event will be triggered
     * for waking the device up from the suspend mode and for executing the action.
     * So, in order to trigger the functional action (e.g. decoding as default),
     * the user is required to press the button just once, because it will wake the device up
     * from the suspend mode and it will also perform the action.
     * <p>
     * <b>Disclaimer</b>: if the device is locked by keyguard, then the action will be performed
     * only if it can be executed in accordance with the current status of keyguard.
     * <p>
     * For example Push To Talk action can be executed or discarded with the keyguard active
     * in accordance with the property ({@link #KEYBOARD_PTT_BYPASS_KEYGUARD_ENABLED}).
     * While decoding action is always discarded with the keyguard active.
     * <p>
     * The default value is disabled.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int KEYBOARD_PISTOL_TRIGGER_ACTION_IN_SUSPEND = PropertyGroupID.KEYBOARD_GROUP + 0x0016;

    /**
     * This parameter defines the behaviour of Front Trigger button when the device is in suspend mode.
     * This takes effect only if the Front Trigger is enabled ({@link #KEYBOARD_FRONT_TRIGGER})
     * and it has been configured as wakeup source ({@link #POWER_WAKEUP_FRONT_TRIGGER}).
     * <p>
     * If this property is disabled, when the Front Trigger button is pressed in suspend mode,
     * then only the wakeup event will be triggered for waking the device up from the suspend mode.
     * So, in order to trigger the functional action (e.g. decoding as default),
     * the user shall press the button again after the device has been resumed from the suspend mode.
     * <p>
     * If this property is enabled, when the Front Trigger button is pressed in suspend mode,
     * then both the wakeup event and the action event will be triggered
     * for waking the device up from the suspend mode and for executing the action.
     * So, in order to trigger the functional action (e.g. decoding as default),
     * the user is required to press the button just once, because it will wake the device up
     * from the suspend mode and it will also perform the action.
     * <p>
     * <b>Disclaimer</b>: if the device is locked by keyguard, then the action will be performed
     * only if it can be executed in accordance with the current status of keyguard.
     * <p>
     * For example Push To Talk action can be executed or discarded with the keyguard active
     * in accordance with the property ({@link #KEYBOARD_PTT_BYPASS_KEYGUARD_ENABLED}).
     * While decoding action is always discarded with the keyguard active.
     * <p>
     * The default value is disabled.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int KEYBOARD_FRONT_TRIGGER_ACTION_IN_SUSPEND = PropertyGroupID.KEYBOARD_GROUP + 0x0017;

    /**
     * This parameter defines the behaviour of PTT Trigger button when the device is in suspend mode.
     * This takes effect only if the PTT Trigger is enabled ({@link #KEYBOARD_PTT_TRIGGER})
     * and it has been configured as wakeup source ({@link #POWER_WAKEUP_PTT_TRIGGER}).
     * <p>
     * If this property is disabled, when the PTT Trigger button is pressed in suspend mode,
     * then only the wakeup event will be triggered for waking the device up from the suspend mode.
     * So, in order to trigger the functional action (e.g. decoding as default),
     * the user shall press the button again after the device has been resumed from the suspend mode.
     * <p>
     * If this property is enabled, when the PTT Trigger button is pressed in suspend mode,
     * then both the wakeup event and the action event will be triggered
     * for waking the device up from the suspend mode and for executing the action.
     * So, in order to trigger the functional action (e.g. decoding as default),
     * the user is required to press the button just once, because it will wake the device up
     * from the suspend mode and it will also perform the action.
     * <p>
     * <b>Disclaimer</b>: if the device is locked by keyguard, then the action will be performed
     * only if it can be executed in accordance with the current status of keyguard.
     * <p>
     * For example Push To Talk action can be executed or discarded with the keyguard active
     * in accordance with the property ({@link #KEYBOARD_PTT_BYPASS_KEYGUARD_ENABLED}).
     * While decoding action is always discarded with the keyguard active.
     * <p>
     * The default value is disabled.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int KEYBOARD_PTT_TRIGGER_ACTION_IN_SUSPEND = PropertyGroupID.KEYBOARD_GROUP + 0x0018;

    /**
     * <b>Administrative Settings:</b> For devices managed by an organization,
     * administrative policies might require to configure the default layout of
     * an external physical keyboard in combination with {@link #DESKTOP_MODE_POLICY}.
     * <p>
     * This parameter allows to configure the layout for customizing settings
     * related to an external physical keyboard connected to the device.
     * When this settings is set to CUSTOM, then the value of property
     * {@link #PHYSICAL_KEYBOARD_PROFILE} shall be used for defining the layout.
     * <p>
     * The class of the property is {@link PhysicalKeyboardPolicy}.
     */
    public final static int PHYSICAL_KEYBOARD_POLICY = PropertyGroupID.KEYBOARD_GROUP + 0x0019;

    /**
     * <b>Administrative Settings:</b> For devices managed by an organization,
     * administrative policies might require to configure the default layout
     * of an external physical keyboard in combination with {@link #DESKTOP_MODE_POLICY}.
     * <p>
     * This parameter allows to configure the layout for customizing settings
     * related to an external physical keyboard connected to the device.
     * This configuration takes effect only if the value of property
     * {@link #PHYSICAL_KEYBOARD_POLICY} is set to {@link PhysicalKeyboardPolicy#CUSTOM}.
     * <p>
     * The class of the property is {@link TextProperty}.
     * <p>
     * This property can be set with a String defining the keyboard layout identifier,
     * keyboard layout short identifier or the locale:
     * <ul>
     * <li><b>keyboard layout identifier</b>: it is the physical keyboard layout identifier
     * defined by "[package name]/[receiver name]/keyboard_layout_xxx".<br>
     * For example:
     *     <ul>
     *        <li>com.android.inputdevices/com.android.inputdevices.InputDeviceReceiver/keyboard_layout_polish
     *        corresponds to Polish keyboard layout provided by Android.</li>
     *     </ul>
     * </li>
     * <li><b>keyboard layout short identifier</b>: it is the physical keyboard layout identifier
     * defined by "keyboard_layout_xxx". This is a shorter version of keyboard layout identifier,
     * obtained by omitting the "[package name]/[receiver name]/" prefix.
     * Since, an App could define a custom layout using the same short identifier keyboard_layout_xxx
     * already used by a pre-loaded layout, when the user sets this property using that value,
     * the pre-loaded keyboard layout will be used instead of the custom one.
     * So, in case of custom layouts, it is required to configure this property using the keyboard
     * layout identifier, instead of the shorter definition.<br>
     * For example:
     *     <ul>
     *        <li>keyboard_layout_german corresponds to German keyboard layout.</li>
     *        <li>keyboard_layout_french corresponds to French-France keyboard layout.</li>
     *        <li>keyboard_layout_french_ca corresponds to French-Canada keyboard layout.</li>
     *        <li>keyboard_layout_italian corresponds to Italian keyboard layout.</li>
     *     </ul>
     * </li>
     * <li></><b>locale</b>: it is the locale identifier defined by
     * [language identifier with two lowercase letters]-[country code identifier with uppercase two letters],
     * where the country code is optional and it depends on the language.<br>
     * For example:
     *      <ul>
     *         <li>"de" or "de-DE" corresponds to German language.</li>
     *         <li>"de-CH" corresponds to German language in Switzerland.</li>
     *         <li>"fr" or "fr-FR" corresponds to French language in France.</li>
     *         <li>"fr-CA" corresponds to French keyboard layout in Canada.</li>
     *         <li>"it" corresponds to Italian language.</li>
     *      </ul><br>
     * Locale is a compact representation, but it does not always match uniquely with a keyboard layout.
     * In particular:
     *     <ul>
     *         <li> not all the Locales have a corresponding layout (e.g chinese). In this case, when the user
     * sets this property with one of those Locales, an error will be returned.</li>
     *         <li>not all the Locales have only one corresponding layout (e.g "en-US"). In this case, setting this property
     * when the user sets this property with one of those Locales, the most common layout for that
     * Locale will be chosen.</li>
     *     </ul>
     * </li>
     * </ul>
     * <p>
     * <p>
     * The following command can be used to retrieve the identifier for all the pre-loaded
     * and custom keyboard layouts available on the device:
     * <pre>adb shell dumpsys activity service com.datalogic.extension.uxsettings/.MainService</pre>
     * <p>
     * Below the list of pre-loaded physical keyboard layouts:
     * <ul>
     * <li> keyboard_layout_english_uk </li>
     * <li> keyboard_layout_english_us </li>
     * <li> keyboard_layout_english_us_intl </li>
     * <li> keyboard_layout_english_us_colemak </li>
     * <li> keyboard_layout_english_us_dvorak </li>
     * <li> keyboard_layout_english_us_workman </li>
     * <li> keyboard_layout_german </li>
     * <li> keyboard_layout_french </li>
     * <li> keyboard_layout_french_ca </li>
     * <li> keyboard_layout_russian </li>
     * <li> keyboard_layout_russian_mac </li>
     * <li> keyboard_layout_spanish </li>
     * <li> keyboard_layout_swiss_french </li>
     * <li> keyboard_layout_swiss_german </li>
     * <li> keyboard_layout_belgian </li>
     * <li> keyboard_layout_bulgarian </li>
     * <li> keyboard_layout_bulgarian_phonetic </li>
     * <li> keyboard_layout_italian </li>
     * <li> keyboard_layout_danish </li>
     * <li> keyboard_layout_norwegian </li>
     * <li> keyboard_layout_swedish </li>
     * <li> keyboard_layout_finnish </li>
     * <li> keyboard_layout_croatian </li>
     * <li> keyboard_layout_czech </li>
     * <li> keyboard_layout_czech_qwerty </li>
     * <li> keyboard_layout_estonian </li>
     * <li> keyboard_layout_hungarian </li>
     * <li> keyboard_layout_icelandic </li>
     * <li> keyboard_layout_brazilian </li>
     * <li> keyboard_layout_portuguese </li>
     * <li> keyboard_layout_slovak </li>
     * <li> keyboard_layout_slovenian </li>
     * <li> keyboard_layout_turkish </li>
     * <li> keyboard_layout_turkish_f </li
     * <li> keyboard_layout_ukrainian </li>
     * <li> keyboard_layout_arabic </li>
     * <li> keyboard_layout_greek </li>
     * <li> keyboard_layout_hebrew </li>
     * <li> keyboard_layout_lithuanian </li>
     * <li> keyboard_layout_spanish_latin </li>
     * <li> keyboard_layout_latvian </li>
     * <li> keyboard_layout_persian </li>
     * <li> keyboard_layout_azerbaijani </li>
     * <li> keyboard_layout_polish </li>
     * <li> keyboard_layout_belarusian </li>
     * <li> keyboard_layout_mongolian </li>
     * <li> keyboard_layout_georgian </li>
     * <li> keyboard_layout_thai_kedmanee </li>
     * <li> keyboard_layout_thai_pattachote </li>
     * <li> keyboard_layout_romanian </li>
     * <li> keyboard_layout_romanian_qwertz </li>
     * <li> keyboard_layout_moldovan </li>
     * <li> keyboard_layout_moldovan_qwertz </li>
     * <li> keyboard_layout_serbian_cyrillic </li>
     * <li> keyboard_layout_serbian_latin </li>
     * <li> keyboard_layout_montenegrin_cyrillic </li>
     * <li> keyboard_layout_montenegrin_latin </li>
     * <li> keyboard_layout_english_india </li>
     * <li> keyboard_layout_hindi_inscript </li>
     * <li> keyboard_layout_japanese109 </li>
     * </ul>
     */
    public final static int PHYSICAL_KEYBOARD_PROFILE = PropertyGroupID.KEYBOARD_GROUP + 0x001A;

    /**
     * <b>Administrative Settings:</b> For devices managed by an organization,
     * administrative policies might require to configure the default virtual keyboard.
     * <p>
     * A virtual keyboard is a software interface that allows users to input text,
     * for example via the device's touchscreen. It appears on the display whenever text input is needed,
     * such as when typing a message, filling out a form, or entering a password.
     * <p>
     * This parameter allows to configure the desired virtual keyboard among the installed ones.
     * It shall be set as a string representing a valid input method ID.
     * <p>
     * If the input method ID refers to an input method installed on the device and currently enabled,
     * then this input method will be selected.
     * If the input method ID refers to an input method installed on the device, but currently disabled,
     * then this input method will be both enabled and selected.
     * An empty string is accepted as a valid input method,
     * this means that no input method will be selected for the user.
     * <p>
     * Setting a malformed input method ID or an input method not installed yet on the device,
     * an error is returned and the value of this property will not be changed.
     * <p>
     * <b>Input method ID</b>: Android defines the input method ID as a string in the form
     * "package_name/class_name", composed by the package name of the virtual keyboard application
     * and the class name of the main input method service within the keyboard application.
     * <p>
     * E.g. Gboard input method ID is defined as "com.google.android.inputmethod.latin/com.android.inputmethod.latin.LatinIME", where:
     * <ul>
     * <li>com.google.android.inputmethod.latin: the package name is a unique identifier for the App,
     * and in this case, it corresponds to the Latin IME (Input Method Editor) provided by Google.
     * This package name is used by the Android system to recognize and manage the keyboard App.</li>
     * <li>com.android.inputmethod.latin.LatinIME: this is the fully qualified class name of
     * the main input method service within the keyboard application.
     * It specifies the particular class within the package that provides the actual functionality of the keyboard.</li>
     * </ul>
     * <p>
     * In summary, the first part identifies the App package, and the second part specifies
     * the class within that package that implements the keyboard service.
     * <p>
     * <b>Disclaimer</b>: the fully qualified class name is used only if the namespace does not correspond to the package name.
     * Otherwise, the short qualified class name is used instead. For example.:
     * <ul>
     * <li>Gboard uses the full class name, since package name and class namespace do not correspond:
     * com.google.android.inputmethod.latin/com.android.inputmethod.latin.LatinIME</li>
     * <li>Labankey uses the short class name, since package name and class namespace corresponds:
     * com.vng.inputmethod.labankey/.LatinIME</li>
     * </ul>
     * <p>
     * <b>How to list the installed input methods and their IDs</b>: use the command "adb shell ime list -a -s"
     * <p>
     * The class of the property is {@link TextProperty}.
     */
    public final static int VIRTUAL_KEYBOARD_PROFILE = PropertyGroupID.KEYBOARD_GROUP + 0x001B;

    /**
     * <b>Administrative Settings:</b> For devices managed by an organization,
     * administrative policies might require to restrict the user to access to the Gboard,
     * as default keyboard provided by Android.
     * <p>
     * If this property is disabled, it prevents the Gboard from being available for text input.
     * Disabling Gboard means that this keyboard will no longer appear when the user needs to input text.
     * <p>
     * This property is available only for Android GMS version.
     * <p>
     * Gboard is the Google's default UI keyboard distributed with GMS version of Android,
     * offering seamless integration with Google services, predictive text, voice typing,
     * and multilingual support. The Gboard is enable by default and it is also the default option
     * provided to the user for GMS version of Android.
     * <p>
     * The keyboard shown to the user by default can be defined though {@link #VIRTUAL_KEYBOARD_PROFILE}
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int VIRTUAL_KEYBOARD_GBOARD_ENABLED = PropertyGroupID.KEYBOARD_GROUP + 0x001C;

    /**
     * <b>Administrative Settings:</b> For devices managed by an organization,
     * administrative policies might require to restrict the user to access to the Voice Typing,
     * as default keyboard provided by Android.
     * <p>
     * If this property is disabled, it prevents the Voice Typing from being available for text input.
     * Disabling Voice Typing means that this keyboard will no longer appear when the user needs to input text.
     * <p>
     * This property is available only for Android GMS version.
     * <p>
     * Gboard is a Google's default virtual keyboard distributed with GMS version of Android,
     * offering seamless integration with Google services, predictive text, voice typing,
     * and multilingual support. The Gboard is enable by default and it is also the default option
     * provided to the user.
     * Voice Typing is a Google's built-in voice recognition feature in Android that allows users
     * to input text by speaking. It enables hands-free text entry through accurate speech-to-text conversion.
     * The Voice Typing is enable by default.
     * <p>
     * The keyboard shown to the user by default can be defined though {@link #VIRTUAL_KEYBOARD_PROFILE}
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int VIRTUAL_KEYBOARD_VOICE_TYPING_ENABLED = PropertyGroupID.KEYBOARD_GROUP + 0x001D;

    /**
     * <b>Administrative Settings:</b> For devices managed by an organization,
     * administrative policies might require to restrict the user to access to the Android Keyboard,
     * as default keyboard provided by Android.
     * <p>
     * If this property is disabled, it prevents the Android Keyboard from being available for text input.
     * Disabling Android Keyboard means that this keyboard will no longer appear when the user needs to input text.
     * <p>
     * This property is available only for Android AOSP version.
     * <p>
     * Android Keyboard is the Google's default UI keyboard distributed with AOSP versions of Android,
     * providing basic text input functionality. It includes predictive text, auto-correction,
     * and support for multiple languages, but lacks the advanced features of Gboard.
     * The Android Keyboard is enable by default and it is also the default option
     * provided to the user for AOSP version of Android.
     * <p>
     * The keyboard shown to the user by default can be defined though {@link #VIRTUAL_KEYBOARD_PROFILE}
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int VIRTUAL_KEYBOARD_ANDROID_ENABLED = PropertyGroupID.KEYBOARD_GROUP + 0x001E;

    /**
     * <b>Administrative Settings:</b> For devices managed by an organization,
     * administrative policies might require to enable or disable the custom virtual keyboards
     * which could be installed in addition to the ones provided by default.
     * <p>
     * This parameter is a list containing the input method editor IDs related to the
     * custom virtual keyboards to be enabled.
     * It allows to enable one or multiple custom virtual keyboards by adding them to the list,
     * or to disable them by removing from the list.
     * <p>
     * It is not required that the custom virtual keyboards added to the list have been already installed on the device.
     * In that case, if a custom virtual keyboard is added to this list, but it has not been installed yet,
     * the configuration is accepted. When that custom virtual keyboard will be installed later,
     * it will be enabled or disabled accordingly to its presence into this list.
     * <p>
     * Coherently, when a custom virtual keyboard will be uninstalled, this property will not change.
     * That ID is kept in the list, in order to restore the required configuration
     * when that custom virtual keyboard will be installed again in the future.
     * <p>
     * This property is intended for creating a configuration of custom virtual keyboards.
     * In order to enabled or disable the virtual keyboards provided by default,
     * the following properties shall be used instead:
     * <ul>
     *     <li>Gboard with {@link #VIRTUAL_KEYBOARD_GBOARD_ENABLED}</li>
     *     <li>Voice Typing with {@link #VIRTUAL_KEYBOARD_VOICE_TYPING_ENABLED}</li>
     *     <li>Android keyboard with {@link #VIRTUAL_KEYBOARD_ANDROID_ENABLED}</li>
     * </ul>
     * <b></b>
     * <p>
     * The class of the property is {@link BlobProperty}.
     * The specific implementation for this type of blob is {@link StringSetBlob}.
     * <p>
     * <b>Input method editor ID</b>: Android defines a input method editor ID as a string in the form
     * "package_name/class_name", composed by the package name of the virtual keyboard application
     * and the class name of the main input method service within the keyboard application.
     * For a comprehensive definition of the structure of virtual keyboard ID and some examples,
     * refers to the details provided in the description of {@link #VIRTUAL_KEYBOARD_PROFILE}.
     * <p>
     * Custom virtual keyboards are usually distributed as APKs. In that case, the custom virtual keyboard
     * can be installed on or uninstalled from the device as any other App.
     * <p>
     * The link to the <a href=https://developer.android.com/reference/android/view/inputmethod/InputMethodManager>InputMethodManager</a>
     * at the Google's documentation can be helpful to correctly interact with the Input Methods and
     * to retrieve the details related to the Input Methods.
     * <p>
     * The list of virtual keyboards currently installed on the device can be retrieved as shown by
     * the example below:
     * <pre>
     * InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService(Context.INPUT_METHOD_SERVICE);
     * List<InputMethodInfo> installedIMEs = inputMethodManager.getInputMethodList();
     * </pre>
     * In alternative, the following command retrieves the list of input method editor IDs
     * currently installed on the device:
     * <pre>adb shell ime list -a -s</pre>
     * <p>
     * The list of virtual keyboards currently enabled on the device can be retrieved as shown by
     * the example below:
     * <pre>
     * InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService(Context.INPUT_METHOD_SERVICE);
     * List<InputMethodInfo> enabledIMEs = inputMethodManager.getEnabledInputMethodList();
     * </pre>
     * In alternative, the following command retrieves the list of input method IDs
     * currently enabled on the device:
     * <pre>adb shell ime list -s</pre>
     * In order to enable or disable desired virtual keyboards, the following commands provide
     * an alternative to {@link #VIRTUAL_KEYBOARD_GBOARD_ENABLED},
     * {@link #VIRTUAL_KEYBOARD_VOICE_TYPING_ENABLED}, {@link #VIRTUAL_KEYBOARD_ANDROID_ENABLED},
     * {@link #VIRTUAL_KEYBOARDS_CUSTOM_ENABLED}:
     * <pre>adb shell ime enable [input method id]</pre>
     * or
     * <pre>adb shell ime disable [input method id]</pre>
     * <p>
     * But, as mention above, the property {@link #VIRTUAL_KEYBOARDS_CUSTOM_ENABLED} can be used also
     * to enable virtual keyboards not yet installed on the device, while the Android methods allow
     * to enable virtual keyboard which are already installed on the device.
     * <p>
     * Finally, in order to select the virtual keyboard which should be displayed to the user,
     * refer to property {@link #VIRTUAL_KEYBOARD_PROFILE}.
     */
    public final static int VIRTUAL_KEYBOARDS_CUSTOM_ENABLED = PropertyGroupID.KEYBOARD_GROUP + 0x001F;

    //
    // Device Info definitions
    //

    /**
     * This parameter is the Device Name base part. The whole Device Name is obtained adding the suffix specified by {@link #DEVICE_NAME_SUFFIX}.
     * The set to an empty String is refused if {@link #DEVICE_NAME_SUFFIX} has value {@link DeviceNameSuffix#NONE}.
     * <p>
     * The class of the property is {@link TextProperty}.
     */
    public final static int DEVICE_NAME_BASE = PropertyGroupID.DEVICE_INFO_GROUP + 0x0001;
    /**
     *This parameter sets the device name suffix.
     * The set to value {@link DeviceNameSuffix#NONE} is refused if {@link #DEVICE_NAME_BASE} is an empty String.
     * <p>
     * The class of the property is {@link EnumProperty}.
     * The allowed values are defined by enum {@link DeviceNameSuffix}.
     */
    public final static int DEVICE_NAME_SUFFIX = PropertyGroupID.DEVICE_INFO_GROUP + 0x0002;

    //
    // Bluetooth definitions
    //

    /**
     * This parameter enables/disables bluetooth discoverability.
     * <p>
     * When this property is true, the device will always be visible from any other devices
     * that are performing bluetooth discovery.
     * When this property is false, the device will not be visible to the other devices
     * that are performing bluetooth discovery.
     * This property affects only the discovery process, so also with the property set to false,
     * the device will still be reachable from all of the other devices already paired.
     * This means that when the discoverability is set to false,
     * even if the whitelisting for silently pairing Bluetooth devices has been configured
     * through the properties {@link #BT_SILENT_PAIRING_WHITELISTING_ENABLE} and {@link #BT_SILENT_PAIRING_WHITELISTING},
     * a whitelisted bluetooth device will not be able to pair and connect to the device,
     * because the device cannot be discovered via Bluetooth.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int BT_DISCOVERABILITY = PropertyGroupID.BLUETOOTH_GROUP + 0x0001;

    /**
     * This parameter sets the default policy for the pairing procedure with external devices
     * for Bluetooth connections.
     * <p>
     * The class of the property is {@link EnumProperty}.
     * The allowed values are defined by enum {@link BTPairingPolicy}.
     */
    public final static int BT_PAIRING_POLICY = PropertyGroupID.BLUETOOTH_GROUP + 0x0002;

    /**
     * This parameter enables the silent procedure for pairing bluetooth devices.
     * The silent procedure allows certain external pre-approved devices to connect to
     * the mobile device via bluetooth without requiring user interaction during the initial pairing process.
     * <p>
     * By reducing the need for user interaction for trusted devices,
     * the SDK streamlines the user experience while maintaining security protocols for all other devices.
     * <p>
     * <b>How It Works:</b><p>
     * When an external device attempts to pair with the mobile device using Bluetooth,
     * Android typically prompts the user to confirm the connection thought several steps.
     * However, with Bluetooth Silent Pairing mechanism, developers can preemptively whitelist one or more devices.
     * So, when a whitelisted device initiates a pairing request,
     * the mobile device bypasses the confirmation dialogs, allowing the device
     * to connect automatically and seamlessly without any user intervention.
     * Only devices that have been whitelisted will bypass the pairing dialogs.
     * This ensures security and control over which devices can connect automatically.
     * <p>
     * In order to define the list of pre-approved devices,
     * the property {@link #BT_SILENT_PAIRING_WHITELISTING} shall be configured.
     * <p>
     * <b>Default Pairing:</b><p>
     * The silent pairing procedure does not modify or interfere with the default Android pairing and connection processes.
     * For devices that are not whitelisted, the default Android behavior is maintained.
     * The user will be prompted with the standard Android pairing dialogs,
     * ensuring that non-whitelisted devices still require explicit user approval before they can connect.
     * In case the default Android behavior required to be modified or the user shall be restricted
     * in pairing external devices, the property {@link #BT_PAIRING_POLICY} can be configured
     * with this purpose.
     * <p>
     * <b>Developer Responsibilities:</b><p>
     * Even when using the silent pairing procedure, developers are still responsible for managing
     * the Bluetooth connection and its associated events within their application.
     * This includes utilizing the standard Android APIs and event receivers to handle
     * the Bluetooth connection process after the pairing is completed.
     * As documented by Google in https://developer.android.com/reference/android/bluetooth/BluetoothDevice
     * <p>
     * Developers must ensure that their application properly listens for Bluetooth connection events,
     * manages connections, and handles any disconnections or other relevant events.
     * The silent pairing procedure only affects the user interaction during the initial pairing process,
     * and does not alter the standard procedures for Bluetooth connection management within the Android ecosystem.
     * <p>
     * By integrating this feature, developers can provide a more streamlined user experience
     * while still leveraging the full capabilities of Android's Bluetooth API
     * to manage device connections effectively.
     * <p>
     * The class of the property is {@link BooleanProperty}.    
     */
    public final static int BT_SILENT_PAIRING_WHITELISTING_ENABLE = PropertyGroupID.BLUETOOTH_GROUP + 0x0003;

    /**
     * This parameter defines the devices whitelisted for the Bluetooth Silent Pairing.
     * The bluetooth silent pairing procedure required to be enabled by configuring the property
     * {@link #BT_SILENT_PAIRING_WHITELISTING_ENABLE}.
     * <p>
     * The class of the property is {@link BlobProperty}.
     * The specific implementation for this type of blob is {@link BluetoothSilentPairingWhitelisting}.<br>
     * 
     * To set this property by intent ({@link Intents#ACTION_CONFIGURATION_COMMIT}) use the serialized form:<br>
     * <pre>
     * [["IDENTIFIER","value"],["IDENTIFIER","value"],["IDENTIFIER","value"]]
     * </pre>     
     * <ul>
     *  <li><b>IDENTIFIER</b>: Only values in {@link BluetoothSilentPairingWhitelisting.IdentifierType} are allowed.
     *  <li><b>value</b>: string containing the name, the MAC address or the OUI of the bluetooth device, in base of the used identifier.
     * </ul>
     * <br>
     * Using commit intent by android app, character <code>  <mark>"</mark>   </code>  must be escaped as <code>   <mark>\"</mark></code>.<br><br>
     * <b>To whitelist three devices by name, MAC and OUI with the commit intent:</b>
     * <pre>
     * Intent intent = new Intent(Intents.ACTION_CONFIGURATION_COMMIT);
     * HashMap map = new HashMap();
     * map.put(PropertyID.BT_SILENT_PAIRING_WHITELISTING, "[[\"NAME\",\"Bluetooth device\"],[\"MAC_ADDRESS\",\"51:A9:EE:81:FA:BA\"],[\"OUI\",\"50:A9:EE\"]]");
     * intent.putExtra(Intents.EXTRA_CONFIGURATION_CHANGED_MAP, map);
     * mContext.sendBroadcast(intent);
     * </pre>
     * <b>To delete all devices:</b>
     * <pre>
     * Intent intent = new Intent(Intents.ACTION_CONFIGURATION_COMMIT);
     * HashMap map = new HashMap();
     * map.put(PropertyID.BT_SILENT_PAIRING_WHITELISTING, "[]");
     * intent.putExtra(Intents.EXTRA_CONFIGURATION_CHANGED_MAP, map);
     * mContext.sendBroadcast(intent);
     * </pre>
     * <br><br>
     * 
     * Using the commit intent by shell, characters <code>   <mark>,</mark>   </code><code>   <mark>"</mark>   </code> and <mark>space</mark> must be escaped as <code>   <mark>"\,"</mark>   </code><code>   <mark>\"</mark>   </code>and<code>   <mark>" "</mark>   </code> respectively.<br><br>
     * <b>To whitelist three devices by name, MAC and OUI with the commit intent:</b>
     * <pre>
     * adb shell am broadcast 
     * -a com.datalogic.device.intent.action.configuration.COMMIT 
     * --es com.datalogic.device.intent.extra.configuration.CHANGED_MAP 'BT_SILENT_PAIRING_WHITELISTING=[[\"NAME\""\,"\"Bluetooth" "device\"]"\,"[\"MAC_ADDRESS\""\,"\"51:A9:EE:81:FA:BA\"]"\,"[\"OUI\""\,"\"50:A9:EE\"]]'
     * </pre>
     * <b>To delete all devices:</b>
     * <pre>
     * adb shell am broadcast 
     * -a com.datalogic.device.intent.action.configuration.COMMIT 
     * --es com.datalogic.device.intent.extra.configuration.CHANGED_MAP 'BT_SILENT_PAIRING_WHITELISTING=[]'
     * </pre>
     */
    public final static int BT_SILENT_PAIRING_WHITELISTING = PropertyGroupID.BLUETOOTH_GROUP + 0x0004;

    /**
     * This parameter enables or disables the silent procedure for pairing bluetooth devices
     * manufactured by Datalogic.
     * The silent procedure allows certain external pre-approved devices to connect to the mobile
     * device via bluetooth without requiring user interaction during the initial pairing process.
     * <p>
     * This approach can be extended also to trusted devices not manufactured by Datalogic
     * through the properties {@link #BT_SILENT_PAIRING_WHITELISTING_ENABLE} and
     * {@link #BT_SILENT_PAIRING_WHITELISTING}.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int BT_SILENT_PAIRING_TRUSTED_ENABLED = PropertyGroupID.BLUETOOTH_GROUP + 0x0005;

    /**
     * This parameter enables the notification when a profile is automatically loaded because the associated application
     * goes to foreground.
     * As a consequence an icon is shown on the status bar.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int PROFILES_AUTO_SWITCHING_NOTIFICATION_ENABLE = PropertyGroupID.PROFILES_GROUP + 0x0001;

    //
    // System definitions
    //

    /**
     * The Virtual RAM is a cutting-edge feature designed to enhance the device's performance.
     * In particular, swap allows to free up physical RAM by moving less frequently accessed data to
     * slower but larger memory (e.g. flash), allowing more space for active application and processes in RAM.
     * Users can enjoy the benefits of extended memory capacity without physical hardware upgrades,
     * enabling more robust multitasking and improved app performance.
     * <p>
     * The required space in flash storage for Virtual RAM is configurable and can be tailored
     * to meet specific needs. This flexibility ensures that the device maintains a balance between
     * performance and storage capacity, resulting in an optimized user experience without unnecessary constraints.
     * The memory swap parameter allows developers to manage and optimize the allocation of Virtual RAM,
     * effectively utilizing a portion of the device's flash storage to extend the available RAM.
     * <p>
     * By allocating flash storage for Virtual RAM, this feature minimizes the likelihood of slowdowns,
     * providing a responsive and fluid user experience that can handle more applications and data simultaneously.
     * <p>
     * The class of the property is {@link EnumProperty}.
     * The allowed values are defined by enum {@link VirtualRAMSwapPolicy}.
     */
    public final static int VIRTUAL_RAM_SWAP_POLICY = PropertyGroupID.SYSTEM_GROUP + 0x0001;

    //
    // General Decoding definitions
    //

    /**
      * This parameter controls the barcode illumination for capturing frames from displays or reflective surfaces. 
      * The possibile configurations are: 
      * <ul>
      * <li> feature disabled that means "Illuminator alwayas enabled",
      * <li> feature enabled that means "Illuminator adjusted according" to reflection in the previous acquired frames.
      * </ul> 
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int DISPLAY_MODE_ENABLE = 0x0006;
    /**
      * This parameter enables barcode illumination when capturing frames.  
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int ILLUMINATION_ENABLE = 0x0007;
    /**
      * This parameter enables aim projection when capturing frames.  
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int AIM_ENABLE = 0x0008;
    /**
      * This parameter selects the scanner target beam mode.  
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link BeamMode}.
      */
    public final static int TARGET_MODE = 0x0009;
    /**
      * This parameter limits reading to targeted selection.  
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int PICKLIST_ENABLE = 0x000A;
    /**
      * This parameter enables the use of a target beam mode.  
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int TARGET_MODE_ENABLE = 0x000B;
    /**
      * This parameter selects the scanner image capture profile.  
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link ImageCaptureProfile}.
      */
    public final static int IMAGE_CAPTURE_PROFILE = 0x000C;
    /**
      * This parameter allows to define a custom profile. It could be set with a number between 0-255.  
      * <p>
      * The class of the property is {@link NumericProperty}.
      */
    public final static int CUSTOM_IMAGE_CAPTURE_PROFILE = 0x000D;
    /**
      * This parameter selects the scanner illuminator to be used for decoding.  
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link IlluminationType}.
      */
    public final static int ILLUMINATION_TYPE = 0x000E;
    /**
      * This parameter enables the use of the good read notification on a successful read.  
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int GOOD_READ_ENABLE = 0x0010;
    /**
      * This parameter enables the use of the green spot notification on a successful read.   
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int GREEN_SPOT_ENABLE = 0x0011;
    /**
      * This parameter enables the use of the vibrator notification on a successful read.   
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int GOOD_READ_VIBRATE_ENABLE = 0x0012;
     /**
      * This parameter enables the use of the led notification on a successful read.   
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int GOOD_READ_LED_ENABLE = 0x0013;
     /**
      * This parameter enables the removal of all characters in the range 0x00-0x1F and the single    
      * character 0x7F from the scanned data. The length check for each symbology is evaluated before any 
      * characters are removed. Characters in the code ID, prefix, suffix, or separator won't be removed.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int REMOVE_NON_PRINTABLE_CHARS = 0x0018;
     /**
      * This parameter indicates the number of notifications to produce on a successful read.    
      * <p>
      * The class of the property is {@link NumericProperty}.
      */
    public final static int GOOD_READ_COUNT = 0x0020;
     /**
      * This parameter indicates the duration of each notification on a successful read.     
      * <p>
      * The class of the property is {@link NumericProperty}.
      */
    public final static int GOOD_READ_DURATION = 0x0022;
     /**
      * This parameter selects the symbology identifier to be transmitted along with the scanned data.     
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link SendCodeID}.
      */
    public final static int SEND_CODE_ID = 0x0025;
     /**
      * This parameter is a string of Unicode characters sent immediatly before symbology identifier.      
      * <p>
      * The class of the property is {@link TextProperty}.
      */
    public final static int LABEL_PREFIX = 0x0026;
     /**
      * This parameter is a string of Unicode characters sent ent after the final character in data.      
      * <p>
      * The class of the property is {@link TextProperty}.
      */
    public final static int LABEL_SUFFIX = 0x0027;
     /**
      * This parameter is the time the target beam is on before scanner attempts to read. 
      * <ul>
      * <li> 0 = 0.25 seconds </li> 
      * <li> 1 = 0.5 seconds </li>
      * <li> 2 = 1 seconds </li>
      * <li> 3 = 15 seconds </li>
      * <li> 4 = 2 seconds </li>
      * </ul>
      * <p>
      * If the value exceeds the range, the value is set at full scale.     
      * The class of the property is {@link NumericProperty}.
      */
    public final static int TARGET_TIMEOUT = 0x0029;
     /**
      * This parameter is the maximum time the scanner is on after trigger release when using 
      * Release Scan target beam mode. If the value exceeds the range, the value is set at full scale.       
      * <p>
      * The class of the property is {@link NumericProperty}.
      */
    public final static int TARGET_RELEASE_TIMEOUT = 0x002A;
     /**
      * This parameter is s a string of Unicode characters that replaces each occurrence of GS (ASCII code 0x1D) in the scanned data.       
      * <p>
      * The class of the property is {@link TextProperty}.
      */
    public final static int GS_SUBSTITUTION = 0x002C;
     /**
      * This parameter is the maximum time the scanner remains on without reading a barcode. 
      * If the value exceeds the range, the value is set at full scale. 
      * The amount of time is represented in milliseconds.      
      * <p>
      * The class of the property is {@link NumericProperty}.
      */
    public final static int DECODE_TIMEOUT = 0x002D;
     /**
      * This parameter is the delay between notifications on a successful read.        
      * <p>
      * The class of the property is {@link NumericProperty}.
      */
    public final static int GOOD_READ_INTERVAL = 0x002E;
     /**
      * This parameter is the volume of the audio notification on a successfull read.        
      * <p>
      * The class of the property is {@link NumericProperty}.
      */
    public final static int GOOD_READ_AUDIO_VOLUME = 0x002F;
     /**
      * This parameter is the file used for the audio notification on a successfull read.        
      * <p>
      * The class of the property is {@link TextProperty}.
      */
    public final static int GOOD_READ_AUDIO_FILE = 0x0030;
     /**
      * This parameter activates the notification mechanism. 
      * It enables the Display Notification capability via a displaying message. 
      * This means that the decoded label is displayed through a pop-up message, an Android Toast, on the device's screen.        
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int DISPLAY_NOTIFICATION_ENABLE = 0x0031;
     /**
     * @hide
     */
    public final static int GOOD_READ_AUDIO_TONE = 0x0032;
     /**
      * This parameter selects the scanner audio notification mode.     
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link ToneNotificationMode}.
      */
    public final static int GOOD_READ_AUDIO_MODE = 0x0033;
     /**
      * This parameter selects the audio channel to use for the scanner notification.     
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link ToneNotificationChannel}.
      */
    public final static int GOOD_READ_AUDIO_CHANNEL = 0x0034;
    /**
     * This parameter is the timeout to set during image decoding.
     * The amount of time is represented in milliseconds.
     * <p>
     * The class of the property is {@link NumericProperty}.
     */
    public final static int IMAGE_DECODE_TIMEOUT = 0x0035;
	/**
	 * This parameter enables a check to verify that the content of the barcode matches the GS1
	 * AIs format (<a href="https://ref.gs1.org/ai/">https://ref.gs1.org/ai/</a>), so that GS1 codes not well
	 * formatted will not be decoded.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int GS1_CHECK = 0x0036;
	/**
	 * This parameter enables automatic formatting of the barcode content, based on the
	 * "GS1 Human Readable Interpretation (HRI)" rules 
	 * (<a href="https://www.gs1.org/docs/barcodes/HRI_Implementation_Guide.pdf">
	 * https://www.gs1.org/docs/barcodes/HRI_Implementation_Guide.pdf</a>), by dividing the code into the
	 * different fields and marking each 
	 * Application Identifier by enclosing it in parentheses. Example: "(01)195001101530000(17)140704(10)AB-123"
	 * It is used only if {@link #GS1_CHECK} is set to true.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int GS1_STRING_FORMAT = 0x0037;
    /**
     * This parameter indicates the delay after which the good read LEDs are turned off. This is valid only in case of a single good read.
     * The value range is between 20 and 5000 for  normal scanning sessions. The maximum value is lowered to 500 in case of a scan mode
     * different from SINGLE or when the target mode is set to RELEASE_SCAN.
     * <p>
     * The class of the property is {@link NumericProperty}.
     */
    public final static int GOOD_READ_TIMEOUT = 0x0038;
     /**
     * This parameter enables the overlay notification for a successful read.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int GOOD_READ_OVERLAY_ENABLE = 0x0039;
    /**
     * This parameter selects the color of the overlay used as a notification on a successful read.  
     * If the property <code>GOOD_READ_OVERLAY_SHAPE_POLICY</code> is set to <code>FULL_SCREEN</code>, the entire screen is painted with the selected color once a code is decoded.  
     * If <code>GOOD_READ_OVERLAY_PRESERVE_COLORS</code> is set to <code>false</code>, the selected color is applied to the whole overlay, excluding transparent areas, and painted on top of the screen.  
     * The transparency level is controlled by the property <code>GOOD_READ_OVERLAY_TRANSPARENCY</code>.  
     * <p>
     * The color is specified in ARGB format (32-bit, 8 bits per channel). The alpha channel is ignored, as transparency is managed separately.
     * <p>
     * The class of the property is {@link NumericProperty}.
     */
    public final static int GOOD_READ_OVERLAY_COLOR = 0x003A;
    /**
     * This parameter selects the shape of the overlay used as notification on a successful read.
     * <p>
     * The class of the property is {@link EnumProperty}.
     * The allowed values are defined by enum {@link GoodReadOverlayShapePolicy}.
     */
    public final static int GOOD_READ_OVERLAY_SHAPE_POLICY = 0x003B;
    /**
     * This parameter selects the custom shape profile name for the overlay notification.
     * <p>
     * The class of the property is {@link TextProperty}.
     */
    public final static int GOOD_READ_OVERLAY_CUSTOM_SHAPE_NAME_PROFILE = 0x003C;
    /**
     * This parameter selects the position policy for the overlay in portrait mode.
     * <p>
     * The class of the property is {@link EnumProperty}.
     * The allowed values are defined by enum {@link GoodReadOverlayPositionPolicy}.
     */
    public final static int GOOD_READ_OVERLAY_PORTRAIT_POSITION_POLICY = 0x003D;
    /**
     * This parameter defines the custom starting X coordinate (starting from the left side of the screen) for the overlay in portrait mode.
     * <p>
     * The class of the property is {@link NumericProperty}.
     */
    public final static int GOOD_READ_OVERLAY_PORTRAIT_CUSTOM_POSITION_X = 0x003E;
    /**
     * This parameter defines the custom starting Y coordinate (starting from the top of the screen) for the overlay in portrait mode.
     * <p>
     * The class of the property is {@link NumericProperty}.
     */
    public final static int GOOD_READ_OVERLAY_PORTRAIT_CUSTOM_POSITION_Y = 0x003F;
    /**
     * This parameter selects how the overlay is displayed in portrait mode.
     * <p>
     * The class of the property is {@link EnumProperty}.
     * The allowed values are defined by enum {@link GoodReadOverlayDisplayPolicy}.
     */
    public final static int GOOD_READ_OVERLAY_PORTRAIT_DISPLAY_POLICY = 0x0040;
    /**
     * This parameter defines the maximum custom width of the overlay in portrait mode.
     * <p>
     * The class of the property is {@link NumericProperty}.
     */
    public final static int GOOD_READ_OVERLAY_PORTRAIT_CUSTOM_SIZE_MAX_WIDTH = 0x0041;
    /**
     * This parameter defines the maximum custom height of the overlay in portrait mode.
     * <p>
     * The class of the property is {@link NumericProperty}.
     */
    public final static int GOOD_READ_OVERLAY_PORTRAIT_CUSTOM_SIZE_MAX_HEIGHT = 0x0042;
    /**
     * This parameter selects the position policy for the overlay in landscape mode.
     * <p>
     * The class of the property is {@link EnumProperty}.
     * The allowed values are defined by enum {@link GoodReadOverlayPositionPolicy}.
     */
    public final static int GOOD_READ_OVERLAY_LANDSCAPE_POSITION_POLICY = 0x0043;
    /**
     * This parameter defines the custom starting X coordinate (starting from the left side of the screen) for the overlay in landscape mode.
     * <p>
     * The class of the property is {@link NumericProperty}.
     */
    public final static int GOOD_READ_OVERLAY_LANDSCAPE_CUSTOM_POSITION_X = 0x0044;
    /**
     * This parameter defines the custom starting Y coordinate (starting from the top of the screen) for the overlay in landscape mode.
     * <p>
     * The class of the property is {@link NumericProperty}.
     */
    public final static int GOOD_READ_OVERLAY_LANDSCAPE_CUSTOM_POSITION_Y = 0x0045;
    /**
     * This parameter selects how the overlay is displayed in landscape mode.
     * <p>
     * The class of the property is {@link EnumProperty}.
     * The allowed values are defined by enum {@link GoodReadOverlayDisplayPolicy}.
     */
    public final static int GOOD_READ_OVERLAY_LANDSCAPE_DISPLAY_POLICY = 0x0046;
    /**
     * This parameter defines the maximum custom width of the overlay in landscape mode.
     * <p>
     * The class of the property is {@link NumericProperty}.
     */
    public final static int GOOD_READ_OVERLAY_LANDSCAPE_CUSTOM_SIZE_MAX_WIDTH = 0x0047;
    /**
     * This parameter defines the maximum custom height of the overlay in landscape mode.
     * <p>
     * The class of the property is {@link NumericProperty}.
     */
    public final static int GOOD_READ_OVERLAY_LANDSCAPE_CUSTOM_SIZE_MAX_HEIGHT = 0x0048;
    /**
     * This parameter selects the level of transparency to be applied to the overlay notification for a successful read.
     * The value ranges from 0 (fully opaque) to 100 (fully transparent), allowing varying degrees of transparency.
     * <p>
     * The class of the property is {@link NumericProperty}.
     */
    public final static int GOOD_READ_OVERLAY_TRANSPARENCY = 0x0049;
    /**
     * This parameter determines whether the original colors of the overlay should be preserved.
     * When set to <code>true</code>, the overlay's colors remain unchanged during rendering.
     * When set to <code>false</code>, the colors may be modified to achieve different visual effects.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int GOOD_READ_OVERLAY_PRESERVE_COLORS = 0x004A;
    /**
     * This parameter selects whether the black or white color in the overlay should be treated as transparent.
     * When set to <code>false</code>, the white areas in the overlay will be considered transparent;
     * when set to <code>true</code>, the black areas will be treated as transparent.
     * In both cases, all other colors are converted to grayscale, and their transparency is interpolated between the two extremes.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int GOOD_READ_OVERLAY_BLACK_AS_TRANSPARENT = 0x004B;
    /**
      * This parameter enables the ability to collect a defined number of barcodes in a single session and transmit them at the same time.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int MULTISCAN_ENABLE = 0x0050;
     /**
      * This parameter defines the number of required labels to be read before automatically ending a good read transaction.     
      * <p>
      * The class of the property is {@link NumericProperty}.
      */
    public final static int MULTISCAN_REQUIRED_LABELS = 0x0051;
     /**
      * This parameter defines whether to notify each successfully read label during Multi Scan operation.       
      * <p>
      * The decoding session is ended successfully and all the collected labels are returned together, only if the labelCount is reached. 
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int MULTISCAN_NOTIFICATION_ENABLE = 0x0052;
     /**
      * This parameter selects the behaviour when partial results are present.     
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link PartialResultMode}.
      */
    public final static int MULTISCAN_PARTIAL_RESULT_MODE = 0x0053;
     /**
      * This parameter sets the inverse mode for linear barcode symbologies.    
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link InverseMode}.
      */
    public final static int INVERSE_1D_SYMBOLOGIES = 0x0060;
     /**
      * This parameter sets the inverse mode for 2D barcode symbologies.    
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link InverseMode}.
      */
    public final static int INVERSE_2D_SYMBOLOGIES = 0x0061;
     /**
      * This parameter enables the use of presentation mode.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int PRESENTATION_MODE_ENABLE = 0x0062;
     /**
      * This parameter enables the use of the aimer in presentation mode.      
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int PRESENTATION_MODE_AIMER_ENABLE = 0x0063;
     /**
      * This parameter sets sensitivity in presentation mode.    
      * <p>
      * The class of the property is {@link NumericProperty}.
      */
    public final static int PRESENTATION_MODE_SENSITIVITY = 0x0064;
     /**
      * This parameter selects the scan mode.    
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link ScanMode}.
      */
    public final static int SCAN_MODE = 0x0065;
     /**
      * This parameter is the minimum time allowed between reads of the same barcode label. 
      * <p>
      * When the device decodes a label and sees the same one before this timeout is expired, 
      * the second result will be ignored. This timeout works when scanMode is set to HOLD_MULTIPLE, PULSE_MULTIPLE 
      * or ALWAYS_ON. The amount of time is represented in milliseconds.     
      * <p>
      * The class of the property is {@link NumericProperty}.
      */
    public final static int DOUBLE_READ_TIMEOUT = 0x0066;
     /**
      * This parameter selects the scanner illumination pulse length. 
      * <p>
      * The scan engine illumination is a pulsed light. It is characterized by a light pulse length and a frequency
      * usually equal to the frame rate frequency. This property affects only the pulse length. With a longer light
      * pulse the scan engine can decode a more distant target and DOF performance is enhanced on low environment
      * light condition. In the counterside, a shorter light pulse makes the scan engine more motion tollerant.     
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link IlluminationTime}.
      */
    public final static int ILLUMINATION_TIME = 0x0067;
    /**
     * @hide
     */
    public final static int LINEAR_RASTER = 0x0068;
    /**
     * @hide
     * This parameter forcefully disable hardware generation from the scanengine
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int FORCE_HW_ACCELERATION_DISABLED = 0x0069;
    /**
     * This parameter enhances the Depth of Field.
     * <p></p>
     * Depending on barcode typology, quality and light condition it could enhance the Depth of Field.
     * Try to enable it only if you need to increment the DoF.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int ENHANCE_DOF_ENABLE = 0x006A;
    /**
     * This parameter is set to specify the representation used for the GTIN format.
     * <p>
     * The class of the property is {@link EnumProperty}.
     * The allowed values are defined by enum {@link GtinFormat}.
     */
    public final static int GTIN_FORMAT = 0x006B;
    /**
     * This parameter is set to specify the mode use to transmit GS1 label sets.
     * A label set consists of all the GS1 barcodes that have the same GTIN value.
     * <p>
     * The class of the property is {@link EnumProperty}.
     * The allowed values are defined by enum {@link Gs1LabelSetTransmitMode}.
     */
    public final static int GS1_LABEL_SET_TRANSMIT_MODE = 0x006C;
    /**
     * This parameter is set to specify the label set prefix to use when the
     * label set mode is set to <code>ALL_LABELS</code>.
     * <p>
     * The class of the property is {@link TextProperty}.
     */
    public final static int GS1_LABEL_SET_PREFIX = 0x006D;
    /**
     * This parameter is set to specify the conversion used for GS1 2D barcodes.
     * <p>
     * The class of the property is {@link EnumProperty}.
     * The allowed values are defined by enum {@link Gs1Conversion2d}.
     */
    public final static int GS1_2D_CONVERSION = 0x006E;
    /**
     * This parameter enables the injection of the barcodes from an external scanner source.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int EXT_SCANNER_SOURCE_ENABLE = 0x006F;
    /**
     * This parameter allows using the standard formatter when the injection is enabled.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int EXT_SCANNER_SOURCE_STANDARD_FORMATTER_ENABLE = 0x0070;
    /**
     * This parameter enables to format the read data as a readable hexadecimal string. Ignores other formatting options.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int HEX_FORMAT = 0x0071;
    /**
     * This parameter enables scanner decoding.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int ENABLE_SCANNER = 0x0072;
    /**
     * @hide
     * This parameter set after how many frame the scanner tries decoding ignoring hardware accelleration.
     * <p>
     * The class of the property is {@link NumericProperty}.
     */
    public final static int HW_ACCELERATION_FRAME_TO_SKIP = 0x0073;
    /**
     * This parameter enables the use of the scanner in place of the rear camera.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int CAMERA_WEDGE_ENABLE = 0x0074;
    /**
     * This parameter represents the symbology of the barcode generated by the camera wedge.
     * <p>
     * The class of the property is {@link EnumProperty}.
     * The allowed values are defined by enum {@link CameraWedgeBarcodeType}.
     */
    public final static int CAMERA_WEDGE_BARCODE_TYPE = 0x0075;
    /**
     * This parameter represents the maximum amount of time (in milliseconds) a generated
     * barcode is shown in the camera frames. After this time has expired, the camera frames
     * with come back to show only the background.
     * <p>
     * The class of the property is {@link NumericProperty}.
     */
    public final static int CAMERA_WEDGE_MAX_BARCODE_PERSISTENCE = 0x0076;
    /**
     * This parameter represents the minimum amount of time (in milliseconds) a generated
     * barcode is shown in the camera frames. If another barcode is decoded before the time
     * has expired, it will be shown only after the expiration.
     * <p>
     * The class of the property is {@link NumericProperty}.
     */
    public final static int CAMERA_WEDGE_MIN_BARCODE_PERSISTENCE = 0x0077;
    /**
     * This parameter represents the orientation of the barcode generated by the camera wedge.
     * <p>
     * The class of the property is {@link EnumProperty}.
     * The allowed values are defined by enum {@link CameraWedgeBarcodeOrientation}.
     */
    public final static int CAMERA_WEDGE_BARCODE_ORIENTATION = 0x0078;
    /**
     * This parameter represents the size in pixels of the barcode generated by the camera wedge.
     * For barcodes that have different width and height, the size refers to the biggest
     * value between them.
     * <p>
     * The class of the property is {@link NumericProperty}.
     */
    public final static int CAMERA_WEDGE_BARCODE_SIZE = 0x0079;
    /**
     * This parameter represents the position of the barcode generated by the camera wedge.
     * <p>
     * The class of the property is {@link EnumProperty}.
     * The allowed values are defined by enum {@link CameraWedgeBarcodePosition}.
     */
    public final static int CAMERA_WEDGE_BARCODE_POSITION = 0x007A;
    /**
     * In case of custom positioning, this parameter represents the position of
     * the barcode generated by the camera wedge on the X coordinate.<br/>
     * <b>NOTE:</b> The camera frame is considered as being rotated clockwise
     * by 90 degrees, which means that the starting coordinate will be on the top
     * right of the screen in portrait orientation. In this configuration, an
     * increase of the X coordinate causes the barcode to move down on the vertical axis
     * of the screen.
     * <p>
     * The class of the property is {@link NumericProperty}.
     */
    public final static int CAMERA_WEDGE_BARCODE_CUSTOM_POSITION_X = 0x007B;
    /**
     * In case of custom positioning, this parameter represents the position of
     * the barcode generated by the camera wedge on the Y coordinate.
     * <b>NOTE:</b> The camera frame is considered as being rotated clockwise
     * by 90 degrees, which means that the starting coordinate will be on the top
     * right of the screen in portrait orientation. In this configuration, an
     * increase of the Y coordinate causes the barcode to move left on the horizontal axis
     * of the screen.
     * <p>
     * The class of the property is {@link NumericProperty}.
     */
    public final static int CAMERA_WEDGE_BARCODE_CUSTOM_POSITION_Y = 0x007C;
    /**
     * This parameter represents the background color of the frames containing a
     * barcode generated by the camera wedge.
     * <p>
     * The class of the property is {@link NumericProperty}.
     */
    public final static int CAMERA_WEDGE_BACKGROUND_COLOR = 0x007D;
    /**
     * This parameter represents the barcode color of the frames containing a
     * barcode generated by the camera wedge.
     * <p>
     * The class of the property is {@link NumericProperty}.
     */
    public final static int CAMERA_WEDGE_BARCODE_COLOR = 0x007E;
    /**
     * By default, the scanner is prevented from starting barcode scanning
     * when the camera is in preview.
     * This parameter enables interoperability between the scanner and other cameras,
     * allowing the user to scan barcodes even while another camera is in use.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int SCANNER_CAMERA_INTEROPERABILITY = 0x007F;

    //
    // Code 39 definitions
    //
     /**
      * This parameter enables or disables the symbology.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int CODE39_ENABLE = 0x0100;
     /**
      * This parameter enables the reading of Code 39 barcode labels with short quiet zones.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int CODE39_SHORT_QUIET_ZONES = 0x0101;
     /**
      * This parameter requires the use of checksum characters to verify a barcode.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int CODE39_ENABLE_CHECK = 0x0102;
     /**
      * This parameter includes the checksum in the label transmission (if checksum is required with enableChecksum).        
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int CODE39_SEND_CHECK = 0x0103;
     /**
      * This parameter enables or disables the Full Ascii conversion.        
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int CODE39_FULL_ASCII = 0x0105;
     /**
      * This parameter is one of the two configurable label lengths. It can be used
      * as a single fixed accepted length, when {@link #CODE39_LENGTH_CONTROL} is set to {@link LengthControlMode#ONE_FIXED}.
      * When {@link LengthControlMode#TWO_FIXED} is enabled, its value is one of the two possible accepted fixed lengths for a specific label.
      * It can also represent the minor or major length value whenever {@link LengthControlMode#RANGE} is selected.
      * 
      * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
      * biggest accepted length will be used.  
      *     
      * <p>
      * The class of the property is {@link NumericProperty}.
      * @see #CODE39_LENGTH_CONTROL
      */
    public final static int CODE39_LENGTH1 = 0x0120;
     /**
      * This parameter is one of the two configurable label lengths.
      * When {@link #CODE39_LENGTH_CONTROL} is set to {@link LengthControlMode#TWO_FIXED}, its value is one of the two possible accepted fixed lengths for a specific label.
      * It can also represent the minor or major length value whenever {@link LengthControlMode#RANGE} is selected.
      *
      * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
      * biggest accepted length will be used.  
      *    
      * <p>
      * The class of the property is {@link NumericProperty}.
      * @see #CODE39_LENGTH_CONTROL
      */
    public final static int CODE39_LENGTH2 = 0x0121;
     /**
      * This parameter specifies how each L1 and L2 length values should be applied to a label. 
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link LengthControlMode}. 
      */
    public final static int CODE39_LENGTH_CONTROL = 0x0122;
     /**
      * This parameter specifies the symbology identifier (if any).
      * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
      * {@link SendCodeID#USERDEFINED_IDENTIFIER_BEFORE_LABEL} or {@link SendCodeID#USERDEFINED_IDENTIFIER_AFTER_LABEL}.  
      * <p>
      * The class of the property is {@link CharacterProperty}.
      */
    public final static int CODE39_USER_ID = 0x0123;
     /**
      * This parameter controls the aggressiveness for the Code 39 symbology. 
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link Code39Aggressiveness}. 
      */
    public final static int CODE39_AGGRESSIVENESS = 0x0124;

    //
    // Trioptic definitions
    //
    //
     /**
      * This parameter enables or disables the symbology.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int TRIOPTIC_ENABLE = 0x0108;
     /**
      * This parameter specifies the symbology identifier (if any).
      * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
      * {@link SendCodeID#USERDEFINED_IDENTIFIER_BEFORE_LABEL} or {@link SendCodeID#USERDEFINED_IDENTIFIER_AFTER_LABEL}.  
      * <p>
      * The class of the property is {@link CharacterProperty}.
      */
    public final static int TRIOPTIC_USER_ID = 0x0125;

    //
    // Code 32 definitions
    //
    //
     /**
      * This parameter enables or disables the symbology.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int CODE32_ENABLE = 0x0110;
     /**
      * This parameter specifies the symbology identifier (if any).
      * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
      * {@link SendCodeID#USERDEFINED_IDENTIFIER_BEFORE_LABEL} or {@link SendCodeID#USERDEFINED_IDENTIFIER_AFTER_LABEL}.  
      * <p>
      * The class of the property is {@link CharacterProperty}.
      */
    public final static int CODE32_USER_ID = 0x0127;

    //
    // Discrete 2/5 definitions
    //
    //
     /**
      * This parameter enables or disables the symbology.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int D25_ENABLE = 0x0200;
     /**
      * This parameter is one of the two configurable label lengths.
      * When {@link #D25_LENGTH_CONTROL} is set to {@link LengthControlMode#TWO_FIXED}, its value is one of the two possible accepted fixed lengths for a specific label.
      * It can also represent the minor or major length value whenever {@link LengthControlMode#RANGE} is selected.
      *
      * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
      * biggest accepted length will be used.  
      *    
      * <p>
      * The class of the property is {@link NumericProperty}.
      * @see #D25_LENGTH_CONTROL
      */
    public final static int D25_LENGTH1 = 0x0220;
     /**
      * This parameter is one of the two configurable label lengths.
      * When {@link #D25_LENGTH_CONTROL} is set to {@link LengthControlMode#TWO_FIXED}, its value is one of the two possible accepted fixed lengths for a specific label.
      * It can also represent the minor or major length value whenever {@link LengthControlMode#RANGE} is selected.
      *
      * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
      * biggest accepted length will be used.  
      *    
      * <p>
      * The class of the property is {@link NumericProperty}.
      * @see #D25_LENGTH_CONTROL
      */
    public final static int D25_LENGTH2 = 0x0221;
     /**
      * This parameter specifies how each L1 and L2 length values should be applied to a label. 
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link LengthControlMode}. 
      */
    public final static int D25_LENGTH_CONTROL = 0x0222;
     /**
      * This parameter specifies the symbology identifier (if any).
      * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
      * {@link SendCodeID#USERDEFINED_IDENTIFIER_BEFORE_LABEL} or {@link SendCodeID#USERDEFINED_IDENTIFIER_AFTER_LABEL}.  
      * <p>
      * The class of the property is {@link CharacterProperty}.
      */
    public final static int D25_USER_ID = 0x0223;

    //
    // Matrix 2/5 definitions
    //
    //
     /**
      * This parameter enables or disables the symbology.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int M25_ENABLE = 0x0208;
     /**
      * This parameter is one of the two configurable label lengths.
      * When {@link #M25_LENGTH_CONTROL} is set to {@link LengthControlMode#TWO_FIXED}, its value is one of the two possible accepted fixed lengths for a specific label.
      * It can also represent the minor or major length value whenever {@link LengthControlMode#RANGE} is selected.
      *
      * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
      * biggest accepted length will be used.  
      *    
      * <p>
      * The class of the property is {@link NumericProperty}.
      * @see #M25_LENGTH_CONTROL
      */
    public final static int M25_LENGTH1 = 0x0224;
     /**
      * This parameter is one of the two configurable label lengths.
      * When {@link #D25_LENGTH_CONTROL} is set to {@link LengthControlMode#TWO_FIXED}, its value is one of the two possible accepted fixed lengths for a specific label.
      * It can also represent the minor or major length value whenever {@link LengthControlMode#RANGE} is selected.
      *
      * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
      * biggest accepted length will be used.  
      *    
      * <p>
      * The class of the property is {@link NumericProperty}.
      * @see #D25_LENGTH_CONTROL
      */
    public final static int M25_LENGTH2 = 0x0225;
     /**
      * This parameter specifies how each L1 and L2 length values should be applied to a label. 
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link LengthControlMode}. 
      */
    public final static int M25_LENGTH_CONTROL = 0x0226;
     /**
      * This parameter specifies the symbology identifier (if any).
      * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
      * {@link SendCodeID#USERDEFINED_IDENTIFIER_BEFORE_LABEL} or {@link SendCodeID#USERDEFINED_IDENTIFIER_AFTER_LABEL}.  
      * <p>
      * The class of the property is {@link CharacterProperty}.
      */
    public final static int M25_USER_ID = 0x0227;
     /**
      * This parameter enables the reading of Matrix 2 of 5 barcode labels with short quiet zones.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int M25_SHORT_QUIET_ZONES = 0x022F;

    //
    // Interleaved 2/5 definitions
    //
    //
     /**
      * This parameter enables or disables the symbology.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int I25_ENABLE = 0x0210;
     /**
      * This parameter equires the use of checksum characters to verify a barcode.      
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int I25_ENABLE_CHECK = 0x0212;
     /**
      * This parameter includes the checksum in the label transmission (if checksum is required with enableChecksum).       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int I25_SEND_CHECK = 0x0213;
     /**
      * This parameter is one of the two configurable label lengths.
      * When {@link #I25_LENGTH_CONTROL} is set to {@link LengthControlMode#TWO_FIXED}, its value is one of the two possible accepted fixed lengths for a specific label.
      * It can also represent the minor or major length value whenever {@link LengthControlMode#RANGE} is selected.
      *
      * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
      * biggest accepted length will be used.  
      *    
      * <p>
      * The class of the property is {@link NumericProperty}.
      * @see #I25_LENGTH_CONTROL
      */
    public final static int I25_LENGTH1 = 0x0228;
     /**
      * This parameter is one of the two configurable label lengths.
      * When {@link #I25_LENGTH_CONTROL} is set to {@link LengthControlMode#TWO_FIXED}, its value is one of the two possible accepted fixed lengths for a specific label.
      * It can also represent the minor or major length value whenever {@link LengthControlMode#RANGE} is selected.
      *
      * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
      * biggest accepted length will be used.  
      *    
      * <p>
      * The class of the property is {@link NumericProperty}.
      * @see #I25_LENGTH_CONTROL
      */
    public final static int I25_LENGTH2 = 0x0229;
     /**
      * This parameter specifies how each L1 and L2 length values should be applied to a label. 
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link LengthControlMode}. 
      */
    public final static int I25_LENGTH_CONTROL = 0x022A;
     /**
      * This parameter specifies the symbology identifier (if any).
      * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
      * {@link SendCodeID#USERDEFINED_IDENTIFIER_BEFORE_LABEL} or {@link SendCodeID#USERDEFINED_IDENTIFIER_AFTER_LABEL}.  
      * <p>
      * The class of the property is {@link CharacterProperty}.
      */
    public final static int I25_USER_ID = 0x022B;
     /**
      * This parameter enables or disables the ITF14 symbology. It could be used to include a GTIN. It always checks and transmits the checksum character.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int ITF14_ENABLE = 0x022C;
     /**
      * This parameter controls the aggressiveness for the Interleaved 2/5 symbology. 
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link Interleaved25Aggressiveness}. 
      */
    public final static int I25_AGGRESSIVENESS = 0x022D;
     /**
      * This parameter enables the reading of Interleaved 2 of 5 barcode labels with short quiet zones.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int I25_SHORT_QUIET_ZONES = 0x022E;

    //
    // Codabar definitions
    //
    //
     /**
      * This parameter enables or disables the symbology.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int CODABAR_ENABLE = 0x0300;
     /**
      * This parameter equires the use of checksum characters to verify a barcode.      
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int CODABAR_ENABLE_CHECK = 0x0302;
     /**
      * This parameter includes the checksum in the label transmission (if checksum is required with enableChecksum).       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int CODABAR_SEND_CHECK = 0x0303;
     /**
      * This parameter enables/disables the transmission of the decoded star and stop characters. The start and stop characters will both be translated as A, B, C or D.        
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int CODABAR_SEND_START = 0x0305;
     /**
      * This parameter restricts the decoding to only read labels that conform to CLSI specifications. Label length must be 14 and the data is split into fields of 1, 4, 5 and 4 characters separated by spaces.        
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int CODABAR_CLSI = 0x0306;
     /**
      * This parameter is one of the two configurable label lengths.
      * When {@link #CODABAR_LENGTH_CONTROL} is set to {@link LengthControlMode#TWO_FIXED}, its value is one of the two possible accepted fixed lengths for a specific label.
      * It can also represent the minor or major length value whenever {@link LengthControlMode#RANGE} is selected.
      *
      * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
      * biggest accepted length will be used.  
      *    
      * <p>
      * The class of the property is {@link NumericProperty}.
      * @see #CODABAR_LENGTH_CONTROL
      */
    public final static int CODABAR_LENGTH1 = 0x0320;
     /**
      * This parameter is one of the two configurable label lengths.
      * When {@link #CODABAR_LENGTH_CONTROL} is set to {@link LengthControlMode#TWO_FIXED}, its value is one of the two possible accepted fixed lengths for a specific label.
      * It can also represent the minor or major length value whenever {@link LengthControlMode#RANGE} is selected.
      *
      * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
      * biggest accepted length will be used.  
      *    
      * <p>
      * The class of the property is {@link NumericProperty}.
      * @see #CODABAR_LENGTH_CONTROL
      */
    public final static int CODABAR_LENGTH2 = 0x0321;
     /**
      * This parameter specifies how each L1 and L2 length values should be applied to a label. 
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link LengthControlMode}. 
      */
    public final static int CODABAR_LENGTH_CONTROL = 0x0322;
     /**
      * This parameter specifies the symbology identifier (if any).
      * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
      * {@link SendCodeID#USERDEFINED_IDENTIFIER_BEFORE_LABEL} or {@link SendCodeID#USERDEFINED_IDENTIFIER_AFTER_LABEL}.  
      * <p>
      * The class of the property is {@link CharacterProperty}.
      */
    public final static int CODABAR_USER_ID = 0x0323;
     /**
      * This parameter enables the reading of Codabar barcode labels with short quiet zones.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int CODABAR_SHORT_QUIET_ZONES = 0x0324;

    //
    // Code 93 definitions
    //
    //
     /**
      * This parameter enables or disables the symbology.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int CODE93_ENABLE = 0x0400;
     /**
      * This parameter is one of the two configurable label lengths.
      * When {@link #CODE93_LENGTH_CONTROL} is set to {@link LengthControlMode#TWO_FIXED}, its value is one of the two possible accepted fixed lengths for a specific label.
      * It can also represent the minor or major length value whenever {@link LengthControlMode#RANGE} is selected.
      *
      * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
      * biggest accepted length will be used.  
      *    
      * <p>
      * The class of the property is {@link NumericProperty}.
      * @see #CODE93_LENGTH_CONTROL
      */
    public final static int CODE93_LENGTH1 = 0x0420;
     /**
      * This parameter is one of the two configurable label lengths.
      * When {@link #CODE93_LENGTH_CONTROL} is set to {@link LengthControlMode#TWO_FIXED}, its value is one of the two possible accepted fixed lengths for a specific label.
      * It can also represent the minor or major length value whenever {@link LengthControlMode#RANGE} is selected.
      *
      * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
      * biggest accepted length will be used.  
      *    
      * <p>
      * The class of the property is {@link NumericProperty}.
      * @see #CODE93_LENGTH_CONTROL
      */
    public final static int CODE93_LENGTH2 = 0x0421;
     /**
      * This parameter specifies how each L1 and L2 length values should be applied to a label. 
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link LengthControlMode}. 
      */
    public final static int CODE93_LENGTH_CONTROL = 0x0422;
     /**
      * This parameter specifies the symbology identifier (if any).
      * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
      * {@link SendCodeID#USERDEFINED_IDENTIFIER_BEFORE_LABEL} or {@link SendCodeID#USERDEFINED_IDENTIFIER_AFTER_LABEL}.  
      * <p>
      * The class of the property is {@link CharacterProperty}.
      */
    public final static int CODE93_USER_ID = 0x0423;
     /**
      * This parameter enables the reading of Code 93 barcode labels with short quiet zones.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int CODE93_SHORT_QUIET_ZONES = 0x042B;

    //
    // Code 128 definitions
    //
    //
     /**
      * This parameter enables or disables the symbology.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int CODE128_ENABLE = 0x0408;
     /**
      * This parameter is one of the two configurable label lengths.
      * When {@link #CODE128_LENGTH_CONTROL} is set to {@link LengthControlMode#TWO_FIXED}, its value is one of the two possible accepted fixed lengths for a specific label.
      * It can also represent the minor or major length value whenever {@link LengthControlMode#RANGE} is selected.
      *
      * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
      * biggest accepted length will be used.  
      *    
      * <p>
      * The class of the property is {@link NumericProperty}.
      * @see #CODE128_LENGTH_CONTROL
      */
    public final static int CODE128_LENGTH1 = 0x0424;
     /**
      * This parameter is one of the two configurable label lengths.
      * When {@link #CODE128_LENGTH_CONTROL} is set to {@link LengthControlMode#TWO_FIXED}, its value is one of the two possible accepted fixed lengths for a specific label.
      * It can also represent the minor or major length value whenever {@link LengthControlMode#RANGE} is selected.
      *
      * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
      * biggest accepted length will be used.  
      *    
      * <p>
      * The class of the property is {@link NumericProperty}.
      * @see #CODE128_LENGTH_CONTROL
      */
    public final static int CODE128_LENGTH2 = 0x0425;
     /**
      * This parameter specifies how each L1 and L2 length values should be applied to a label. 
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link LengthControlMode}. 
      */
    public final static int CODE128_LENGTH_CONTROL = 0x0426;
     /**
      * This parameter specifies the symbology identifier (if any).
      * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
      * {@link SendCodeID#USERDEFINED_IDENTIFIER_BEFORE_LABEL} or {@link SendCodeID#USERDEFINED_IDENTIFIER_AFTER_LABEL}.  
      * <p>
      * The class of the property is {@link CharacterProperty}.
      */
    public final static int CODE128_USER_ID = 0x0427;
     /**
      * This parameter enables or disables the GS1 Code128 symbology.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int CODE128_GS1_ENABLE = 0x040C;
     /**
      * This parameter specifies the symbology identifier (if any).
      * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
      * {@link SendCodeID#USERDEFINED_IDENTIFIER_BEFORE_LABEL} or {@link SendCodeID#USERDEFINED_IDENTIFIER_AFTER_LABEL}.  
      * <p>
      * The class of the property is {@link CharacterProperty}.
      */
    public final static int CODE128_GS1_USER_ID   = 0x0428;
     /**
      * This parameter controls the aggressiveness for the Code128 symbology. 
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link Code128Aggressiveness}. 
      */
    public final static int CODE128_AGGRESSIVENESS = 0x0429;
     /**
      * This parameter enables the reading of Code128 barcode labels with short quiet zones.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int CODE128_SHORT_QUIET_ZONES = 0x042A;
    /**
     * This parameter selects the support to the extended ASCII (ASCII code from 128 to 255).
     * <p>
     * The class of the property is {@link EnumProperty}.
     * The allowed values are defined by enum {@link Code128ExtendedAsciiMode}.
     */
    public final static int CODE128_EXTENDED_ASCII = 0x042C;
    /**
     * This parameter controls the character set in use for the decoded label.
     * <p>
     * The class of the property is {@link EnumProperty}.
     * The allowed values are defined by enum {@link CharacterSetMode}.
     */
    public final static int CODE128_CHARACTER_SET_MODE = 0x042D;

    //
    // UPC-A definitions
    //
    //
     /**
      * This parameter enables or disables the symbology.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int UPCA_ENABLE = 0x0500;
     /**
      * This parameter includes the checksum in the label transmission.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int UPCA_SEND_CHECK = 0x0502;
     /**
      * This parameter includes the system digit in the label transmission. For UPC-A the system digit is always zero.        
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int UPCA_SEND_SYS = 0x0503;
     /**
      * This parameter allows to expand the UPC-A labels to their EAN-13 equivalents. Any EAN-13 parameters will then apply to the result.        
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int UPCA_TO_EAN13 = 0x0504;
     /**
      * This parameter allows to use UPC-A labels in composite barcode.        
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int UPCA_COMPOSITE_ENABLE = 0x0505;
     /**
      * This parameter specifies the symbology identifier (if any).
      * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
      * {@link SendCodeID#USERDEFINED_IDENTIFIER_BEFORE_LABEL} or {@link SendCodeID#USERDEFINED_IDENTIFIER_AFTER_LABEL}.  
      * <p>
      * The class of the property is {@link CharacterProperty}.
      */
    public final static int UPCA_USER_ID = 0x0521;

    //
    // UPC-E definitions
    //
    //
     /**
      * This parameter enables or disables the symbology.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int UPCE_ENABLE = 0x0508;
     /**
      * This parameter includes the checksum in the label transmission.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int UPCE_SEND_CHECK = 0x050A;
     /**
      * This parameter includes the system digit in the label transmission. For UPC-E the system digit is always zero.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int UPCE_SEND_SYS = 0x050B;
     /**
      * This parameter allows to expand the UPC-E labels to their UPC-A equivalents. Any UPC-A parameters will then apply to the result.         
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int UPCE_TO_UPCA = 0x050C;
     /**
      * This parameter allows to use UPC-E labels in composite barcode.        
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int UPCE_COMPOSITE_ENABLE = 0x050D;
     /**
      * This parameter specifies the symbology identifier (if any).
      * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
      * {@link SendCodeID#USERDEFINED_IDENTIFIER_BEFORE_LABEL} or {@link SendCodeID#USERDEFINED_IDENTIFIER_AFTER_LABEL}.  
      * <p>
      * The class of the property is {@link CharacterProperty}.
      */
    public final static int UPCE_USER_ID = 0x0523;
     /**
      * This parameter enables decoding of the UPC-E1 Symbology variation of UPC-E code.         
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int UPCE1_ENABLE = 0x0509;

    //
    // EAN-13 definitions
    //
    //
     /**
      * This parameter enables or disables the symbology.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int EAN13_ENABLE = 0x0510;
     /**
      * This parameter includes the checksum in the label transmission.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int EAN13_SEND_CHECK = 0x0512;
     /**
      * This parameter includes the system digit in the label transmission, it configures whether the first character should be transmitted.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int EAN13_SEND_SYS = 0x0513;
     /**
      * This parameter allows to identify ISBN labels and append the check digit (per ISBN guidelines) to the end of the label.        
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int EAN13_TO_ISBN = 0x0514;
     /**
      * This parameter allows to identify ISSN labels and append the check digit (per ISSN guidelines) to the end of the label.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int EAN13_TO_ISSN = 0x0515;
     /**
      * This parameter allows to use EAN-13 labels in composite barcode.        
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int EAN13_COMPOSITE_ENABLE = 0x0516;
    /**
     * This parameter allows to convert EAN-13 labels to GTIN.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int EAN13_TO_GTIN = 0x0517;
     /**
      * This parameter specifies the symbology identifier (if any).
      * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
      * {@link SendCodeID#USERDEFINED_IDENTIFIER_BEFORE_LABEL} or {@link SendCodeID#USERDEFINED_IDENTIFIER_AFTER_LABEL}.  
      * <p>
      * The class of the property is {@link CharacterProperty}.
      */
    public final static int EAN13_USER_ID = 0x0525;

    //
    // EAN-8 definitions
    //
    //
     /**
      * This parameter enables or disables the symbology.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int EAN8_ENABLE = 0x0518;
     /**
      * This parameter includes the checksum in the label transmission.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int EAN8_SEND_CHECK = 0x051A;
 
     /**
      * This parameter allows to expand the EAN-8 labels to their EAN-13 equivalents. Any EAN-13 parameters will then apply to the result.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int EAN8_TO_EAN13 = 0x051B;
     /**
      * This parameter allows to use EAN-8 labels in composite barcode.        
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int EAN8_COMPOSITE_ENABLE = 0x0528;
     /**
      * This parameter specifies the symbology identifier (if any).
      * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
      * {@link SendCodeID#USERDEFINED_IDENTIFIER_BEFORE_LABEL} or {@link SendCodeID#USERDEFINED_IDENTIFIER_AFTER_LABEL}.  
      * <p>
      * The class of the property is {@link CharacterProperty}.
      */
    public final static int EAN8_USER_ID = 0x0527;

    //
    // UPC/EAN Extensions definitions
    //
     /**
      * This parameter requires a 2 digit extension to be verified for a successful decode of a label.         
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int EAN_EXT_ENABLE_2_DIGIT = 0x051C;
     /**
      * This parameter requires a 5 digit extension to be verified for a successful decode of a label.         
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int EAN_EXT_ENABLE_5_DIGIT = 0x051D;
     /**
      * This parameter indicates that are read only barcode with the supplemental label. If the parameter is false are read barcodes with or without the supplemental labels.          
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int EAN_EXT_REQUIRE = 0x051F;

    //
    // UPC/EAN Options
    //
     /**
      * This parameter enables the reading of UPC and EAN barcode labels with short quiet zones.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int UPC_EAN_SHORT_QUIET_ZONES = 0x0520;
     /**
      * This parameter controls the aggressiveness for the UPC and EAN symbology. 
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link UpcEanAggressiveness}. 
      */
    public final static int UPC_EAN_AGGRESSIVENESS = 0x0526;

    //
    // MSI definitions
    //
    //
     /**
      * This parameter enables or disables the symbology.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int MSI_ENABLE = 0x0608;
     /**
      * This parameter requires that a MSI label contains two check digits.        
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int MSI_REQUIRE_2_CHECK = 0x060A;
     /**
      * This parameter includes the checksum in the label transmission.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int MSI_SEND_CHECK = 0x060B;
     /**
      * This parameter allows to interpret the second check digit as module 11 instead of module 10.        
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int MSI_CHECK_2_MOD_11 = 0x060C;
     /**
      * This parameter is one of the two configurable label lengths.
      * When {@link #MSI_LENGTH_CONTROL} is set to {@link LengthControlMode#TWO_FIXED}, its value is one of the two possible accepted fixed lengths for a specific label.
      * It can also represent the minor or major length value whenever {@link LengthControlMode#RANGE} is selected.
      *
      * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
      * biggest accepted length will be used.  
      *    
      * <p>
      * The class of the property is {@link NumericProperty}.
      * @see #MSI_LENGTH_CONTROL
      */
    public final static int MSI_LENGTH1 = 0x0624;
     /**
      * This parameter is one of the two configurable label lengths.
      * When {@link #MSI_LENGTH_CONTROL} is set to {@link LengthControlMode#TWO_FIXED}, its value is one of the two possible accepted fixed lengths for a specific label.
      * It can also represent the minor or major length value whenever {@link LengthControlMode#RANGE} is selected.
      *
      * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
      * biggest accepted length will be used.  
      *    
      * <p>
      * The class of the property is {@link NumericProperty}.
      * @see #MSI_LENGTH_CONTROL
      */
    public final static int MSI_LENGTH2 = 0x0625;
     /**
      * This parameter specifies how each L1 and L2 length values should be applied to a label. 
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link LengthControlMode}. 
      */
    public final static int MSI_LENGTH_CONTROL = 0x0626;
     /**
      * This parameter specifies the symbology identifier (if any).
      * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
      * {@link SendCodeID#USERDEFINED_IDENTIFIER_BEFORE_LABEL} or {@link SendCodeID#USERDEFINED_IDENTIFIER_AFTER_LABEL}.  
      * <p>
      * The class of the property is {@link CharacterProperty}.
      */
    public final static int MSI_USER_ID = 0x0627;
     /**
      * This parameter controls the aggressiveness for the MSI symbology. 
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link MsiAggressiveness}. 
      */
    public final static int MSI_AGGRESSIVENESS = 0x0628;
     /**
      * This parameter enables the reading of MSI barcode labels with short quiet zones.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int MSI_SHORT_QUIET_ZONES = 0x0629;

    //
    // RSS-14 definitions
    //
    //
     /**
      * This parameter enables or disables the symbology.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int GS1_14_ENABLE = 0x0800;
     /**
      * This parameter convert the Gs1DataBar_14 label to a GS1-128 barcode.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int GS1_14_GS1_128_MODE = 0x0803;
     /**
      * This parameter specifies the symbology identifier (if any).
      * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
      * {@link SendCodeID#USERDEFINED_IDENTIFIER_BEFORE_LABEL} or {@link SendCodeID#USERDEFINED_IDENTIFIER_AFTER_LABEL}.  
      * <p>
      * The class of the property is {@link CharacterProperty}.
      */
    public final static int GS1_14_USER_ID = 0x0821;

    //
    // RSS Limited definitions
    //
    //
     /**
      * This parameter enables or disables the symbology.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int GS1_LIMIT_ENABLE = 0x0808;
     /**
      * This parameter convert the Gs1DataBar_Limited label to a GS1-128 barcode.        
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int GS1_LIMIT_GS1_128_MODE = 0x080B;
     /**
      * This parameter specifies the symbology identifier (if any).
      * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
      * {@link SendCodeID#USERDEFINED_IDENTIFIER_BEFORE_LABEL} or {@link SendCodeID#USERDEFINED_IDENTIFIER_AFTER_LABEL}.  
      * <p>
      * The class of the property is {@link CharacterProperty}.
      */
    public final static int GS1_LIMIT_USER_ID = 0x0823;

    //
    // RSS Expanded definitions
    //
    //
     /**
      * This parameter enables or disables the symbology.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int GS1_EXP_ENABLE = 0x0810;
     /**
      * This parameter convert the Gs1DataBar_Expanded label to a sequence of one or more GS1-128 barcodes.        
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int GS1_EXP_GS1_128_MODE = 0x0813;
     /**
      * This parameter is one of the two configurable label lengths.
      * When {@link #GS1_EXP_LENGTH_CONTROL} is set to {@link LengthControlMode#TWO_FIXED}, its value is one of the two possible accepted fixed lengths for a specific label.
      * It can also represent the minor or major length value whenever {@link LengthControlMode#RANGE} is selected.
      *
      * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
      * biggest accepted length will be used.  
      *    
      * <p>
      * The class of the property is {@link NumericProperty}.
      * @see #GS1_EXP_LENGTH_CONTROL
      */
    public final static int GS1_EXP_LENGTH1 = 0x0824;
     /**
      * This parameter is one of the two configurable label lengths.
      * When {@link #GS1_EXP_LENGTH_CONTROL} is set to {@link LengthControlMode#TWO_FIXED}, its value is one of the two possible accepted fixed lengths for a specific label.
      * It can also represent the minor or major length value whenever {@link LengthControlMode#RANGE} is selected.
      *
      * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
      * biggest accepted length will be used.  
      *    
      * <p>
      * The class of the property is {@link NumericProperty}.
      * @see #GS1_EXP_LENGTH_CONTROL
      */
    public final static int GS1_EXP_LENGTH2 = 0x0825;
     /**
      * This parameter specifies how each L1 and L2 length values should be applied to a label. 
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link LengthControlMode}. 
      */
    public final static int GS1_EXP_LENGTH_CONTROL = 0x0826;
     /**
      * This parameter specifies the symbology identifier (if any).
      * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
      * {@link SendCodeID#USERDEFINED_IDENTIFIER_BEFORE_LABEL} or {@link SendCodeID#USERDEFINED_IDENTIFIER_AFTER_LABEL}.  
      * <p>
      * The class of the property is {@link CharacterProperty}.
      */
    public final static int GS1_EXP_USER_ID = 0x0827;

    //
    // Postal Code definitions
    //
    //
     /**
      * This parameter enables or disables the symbology.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int US_POSTNET_ENABLE = 0x0910;
    //
     /**
      * This parameter enables or disables the symbology.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int US_PLANET_ENABLE = 0x0911;
    //
     /**
      * This parameter enables or disables the symbology.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int USPS_4STATE_ENABLE = 0x0913;
    //
     /**
      * This parameter enables or disables the symbology.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int ROYAL_MAIL_ENABLE = 0x0915;
     /**
      * This parameter includes the Royal Mail checksum in the label transmission.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int ROYAL_MAIL_SEND_CHECK = 0x0916;
    //
     /**
      * This parameter enables or disables the symbology.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int AUSTRALIAN_POST_ENABLE = 0x0917;
    //
     /**
      * This parameter enables or disables the symbology.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int KIX_CODE_ENABLE = 0x0918;
    //
     /**
      * This parameter enables or disables the symbology.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int JAPANESE_POST_ENABLE = 0x0919;
     /**
      * This parameter specifies the symbology identifier (if any).
      * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
      * {@link SendCodeID#USERDEFINED_IDENTIFIER_BEFORE_LABEL} or {@link SendCodeID#USERDEFINED_IDENTIFIER_AFTER_LABEL}.  
      * <p>
      * The class of the property is {@link CharacterProperty}.
      */
    public final static int US_PLANET_CODE_USER_ID = 0x092A;
     /**
      * This parameter specifies the symbology identifier (if any).
      * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
      * {@link SendCodeID#USERDEFINED_IDENTIFIER_BEFORE_LABEL} or {@link SendCodeID#USERDEFINED_IDENTIFIER_AFTER_LABEL}.  
      * <p>
      * The class of the property is {@link CharacterProperty}.
      */
    public final static int US_POSTNET_CODE_USER_ID = 0x092B;
     /**
      * This parameter specifies the symbology identifier (if any).
      * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
      * {@link SendCodeID#USERDEFINED_IDENTIFIER_BEFORE_LABEL} or {@link SendCodeID#USERDEFINED_IDENTIFIER_AFTER_LABEL}.  
      * <p>
      * The class of the property is {@link CharacterProperty}.
      */
    public final static int USPS_4STATE_CODE_USER_ID = 0x092C;
     /**
      * This parameter specifies the symbology identifier (if any).
      * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
      * {@link SendCodeID#USERDEFINED_IDENTIFIER_BEFORE_LABEL} or {@link SendCodeID#USERDEFINED_IDENTIFIER_AFTER_LABEL}.  
      * <p>
      * The class of the property is {@link CharacterProperty}.
      */
    public final static int ROYAL_MAIL_CODE_USER_ID = 0x092E;
     /**
      * This parameter specifies the symbology identifier (if any).
      * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
      * {@link SendCodeID#USERDEFINED_IDENTIFIER_BEFORE_LABEL} or {@link SendCodeID#USERDEFINED_IDENTIFIER_AFTER_LABEL}.  
      * <p>
      * The class of the property is {@link CharacterProperty}.
      */
    public final static int AUSTRALIAN_CODE_USER_ID = 0x092F;
     /**
      * This parameter specifies the symbology identifier (if any).
      * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
      * {@link SendCodeID#USERDEFINED_IDENTIFIER_BEFORE_LABEL} or {@link SendCodeID#USERDEFINED_IDENTIFIER_AFTER_LABEL}.  
      * <p>
      * The class of the property is {@link CharacterProperty}.
      */
    public final static int KIX_CODE_USER_ID = 0x0930;
     /**
      * This parameter specifies the symbology identifier (if any).
      * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
      * {@link SendCodeID#USERDEFINED_IDENTIFIER_BEFORE_LABEL} or {@link SendCodeID#USERDEFINED_IDENTIFIER_AFTER_LABEL}.  
      * <p>
      * The class of the property is {@link CharacterProperty}.
      */
    public final static int JAPANESE_POST_CODE_USER_ID = 0x0931;

    //
    // PDF417 definitions
    //
    //
     /**
      * This parameter enables or disables the symbology.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int PDF417_ENABLE = 0x0A00;
     /**
      * This parameter is one of the two configurable label lengths.
      * When {@link #PDF417_LENGTH_CONTROL} is set to {@link LengthControlMode#TWO_FIXED}, its value is one of the two possible accepted fixed lengths for a specific label.
      * It can also represent the minor or major length value whenever {@link LengthControlMode#RANGE} is selected.
      *
      * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
      * biggest accepted length will be used.  
      *    
      * <p>
      * The class of the property is {@link NumericProperty}.
      * @see #PDF417_LENGTH_CONTROL
      */
    public final static int PDF417_LENGTH1 = 0x0A20;
     /**
      * This parameter is one of the two configurable label lengths.
      * When {@link #PDF417_LENGTH_CONTROL} is set to {@link LengthControlMode#TWO_FIXED}, its value is one of the two possible accepted fixed lengths for a specific label.
      * It can also represent the minor or major length value whenever {@link LengthControlMode#RANGE} is selected.
      *
      * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
      * biggest accepted length will be used.  
      *    
      * <p>
      * The class of the property is {@link NumericProperty}.
      * @see #PDF417_LENGTH_CONTROL
      */
    public final static int PDF417_LENGTH2 = 0x0A21;
     /**
      * This parameter specifies how each L1 and L2 length values should be applied to a label. 
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link LengthControlMode}. 
      */
    public final static int PDF417_LENGTH_CONTROL = 0x0A22;
     /**
      * This parameter specifies the symbology identifier (if any).
      * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
      * {@link SendCodeID#USERDEFINED_IDENTIFIER_BEFORE_LABEL} or {@link SendCodeID#USERDEFINED_IDENTIFIER_AFTER_LABEL}.  
      * <p>
      * The class of the property is {@link CharacterProperty}.
      */
    public final static int PDF417_USER_ID = 0x0A23;
     /**
      * This parameter controls the character set in use for the decoded label.  
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link CharacterSetMode}. 
      */
    public final static int PDF417_CHARACTER_SET_MODE = 0x0A02;

    //
    // MicroPDF417 definitions
    //
    //
     /**
      * This parameter enables or disables the symbology.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int MICROPDF417_ENABLE = 0x0A08;
     /**
      * This parameter is one of the two configurable label lengths.
      * When {@link #MICROPDF417_LENGTH_CONTROL} is set to {@link LengthControlMode#TWO_FIXED}, its value is one of the two possible accepted fixed lengths for a specific label.
      * It can also represent the minor or major length value whenever {@link LengthControlMode#RANGE} is selected.
      *
      * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
      * biggest accepted length will be used.  
      *    
      * <p>
      * The class of the property is {@link NumericProperty}.
      * @see #MICROPDF417_LENGTH_CONTROL
      */
    public final static int MICROPDF417_LENGTH1 = 0x0A24;
     /**
      * This parameter is one of the two configurable label lengths.
      * When {@link #MICROPDF417_LENGTH_CONTROL} is set to {@link LengthControlMode#TWO_FIXED}, its value is one of the two possible accepted fixed lengths for a specific label.
      * It can also represent the minor or major length value whenever {@link LengthControlMode#RANGE} is selected.
      *
      * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
      * biggest accepted length will be used.  
      *    
      * <p>
      * The class of the property is {@link NumericProperty}.
      * @see #MICROPDF417_LENGTH_CONTROL
      */
    public final static int MICROPDF417_LENGTH2 = 0x0A25;
     /**
      * This parameter specifies how each L1 and L2 length values should be applied to a label. 
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link LengthControlMode}. 
      */
    public final static int MICROPDF417_LENGTH_CONTROL = 0x0A26;
     /**
      * This parameter specifies the symbology identifier (if any).
      * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
      * {@link SendCodeID#USERDEFINED_IDENTIFIER_BEFORE_LABEL} or {@link SendCodeID#USERDEFINED_IDENTIFIER_AFTER_LABEL}.  
      * <p>
      * The class of the property is {@link CharacterProperty}.
      */
    public final static int MICROPDF417_USER_ID = 0x0A27;
     /**
      * This parameter controls the character set in use for the decoded label.  
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link CharacterSetMode}. 
      */
    public final static int MICROPDF417_CHARACTER_SET_MODE = 0x0A0A;

    //
    // UCC EAN Composite
    //
    //
     /**
      * This parameter enables or disables the symbology.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int COMPOSITE_ENABLE = 0x0A30;
     /**
      * This parameter controls UPC/EAN label recognition mode.   
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link UpcEanCompositeMode}. 
      */
    public final static int COMPOSITE_EAN_UPC_MODE = 0x0A32;
     /**
      * This parameter convert the Composite label to a sequence of one or more GS1-128 barcodes.    
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int COMPOSITE_GS1_128_MODE = 0x0A33;
     /**
      * This parameter enable linear code transmission.        
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int COMPOSITE_LINEAR_TRANSMISSION_ENABLE = 0x0A34;
     /**
      * This parameter specifies the symbology identifier (if any).
      * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
      * {@link SendCodeID#USERDEFINED_IDENTIFIER_BEFORE_LABEL} or {@link SendCodeID#USERDEFINED_IDENTIFIER_AFTER_LABEL}.  
      * <p>
      * The class of the property is {@link CharacterProperty}.
      */
    public final static int COMPOSITE_USER_ID = 0x0A53;

    //
    // DataMatrix definitions
    //
    //
     /**
      * This parameter enables or disables the symbology.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int DATAMATRIX_ENABLE = 0x0B00;
     /**
      * This parameter is one of the two configurable label lengths.
      * When {@link #DATAMATRIX_LENGTH_CONTROL} is set to {@link LengthControlMode#TWO_FIXED}, its value is one of the two possible accepted fixed lengths for a specific label.
      * It can also represent the minor or major length value whenever {@link LengthControlMode#RANGE} is selected.
      *
      * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
      * biggest accepted length will be used.  
      *    
      * <p>
      * The class of the property is {@link NumericProperty}.
      * @see #DATAMATRIX_LENGTH_CONTROL
      */
    public final static int DATAMATRIX_LENGTH1 = 0x0B20;
     /**
      * This parameter is one of the two configurable label lengths.
      * When {@link #DATAMATRIX_LENGTH_CONTROL} is set to {@link LengthControlMode#TWO_FIXED}, its value is one of the two possible accepted fixed lengths for a specific label.
      * It can also represent the minor or major length value whenever {@link LengthControlMode#RANGE} is selected.
      *
      * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
      * biggest accepted length will be used.  
      *    
      * <p>
      * The class of the property is {@link NumericProperty}.
      * @see #DATAMATRIX_LENGTH_CONTROL
      */
    public final static int DATAMATRIX_LENGTH2 = 0x0B21;
     /**
      * This parameter specifies how each L1 and L2 length values should be applied to a label. 
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link LengthControlMode}. 
      */
    public final static int DATAMATRIX_LENGTH_CONTROL = 0x0B22;
     /**
      * This parameter specifies the symbology identifier (if any).
      * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
      * {@link SendCodeID#USERDEFINED_IDENTIFIER_BEFORE_LABEL} or {@link SendCodeID#USERDEFINED_IDENTIFIER_AFTER_LABEL}.  
      * <p>
      * The class of the property is {@link CharacterProperty}.
      */
    public final static int DATAMATRIX_USER_ID = 0x0B23;
     /**
      * This parameter controls the character set in use for the decoded label.  
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link CharacterSetMode}. 
      */
    public final static int DATAMATRIX_CHARACTER_SET_MODE = 0x0B02;
     /**
      * This parameter control the operating mode.   
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link DatamatrixOpMode}. 
      */
    public final static int DATAMATRIX_OPERATING_MODE = 0x0B03;
     /**
      * This parameter controls the mirror mode. It controls the scanning capabilities of Data Matrix barcodes from mirror reflections.    
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link DatamatrixMirror}. 
      */
    public final static int DATAMATRIX_MIRROR = 0x0B04;
     /**
      * This parameter enables or disables the symbology.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int DATAMATRIX_GS1_ENABLE = 0x0B05;
     /**
      * This parameter controls the aggressiveness for the Datamatrix symbology.
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link DatamatrixAggressiveness}. 
      */
    public final static int DATAMATRIX_AGGRESSIVENESS = 0x0B06;
     /**
      * This parameter enables or disables DataMatrix Rectangular Extended dimensions (DMRE).
      * New AIM specs introduce new Datamatrix format:
      * 8x48, 8x64, 12x48, 12x64, 16x64, 24x32, 24x36, 24x48, 24x64, 26x32, 26x40, 26x48, 26x64
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int DATAMATRIX_DMRE = 0x0B0A;
    /**
     * This parameter enables or disables the GS1-DIGITAL-LINK-DATAMATRIX symbology.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int DATAMATRIX_GS1_DL_ENABLE = 0x0B0B;

    //
    // MaxiCode definitions
    //
    //
     /**
      * This parameter enables or disables the symbology.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int MAXICODE_ENABLE = 0x0B08;
     /**
      * This parameter is one of the two configurable label lengths.
      * When {@link #MAXICODE_LENGTH_CONTROL} is set to {@link LengthControlMode#TWO_FIXED}, its value is one of the two possible accepted fixed lengths for a specific label.
      * It can also represent the minor or major length value whenever {@link LengthControlMode#RANGE} is selected.
      *
      * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
      * biggest accepted length will be used.  
      *    
      * <p>
      * The class of the property is {@link NumericProperty}.
      * @see #MAXICODE_LENGTH_CONTROL
      */
    public final static int MAXICODE_LENGTH1 = 0x0B24;
     /**
      * This parameter is one of the two configurable label lengths.
      * When {@link #MAXICODE_LENGTH_CONTROL} is set to {@link LengthControlMode#TWO_FIXED}, its value is one of the two possible accepted fixed lengths for a specific label.
      * It can also represent the minor or major length value whenever {@link LengthControlMode#RANGE} is selected.
      *
      * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
      * biggest accepted length will be used.  
      *    
      * <p>
      * The class of the property is {@link NumericProperty}.
      * @see #MAXICODE_LENGTH_CONTROL
      */
    public final static int MAXICODE_LENGTH2 = 0x0B25;
     /**
      * This parameter specifies how each L1 and L2 length values should be applied to a label. 
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link LengthControlMode}. 
      */
    public final static int MAXICODE_LENGTH_CONTROL = 0x0B26;
     /**
      * This parameter specifies the symbology identifier (if any).
      * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
      * {@link SendCodeID#USERDEFINED_IDENTIFIER_BEFORE_LABEL} or {@link SendCodeID#USERDEFINED_IDENTIFIER_AFTER_LABEL}.  
      * <p>
      * The class of the property is {@link CharacterProperty}.
      */
    public final static int MAXICODE_USER_ID = 0x0B27;

    //
    // QR Code definitions
    //
    //
     /**
      * This parameter enables or disables the symbology.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int QRCODE_ENABLE = 0x0B10;
     /**
      * This parameter is one of the two configurable label lengths.
      * When {@link #QRCODE_LENGTH_CONTROL} is set to {@link LengthControlMode#TWO_FIXED}, its value is one of the two possible accepted fixed lengths for a specific label.
      * It can also represent the minor or major length value whenever {@link LengthControlMode#RANGE} is selected.
      *
      * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
      * biggest accepted length will be used.  
      *    
      * <p>
      * The class of the property is {@link NumericProperty}.
      * @see #QRCODE_LENGTH_CONTROL
      */
    public final static int QRCODE_LENGTH1 = 0x0B28;
     /**
      * This parameter is one of the two configurable label lengths.
      * When {@link #QRCODE_LENGTH_CONTROL} is set to {@link LengthControlMode#TWO_FIXED}, its value is one of the two possible accepted fixed lengths for a specific label.
      * It can also represent the minor or major length value whenever {@link LengthControlMode#RANGE} is selected.
      *
      * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
      * biggest accepted length will be used.  
      *    
      * <p>
      * The class of the property is {@link NumericProperty}.
      * @see #QRCODE_LENGTH_CONTROL
      */
    public final static int QRCODE_LENGTH2 = 0x0B29;
     /**
      * This parameter specifies how each L1 and L2 length values should be applied to a label. 
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link LengthControlMode}. 
      */
    public final static int QRCODE_LENGTH_CONTROL = 0x0B2A;
     /**
      * This parameter specifies the symbology identifier (if any).
      * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
      * {@link SendCodeID#USERDEFINED_IDENTIFIER_BEFORE_LABEL} or {@link SendCodeID#USERDEFINED_IDENTIFIER_AFTER_LABEL}.  
      * <p>
      * The class of the property is {@link CharacterProperty}.
      */
    public final static int QRCODE_USER_ID = 0x0B2B;
     /**
      * This parameter controls the character set in use for the decoded label.  
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link CharacterSetMode}. 
      */
    public final static int QRCODE_CHARACTER_SET_MODE = 0x0B12;
     /**
      * This parameter enables Wi-Fi configuration through Wi-Fi QR Code.      
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int QRCODE_WIFI_ENABLE = 0x30E41;
     /**
      * This parameter enables or disables the GS1-QR Code symbology.        
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int QRCODE_GS1_ENABLE = 0x0B13;
     /**
      * This parameter enables device configuration through Scan2Deploy QR Codes.        
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int QRCODE_S2D_ENABLE = 0x30E42;
     /**
      * This parameter controls the mirror mode.
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link QRMirror}. 
      */
    public final static int QRCODE_MIRROR = 0x0B07;
     /**
      * This parameter enables or disables Absolute Grid algorithm. It performs
      * a geometric reconstruction of the QR Code grid by regularizing it. This algorithm is executed
      * only when the standard one fails. It may slow down decoding rate.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int QRCODE_ABSOLUTE_GRID = 0x0B09;
    /**
     * This parameter enables or disables the GS1-DIGITAL-LINK-QR Code symbology.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int QRCODE_GS1_DL_ENABLE = 0x0B15;

    //
    // Micro QR Code definitions
    //
    //
     /**
      * This parameter enables or disables the symbology.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int MICRO_QR_ENABLE = 0x0B14;
     /**
      * This parameter is one of the two configurable label lengths.
      * When {@link #MICRO_QR_LENGTH_CONTROL} is set to {@link LengthControlMode#TWO_FIXED}, its value is one of the two possible accepted fixed lengths for a specific label.
      * It can also represent the minor or major length value whenever {@link LengthControlMode#RANGE} is selected.
      *
      * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
      * biggest accepted length will be used.  
      *    
      * <p>
      * The class of the property is {@link NumericProperty}.
      * @see #MICRO_QR_LENGTH_CONTROL
      */
    public final static int MICRO_QR_LENGTH1 = 0x0B30;
     /**
      * This parameter is one of the two configurable label lengths.
      * When {@link #MICRO_QR_LENGTH_CONTROL} is set to {@link LengthControlMode#TWO_FIXED}, its value is one of the two possible accepted fixed lengths for a specific label.
      * It can also represent the minor or major length value whenever {@link LengthControlMode#RANGE} is selected.
      *
      * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
      * biggest accepted length will be used.  
      *    
      * <p>
      * The class of the property is {@link NumericProperty}.
      * @see #MICRO_QR_LENGTH_CONTROL
      */
    public final static int MICRO_QR_LENGTH2 = 0x0B31;
     /**
      * This parameter specifies how each L1 and L2 length values should be applied to a label. 
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link LengthControlMode}. 
      */
    public final static int MICRO_QR_LENGTH_CONTROL = 0x0B32;
     /**
      * This parameter specifies the symbology identifier (if any).
      * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
      * {@link SendCodeID#USERDEFINED_IDENTIFIER_BEFORE_LABEL} or {@link SendCodeID#USERDEFINED_IDENTIFIER_AFTER_LABEL}.  
      * <p>
      * The class of the property is {@link CharacterProperty}.
      */
    public final static int MICRO_QR_USER_ID = 0x0B33;
     /**
      * This parameter controls the character set in use for the decoded label.  
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link CharacterSetMode}. 
      */
    public final static int MICRO_QR_CHARACTER_SET_MODE = 0x0B16;

    //
    // Aztec Code definitions
    //
    //
     /**
      * This parameter enables or disables the symbology.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int AZTEC_ENABLE = 0x0B18;
     /**
      * This parameter is one of the two configurable label lengths.
      * When {@link #AZTEC_LENGTH_CONTROL} is set to {@link LengthControlMode#TWO_FIXED}, its value is one of the two possible accepted fixed lengths for a specific label.
      * It can also represent the minor or major length value whenever {@link LengthControlMode#RANGE} is selected.
      *
      * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
      * biggest accepted length will be used.  
      *    
      * <p>
      * The class of the property is {@link NumericProperty}.
      * @see #AZTEC_LENGTH_CONTROL
      */
    public final static int AZTEC_LENGTH1 = 0x0B2C;
     /**
      * This parameter is one of the two configurable label lengths.
      * When {@link #AZTEC_LENGTH_CONTROL} is set to {@link LengthControlMode#TWO_FIXED}, its value is one of the two possible accepted fixed lengths for a specific label.
      * It can also represent the minor or major length value whenever {@link LengthControlMode#RANGE} is selected.
      *
      * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
      * biggest accepted length will be used.  
      *    
      * <p>
      * The class of the property is {@link NumericProperty}.
      * @see #AZTEC_LENGTH_CONTROL
      */
    public final static int AZTEC_LENGTH2 = 0x0B2D;
     /**
      * This parameter specifies how each L1 and L2 length values should be applied to a label. 
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link LengthControlMode}. 
      */
    public final static int AZTEC_LENGTH_CONTROL = 0x0B2E;
     /**
      * This parameter specifies the symbology identifier (if any).
      * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
      * {@link SendCodeID#USERDEFINED_IDENTIFIER_BEFORE_LABEL} or {@link SendCodeID#USERDEFINED_IDENTIFIER_AFTER_LABEL}.  
      * <p>
      * The class of the property is {@link CharacterProperty}.
      */
    public final static int AZTEC_USER_ID = 0x0B2F;
     /**
      * This parameter controls the character set in use for the decoded label.  
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link CharacterSetMode}. 
      */
    public final static int AZTEC_CHARACTER_SET_MODE = 0x0B1A;

    //
    // Digimarc Barcode definitions
    //
    //
     /**
      * This parameter enables or disables the symbology.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int DIGIMARC_ENABLE = 0x10000;

     /**
      * This paramater configures which data format is used for Digimarc barcode.
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link DigimarcDataFormat}.
      */
    public final static int DIGIMARC_DATAFORMAT = 0x10001;

     /**
      * This parameter determines the frequency for attempting to decode using Digimarc., lower values are higher priority for Digimarc.
      * <p>
      * The class of the property is {@link NumericProperty}.
      */
    public final static int DIGIMARC_PRIORITY = 0x10002;

    /**
     * This parameter specifies the symbology identifier (if any).
     * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to
     * {@link SendCodeID#USERDEFINED_IDENTIFIER_BEFORE_LABEL} or {@link SendCodeID#USERDEFINED_IDENTIFIER_AFTER_LABEL}.
     * <p>
     * The class of the property is {@link CharacterProperty}.
     */
    public final static int DIGIMARC_USER_ID = 0x10003;

    //
    // DotCode definitions
    //
    //
     /**
      * This parameter enables or disables the symbology.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int DOTCODE_ENABLE = 0x0C00;
     /**
      * This parameter is one of the two configurable label lengths.
      * When {@link #DOTCODE_LENGTH_CONTROL} is set to {@link LengthControlMode#TWO_FIXED}, its value is one of the two possible accepted fixed lengths for a specific label.
      * It can also represent the minor or major length value whenever {@link LengthControlMode#RANGE} is selected.
      *
      * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
      * biggest accepted length will be used.  
      *    
      * <p>
      * The class of the property is {@link NumericProperty}.
      * @see #DOTCODE_LENGTH_CONTROL
      */
    public final static int DOTCODE_LENGTH1 = 0x0C20;
     /**
      * This parameter is one of the two configurable label lengths.
      * When {@link #DOTCODE_LENGTH_CONTROL} is set to {@link LengthControlMode#TWO_FIXED}, its value is one of the two possible accepted fixed lengths for a specific label.
      * It can also represent the minor or major length value whenever {@link LengthControlMode#RANGE} is selected.
      *
      * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
      * biggest accepted length will be used.  
      *    
      * <p>
      * The class of the property is {@link NumericProperty}.
      * @see #DOTCODE_LENGTH_CONTROL
      */
    public final static int DOTCODE_LENGTH2 = 0x0C21;
     /**
      * This parameter specifies how each L1 and L2 length values should be applied to a label. 
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link LengthControlMode}. 
      */
    public final static int DOTCODE_LENGTH_CONTROL = 0x0C22;
     /**
      * This parameter specifies the symbology identifier (if any).
      * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
      * {@link SendCodeID#USERDEFINED_IDENTIFIER_BEFORE_LABEL} or {@link SendCodeID#USERDEFINED_IDENTIFIER_AFTER_LABEL}.  
      * <p>
      * The class of the property is {@link CharacterProperty}.
      */
    public final static int DOTCODE_USER_ID = 0x0C23;
     /**
      * This parameter controls the character set in use for the decoded label.  
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link CharacterSetMode}. 
      */
    public final static int DOTCODE_CHARACTER_SET_MODE = 0x0C02;

    //
    // ISBT 128 definitions
    //
    //
     /**
      * This parameter enables or disables the symbology.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int ISBT_128_ENABLE = 0x0D00;
     /**
      * This parameter specifies the symbology identifier (if any).
      * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
      * {@link SendCodeID#USERDEFINED_IDENTIFIER_BEFORE_LABEL} or {@link SendCodeID#USERDEFINED_IDENTIFIER_AFTER_LABEL}.  
      * <p>
      * The class of the property is {@link CharacterProperty}.
      */
    public final static int ISBT_128_USER_ID = 0x0D01;
     /**
      * This parameter allows the concatenation of common concatenated pairs.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int ISBT_128_COMMONLY_CONCATENATED_PAIRS = 0x0D02;
     /**
      * This parameter defines the decoding mode for ISBT 128 barcodes.  
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link Isbt128Mode}. 
      */
    public final static int ISBT_128_MODE = 0x0D03;

    //
    // Wedge - Keyboard, Intent mode & Web
    //
     /**
      * This parameter enables the the keystroke mode for the Decode Wedge capability.
      * <p>
      * This means that the label is sent to the foreground application in the form of key events.         
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WEDGE_KEYBOARD_ENABLE = 0x11170;
     /**
      * This parameter enables the input of the keystrokes only in input areas with active focus and an IME active, such as a touch keyboard.
      * <p>
      * This means that the label will be sent to the foreground application in the form of key events only when previous 
      * conditions will be met. Instead, set to false, it will emulate keystrokes directly into the foreground activity. , 
      * Be aware, keeping this deactivated could lead to undesired behaviors.         
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WEDGE_KEYBOARD_ONLY_ON_FOCUS = 0x11171;
     /**
      * This parameter indicates the method by which the KeyboardWedge operates.  
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link KeyWedgeMode}. 
      */
    public final static int WEDGE_KEYBOARD_DELIVERY_MODE = 0x11172;
    /**
     * @hide
     */
    public final static int WEDGE_KEYBOARD_INJECTION2COMMIT = 0x11173;
    /**
     * Delay applied before and after every non printable character. This is valid only for the commit text and the text injection modes
     * of the keyboard wedge.
     * <p>
     * The class of the property is {@link NumericProperty}.
     */
    public final static int WEDGE_KEYBOARD_NON_PRINTABLE_KEY_EVENT_DELAY = 0x11174;
     /**
      * This parameter enables the intent mode for the Decode Wedge.
      * <p>
      * This means that the decoding results are always sent through an intent, such as broadcast, start activity or start sevice,
      * according to the value of the property {@link #WEDGE_INTENT_DELIVERY_MODE}.
      * <p>
      * The Decode Wedge can be configured to define the intent sent with the decoding result as expected by a given App.
      * In particular, beside the delivery mode, common intent information can be configured, such as:
      * <ul>
      * <li>the intent <b>action</b> can be configured by the property {@link #WEDGE_INTENT_ACTION_NAME}
      * <li>the intent <b>category</b> can be configured by the property {@link #WEDGE_INTENT_CATEGORY_NAME}
      * </ul>
      * <p>
      * Moreover, some extra data can be configured to send custom information, such as symbology and read label:
      * <ul>
      * <li>the <b>extra name</b> where the <b>symbology</b> of the decoded barcode is provided as a <b>String</b>
      * can be defined by the property {@link #WEDGE_INTENT_EXTRA_BARCODE_TYPE}.
      * This extra name shall be used as the name argument of Intent.getStringExtra() to retrieve the symbology of the decoded barcode.</li>
      * <li>the <b>extra name</b> where the <b>read label</b> of the decoded barcode is provided as a <b>String</b>
      * can be configured by the property {@link #WEDGE_INTENT_EXTRA_BARCODE_STRING}.
      * This extra name shall be used as the name argument of Intent.getStringExtra() to retrieve the read label of the decoded barcode.
      * For those barcode symbologies that support concatenation, the read labels are concatenated and sent as a single string.</li>
      * <li>the <b>extra name</b> where the <b>read label</b> of the decoded barcode is provided as a <b>list of byte arrays</b>
      * can be configured by the property {@link #WEDGE_INTENT_EXTRA_BARCODE_DATA}.
      * This extra name shall be used as the name argument of Intent.getSerializableExtra() to retrieve the read label of the decoded barcode.
      * For those barcode symbologies that support concatenation, the decode data is stored in
      * multiple byte arrays (one byte array per bar code). Clients can get data in each byte array by passing an index.</li>
      * </ul>
      * <p>
      * <p>
      * The default value is disabled.
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WEDGE_INTENT_ENABLE = 0x30D40;
     /**
      * This parameter defines the action name for the intent sent by the Decode Wedge.
      * It takes effect if the Decode Wedge is properly configured according to the property {@link #WEDGE_INTENT_ENABLE}
      * <p>
      * The default value is "com.datalogic.decodewedge.decode_action".
      * <p>
      * The class of the property is {@link TextProperty}.
      */
    public final static int WEDGE_INTENT_ACTION_NAME = 0x30D41;
     /**
      * This parameter defines the category name for the intent sent by the Decode Wedge.
      * It takes effect if the Decode Wedge is properly configured according to the property {@link #WEDGE_INTENT_ENABLE}
      * <p>
      * The default value is "com.datalogic.decodewedge.decode_category".
      * <p>       
      * The class of the property is {@link TextProperty}.
      */
    public final static int WEDGE_INTENT_CATEGORY_NAME = 0x30D42;
     /**
      * This parameter defines the method used to deliver the intent.
      * It can be a Broadcast, StartActivity or StartService intent.
      * It takes effect if the Decode Wedge is properly configured according to the property {@link #WEDGE_INTENT_ENABLE}
      * <p>
      * The default value is Broadcast intent.
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link IntentDeliveryMode}. 
      */
    public final static int WEDGE_INTENT_DELIVERY_MODE = 0x30D43;
     /**
      * This parameter defines the name of the extra field of the Decode Wedge intent containing the read label of the decoded barcode as extra value (as list of byte arrays).
      * <p>
      * It takes effect if the Decode Wedge is properly configured according to the property {@link #WEDGE_INTENT_ENABLE}.
      * <p>
      * This extra name shall be used as the name argument of Intent.getSerializableExtra() to retrieve the read label of the decoded barcode.
      * The extra value is a byte array containing one or more read labels.
      * For those barcode symbologies that support concatenation, the decode data is stored in
      * multiple byte arrays (one byte array per bar code). Clients can get data in each byte array by passing an index.
      * <p>
      * The default value is "com.datalogic.decode.intentwedge.barcode_data".
      * <p>
      * The class of the property is {@link TextProperty}.
      */
    public final static int WEDGE_INTENT_EXTRA_BARCODE_DATA = 0x30D44;
    /**
     * This parameter defines the name of the extra field of the Decode Wedge intent containing the symbology of the decoded barcode as extra value.
     * <p>
     * It takes effect if the Decode Wedge is properly configured according to the property {@link #WEDGE_INTENT_ENABLE}.
     * <p>
     * This extra name shall be used as the name argument of Intent.getStringExtra() to retrieve the symbology of the decoded barcode.
     * The extra value is a String containing the symbology of the decoded barcode.
     * <p>
     * The default value is "com.datalogic.decode.intentwedge.barcode_type".
     * <p>
     * The class of the property is {@link TextProperty}.
     */
    public final static int WEDGE_INTENT_EXTRA_BARCODE_TYPE = 0x30D45;
    /**
     * This parameter defines the name of the extra field of the Decode Wedge intent containing the read label of the decoded barcode as extra value (as String).
     * <p>
     * It takes effect if the Decode Wedge is properly configured according to the property {@link #WEDGE_INTENT_ENABLE}.
     * <p>
     * This extra name shall be used as the name argument of Intent.getStringExtra() to retrieve the read label of the decoded barcode.
     * The extra value is a String containing one or more read labels.
     * For those barcode symbologies that support concatenation, the read labels are concatenated and sent as a single string.
     * <p>
     * The default value is "com.datalogic.decode.intentwedge.barcode_string".
     * <p>
     * The class of the property is {@link TextProperty}.
     */
    public final static int WEDGE_INTENT_EXTRA_BARCODE_STRING = 0x30D46;
    /**
     * This parameter indicates if the empty intent values have to be excluded. This considers all extras' names and the category, while the action is always included in the intent.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int WEDGE_INTENT_EXCLUDE_EMPTY_VALUES = 0x30D47;
    /**
     * This parameter defines the name of the extra field of the Decode Wedge intent containing the user ID of the decoded barcode as extra value (as String).
     * <p>
     * This extra name shall be used as the name argument of Intent.getStringExtra() to retrieve the user ID of the decoded barcode.
     * <p>
     * The default value is "com.datalogic.decode.intentwedge.barcode_user_id".
     * <p>
     * The class of the property is {@link TextProperty}.
     */
     public final static int WEDGE_INTENT_EXTRA_BARCODE_USER_ID = 0x30D48;
     /**
     * This parameter defines the name of the extra field of the Decode Wedge intent containing the AIM ID of the decoded barcode as extra value (as String)
     * <p>
     * This extra name shall be used as the name argument of Intent.getStringExtra() to retrieve the AIM ID of the decoded barcode.
     * <p>
     * The default value is "com.datalogic.decode.intentwedge.barcode_aim_id".
     * <p>
     * The class of the property is {@link TextProperty}.
      */
    public final static int WEDGE_INTENT_EXTRA_BARCODE_AIM_ID = 0x30D49;
    /**
     * This parameter defines the name of the extra field of the Decode Wedge intent containing the crop of the decoded barcode as extra value (as byte array).
     * The crop must be first enabled in the decoded result by setting the property {@link #DECODE_RESULT_CROP_BARCODE_ENABLE} or {@link #DECODE_RESULT_CROP_SNAP_OCR_ENABLE}.
     * The resulting byte array represents an image in JPEG format.
     * <p>
     * This extra name shall be used as the name argument of Intent.getByteArrayExtra() to retrieve the crop of the decoded barcode.
     * <p>
     * The default value is "com.datalogic.decode.intentwedge.barcode_crop".
     * <p>
     * The class of the property is {@link TextProperty}.
     */
    public final static int WEDGE_INTENT_EXTRA_BARCODE_CROP = 0x30D4A;
     /**
      * This parameter enables the Decode Wedge capability for direct web browsing. 
      * <p>
      * Each time a label is decoded successfully and a valid URL is found, the available and selected Internet web browsing application will be launched pointing to the desired URL.        
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int WEDGE_WEB_ENABLE = 0x30E40;

    //
    // External formatting
    //
     /**
      * @hide
      * This parameter enables the external formatting service.
      * <p>       
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int EXTERNAL_FORMATTING_ENABLE = 0x40000;

    //
    // Visual formatting
    //
     /**
      * @hide
      * This parameter enables the external formatting service.
      * <p>       
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int VISUAL_FORMATTING_ENABLE = 0x40100;
     /**
      * @hide
      * This parameter stores the path to the visual formatting script.
      * <p>       
      * The class of the property is {@link TextProperty}.
      */
    public final static int VISUAL_FORMATTING_PATH = 0x40101;

     /**
     * @hide
     */
    public final static int VISUAL_FORMATTING_TIMEOUT = 0x40102;

    /**
     * @hide
     */
    public final static int VISUAL_FORMATTING_ACTIVE_ITEM = 0x40103;

    //
    // ECI Policy
    //
     /**
      * This parameter selects the policy used to handle ECI. 
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link ECIPolicy}. 
      */
    public final static int ECI_POLICY = 0x40200;

    //
    // OCR
    //
    //
     /**
      * This parameter enables or disables the symbology.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int OCR_ENABLE = 0x40300;
     /**
      * This parameter specifies the symbology identifier (if any).
      * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
      * {@link SendCodeID#USERDEFINED_IDENTIFIER_BEFORE_LABEL} or {@link SendCodeID#USERDEFINED_IDENTIFIER_AFTER_LABEL}.  
      * <p>
      * The class of the property is {@link CharacterProperty}.
      */
    public final static int OCR_USER_ID = 0x40301;
 
     /**
      * This parameter allows to read passport booklet in TD3 size. The data of the machine-readable zone consists of two rows of 44 characters each.        
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int OCR_PASSPORT_ENABLE = 0x40302;
     /**
      * This parameter allows to read official travel document in TD1 size. The data of the machine-readable zone consists of three rows of 30 characters each.         
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int OCR_ID_ENABLE = 0x40303;
     /**
      * This parameter allows to set minimum confidence used by the OCR algorithm. An higher confidence decreases misdecoding probabilities.          
      * <p>
      * The class of the property is {@link NumericProperty}.
      */
    public final static int OCR_CONFIDENCE = 0x40304;
     /**
      * This parameter specifies how many decoded frames must match before accepting OCR data.           
      * <p>
      * The class of the property is {@link NumericProperty}.
      */
    public final static int OCR_MULTIFRAME = 0x40305;

    //
    // Camera
    //
    /**
     * This parameter indicates the input type to use for decoding.<br/>
     * <b>NOTE:</b> After changing this parameter, the scanner will take a few seconds to reconfigure (generally around 2 or 3 seconds).
     * During this time, any subsequent property change might fail and needs to be applied again.
     * <p>
     * The class of the property is {@link EnumProperty}.
     * The allowed values are defined by enum {@link com.datalogic.decode.configuration.InputType}.
     */
    public final static int INPUT_TYPE = 0x40401;
    /**
     * This parameter indicates the display mode in which to show the
     * camera preview in case the input type is set to camera.
     * <p>
     * The class of the property is {@link EnumProperty}.
     * The allowed values are defined by enum {@link com.datalogic.decode.configuration.PreviewDisplayMode}.
     */
    public final static int PREVIEW_DISPLAY_MODE = 0x40402;
    /**
     * This parameter indicates the Y coordinate of the preview shown
     * in case of manual display mode and camera input type, when the
     * device is positioned in portrait.
     * <p>
     * The class of the property is {@link NumericProperty}.
     */
    public final static int PREVIEW_DISPLAY_MODE_MANUAL_PORTRAIT_X = 0x40403;
    /**
     * This parameter indicates the Y coordinate of the preview shown
     * in case of manual display mode and camera input type, when the
     * device is positioned in portrait.
     * <p>
     * The class of the property is {@link NumericProperty}.
     */
    public final static int PREVIEW_DISPLAY_MODE_MANUAL_PORTRAIT_Y = 0x40404;
    /**
     * This parameter indicates the width of the preview shown
     * in case of manual display mode and camera input type, when the
     * device is positioned in portrait. The camera frames will retain their
     * original aspect ratio but they will resize in order to fit inside the
     * preview box specified by the width and height parameters.
     * <p>
     * The class of the property is {@link NumericProperty}.
     */
    public final static int PREVIEW_DISPLAY_MODE_MANUAL_PORTRAIT_WIDTH = 0x40405;
    /**
     * This parameter indicates the height of the preview shown
     * in case of manual display mode and camera input type, when the
     * device is positioned in portrait. The camera frames will retain their
     * original aspect ratio but they will resize in order to fit inside the
     * preview box specified by the width and height parameters.
     * <p>
     * The class of the property is {@link NumericProperty}.
     */
    public final static int PREVIEW_DISPLAY_MODE_MANUAL_PORTRAIT_HEIGHT = 0x40406;
    /**
     * This parameter indicates the X coordinate of the preview shown
     * in case of manual display mode and camera input type, when the
     * device is positioned in landscape.
     * <p>
     * The class of the property is {@link NumericProperty}.
     */
    public final static int PREVIEW_DISPLAY_MODE_MANUAL_LANDSCAPE_X = 0x40407;
    /**
     * This parameter indicates the Y coordinate of the preview shown
     * in case of manual display mode and camera input type, when the
     * device is positioned in landscape.
     * <p>
     * The class of the property is {@link NumericProperty}.
     */
    public final static int PREVIEW_DISPLAY_MODE_MANUAL_LANDSCAPE_Y = 0x40408;
    /**
     * This parameter indicates the width of the preview shown
     * in case of manual display mode and camera input type, when the
     * device is positioned in landscape. The camera frames will retain their
     * original aspect ratio but they will resize in order to fit inside the
     * preview box specified by the width and height parameters.
     * <p>
     * The class of the property is {@link NumericProperty}.
     */
    public final static int PREVIEW_DISPLAY_MODE_MANUAL_LANDSCAPE_WIDTH = 0x40409;
    /**
     * This parameter indicates the height of the preview shown
     * in case of manual display mode and camera input type, when the
     * device is positioned in landscape. The camera frames will retain their
     * original aspect ratio but they will resize in order to fit inside the
     * preview box specified by the width and height parameters.
     * <p>
     * The class of the property is {@link NumericProperty}.
     */
    public final static int PREVIEW_DISPLAY_MODE_MANUAL_LANDSCAPE_HEIGHT = 0x4040A;
    /**
     * This parameter indicates the zoom level applied to the camera preview.
     * <p>
     * The class of the property is {@link NumericProperty}.
     */
    public final static int PREVIEW_ZOOM_LEVEL = 0x4040B;

    //
    // Frame capture
    //
     /**
      * This parameter enable the feauture that configures the scanner to capture store and provide frames.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int FRAME_CAPTURE_ENABLE = 0x50000;
     /**
      * This parameter indicates the directory where will be stored the frames saved by the Scanner. Only directory under getExternalStorageDirectory() are supported (eg. /storage/emulated/0/).       
      * <p>
      * The class of the property is {@link TextProperty}.
      */
    public final static int FRAME_CAPTURE_FILE_PATH = 0x50001;
     /**
      * This parameter selects the format used for storing the frames captured by the Scanner.  
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link FrameCaptureFormat}. 
      */
    public final static int FRAME_CAPTURE_FORMAT = 0x50002;
     /**
      * This parameter selects the Scanner frame capture mode.
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link FrameCaptureMode}. 
      */
    public final static int FRAME_CAPTURE_MODE = 0x50003;
     /**
      * This parameter enables the Scanner to store captured frames.        
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int FRAME_CAPTURE_STORAGE_ENABLE = 0x50004;

    //
    // HAN XIN
    //
    //
     /**
      * This parameter enables or disables the symbology.       
      * <p>
      * The class of the property is {@link BooleanProperty}.
      */
    public final static int HAN_XIN_ENABLE = 0x40500;
     /**
      * This parameter is one of the two configurable label lengths.
      * When {@link #HAN_XIN_LENGTH_CONTROL} is set to {@link LengthControlMode#TWO_FIXED}, its value is one of the two possible accepted fixed lengths for a specific label.
      * It can also represent the minor or major length value whenever {@link LengthControlMode#RANGE} is selected.
      *
      * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
      * biggest accepted length will be used.  
      *    
      * <p>
      * The class of the property is {@link NumericProperty}.
      * @see #HAN_XIN_LENGTH_CONTROL
      */
    public final static int HAN_XIN_LENGTH1 = 0x40501;
     /**
      * This parameter is one of the two configurable label lengths.
      * When {@link #HAN_XIN_LENGTH_CONTROL} is set to {@link LengthControlMode#TWO_FIXED}, its value is one of the two possible accepted fixed lengths for a specific label.
      * It can also represent the minor or major length value whenever {@link LengthControlMode#RANGE} is selected.
      *
      * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
      * biggest accepted length will be used.  
      *    
      * <p>
      * The class of the property is {@link NumericProperty}.
      * @see #HAN_XIN_LENGTH_CONTROL
      */
    public final static int HAN_XIN_LENGTH2 = 0x40502;
     /**
      * This parameter specifies how each L1 and L2 length values should be applied to a label. 
      * <p>
      * The class of the property is {@link EnumProperty}.
      * The allowed values are defined by enum {@link LengthControlMode}. 
      */
    public final static int HAN_XIN_LENGTH_CONTROL = 0x40503;
     /**
      * This parameter specifies the symbology identifier (if any).
      * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to      
      * {@link SendCodeID#USERDEFINED_IDENTIFIER_BEFORE_LABEL} or {@link SendCodeID#USERDEFINED_IDENTIFIER_AFTER_LABEL}.  
      * <p>
      * The class of the property is {@link CharacterProperty}.
      */
    public final static int HAN_XIN_USER_ID = 0x40504;

    //
    // TLC39
    //
    //
    /**
     * This parameter enables or disables the symbology.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int TLC39_ENABLE = 0x40600;
    /**
     * This parameter is one of the two configurable label lengths.
     * When {@link #TLC39_LENGTH_CONTROL} is set to {@link LengthControlMode#TWO_FIXED}, its value is one of the two possible accepted fixed lengths for a specific label.
     * It can also represent the minor or major length value whenever {@link LengthControlMode#RANGE} is selected.
     *
     * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
     * biggest accepted length will be used.
     *
     * <p>
     * The class of the property is {@link NumericProperty}.
     * @see #TLC39_LENGTH_CONTROL
     */
    public final static int TLC39_LENGTH1 = 0x40601;
    /**
     * This parameter is one of the two configurable label lengths.
     * When {@link #TLC39_LENGTH_CONTROL} is set to {@link LengthControlMode#TWO_FIXED}, its value is one of the two possible accepted fixed lengths for a specific label.
     * It can also represent the minor or major length value whenever {@link LengthControlMode#RANGE} is selected.
     *
     * If is set below the accepted minimum, the smallest accepted length will be used; instead it the set value exceed the maximum value, the
     * biggest accepted length will be used.
     *
     * <p>
     * The class of the property is {@link NumericProperty}.
     * @see #TLC39_LENGTH_CONTROL
     */
    public final static int TLC39_LENGTH2 = 0x40602;
    /**
     * This parameter specifies how each L1 and L2 length values should be applied to a label.
     * <p>
     * The class of the property is {@link EnumProperty}.
     * The allowed values are defined by enum {@link LengthControlMode}.
     */
    public final static int TLC39_LENGTH_CONTROL = 0x40603;
    /**
     * This parameter specifies the symbology identifier (if any).
     * The symbology identifier is sent with the label when the global decode property {@link #SEND_CODE_ID} is set to
     * {@link SendCodeID#USERDEFINED_IDENTIFIER_BEFORE_LABEL} or {@link SendCodeID#USERDEFINED_IDENTIFIER_AFTER_LABEL}.
     * <p>
     * The class of the property is {@link CharacterProperty}.
     */
    public final static int TLC39_USER_ID = 0x40604;
    /**
     * This parameter enables linear code transmission.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int TLC39_LINEAR_TRANSMISSION_ENABLE = 0x40605;

    //
    // SNAP OCR
    //
    //
    /**
     * This parameter enables or disables the Snap Ocr feature.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int SNAP_OCR_ENABLE = 0x40700;
    /**
     * This parameter specifies how the OCR text is selected.
     * <p>
     * The class of the property is {@link EnumProperty}.
     * The allowed values are defined by enum {@link SnapOcrFirstSelectionMode}.
     */
    public final static int SNAP_OCR_FIRST_SELECTION_MODE = 0x40701;
    /**
     * This parameter specifies how to send the OCR results, if they are concatenated
     * in the same result or divided in different results.
     * <p>
     * The class of the property is {@link EnumProperty}.
     * The allowed values are defined by enum {@link SnapOcrResultsCombination}.
     */
    public final static int SNAP_OCR_RESULTS_COMBINATION = 0x40702;
    /**
     * This parameter is a String providing the separator between results,
     * only used in concatenated mode.
     * <p>
     * The class of the property is {@link TextProperty}.
     */
    public final static int SNAP_OCR_RESULT_SEPARATOR = 0x40703;
    /**
     * This parameter specifies the settings used to define ROIs on the image, inside of which the
     * OCR text is decoded. These settings are used only when the first selection mode is set to ROI_PROPOSE or
     * ROI_SEND.
     * <p>
     * The class of the property is {@link BlobProperty}.
     * The specific implementation for this type of blob is {@link SnapOcrRoiSettings}.
     */
    public final static int SNAP_OCR_ROI_SETTINGS = 0x40704;
    /**
     * This parameter specifies the scanning policy.
     * <p>
     * The class of the property is {@link EnumProperty}.
     * The allowed values are defined by enum {@link SnapOcrScanningPolicy}.
     */
    public final static int SNAP_OCR_SCANNING_POLICY = 0x40705;
    /**
     * This parameter is a regular expression used to filter any OCR text, excluding
     * the values that don't match the filter.
     * <p>
     * The class of the property is {@link TextProperty}.
     */
    public final static int SNAP_OCR_REGEX_FILTER = 0x40706;
    /**
     * This parameter is used to setup the background color in the OCR result dialog.
     * <p>
     * The class of the property is {@link NumericProperty}.
     */
    public final static int SNAP_OCR_COLOR_BLOCK = 0x40707;
    /**
     * This parameter is used to setup the text color in the OCR result dialog.
     * <p>
     * The class of the property is {@link NumericProperty}.
     */
    public final static int SNAP_OCR_COLOR_TEXT = 0x40708;
    /**
     * This parameter is used to show or hide the reference ROI from
     * the preview and from the OCR result dialog.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int SNAP_OCR_REFERENCE_ROI_VISIBILITY = 0x40709;
    /**
     * This parameter allows to show the ROI number as prefix inside the OCR
     * results, when enabled. The prefix is set in the format ROI_NUMBER:OCR_TEXT, where
     * ROI_NUMBER indicates the index of the ROI inside the ROI settings (starting from 1)
     * and OCR_TEXT is the original result.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int SNAP_OCR_ROI_PREFIX_VISIBILITY = 0x4070A;

    //
    // DECODE RESULT CROP
    //
    //
    /**
     * This parameter allows to show the cropped image corresponding to the decoded
     * barcode. The image is shown as a Bitmap provided in the decode result.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int DECODE_RESULT_CROP_BARCODE_ENABLE = 0x40800;
    /**
     * This parameter allows to show the cropped image corresponding to the decoded
     * OCR text. The image is shown as a Bitmap provided in the decode result.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int DECODE_RESULT_CROP_SNAP_OCR_ENABLE = 0x40801;
    /**
     * This parameter allows to select the amount of pixels to include as margin
     * in the cropped image that is shown as a Bitmap in the decode result.
     * <p>
     * The class of the property is {@link NumericProperty}.
     */
    public final static int DECODE_RESULT_CROP_MARGIN = 0x40802;
    /**
     * This parameter allows to send the entire frame shown as a Bitmap in the decode result.
     * <p>
     * The class of the property is {@link BooleanProperty}.
     */
    public final static int DECODE_RESULT_CROP_ENTIRE_FRAME = 0x40803;

    /**
     * @hide
     * The constructor is defined hide and private to avoid Apps create an instance of this class.
     */
    private PropertyID() {}

   /**
     * Returns the name of the constant whose value is the given id.
     * @param id
     *            <code>int</code> unique identifier of the property.
     * @return String the name of the constant.
     */
    public static String Name(int id) {
        return null;
    }
}

