package com.bridge.criteria.struct;

import com.yantra.custom.dbi.EXTN_Inventory_Alerts;
import com.yantra.omp.business.rtam.OMPMonitorDistributionGroupStruct;
import com.yantra.shared.dbi.YFS_Inventory_Item;
import com.yantra.shared.dbi.YFS_Inventory_Monitor_Rules;
import com.yantra.shared.dbi.YFS_Item;
import com.yantra.yfc.dblayer.SCIndexedEntityList;
import com.yantra.yfc.dom.YFCDocument;
import com.yantra.yfc.dom.YFCElement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MonitorCriteriaStruct {
	private SCIndexedEntityList<EXTN_Inventory_Alerts> indexListAlerts = null;
	private Set<String> colActivityNodes = new HashSet<String>();
	private List<EXTN_Inventory_Alerts> colAlertsToRaiseEvent = new ArrayList<EXTN_Inventory_Alerts>();
	private String sSegment;
	private String sSegmentType;
	private String sTransactionId;
	private String sInvItemKey;
	private String sInvOrgCode;
	private YFS_Item oItem;
	private YFS_Inventory_Item oInvItem;
	private YFS_Inventory_Monitor_Rules oInvMonitorRule;
	private YFS_Inventory_Monitor_Rules oNodeLevelMonitorRule;
	private Map<String, OMPMonitorDistributionGroupStruct> mGrpsInDistrLevelRule = new HashMap<String, OMPMonitorDistributionGroupStruct>();
	private Map<String, OMPMonitorDistributionGroupStruct> mGrpsInNodeLevelDistrRule = new HashMap<String, OMPMonitorDistributionGroupStruct>();
	private Map<String, OMPMonitorDistributionGroupStruct> mGrpsToConsiderForGTIN = new HashMap<String, OMPMonitorDistributionGroupStruct>();
	private String sMonitorOption;
	private String sDemandType;
	private String sAgentCriteriaId;
	private boolean useRealTimeATPMonitor = false;
	private boolean bComputeAvailabilityForRTAM = false;
	private String sMaxShipDateTime = null;
	private int iMaxShipDateOffSetDays = 0;
	private boolean useNodeLevelRealTimeATPMonitor = false;
	private boolean bAlwaysRaiseEvent = false;
	private String sProcessedFlag = null;
	private String sComponentInvItemKey = null;
	private YFCDocument inventoryAlertsListDoc = null;
	private YFCElement templateElem = null;
	private boolean bIsAPIMode = false;
	private boolean bExpandAdditionalItems = true;
	private String overriddenDistributionRuleId = null;
	private Map<String, Set<String>> distributionGroupForDGLevel = new HashMap<String, Set<String>>();
	private Map<String, Set<String>> distributionGroupsForNodeLevel = new HashMap<String, Set<String>>();
	private String sDefaultDistributionRule = null;
	private boolean bEnterpriseDGOverridden = false;
	private String sDefaultDistributionRuleOrgn = null;
	private YFCDocument docConsolidatedAvailabilityChange = null;
	private boolean bActivityNodesRead = false;
	private String sNodeType;
	private String sOrgListForMonitoring;
	private boolean bPopulateInventoryAlerts = false;

	/**
	 * @return the colActivityNodes
	 */
	public Set<String> getColActivityNodes() {
		return colActivityNodes;
	}

	/**
	 * @param colActivityNodes
	 *            the colActivityNodes to set
	 */
	public void setColActivityNodes(Set<String> colActivityNodes) {
		this.colActivityNodes = colActivityNodes;
	}

	/**
	 * @return the colAlertsToRaiseEvent
	 */
	public List<EXTN_Inventory_Alerts> getColAlertsToRaiseEvent() {
		return colAlertsToRaiseEvent;
	}

	/**
	 * @param colAlertsToRaiseEvent
	 *            the colAlertsToRaiseEvent to set
	 */
	public void setColAlertsToRaiseEvent(List<EXTN_Inventory_Alerts> colAlertsToRaiseEvent) {
		this.colAlertsToRaiseEvent = colAlertsToRaiseEvent;
	}

	/**
	 * @return the sSegment
	 */
	public String getSegment() {
		return sSegment;
	}

	/**
	 * @param sSegment
	 *            the sSegment to set
	 */
	public void setSegment(String sSegment) {
		this.sSegment = sSegment;
	}

	/**
	 * @return the sSegmentType
	 */
	public String getSegmentType() {
		return sSegmentType;
	}

	/**
	 * @param sSegmentType
	 *            the sSegmentType to set
	 */
	public void setSegmentType(String sSegmentType) {
		this.sSegmentType = sSegmentType;
	}

	/**
	 * @return the sTransactionId
	 */
	public String getTransactionId() {
		return sTransactionId;
	}

	/**
	 * @param sTransactionId
	 *            the sTransactionId to set
	 */
	public void setTransactionId(String sTransactionId) {
		this.sTransactionId = sTransactionId;
	}

	/**
	 * @return the sInvOrgCode
	 */
	public String getInvOrgCode() {
		return sInvOrgCode;
	}

	/**
	 * @param sInvOrgCode
	 *            the sInvOrgCode to set
	 */
	public void setInvOrgCode(String sInvOrgCode) {
		this.sInvOrgCode = sInvOrgCode;
	}

	/**
	 * @return the sInvItemKey
	 */
	public String getInvItemKey() {
		return sInvItemKey;
	}

	/**
	 * @param sInvItemKey
	 *            the sInvItemKey to set
	 */
	public void setInvItemKey(String sInvItemKey) {
		this.sInvItemKey = sInvItemKey;
	}

	/**
	 * @return the oItem
	 */
	public YFS_Item getItem() {
		return oItem;
	}

	/**
	 * @param oItem
	 *            the oItem to set
	 */
	public void setItem(YFS_Item oItem) {
		this.oItem = oItem;
	}

	/**
	 * @return the oInvItem
	 */
	public YFS_Inventory_Item getInvItem() {
		return oInvItem;
	}

	/**
	 * @param oInvItem
	 *            the oInvItem to set
	 */
	public void setInvItem(YFS_Inventory_Item oInvItem) {
		this.oInvItem = oInvItem;
	}

	/**
	 * @return the oInvMonitorRule
	 */
	public YFS_Inventory_Monitor_Rules getInvMonitorRule() {
		return oInvMonitorRule;
	}

	/**
	 * @param oInvMonitorRule
	 *            the oInvMonitorRule to set
	 */
	public void setInvMonitorRule(YFS_Inventory_Monitor_Rules oInvMonitorRule) {
		this.oInvMonitorRule = oInvMonitorRule;
	}

	/**
	 * @return the oNodeLevelMonitorRule
	 */
	public YFS_Inventory_Monitor_Rules getNodeLevelMonitorRule() {
		return oNodeLevelMonitorRule;
	}

	/**
	 * @param oNodeLevelMonitorRule
	 *            the oNodeLevelMonitorRule to set
	 */
	public void setNodeLevelMonitorRule(YFS_Inventory_Monitor_Rules oNodeLevelMonitorRule) {
		this.oNodeLevelMonitorRule = oNodeLevelMonitorRule;
	}

	/**
	 * @return the mGrpsInDistrLevelRule
	 */
	public Map<String, OMPMonitorDistributionGroupStruct> getGrpsInDistrLevelRule() {
		return mGrpsInDistrLevelRule;
	}

	/**
	 * @param mGrpsInDistrLevelRule
	 *            the mGrpsInDistrLevelRule to set
	 */
	public void setGrpsInDistrLevelRule(Map<String, OMPMonitorDistributionGroupStruct> mGrpsInDistrLevelRule) {
		this.mGrpsInDistrLevelRule = mGrpsInDistrLevelRule;
	}

	/**
	 * @return the mGrpsInNodeLevelDistrRule
	 */
	public Map<String, OMPMonitorDistributionGroupStruct> getGrpsInNodeLevelDistrRule() {
		return mGrpsInNodeLevelDistrRule;
	}

	/**
	 * @param mGrpsInNodeLevelDistrRule
	 *            the mGrpsInNodeLevelDistrRule to set
	 */
	public void setGrpsInNodeLevelDistrRule(Map<String, OMPMonitorDistributionGroupStruct> mGrpsInNodeLevelDistrRule) {
		this.mGrpsInNodeLevelDistrRule = mGrpsInNodeLevelDistrRule;
	}

	/**
	 * @return the mGrpsToConsiderForGTIN
	 */
	public Map<String, OMPMonitorDistributionGroupStruct> getGrpsToConsiderForGTIN() {
		return mGrpsToConsiderForGTIN;
	}

	/**
	 * @param mGrpsToConsiderForGTIN
	 *            the mGrpsToConsiderForGTIN to set
	 */
	public void setGrpsToConsiderForGTIN(Map<String, OMPMonitorDistributionGroupStruct> mGrpsToConsiderForGTIN) {
		this.mGrpsToConsiderForGTIN = mGrpsToConsiderForGTIN;
	}

	/**
	 * @return the sMonitorOption
	 */
	public String getMonitorOption() {
		return sMonitorOption;
	}

	/**
	 * @param sMonitorOption
	 *            the sMonitorOption to set
	 */
	public void setMonitorOption(String sMonitorOption) {
		this.sMonitorOption = sMonitorOption;
	}

	/**
	 * @return the sDemandType
	 */
	public String getDemandType() {
		return sDemandType;
	}

	/**
	 * @param sDemandType
	 *            the sDemandType to set
	 */
	public void setDemandType(String sDemandType) {
		this.sDemandType = sDemandType;
	}

	/**
	 * @return the sAgentCriteriaId
	 */
	public String getAgentCriteriaId() {
		return sAgentCriteriaId;
	}

	/**
	 * @param sAgentCriteriaId
	 *            the sAgentCriteriaId to set
	 */
	public void setAgentCriteriaId(String sAgentCriteriaId) {
		this.sAgentCriteriaId = sAgentCriteriaId;
	}

	/**
	 * @return the useRealTimeATPMonitor
	 */
	public boolean isUseRealTimeATPMonitor() {
		return useRealTimeATPMonitor;
	}

	/**
	 * @param useRealTimeATPMonitor
	 *            the useRealTimeATPMonitor to set
	 */
	public void setUseRealTimeATPMonitor(boolean useRealTimeATPMonitor) {
		this.useRealTimeATPMonitor = useRealTimeATPMonitor;
	}

	/**
	 * @return the bComputeAvailabilityForRTAM
	 */
	public boolean isComputeAvailabilityForRTAM() {
		return bComputeAvailabilityForRTAM;
	}

	/**
	 * @param bComputeAvailabilityForRTAM
	 *            the bComputeAvailabilityForRTAM to set
	 */
	public void setComputeAvailabilityForRTAM(boolean bComputeAvailabilityForRTAM) {
		this.bComputeAvailabilityForRTAM = bComputeAvailabilityForRTAM;
	}

	/**
	 * @return the sMaxShipDateTime
	 */
	public String getMaxShipDateTime() {
		return sMaxShipDateTime;
	}

	/**
	 * @param sMaxShipDateTime
	 *            the sMaxShipDateTime to set
	 */
	public void setMaxShipDateTime(String sMaxShipDateTime) {
		this.sMaxShipDateTime = sMaxShipDateTime;
	}

	/**
	 * @return the iMaxShipDateOffSetDays
	 */
	public int getMaxShipDateOffSetDays() {
		return iMaxShipDateOffSetDays;
	}

	/**
	 * @param iMaxShipDateOffSetDays
	 *            the iMaxShipDateOffSetDays to set
	 */
	public void setMaxShipDateOffSetDays(int iMaxShipDateOffSetDays) {
		this.iMaxShipDateOffSetDays = iMaxShipDateOffSetDays;
	}

	/**
	 * @return the useNodeLevelRealTimeATPMonitor
	 */
	public boolean isUseNodeLevelRealTimeATPMonitor() {
		return useNodeLevelRealTimeATPMonitor;
	}

	/**
	 * @param useNodeLevelRealTimeATPMonitor
	 *            the useNodeLevelRealTimeATPMonitor to set
	 */
	public void setUseNodeLevelRealTimeATPMonitor(boolean useNodeLevelRealTimeATPMonitor) {
		this.useNodeLevelRealTimeATPMonitor = useNodeLevelRealTimeATPMonitor;
	}

	/**
	 * @return the bAlwaysRaiseEvent
	 */
	public boolean isAlwaysRaiseEvent() {
		return bAlwaysRaiseEvent;
	}

	/**
	 * @param bAlwaysRaiseEvent
	 *            the bAlwaysRaiseEvent to set
	 */
	public void setAlwaysRaiseEvent(boolean bAlwaysRaiseEvent) {
		this.bAlwaysRaiseEvent = bAlwaysRaiseEvent;
	}

	/**
	 * @return the sProcessedFlag
	 */
	public String getProcessedFlag() {
		return sProcessedFlag;
	}

	/**
	 * @param sProcessedFlag
	 *            the sProcessedFlag to set
	 */
	public void setProcessedFlag(String sProcessedFlag) {
		this.sProcessedFlag = sProcessedFlag;
	}

	/**
	 * @return the sComponentInvItemKey
	 */
	public String getComponentInvItemKey() {
		return sComponentInvItemKey;
	}

	/**
	 * @param sComponentInvItemKey
	 *            the sComponentInvItemKey to set
	 */
	public void setComponentInvItemKey(String sComponentInvItemKey) {
		this.sComponentInvItemKey = sComponentInvItemKey;
	}

	/**
	 * @return the inventoryAlertsListDoc
	 */
	public YFCDocument getInventoryAlertsListDoc() {
		return inventoryAlertsListDoc;
	}

	/**
	 * @param inventoryAlertsListDoc
	 *            the inventoryAlertsListDoc to set
	 */
	public void setInventoryAlertsListDoc(YFCDocument inventoryAlertsListDoc) {
		this.inventoryAlertsListDoc = inventoryAlertsListDoc;
	}

	/**
	 * @return the templateElem
	 */
	public YFCElement getTemplateElem() {
		return templateElem;
	}

	/**
	 * @param templateElem
	 *            the templateElem to set
	 */
	public void setTemplateElem(YFCElement templateElem) {
		this.templateElem = templateElem;
	}

	/**
	 * @return the bIsAPIMode
	 */
	public boolean isIsAPIMode() {
		return bIsAPIMode;
	}

	/**
	 * @param bIsAPIMode
	 *            the bIsAPIMode to set
	 */
	public void setIsAPIMode(boolean bIsAPIMode) {
		this.bIsAPIMode = bIsAPIMode;
	}

	/**
	 * @return the bExpandAdditionalItems
	 */
	public boolean isExpandAdditionalItems() {
		return bExpandAdditionalItems;
	}

	/**
	 * @param bExpandAdditionalItems
	 *            the bExpandAdditionalItems to set
	 */
	public void setExpandAdditionalItems(boolean bExpandAdditionalItems) {
		this.bExpandAdditionalItems = bExpandAdditionalItems;
	}

	/**
	 * @return the overriddenDistributionRuleId
	 */
	public String getOverriddenDistributionRuleId() {
		return overriddenDistributionRuleId;
	}

	/**
	 * @param overriddenDistributionRuleId
	 *            the overriddenDistributionRuleId to set
	 */
	public void setOverriddenDistributionRuleId(String overriddenDistributionRuleId) {
		this.overriddenDistributionRuleId = overriddenDistributionRuleId;
	}

	/**
	 * @return the distributionGroupForDGLevel
	 */
	public Map<String, Set<String>> getDistributionGroupForDGLevel() {
		return distributionGroupForDGLevel;
	}

	/**
	 * @param distributionGroupForDGLevel
	 *            the distributionGroupForDGLevel to set
	 */
	public void setDistributionGroupForDGLevel(Map<String, Set<String>> distributionGroupForDGLevel) {
		this.distributionGroupForDGLevel = distributionGroupForDGLevel;
	}

	/**
	 * @return the distributionGroupsForNodeLevel
	 */
	public Map<String, Set<String>> getDistributionGroupsForNodeLevel() {
		return distributionGroupsForNodeLevel;
	}

	/**
	 * @param distributionGroupsForNodeLevel
	 *            the distributionGroupsForNodeLevel to set
	 */
	public void setDistributionGroupsForNodeLevel(Map<String, Set<String>> distributionGroupsForNodeLevel) {
		this.distributionGroupsForNodeLevel = distributionGroupsForNodeLevel;
	}

	/**
	 * @return the sDefaultDistributionRule
	 */
	public String getDefaultDistributionRule() {
		return sDefaultDistributionRule;
	}

	/**
	 * @param sDefaultDistributionRule
	 *            the sDefaultDistributionRule to set
	 */
	public void setDefaultDistributionRule(String sDefaultDistributionRule) {
		this.sDefaultDistributionRule = sDefaultDistributionRule;
	}

	/**
	 * @return the bEnterpriseDGOverridden
	 */
	public boolean isEnterpriseDGOverridden() {
		return bEnterpriseDGOverridden;
	}

	/**
	 * @param bEnterpriseDGOverridden
	 *            the bEnterpriseDGOverridden to set
	 */
	public void setEnterpriseDGOverridden(boolean bEnterpriseDGOverridden) {
		this.bEnterpriseDGOverridden = bEnterpriseDGOverridden;
	}

	/**
	 * @return the sDefaultDistributionRuleOrgn
	 */
	public String getDefaultDistributionRuleOrgn() {
		return sDefaultDistributionRuleOrgn;
	}

	/**
	 * @param sDefaultDistributionRuleOrgn
	 *            the sDefaultDistributionRuleOrgn to set
	 */
	public void setDefaultDistributionRuleOrgn(String sDefaultDistributionRuleOrgn) {
		this.sDefaultDistributionRuleOrgn = sDefaultDistributionRuleOrgn;
	}

	/**
	 * @return the docConsolidatedAvailabilityChange
	 */
	public YFCDocument getDocConsolidatedAvailabilityChange() {
		return docConsolidatedAvailabilityChange;
	}

	/**
	 * @param docConsolidatedAvailabilityChange
	 *            the docConsolidatedAvailabilityChange to set
	 */
	public void setDocConsolidatedAvailabilityChange(YFCDocument docConsolidatedAvailabilityChange) {
		this.docConsolidatedAvailabilityChange = docConsolidatedAvailabilityChange;
	}

	/**
	 * @return the bActivityNodesRead
	 */
	public boolean isActivityNodesRead() {
		return bActivityNodesRead;
	}

	/**
	 * @param bActivityNodesRead
	 *            the bActivityNodesRead to set
	 */
	public void setActivityNodesRead(boolean bActivityNodesRead) {
		this.bActivityNodesRead = bActivityNodesRead;
	}

	/**
	 * @return the indexListAlerts
	 */
	public SCIndexedEntityList<EXTN_Inventory_Alerts> getIndexListAlerts() {
		return indexListAlerts;
	}

	/**
	 * @param indexListAlerts
	 *            the indexListAlerts to set
	 */
	public void setIndexListAlerts(SCIndexedEntityList<EXTN_Inventory_Alerts> indexListAlerts) {
		this.indexListAlerts = indexListAlerts;
	}

	/**
	 * @return the sNodeType
	 */
	public String getNodeType() {
		return sNodeType;
	}

	/**
	 * @param sNodeType
	 *            the sNodeType to set
	 */
	public void setNodeType(String sNodeType) {
		this.sNodeType = sNodeType;
	}

	/**
	 * @return the sOrgListForMonitoring
	 */
	public String getOrgListForMonitoring() {
		return sOrgListForMonitoring;
	}

	/**
	 * @param sOrgListForMonitoring
	 *            the sOrgListForMonitoring to set
	 */
	public void setOrgListForMonitoring(String sOrgListForMonitoring) {
		this.sOrgListForMonitoring = sOrgListForMonitoring;
	}

	/**
	 * @return the bPopulateInventoryAlerts
	 */
	public boolean isPopulateInventoryAlerts() {
		return bPopulateInventoryAlerts;
	}

	/**
	 * @param bPopulateInventoryAlerts
	 *            the bPopulateInventoryAlerts to set
	 */
	public void setPopulateInventoryAlerts(boolean bPopulateInventoryAlerts) {
		this.bPopulateInventoryAlerts = bPopulateInventoryAlerts;
	}

	public String toString() {
		StringBuilder strbldr = new StringBuilder();
		return strbldr.append("\nindexListAlerts: " + indexListAlerts + "\n")
				.append("colActivityNodes: " + colActivityNodes + "\n")
				.append("colAlertsToRaiseEvent: " + colAlertsToRaiseEvent + "\n").append("sSegment: " + sSegment + "\n")
				.append("sSegmentType: " + sSegmentType + "\n").append("sTransactionId: " + sTransactionId + "\n")
				.append("sInvItemKey: " + sInvItemKey + "\n").append("sInvOrgCode: " + sInvOrgCode + "\n")
				.append("oItem: " + oItem + "\n").append("oInvItem: " + oInvItem + "\n")
				.append("oInvMonitorRule: " + oInvMonitorRule + "\n")
				.append("oNodeLevelMonitorRule: " + oNodeLevelMonitorRule + "\n")
				.append("mGrpsInDistrLevelRule: " + mGrpsInDistrLevelRule + "\n")
				.append("mGrpsInNodeLevelDistrRule: " + mGrpsInNodeLevelDistrRule + "\n")
				.append("mGrpsToConsiderForGTIN: " + mGrpsToConsiderForGTIN + "\n")
				.append("sMonitorOption: " + sMonitorOption + "\n").append("sDemandType: " + sDemandType + "\n")
				.append("sAgentCriteriaId: " + sAgentCriteriaId + "\n")
				.append("useRealTimeATPMonitor: " + useRealTimeATPMonitor + "\n")
				.append("bComputeAvailabilityForRTAM: " + bComputeAvailabilityForRTAM + "\n")
				.append("sMaxShipDateTime: " + sMaxShipDateTime + "\n")
				.append("iMaxShipDateOffSetDays: " + iMaxShipDateOffSetDays + "\n")
				.append("useNodeLevelRealTimeATPMonitor: " + useNodeLevelRealTimeATPMonitor + "\n")
				.append("bAlwaysRaiseEvent: " + bAlwaysRaiseEvent + "\n")
				.append("sProcessedFlag: " + sProcessedFlag + "\n")
				.append("sComponentInvItemKey: " + sComponentInvItemKey + "\n")
				.append("inventoryAlertsListDoc: " + inventoryAlertsListDoc + "\n")
				.append("templateElem: " + templateElem + "\n").append("bIsAPIMode: " + bIsAPIMode + "\n")
				.append("bExpandAdditionalItems: " + bExpandAdditionalItems + "\n")
				.append("overriddenDistributionRuleId: " + overriddenDistributionRuleId + "\n")
				.append("distributionGroupForDGLevel: " + distributionGroupForDGLevel + "\n")
				.append("distributionGroupsForNodeLevel: " + distributionGroupsForNodeLevel + "\n")
				.append("sDefaultDistributionRule: " + sDefaultDistributionRule + "\n")
				.append("bEnterpriseDGOverridden: " + bEnterpriseDGOverridden + "\n")
				.append("sDefaultDistributionRuleOrgn: " + sDefaultDistributionRuleOrgn + "\n")
				.append("docConsolidatedAvailabilityChange: " + docConsolidatedAvailabilityChange + "\n")
				.append("bActivityNodesRead: " + bActivityNodesRead + "\n").append("sNodeType: " + sNodeType + "\n")
				.append("sOrgListForMonitoring: " + sOrgListForMonitoring + "\n")
				.append("bPopulateInventoryAlerts: " + bPopulateInventoryAlerts + "\n").toString();
	}

}
