
package com.ivend.iintegrationservice._2010._12;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.cxs_platform.HorizontalAlign;
import org.datacontract.schemas._2004._07.cxs_platform.KeyBoardMode;
import org.datacontract.schemas._2004._07.cxs_subsystem.CreditLimitOverrideType;
import org.datacontract.schemas._2004._07.cxs_subsystem.EventSelection;
import org.datacontract.schemas._2004._07.cxs_subsystem.TransactionEntryType;


/**
 * <p>Java class for RetailProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetailProfile">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iVend.com/IIntegrationService/2010/12}BaseWrapper">
 *       &lt;sequence>
 *         &lt;element name="AllowRefundOfPromotionalItems" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AutoAddCashierAsSalesPerson" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AutoCloseCompleteSaleView" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AutoLockTimeout" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AutoUpdateChangeAmountInPayments" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CashInCommentRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CashInReasonRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CashOutCommentRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CashOutReasonRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ChangeAmountPaymentCurrencyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompleteTenderingOnZeroBalance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ConfirmationForQuickComplete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CreateNewRowForEveryScan" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DeleteSuspendedTransactionAtDayEnd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DepartmentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EventId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EventSelection" type="{http://schemas.datacontract.org/2004/07/CXS.SubSystem.RetailConfig}EventSelection" minOccurs="0"/>
 *         &lt;element name="ExchangeWithoutReceipt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ExpenseCommentRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ExpenseReasonRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IdleTimeout" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ItemDiscountOverrideCommentRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ItemDiscountOverrideReasonRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ItemTaxOverrideCommentRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ItemTaxOverrideReasonRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="LoginOnPreviousBusinessDate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ManagementConsoleSkinName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ManagerCreditLimitOverrideRequired" type="{http://schemas.datacontract.org/2004/07/CXS.SubSystem.RetailConfig}CreditLimitOverrideType" minOccurs="0"/>
 *         &lt;element name="ManagerReprintOverrideRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MandatorySalesPersonPerTransactionLineItem" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaxLineItemDiscountAmountAllowed" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MaxLineItemDiscountPercentAllowed" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MaxSaleDiscountAmountAllowed" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MaxSaleDiscountPercentAllowed" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="NoResulutionOpenProductSearch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OpenCashDrawerCommentRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OpenCashDrawerReasonRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OpenItemEditViewAutomatically" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OpenItemEditViewOnItemClick" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OverrideForDeletingSuspended" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OverrideForVoidItem" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OverrideForVoidSale" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OverrideSalesPersonForOrderEdits" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OverrideSalesPersonForRefund" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="POSSkinName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PerSaleLogin" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PoleDisplayCompleteSaleMessageId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PoleDisplayIdleMessageId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PoleDisplayStartTransactionMessageId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PriceOverrideCommentRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PriceOverrideReasonRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PrintSuspendedTransaction" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RefundCommentRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RefundItemCommentRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RefundItemReasonCodeRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RefundReasonRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RefundSaleCommentRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RefundSaleReasonCodeRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RefundWithoutReceipt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RestrictSearchOfOtherPOSTransaction" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SaleDiscountCommentRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SaleDiscountReasonRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SaleItemPriceOverrideLowerLimit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SaleItemPriceOverrideUpperLimit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SaleTaxOverrideCommentRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SaleTaxOverrideReasonRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ShowNegativeInventoryResolutionScreen" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ShowTransactionGridHeaders" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ShutdownTerminalCommentRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ShutdownTerminalReasonCodeRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TouchScreenKeyBoardMode" type="{http://schemas.datacontract.org/2004/07/CXS.Platform.DomainObjects}KeyBoardMode" minOccurs="0"/>
 *         &lt;element name="TransactionMode" type="{http://schemas.datacontract.org/2004/07/CXS.SubSystem.RetailConfig}TransactionEntryType" minOccurs="0"/>
 *         &lt;element name="TransactionModeMenuAlignment" type="{http://schemas.datacontract.org/2004/07/CXS.Platform.Core}HorizontalAlign" minOccurs="0"/>
 *         &lt;element name="UseLastSelectedEventForNextTransaction" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UseQuickComplete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UseZipValidation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="VoidItemCommentRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="VoidItemReasonRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="VoidSaleCommentRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="VoidSaleReasonRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="WarnIfTransactionLineItemHasNoSalesPerson" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetailProfile", propOrder = {
    "allowRefundOfPromotionalItems",
    "autoAddCashierAsSalesPerson",
    "autoCloseCompleteSaleView",
    "autoLockTimeout",
    "autoUpdateChangeAmountInPayments",
    "cashInCommentRequired",
    "cashInReasonRequired",
    "cashOutCommentRequired",
    "cashOutReasonRequired",
    "changeAmountPaymentCurrencyId",
    "completeTenderingOnZeroBalance",
    "confirmationForQuickComplete",
    "createNewRowForEveryScan",
    "deleteSuspendedTransactionAtDayEnd",
    "departmentId",
    "description",
    "eventId",
    "eventSelection",
    "exchangeWithoutReceipt",
    "expenseCommentRequired",
    "expenseReasonRequired",
    "idleTimeout",
    "itemDiscountOverrideCommentRequired",
    "itemDiscountOverrideReasonRequired",
    "itemTaxOverrideCommentRequired",
    "itemTaxOverrideReasonRequired",
    "key",
    "loginOnPreviousBusinessDate",
    "managementConsoleSkinName",
    "managerCreditLimitOverrideRequired",
    "managerReprintOverrideRequired",
    "mandatorySalesPersonPerTransactionLineItem",
    "maxLineItemDiscountAmountAllowed",
    "maxLineItemDiscountPercentAllowed",
    "maxSaleDiscountAmountAllowed",
    "maxSaleDiscountPercentAllowed",
    "noResulutionOpenProductSearch",
    "openCashDrawerCommentRequired",
    "openCashDrawerReasonRequired",
    "openItemEditViewAutomatically",
    "openItemEditViewOnItemClick",
    "overrideForDeletingSuspended",
    "overrideForVoidItem",
    "overrideForVoidSale",
    "overrideSalesPersonForOrderEdits",
    "overrideSalesPersonForRefund",
    "posSkinName",
    "perSaleLogin",
    "poleDisplayCompleteSaleMessageId",
    "poleDisplayIdleMessageId",
    "poleDisplayStartTransactionMessageId",
    "priceOverrideCommentRequired",
    "priceOverrideReasonRequired",
    "printSuspendedTransaction",
    "refundCommentRequired",
    "refundItemCommentRequired",
    "refundItemReasonCodeRequired",
    "refundReasonRequired",
    "refundSaleCommentRequired",
    "refundSaleReasonCodeRequired",
    "refundWithoutReceipt",
    "restrictSearchOfOtherPOSTransaction",
    "saleDiscountCommentRequired",
    "saleDiscountReasonRequired",
    "saleItemPriceOverrideLowerLimit",
    "saleItemPriceOverrideUpperLimit",
    "saleTaxOverrideCommentRequired",
    "saleTaxOverrideReasonRequired",
    "showNegativeInventoryResolutionScreen",
    "showTransactionGridHeaders",
    "shutdownTerminalCommentRequired",
    "shutdownTerminalReasonCodeRequired",
    "touchScreenKeyBoardMode",
    "transactionMode",
    "transactionModeMenuAlignment",
    "useLastSelectedEventForNextTransaction",
    "useQuickComplete",
    "useZipValidation",
    "voidItemCommentRequired",
    "voidItemReasonRequired",
    "voidSaleCommentRequired",
    "voidSaleReasonRequired",
    "warnIfTransactionLineItemHasNoSalesPerson",
    "id"
})
public class RetailProfile
    extends BaseWrapper
{

    @XmlElement(name = "AllowRefundOfPromotionalItems")
    protected Boolean allowRefundOfPromotionalItems;
    @XmlElement(name = "AutoAddCashierAsSalesPerson")
    protected Boolean autoAddCashierAsSalesPerson;
    @XmlElement(name = "AutoCloseCompleteSaleView")
    protected Integer autoCloseCompleteSaleView;
    @XmlElement(name = "AutoLockTimeout")
    protected Integer autoLockTimeout;
    @XmlElement(name = "AutoUpdateChangeAmountInPayments")
    protected Boolean autoUpdateChangeAmountInPayments;
    @XmlElement(name = "CashInCommentRequired")
    protected Boolean cashInCommentRequired;
    @XmlElement(name = "CashInReasonRequired")
    protected Boolean cashInReasonRequired;
    @XmlElement(name = "CashOutCommentRequired")
    protected Boolean cashOutCommentRequired;
    @XmlElement(name = "CashOutReasonRequired")
    protected Boolean cashOutReasonRequired;
    @XmlElementRef(name = "ChangeAmountPaymentCurrencyId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> changeAmountPaymentCurrencyId;
    @XmlElement(name = "CompleteTenderingOnZeroBalance")
    protected Boolean completeTenderingOnZeroBalance;
    @XmlElement(name = "ConfirmationForQuickComplete")
    protected Boolean confirmationForQuickComplete;
    @XmlElement(name = "CreateNewRowForEveryScan")
    protected Boolean createNewRowForEveryScan;
    @XmlElement(name = "DeleteSuspendedTransactionAtDayEnd")
    protected Boolean deleteSuspendedTransactionAtDayEnd;
    @XmlElementRef(name = "DepartmentId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> departmentId;
    @XmlElementRef(name = "Description", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "EventId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> eventId;
    @XmlElement(name = "EventSelection")
    protected EventSelection eventSelection;
    @XmlElement(name = "ExchangeWithoutReceipt")
    protected Boolean exchangeWithoutReceipt;
    @XmlElement(name = "ExpenseCommentRequired")
    protected Boolean expenseCommentRequired;
    @XmlElement(name = "ExpenseReasonRequired")
    protected Boolean expenseReasonRequired;
    @XmlElement(name = "IdleTimeout")
    protected Integer idleTimeout;
    @XmlElement(name = "ItemDiscountOverrideCommentRequired")
    protected Boolean itemDiscountOverrideCommentRequired;
    @XmlElement(name = "ItemDiscountOverrideReasonRequired")
    protected Boolean itemDiscountOverrideReasonRequired;
    @XmlElement(name = "ItemTaxOverrideCommentRequired")
    protected Boolean itemTaxOverrideCommentRequired;
    @XmlElement(name = "ItemTaxOverrideReasonRequired")
    protected Boolean itemTaxOverrideReasonRequired;
    @XmlElement(name = "Key")
    protected Long key;
    @XmlElement(name = "LoginOnPreviousBusinessDate")
    protected Boolean loginOnPreviousBusinessDate;
    @XmlElementRef(name = "ManagementConsoleSkinName", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> managementConsoleSkinName;
    @XmlElement(name = "ManagerCreditLimitOverrideRequired")
    protected CreditLimitOverrideType managerCreditLimitOverrideRequired;
    @XmlElement(name = "ManagerReprintOverrideRequired")
    protected Boolean managerReprintOverrideRequired;
    @XmlElement(name = "MandatorySalesPersonPerTransactionLineItem")
    protected Boolean mandatorySalesPersonPerTransactionLineItem;
    @XmlElement(name = "MaxLineItemDiscountAmountAllowed")
    protected BigDecimal maxLineItemDiscountAmountAllowed;
    @XmlElement(name = "MaxLineItemDiscountPercentAllowed")
    protected BigDecimal maxLineItemDiscountPercentAllowed;
    @XmlElement(name = "MaxSaleDiscountAmountAllowed")
    protected BigDecimal maxSaleDiscountAmountAllowed;
    @XmlElement(name = "MaxSaleDiscountPercentAllowed")
    protected BigDecimal maxSaleDiscountPercentAllowed;
    @XmlElement(name = "NoResulutionOpenProductSearch")
    protected Boolean noResulutionOpenProductSearch;
    @XmlElement(name = "OpenCashDrawerCommentRequired")
    protected Boolean openCashDrawerCommentRequired;
    @XmlElement(name = "OpenCashDrawerReasonRequired")
    protected Boolean openCashDrawerReasonRequired;
    @XmlElement(name = "OpenItemEditViewAutomatically")
    protected Boolean openItemEditViewAutomatically;
    @XmlElement(name = "OpenItemEditViewOnItemClick")
    protected Boolean openItemEditViewOnItemClick;
    @XmlElement(name = "OverrideForDeletingSuspended")
    protected Boolean overrideForDeletingSuspended;
    @XmlElement(name = "OverrideForVoidItem")
    protected Boolean overrideForVoidItem;
    @XmlElement(name = "OverrideForVoidSale")
    protected Boolean overrideForVoidSale;
    @XmlElement(name = "OverrideSalesPersonForOrderEdits")
    protected Boolean overrideSalesPersonForOrderEdits;
    @XmlElement(name = "OverrideSalesPersonForRefund")
    protected Boolean overrideSalesPersonForRefund;
    @XmlElementRef(name = "POSSkinName", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> posSkinName;
    @XmlElement(name = "PerSaleLogin")
    protected Boolean perSaleLogin;
    @XmlElementRef(name = "PoleDisplayCompleteSaleMessageId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> poleDisplayCompleteSaleMessageId;
    @XmlElementRef(name = "PoleDisplayIdleMessageId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> poleDisplayIdleMessageId;
    @XmlElementRef(name = "PoleDisplayStartTransactionMessageId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> poleDisplayStartTransactionMessageId;
    @XmlElement(name = "PriceOverrideCommentRequired")
    protected Boolean priceOverrideCommentRequired;
    @XmlElement(name = "PriceOverrideReasonRequired")
    protected Boolean priceOverrideReasonRequired;
    @XmlElement(name = "PrintSuspendedTransaction")
    protected Boolean printSuspendedTransaction;
    @XmlElement(name = "RefundCommentRequired")
    protected Boolean refundCommentRequired;
    @XmlElement(name = "RefundItemCommentRequired")
    protected Boolean refundItemCommentRequired;
    @XmlElement(name = "RefundItemReasonCodeRequired")
    protected Boolean refundItemReasonCodeRequired;
    @XmlElement(name = "RefundReasonRequired")
    protected Boolean refundReasonRequired;
    @XmlElement(name = "RefundSaleCommentRequired")
    protected Boolean refundSaleCommentRequired;
    @XmlElement(name = "RefundSaleReasonCodeRequired")
    protected Boolean refundSaleReasonCodeRequired;
    @XmlElement(name = "RefundWithoutReceipt")
    protected Boolean refundWithoutReceipt;
    @XmlElement(name = "RestrictSearchOfOtherPOSTransaction")
    protected Boolean restrictSearchOfOtherPOSTransaction;
    @XmlElement(name = "SaleDiscountCommentRequired")
    protected Boolean saleDiscountCommentRequired;
    @XmlElement(name = "SaleDiscountReasonRequired")
    protected Boolean saleDiscountReasonRequired;
    @XmlElement(name = "SaleItemPriceOverrideLowerLimit")
    protected BigDecimal saleItemPriceOverrideLowerLimit;
    @XmlElement(name = "SaleItemPriceOverrideUpperLimit")
    protected BigDecimal saleItemPriceOverrideUpperLimit;
    @XmlElement(name = "SaleTaxOverrideCommentRequired")
    protected Boolean saleTaxOverrideCommentRequired;
    @XmlElement(name = "SaleTaxOverrideReasonRequired")
    protected Boolean saleTaxOverrideReasonRequired;
    @XmlElement(name = "ShowNegativeInventoryResolutionScreen")
    protected Boolean showNegativeInventoryResolutionScreen;
    @XmlElement(name = "ShowTransactionGridHeaders")
    protected Boolean showTransactionGridHeaders;
    @XmlElement(name = "ShutdownTerminalCommentRequired")
    protected Boolean shutdownTerminalCommentRequired;
    @XmlElement(name = "ShutdownTerminalReasonCodeRequired")
    protected Boolean shutdownTerminalReasonCodeRequired;
    @XmlElement(name = "TouchScreenKeyBoardMode")
    protected KeyBoardMode touchScreenKeyBoardMode;
    @XmlElement(name = "TransactionMode")
    protected TransactionEntryType transactionMode;
    @XmlElement(name = "TransactionModeMenuAlignment")
    protected HorizontalAlign transactionModeMenuAlignment;
    @XmlElement(name = "UseLastSelectedEventForNextTransaction")
    protected Boolean useLastSelectedEventForNextTransaction;
    @XmlElement(name = "UseQuickComplete")
    protected Boolean useQuickComplete;
    @XmlElement(name = "UseZipValidation")
    protected Boolean useZipValidation;
    @XmlElement(name = "VoidItemCommentRequired")
    protected Boolean voidItemCommentRequired;
    @XmlElement(name = "VoidItemReasonRequired")
    protected Boolean voidItemReasonRequired;
    @XmlElement(name = "VoidSaleCommentRequired")
    protected Boolean voidSaleCommentRequired;
    @XmlElement(name = "VoidSaleReasonRequired")
    protected Boolean voidSaleReasonRequired;
    @XmlElement(name = "WarnIfTransactionLineItemHasNoSalesPerson")
    protected Boolean warnIfTransactionLineItemHasNoSalesPerson;
    @XmlElementRef(name = "Id", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> id;

    /**
     * Gets the value of the allowRefundOfPromotionalItems property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowRefundOfPromotionalItems() {
        return allowRefundOfPromotionalItems;
    }

    /**
     * Sets the value of the allowRefundOfPromotionalItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowRefundOfPromotionalItems(Boolean value) {
        this.allowRefundOfPromotionalItems = value;
    }

    /**
     * Gets the value of the autoAddCashierAsSalesPerson property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoAddCashierAsSalesPerson() {
        return autoAddCashierAsSalesPerson;
    }

    /**
     * Sets the value of the autoAddCashierAsSalesPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoAddCashierAsSalesPerson(Boolean value) {
        this.autoAddCashierAsSalesPerson = value;
    }

    /**
     * Gets the value of the autoCloseCompleteSaleView property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAutoCloseCompleteSaleView() {
        return autoCloseCompleteSaleView;
    }

    /**
     * Sets the value of the autoCloseCompleteSaleView property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAutoCloseCompleteSaleView(Integer value) {
        this.autoCloseCompleteSaleView = value;
    }

    /**
     * Gets the value of the autoLockTimeout property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAutoLockTimeout() {
        return autoLockTimeout;
    }

    /**
     * Sets the value of the autoLockTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAutoLockTimeout(Integer value) {
        this.autoLockTimeout = value;
    }

    /**
     * Gets the value of the autoUpdateChangeAmountInPayments property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoUpdateChangeAmountInPayments() {
        return autoUpdateChangeAmountInPayments;
    }

    /**
     * Sets the value of the autoUpdateChangeAmountInPayments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoUpdateChangeAmountInPayments(Boolean value) {
        this.autoUpdateChangeAmountInPayments = value;
    }

    /**
     * Gets the value of the cashInCommentRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCashInCommentRequired() {
        return cashInCommentRequired;
    }

    /**
     * Sets the value of the cashInCommentRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCashInCommentRequired(Boolean value) {
        this.cashInCommentRequired = value;
    }

    /**
     * Gets the value of the cashInReasonRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCashInReasonRequired() {
        return cashInReasonRequired;
    }

    /**
     * Sets the value of the cashInReasonRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCashInReasonRequired(Boolean value) {
        this.cashInReasonRequired = value;
    }

    /**
     * Gets the value of the cashOutCommentRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCashOutCommentRequired() {
        return cashOutCommentRequired;
    }

    /**
     * Sets the value of the cashOutCommentRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCashOutCommentRequired(Boolean value) {
        this.cashOutCommentRequired = value;
    }

    /**
     * Gets the value of the cashOutReasonRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCashOutReasonRequired() {
        return cashOutReasonRequired;
    }

    /**
     * Sets the value of the cashOutReasonRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCashOutReasonRequired(Boolean value) {
        this.cashOutReasonRequired = value;
    }

    /**
     * Gets the value of the changeAmountPaymentCurrencyId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getChangeAmountPaymentCurrencyId() {
        return changeAmountPaymentCurrencyId;
    }

    /**
     * Sets the value of the changeAmountPaymentCurrencyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setChangeAmountPaymentCurrencyId(JAXBElement<String> value) {
        this.changeAmountPaymentCurrencyId = value;
    }

    /**
     * Gets the value of the completeTenderingOnZeroBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCompleteTenderingOnZeroBalance() {
        return completeTenderingOnZeroBalance;
    }

    /**
     * Sets the value of the completeTenderingOnZeroBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCompleteTenderingOnZeroBalance(Boolean value) {
        this.completeTenderingOnZeroBalance = value;
    }

    /**
     * Gets the value of the confirmationForQuickComplete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConfirmationForQuickComplete() {
        return confirmationForQuickComplete;
    }

    /**
     * Sets the value of the confirmationForQuickComplete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConfirmationForQuickComplete(Boolean value) {
        this.confirmationForQuickComplete = value;
    }

    /**
     * Gets the value of the createNewRowForEveryScan property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCreateNewRowForEveryScan() {
        return createNewRowForEveryScan;
    }

    /**
     * Sets the value of the createNewRowForEveryScan property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCreateNewRowForEveryScan(Boolean value) {
        this.createNewRowForEveryScan = value;
    }

    /**
     * Gets the value of the deleteSuspendedTransactionAtDayEnd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeleteSuspendedTransactionAtDayEnd() {
        return deleteSuspendedTransactionAtDayEnd;
    }

    /**
     * Sets the value of the deleteSuspendedTransactionAtDayEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeleteSuspendedTransactionAtDayEnd(Boolean value) {
        this.deleteSuspendedTransactionAtDayEnd = value;
    }

    /**
     * Gets the value of the departmentId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDepartmentId() {
        return departmentId;
    }

    /**
     * Sets the value of the departmentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDepartmentId(JAXBElement<String> value) {
        this.departmentId = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
    }

    /**
     * Gets the value of the eventId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEventId() {
        return eventId;
    }

    /**
     * Sets the value of the eventId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEventId(JAXBElement<String> value) {
        this.eventId = value;
    }

    /**
     * Gets the value of the eventSelection property.
     * 
     * @return
     *     possible object is
     *     {@link EventSelection }
     *     
     */
    public EventSelection getEventSelection() {
        return eventSelection;
    }

    /**
     * Sets the value of the eventSelection property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventSelection }
     *     
     */
    public void setEventSelection(EventSelection value) {
        this.eventSelection = value;
    }

    /**
     * Gets the value of the exchangeWithoutReceipt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExchangeWithoutReceipt() {
        return exchangeWithoutReceipt;
    }

    /**
     * Sets the value of the exchangeWithoutReceipt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExchangeWithoutReceipt(Boolean value) {
        this.exchangeWithoutReceipt = value;
    }

    /**
     * Gets the value of the expenseCommentRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExpenseCommentRequired() {
        return expenseCommentRequired;
    }

    /**
     * Sets the value of the expenseCommentRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExpenseCommentRequired(Boolean value) {
        this.expenseCommentRequired = value;
    }

    /**
     * Gets the value of the expenseReasonRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExpenseReasonRequired() {
        return expenseReasonRequired;
    }

    /**
     * Sets the value of the expenseReasonRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExpenseReasonRequired(Boolean value) {
        this.expenseReasonRequired = value;
    }

    /**
     * Gets the value of the idleTimeout property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdleTimeout() {
        return idleTimeout;
    }

    /**
     * Sets the value of the idleTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdleTimeout(Integer value) {
        this.idleTimeout = value;
    }

    /**
     * Gets the value of the itemDiscountOverrideCommentRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isItemDiscountOverrideCommentRequired() {
        return itemDiscountOverrideCommentRequired;
    }

    /**
     * Sets the value of the itemDiscountOverrideCommentRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setItemDiscountOverrideCommentRequired(Boolean value) {
        this.itemDiscountOverrideCommentRequired = value;
    }

    /**
     * Gets the value of the itemDiscountOverrideReasonRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isItemDiscountOverrideReasonRequired() {
        return itemDiscountOverrideReasonRequired;
    }

    /**
     * Sets the value of the itemDiscountOverrideReasonRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setItemDiscountOverrideReasonRequired(Boolean value) {
        this.itemDiscountOverrideReasonRequired = value;
    }

    /**
     * Gets the value of the itemTaxOverrideCommentRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isItemTaxOverrideCommentRequired() {
        return itemTaxOverrideCommentRequired;
    }

    /**
     * Sets the value of the itemTaxOverrideCommentRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setItemTaxOverrideCommentRequired(Boolean value) {
        this.itemTaxOverrideCommentRequired = value;
    }

    /**
     * Gets the value of the itemTaxOverrideReasonRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isItemTaxOverrideReasonRequired() {
        return itemTaxOverrideReasonRequired;
    }

    /**
     * Sets the value of the itemTaxOverrideReasonRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setItemTaxOverrideReasonRequired(Boolean value) {
        this.itemTaxOverrideReasonRequired = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKey(Long value) {
        this.key = value;
    }

    /**
     * Gets the value of the loginOnPreviousBusinessDate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLoginOnPreviousBusinessDate() {
        return loginOnPreviousBusinessDate;
    }

    /**
     * Sets the value of the loginOnPreviousBusinessDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLoginOnPreviousBusinessDate(Boolean value) {
        this.loginOnPreviousBusinessDate = value;
    }

    /**
     * Gets the value of the managementConsoleSkinName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getManagementConsoleSkinName() {
        return managementConsoleSkinName;
    }

    /**
     * Sets the value of the managementConsoleSkinName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setManagementConsoleSkinName(JAXBElement<String> value) {
        this.managementConsoleSkinName = value;
    }

    /**
     * Gets the value of the managerCreditLimitOverrideRequired property.
     * 
     * @return
     *     possible object is
     *     {@link CreditLimitOverrideType }
     *     
     */
    public CreditLimitOverrideType getManagerCreditLimitOverrideRequired() {
        return managerCreditLimitOverrideRequired;
    }

    /**
     * Sets the value of the managerCreditLimitOverrideRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditLimitOverrideType }
     *     
     */
    public void setManagerCreditLimitOverrideRequired(CreditLimitOverrideType value) {
        this.managerCreditLimitOverrideRequired = value;
    }

    /**
     * Gets the value of the managerReprintOverrideRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isManagerReprintOverrideRequired() {
        return managerReprintOverrideRequired;
    }

    /**
     * Sets the value of the managerReprintOverrideRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setManagerReprintOverrideRequired(Boolean value) {
        this.managerReprintOverrideRequired = value;
    }

    /**
     * Gets the value of the mandatorySalesPersonPerTransactionLineItem property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMandatorySalesPersonPerTransactionLineItem() {
        return mandatorySalesPersonPerTransactionLineItem;
    }

    /**
     * Sets the value of the mandatorySalesPersonPerTransactionLineItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMandatorySalesPersonPerTransactionLineItem(Boolean value) {
        this.mandatorySalesPersonPerTransactionLineItem = value;
    }

    /**
     * Gets the value of the maxLineItemDiscountAmountAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxLineItemDiscountAmountAllowed() {
        return maxLineItemDiscountAmountAllowed;
    }

    /**
     * Sets the value of the maxLineItemDiscountAmountAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxLineItemDiscountAmountAllowed(BigDecimal value) {
        this.maxLineItemDiscountAmountAllowed = value;
    }

    /**
     * Gets the value of the maxLineItemDiscountPercentAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxLineItemDiscountPercentAllowed() {
        return maxLineItemDiscountPercentAllowed;
    }

    /**
     * Sets the value of the maxLineItemDiscountPercentAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxLineItemDiscountPercentAllowed(BigDecimal value) {
        this.maxLineItemDiscountPercentAllowed = value;
    }

    /**
     * Gets the value of the maxSaleDiscountAmountAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxSaleDiscountAmountAllowed() {
        return maxSaleDiscountAmountAllowed;
    }

    /**
     * Sets the value of the maxSaleDiscountAmountAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxSaleDiscountAmountAllowed(BigDecimal value) {
        this.maxSaleDiscountAmountAllowed = value;
    }

    /**
     * Gets the value of the maxSaleDiscountPercentAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxSaleDiscountPercentAllowed() {
        return maxSaleDiscountPercentAllowed;
    }

    /**
     * Sets the value of the maxSaleDiscountPercentAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxSaleDiscountPercentAllowed(BigDecimal value) {
        this.maxSaleDiscountPercentAllowed = value;
    }

    /**
     * Gets the value of the noResulutionOpenProductSearch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoResulutionOpenProductSearch() {
        return noResulutionOpenProductSearch;
    }

    /**
     * Sets the value of the noResulutionOpenProductSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoResulutionOpenProductSearch(Boolean value) {
        this.noResulutionOpenProductSearch = value;
    }

    /**
     * Gets the value of the openCashDrawerCommentRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOpenCashDrawerCommentRequired() {
        return openCashDrawerCommentRequired;
    }

    /**
     * Sets the value of the openCashDrawerCommentRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOpenCashDrawerCommentRequired(Boolean value) {
        this.openCashDrawerCommentRequired = value;
    }

    /**
     * Gets the value of the openCashDrawerReasonRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOpenCashDrawerReasonRequired() {
        return openCashDrawerReasonRequired;
    }

    /**
     * Sets the value of the openCashDrawerReasonRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOpenCashDrawerReasonRequired(Boolean value) {
        this.openCashDrawerReasonRequired = value;
    }

    /**
     * Gets the value of the openItemEditViewAutomatically property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOpenItemEditViewAutomatically() {
        return openItemEditViewAutomatically;
    }

    /**
     * Sets the value of the openItemEditViewAutomatically property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOpenItemEditViewAutomatically(Boolean value) {
        this.openItemEditViewAutomatically = value;
    }

    /**
     * Gets the value of the openItemEditViewOnItemClick property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOpenItemEditViewOnItemClick() {
        return openItemEditViewOnItemClick;
    }

    /**
     * Sets the value of the openItemEditViewOnItemClick property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOpenItemEditViewOnItemClick(Boolean value) {
        this.openItemEditViewOnItemClick = value;
    }

    /**
     * Gets the value of the overrideForDeletingSuspended property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverrideForDeletingSuspended() {
        return overrideForDeletingSuspended;
    }

    /**
     * Sets the value of the overrideForDeletingSuspended property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverrideForDeletingSuspended(Boolean value) {
        this.overrideForDeletingSuspended = value;
    }

    /**
     * Gets the value of the overrideForVoidItem property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverrideForVoidItem() {
        return overrideForVoidItem;
    }

    /**
     * Sets the value of the overrideForVoidItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverrideForVoidItem(Boolean value) {
        this.overrideForVoidItem = value;
    }

    /**
     * Gets the value of the overrideForVoidSale property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverrideForVoidSale() {
        return overrideForVoidSale;
    }

    /**
     * Sets the value of the overrideForVoidSale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverrideForVoidSale(Boolean value) {
        this.overrideForVoidSale = value;
    }

    /**
     * Gets the value of the overrideSalesPersonForOrderEdits property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverrideSalesPersonForOrderEdits() {
        return overrideSalesPersonForOrderEdits;
    }

    /**
     * Sets the value of the overrideSalesPersonForOrderEdits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverrideSalesPersonForOrderEdits(Boolean value) {
        this.overrideSalesPersonForOrderEdits = value;
    }

    /**
     * Gets the value of the overrideSalesPersonForRefund property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverrideSalesPersonForRefund() {
        return overrideSalesPersonForRefund;
    }

    /**
     * Sets the value of the overrideSalesPersonForRefund property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverrideSalesPersonForRefund(Boolean value) {
        this.overrideSalesPersonForRefund = value;
    }

    /**
     * Gets the value of the posSkinName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPOSSkinName() {
        return posSkinName;
    }

    /**
     * Sets the value of the posSkinName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPOSSkinName(JAXBElement<String> value) {
        this.posSkinName = value;
    }

    /**
     * Gets the value of the perSaleLogin property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPerSaleLogin() {
        return perSaleLogin;
    }

    /**
     * Sets the value of the perSaleLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPerSaleLogin(Boolean value) {
        this.perSaleLogin = value;
    }

    /**
     * Gets the value of the poleDisplayCompleteSaleMessageId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPoleDisplayCompleteSaleMessageId() {
        return poleDisplayCompleteSaleMessageId;
    }

    /**
     * Sets the value of the poleDisplayCompleteSaleMessageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPoleDisplayCompleteSaleMessageId(JAXBElement<String> value) {
        this.poleDisplayCompleteSaleMessageId = value;
    }

    /**
     * Gets the value of the poleDisplayIdleMessageId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPoleDisplayIdleMessageId() {
        return poleDisplayIdleMessageId;
    }

    /**
     * Sets the value of the poleDisplayIdleMessageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPoleDisplayIdleMessageId(JAXBElement<String> value) {
        this.poleDisplayIdleMessageId = value;
    }

    /**
     * Gets the value of the poleDisplayStartTransactionMessageId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPoleDisplayStartTransactionMessageId() {
        return poleDisplayStartTransactionMessageId;
    }

    /**
     * Sets the value of the poleDisplayStartTransactionMessageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPoleDisplayStartTransactionMessageId(JAXBElement<String> value) {
        this.poleDisplayStartTransactionMessageId = value;
    }

    /**
     * Gets the value of the priceOverrideCommentRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPriceOverrideCommentRequired() {
        return priceOverrideCommentRequired;
    }

    /**
     * Sets the value of the priceOverrideCommentRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPriceOverrideCommentRequired(Boolean value) {
        this.priceOverrideCommentRequired = value;
    }

    /**
     * Gets the value of the priceOverrideReasonRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPriceOverrideReasonRequired() {
        return priceOverrideReasonRequired;
    }

    /**
     * Sets the value of the priceOverrideReasonRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPriceOverrideReasonRequired(Boolean value) {
        this.priceOverrideReasonRequired = value;
    }

    /**
     * Gets the value of the printSuspendedTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrintSuspendedTransaction() {
        return printSuspendedTransaction;
    }

    /**
     * Sets the value of the printSuspendedTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrintSuspendedTransaction(Boolean value) {
        this.printSuspendedTransaction = value;
    }

    /**
     * Gets the value of the refundCommentRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRefundCommentRequired() {
        return refundCommentRequired;
    }

    /**
     * Sets the value of the refundCommentRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRefundCommentRequired(Boolean value) {
        this.refundCommentRequired = value;
    }

    /**
     * Gets the value of the refundItemCommentRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRefundItemCommentRequired() {
        return refundItemCommentRequired;
    }

    /**
     * Sets the value of the refundItemCommentRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRefundItemCommentRequired(Boolean value) {
        this.refundItemCommentRequired = value;
    }

    /**
     * Gets the value of the refundItemReasonCodeRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRefundItemReasonCodeRequired() {
        return refundItemReasonCodeRequired;
    }

    /**
     * Sets the value of the refundItemReasonCodeRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRefundItemReasonCodeRequired(Boolean value) {
        this.refundItemReasonCodeRequired = value;
    }

    /**
     * Gets the value of the refundReasonRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRefundReasonRequired() {
        return refundReasonRequired;
    }

    /**
     * Sets the value of the refundReasonRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRefundReasonRequired(Boolean value) {
        this.refundReasonRequired = value;
    }

    /**
     * Gets the value of the refundSaleCommentRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRefundSaleCommentRequired() {
        return refundSaleCommentRequired;
    }

    /**
     * Sets the value of the refundSaleCommentRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRefundSaleCommentRequired(Boolean value) {
        this.refundSaleCommentRequired = value;
    }

    /**
     * Gets the value of the refundSaleReasonCodeRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRefundSaleReasonCodeRequired() {
        return refundSaleReasonCodeRequired;
    }

    /**
     * Sets the value of the refundSaleReasonCodeRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRefundSaleReasonCodeRequired(Boolean value) {
        this.refundSaleReasonCodeRequired = value;
    }

    /**
     * Gets the value of the refundWithoutReceipt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRefundWithoutReceipt() {
        return refundWithoutReceipt;
    }

    /**
     * Sets the value of the refundWithoutReceipt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRefundWithoutReceipt(Boolean value) {
        this.refundWithoutReceipt = value;
    }

    /**
     * Gets the value of the restrictSearchOfOtherPOSTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRestrictSearchOfOtherPOSTransaction() {
        return restrictSearchOfOtherPOSTransaction;
    }

    /**
     * Sets the value of the restrictSearchOfOtherPOSTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRestrictSearchOfOtherPOSTransaction(Boolean value) {
        this.restrictSearchOfOtherPOSTransaction = value;
    }

    /**
     * Gets the value of the saleDiscountCommentRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSaleDiscountCommentRequired() {
        return saleDiscountCommentRequired;
    }

    /**
     * Sets the value of the saleDiscountCommentRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSaleDiscountCommentRequired(Boolean value) {
        this.saleDiscountCommentRequired = value;
    }

    /**
     * Gets the value of the saleDiscountReasonRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSaleDiscountReasonRequired() {
        return saleDiscountReasonRequired;
    }

    /**
     * Sets the value of the saleDiscountReasonRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSaleDiscountReasonRequired(Boolean value) {
        this.saleDiscountReasonRequired = value;
    }

    /**
     * Gets the value of the saleItemPriceOverrideLowerLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSaleItemPriceOverrideLowerLimit() {
        return saleItemPriceOverrideLowerLimit;
    }

    /**
     * Sets the value of the saleItemPriceOverrideLowerLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSaleItemPriceOverrideLowerLimit(BigDecimal value) {
        this.saleItemPriceOverrideLowerLimit = value;
    }

    /**
     * Gets the value of the saleItemPriceOverrideUpperLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSaleItemPriceOverrideUpperLimit() {
        return saleItemPriceOverrideUpperLimit;
    }

    /**
     * Sets the value of the saleItemPriceOverrideUpperLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSaleItemPriceOverrideUpperLimit(BigDecimal value) {
        this.saleItemPriceOverrideUpperLimit = value;
    }

    /**
     * Gets the value of the saleTaxOverrideCommentRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSaleTaxOverrideCommentRequired() {
        return saleTaxOverrideCommentRequired;
    }

    /**
     * Sets the value of the saleTaxOverrideCommentRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSaleTaxOverrideCommentRequired(Boolean value) {
        this.saleTaxOverrideCommentRequired = value;
    }

    /**
     * Gets the value of the saleTaxOverrideReasonRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSaleTaxOverrideReasonRequired() {
        return saleTaxOverrideReasonRequired;
    }

    /**
     * Sets the value of the saleTaxOverrideReasonRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSaleTaxOverrideReasonRequired(Boolean value) {
        this.saleTaxOverrideReasonRequired = value;
    }

    /**
     * Gets the value of the showNegativeInventoryResolutionScreen property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowNegativeInventoryResolutionScreen() {
        return showNegativeInventoryResolutionScreen;
    }

    /**
     * Sets the value of the showNegativeInventoryResolutionScreen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowNegativeInventoryResolutionScreen(Boolean value) {
        this.showNegativeInventoryResolutionScreen = value;
    }

    /**
     * Gets the value of the showTransactionGridHeaders property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowTransactionGridHeaders() {
        return showTransactionGridHeaders;
    }

    /**
     * Sets the value of the showTransactionGridHeaders property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowTransactionGridHeaders(Boolean value) {
        this.showTransactionGridHeaders = value;
    }

    /**
     * Gets the value of the shutdownTerminalCommentRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShutdownTerminalCommentRequired() {
        return shutdownTerminalCommentRequired;
    }

    /**
     * Sets the value of the shutdownTerminalCommentRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShutdownTerminalCommentRequired(Boolean value) {
        this.shutdownTerminalCommentRequired = value;
    }

    /**
     * Gets the value of the shutdownTerminalReasonCodeRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShutdownTerminalReasonCodeRequired() {
        return shutdownTerminalReasonCodeRequired;
    }

    /**
     * Sets the value of the shutdownTerminalReasonCodeRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShutdownTerminalReasonCodeRequired(Boolean value) {
        this.shutdownTerminalReasonCodeRequired = value;
    }

    /**
     * Gets the value of the touchScreenKeyBoardMode property.
     * 
     * @return
     *     possible object is
     *     {@link KeyBoardMode }
     *     
     */
    public KeyBoardMode getTouchScreenKeyBoardMode() {
        return touchScreenKeyBoardMode;
    }

    /**
     * Sets the value of the touchScreenKeyBoardMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyBoardMode }
     *     
     */
    public void setTouchScreenKeyBoardMode(KeyBoardMode value) {
        this.touchScreenKeyBoardMode = value;
    }

    /**
     * Gets the value of the transactionMode property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionEntryType }
     *     
     */
    public TransactionEntryType getTransactionMode() {
        return transactionMode;
    }

    /**
     * Sets the value of the transactionMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionEntryType }
     *     
     */
    public void setTransactionMode(TransactionEntryType value) {
        this.transactionMode = value;
    }

    /**
     * Gets the value of the transactionModeMenuAlignment property.
     * 
     * @return
     *     possible object is
     *     {@link HorizontalAlign }
     *     
     */
    public HorizontalAlign getTransactionModeMenuAlignment() {
        return transactionModeMenuAlignment;
    }

    /**
     * Sets the value of the transactionModeMenuAlignment property.
     * 
     * @param value
     *     allowed object is
     *     {@link HorizontalAlign }
     *     
     */
    public void setTransactionModeMenuAlignment(HorizontalAlign value) {
        this.transactionModeMenuAlignment = value;
    }

    /**
     * Gets the value of the useLastSelectedEventForNextTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseLastSelectedEventForNextTransaction() {
        return useLastSelectedEventForNextTransaction;
    }

    /**
     * Sets the value of the useLastSelectedEventForNextTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseLastSelectedEventForNextTransaction(Boolean value) {
        this.useLastSelectedEventForNextTransaction = value;
    }

    /**
     * Gets the value of the useQuickComplete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseQuickComplete() {
        return useQuickComplete;
    }

    /**
     * Sets the value of the useQuickComplete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseQuickComplete(Boolean value) {
        this.useQuickComplete = value;
    }

    /**
     * Gets the value of the useZipValidation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseZipValidation() {
        return useZipValidation;
    }

    /**
     * Sets the value of the useZipValidation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseZipValidation(Boolean value) {
        this.useZipValidation = value;
    }

    /**
     * Gets the value of the voidItemCommentRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVoidItemCommentRequired() {
        return voidItemCommentRequired;
    }

    /**
     * Sets the value of the voidItemCommentRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVoidItemCommentRequired(Boolean value) {
        this.voidItemCommentRequired = value;
    }

    /**
     * Gets the value of the voidItemReasonRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVoidItemReasonRequired() {
        return voidItemReasonRequired;
    }

    /**
     * Sets the value of the voidItemReasonRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVoidItemReasonRequired(Boolean value) {
        this.voidItemReasonRequired = value;
    }

    /**
     * Gets the value of the voidSaleCommentRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVoidSaleCommentRequired() {
        return voidSaleCommentRequired;
    }

    /**
     * Sets the value of the voidSaleCommentRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVoidSaleCommentRequired(Boolean value) {
        this.voidSaleCommentRequired = value;
    }

    /**
     * Gets the value of the voidSaleReasonRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVoidSaleReasonRequired() {
        return voidSaleReasonRequired;
    }

    /**
     * Sets the value of the voidSaleReasonRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVoidSaleReasonRequired(Boolean value) {
        this.voidSaleReasonRequired = value;
    }

    /**
     * Gets the value of the warnIfTransactionLineItemHasNoSalesPerson property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWarnIfTransactionLineItemHasNoSalesPerson() {
        return warnIfTransactionLineItemHasNoSalesPerson;
    }

    /**
     * Sets the value of the warnIfTransactionLineItemHasNoSalesPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWarnIfTransactionLineItemHasNoSalesPerson(Boolean value) {
        this.warnIfTransactionLineItemHasNoSalesPerson = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setId(JAXBElement<String> value) {
        this.id = value;
    }

}
