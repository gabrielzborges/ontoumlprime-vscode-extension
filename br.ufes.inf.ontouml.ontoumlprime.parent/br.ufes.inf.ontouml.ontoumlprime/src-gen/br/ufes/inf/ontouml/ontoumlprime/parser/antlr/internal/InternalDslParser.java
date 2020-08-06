package br.ufes.inf.ontouml.ontoumlprime.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import br.ufes.inf.ontouml.ontoumlprime.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'{'", "'}'", "'complete'", "'GeneralizationSet'", "'specializes'", "'into'", "','", "';'", "'specialize'", "'=>'", "'PrimitiveDataType'", "'('", "')'", "'ComplexDataType'", "'enum'", "'essential'", "'inseparable'", "'shareable'", "'immutable'", "'relation'", "'['", "'..'", "']'", "'isComponentOf'", "'isMemberOf'", "'isSubCollectionOf'", "'isSubQuantityOf'", "'Kind'", "'Quantity'", "'extensional'", "'CollectiveUniversal'", "'SubKind'", "'Role'", "'Phase'", "'Category'", "'Mixin'", "'RoleMixin'", "'RelatorUniversal'", "'material'", "'rel'", "'formal'", "'ModeUniversal'", "'QualityUniversal'", "'characterizes'", "'datatypes'", "'assoc'", "'characterizedBy'", "'mediates'", "'PrimitiveDataTypeType'", "'*'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDsl.g"; }



     	private DslGrammarAccess grammarAccess;

        public InternalDslParser(TokenStream input, DslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected DslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalDsl.g:71:1: ruleModel returns [EObject current=null] : ( () ( (lv_elements_1_0= ruleElement ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_1_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:77:2: ( ( () ( (lv_elements_1_0= ruleElement ) )* ) )
            // InternalDsl.g:78:2: ( () ( (lv_elements_1_0= ruleElement ) )* )
            {
            // InternalDsl.g:78:2: ( () ( (lv_elements_1_0= ruleElement ) )* )
            // InternalDsl.g:79:3: () ( (lv_elements_1_0= ruleElement ) )*
            {
            // InternalDsl.g:79:3: ()
            // InternalDsl.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getModelAccess().getModelAction_0(),
            					current);
            			

            }

            // InternalDsl.g:86:3: ( (lv_elements_1_0= ruleElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==11||(LA1_0>=14 && LA1_0<=15)||LA1_0==22||(LA1_0>=25 && LA1_0<=30)||(LA1_0>=39 && LA1_0<=50)||(LA1_0>=52 && LA1_0<=54)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDsl.g:87:4: (lv_elements_1_0= ruleElement )
            	    {
            	    // InternalDsl.g:87:4: (lv_elements_1_0= ruleElement )
            	    // InternalDsl.g:88:5: lv_elements_1_0= ruleElement
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getElementsElementParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_elements_1_0=ruleElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_1_0,
            	    						"br.ufes.inf.ontouml.ontoumlprime.Dsl.Element");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleElement"
    // InternalDsl.g:109:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalDsl.g:109:48: (iv_ruleElement= ruleElement EOF )
            // InternalDsl.g:110:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalDsl.g:116:1: ruleElement returns [EObject current=null] : (this_Package_0= rulePackage | this_GeneralizationSet_1= ruleGeneralizationSet | this_PrimitiveDataType_2= rulePrimitiveDataType | this_ComplexDataType_3= ruleComplexDataType | this_Enumeration_4= ruleEnumeration | this_MeronymicRelation_5= ruleMeronymicRelation | this_Kind_6= ruleKind | this_QuantityUniversal_7= ruleQuantityUniversal | this_CollectiveUniversal_8= ruleCollectiveUniversal | this_SubKind_9= ruleSubKind | this_Role_10= ruleRole | this_Phase_11= rulePhase | this_Category_12= ruleCategory | this_Mixin_13= ruleMixin | this_RoleMixin_14= ruleRoleMixin | this_RelatorUniversal_15= ruleRelatorUniversal | this_BinaryMaterialRelation_16= ruleBinaryMaterialRelation | this_BinaryFormalRelation_17= ruleBinaryFormalRelation | this_ModeUniversal_18= ruleModeUniversal | this_QualityUniversal_19= ruleQualityUniversal | this_nAryMaterialRelation_20= rulenAryMaterialRelation | this_nAryFormalRelation_21= rulenAryFormalRelation ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Package_0 = null;

        EObject this_GeneralizationSet_1 = null;

        EObject this_PrimitiveDataType_2 = null;

        EObject this_ComplexDataType_3 = null;

        EObject this_Enumeration_4 = null;

        EObject this_MeronymicRelation_5 = null;

        EObject this_Kind_6 = null;

        EObject this_QuantityUniversal_7 = null;

        EObject this_CollectiveUniversal_8 = null;

        EObject this_SubKind_9 = null;

        EObject this_Role_10 = null;

        EObject this_Phase_11 = null;

        EObject this_Category_12 = null;

        EObject this_Mixin_13 = null;

        EObject this_RoleMixin_14 = null;

        EObject this_RelatorUniversal_15 = null;

        EObject this_BinaryMaterialRelation_16 = null;

        EObject this_BinaryFormalRelation_17 = null;

        EObject this_ModeUniversal_18 = null;

        EObject this_QualityUniversal_19 = null;

        EObject this_nAryMaterialRelation_20 = null;

        EObject this_nAryFormalRelation_21 = null;



        	enterRule();

        try {
            // InternalDsl.g:122:2: ( (this_Package_0= rulePackage | this_GeneralizationSet_1= ruleGeneralizationSet | this_PrimitiveDataType_2= rulePrimitiveDataType | this_ComplexDataType_3= ruleComplexDataType | this_Enumeration_4= ruleEnumeration | this_MeronymicRelation_5= ruleMeronymicRelation | this_Kind_6= ruleKind | this_QuantityUniversal_7= ruleQuantityUniversal | this_CollectiveUniversal_8= ruleCollectiveUniversal | this_SubKind_9= ruleSubKind | this_Role_10= ruleRole | this_Phase_11= rulePhase | this_Category_12= ruleCategory | this_Mixin_13= ruleMixin | this_RoleMixin_14= ruleRoleMixin | this_RelatorUniversal_15= ruleRelatorUniversal | this_BinaryMaterialRelation_16= ruleBinaryMaterialRelation | this_BinaryFormalRelation_17= ruleBinaryFormalRelation | this_ModeUniversal_18= ruleModeUniversal | this_QualityUniversal_19= ruleQualityUniversal | this_nAryMaterialRelation_20= rulenAryMaterialRelation | this_nAryFormalRelation_21= rulenAryFormalRelation ) )
            // InternalDsl.g:123:2: (this_Package_0= rulePackage | this_GeneralizationSet_1= ruleGeneralizationSet | this_PrimitiveDataType_2= rulePrimitiveDataType | this_ComplexDataType_3= ruleComplexDataType | this_Enumeration_4= ruleEnumeration | this_MeronymicRelation_5= ruleMeronymicRelation | this_Kind_6= ruleKind | this_QuantityUniversal_7= ruleQuantityUniversal | this_CollectiveUniversal_8= ruleCollectiveUniversal | this_SubKind_9= ruleSubKind | this_Role_10= ruleRole | this_Phase_11= rulePhase | this_Category_12= ruleCategory | this_Mixin_13= ruleMixin | this_RoleMixin_14= ruleRoleMixin | this_RelatorUniversal_15= ruleRelatorUniversal | this_BinaryMaterialRelation_16= ruleBinaryMaterialRelation | this_BinaryFormalRelation_17= ruleBinaryFormalRelation | this_ModeUniversal_18= ruleModeUniversal | this_QualityUniversal_19= ruleQualityUniversal | this_nAryMaterialRelation_20= rulenAryMaterialRelation | this_nAryFormalRelation_21= rulenAryFormalRelation )
            {
            // InternalDsl.g:123:2: (this_Package_0= rulePackage | this_GeneralizationSet_1= ruleGeneralizationSet | this_PrimitiveDataType_2= rulePrimitiveDataType | this_ComplexDataType_3= ruleComplexDataType | this_Enumeration_4= ruleEnumeration | this_MeronymicRelation_5= ruleMeronymicRelation | this_Kind_6= ruleKind | this_QuantityUniversal_7= ruleQuantityUniversal | this_CollectiveUniversal_8= ruleCollectiveUniversal | this_SubKind_9= ruleSubKind | this_Role_10= ruleRole | this_Phase_11= rulePhase | this_Category_12= ruleCategory | this_Mixin_13= ruleMixin | this_RoleMixin_14= ruleRoleMixin | this_RelatorUniversal_15= ruleRelatorUniversal | this_BinaryMaterialRelation_16= ruleBinaryMaterialRelation | this_BinaryFormalRelation_17= ruleBinaryFormalRelation | this_ModeUniversal_18= ruleModeUniversal | this_QualityUniversal_19= ruleQualityUniversal | this_nAryMaterialRelation_20= rulenAryMaterialRelation | this_nAryFormalRelation_21= rulenAryFormalRelation )
            int alt2=22;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalDsl.g:124:3: this_Package_0= rulePackage
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getPackageParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Package_0=rulePackage();

                    state._fsp--;


                    			current = this_Package_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:133:3: this_GeneralizationSet_1= ruleGeneralizationSet
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getGeneralizationSetParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_GeneralizationSet_1=ruleGeneralizationSet();

                    state._fsp--;


                    			current = this_GeneralizationSet_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDsl.g:142:3: this_PrimitiveDataType_2= rulePrimitiveDataType
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getPrimitiveDataTypeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrimitiveDataType_2=rulePrimitiveDataType();

                    state._fsp--;


                    			current = this_PrimitiveDataType_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalDsl.g:151:3: this_ComplexDataType_3= ruleComplexDataType
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getComplexDataTypeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComplexDataType_3=ruleComplexDataType();

                    state._fsp--;


                    			current = this_ComplexDataType_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalDsl.g:160:3: this_Enumeration_4= ruleEnumeration
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getEnumerationParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Enumeration_4=ruleEnumeration();

                    state._fsp--;


                    			current = this_Enumeration_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalDsl.g:169:3: this_MeronymicRelation_5= ruleMeronymicRelation
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getMeronymicRelationParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_MeronymicRelation_5=ruleMeronymicRelation();

                    state._fsp--;


                    			current = this_MeronymicRelation_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalDsl.g:178:3: this_Kind_6= ruleKind
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getKindParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Kind_6=ruleKind();

                    state._fsp--;


                    			current = this_Kind_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalDsl.g:187:3: this_QuantityUniversal_7= ruleQuantityUniversal
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getQuantityUniversalParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_QuantityUniversal_7=ruleQuantityUniversal();

                    state._fsp--;


                    			current = this_QuantityUniversal_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalDsl.g:196:3: this_CollectiveUniversal_8= ruleCollectiveUniversal
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getCollectiveUniversalParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_CollectiveUniversal_8=ruleCollectiveUniversal();

                    state._fsp--;


                    			current = this_CollectiveUniversal_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalDsl.g:205:3: this_SubKind_9= ruleSubKind
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getSubKindParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_SubKind_9=ruleSubKind();

                    state._fsp--;


                    			current = this_SubKind_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalDsl.g:214:3: this_Role_10= ruleRole
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getRoleParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_Role_10=ruleRole();

                    state._fsp--;


                    			current = this_Role_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalDsl.g:223:3: this_Phase_11= rulePhase
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getPhaseParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_Phase_11=rulePhase();

                    state._fsp--;


                    			current = this_Phase_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalDsl.g:232:3: this_Category_12= ruleCategory
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getCategoryParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_Category_12=ruleCategory();

                    state._fsp--;


                    			current = this_Category_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 14 :
                    // InternalDsl.g:241:3: this_Mixin_13= ruleMixin
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getMixinParserRuleCall_13());
                    		
                    pushFollow(FOLLOW_2);
                    this_Mixin_13=ruleMixin();

                    state._fsp--;


                    			current = this_Mixin_13;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 15 :
                    // InternalDsl.g:250:3: this_RoleMixin_14= ruleRoleMixin
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getRoleMixinParserRuleCall_14());
                    		
                    pushFollow(FOLLOW_2);
                    this_RoleMixin_14=ruleRoleMixin();

                    state._fsp--;


                    			current = this_RoleMixin_14;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 16 :
                    // InternalDsl.g:259:3: this_RelatorUniversal_15= ruleRelatorUniversal
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getRelatorUniversalParserRuleCall_15());
                    		
                    pushFollow(FOLLOW_2);
                    this_RelatorUniversal_15=ruleRelatorUniversal();

                    state._fsp--;


                    			current = this_RelatorUniversal_15;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 17 :
                    // InternalDsl.g:268:3: this_BinaryMaterialRelation_16= ruleBinaryMaterialRelation
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getBinaryMaterialRelationParserRuleCall_16());
                    		
                    pushFollow(FOLLOW_2);
                    this_BinaryMaterialRelation_16=ruleBinaryMaterialRelation();

                    state._fsp--;


                    			current = this_BinaryMaterialRelation_16;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 18 :
                    // InternalDsl.g:277:3: this_BinaryFormalRelation_17= ruleBinaryFormalRelation
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getBinaryFormalRelationParserRuleCall_17());
                    		
                    pushFollow(FOLLOW_2);
                    this_BinaryFormalRelation_17=ruleBinaryFormalRelation();

                    state._fsp--;


                    			current = this_BinaryFormalRelation_17;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 19 :
                    // InternalDsl.g:286:3: this_ModeUniversal_18= ruleModeUniversal
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getModeUniversalParserRuleCall_18());
                    		
                    pushFollow(FOLLOW_2);
                    this_ModeUniversal_18=ruleModeUniversal();

                    state._fsp--;


                    			current = this_ModeUniversal_18;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 20 :
                    // InternalDsl.g:295:3: this_QualityUniversal_19= ruleQualityUniversal
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getQualityUniversalParserRuleCall_19());
                    		
                    pushFollow(FOLLOW_2);
                    this_QualityUniversal_19=ruleQualityUniversal();

                    state._fsp--;


                    			current = this_QualityUniversal_19;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 21 :
                    // InternalDsl.g:304:3: this_nAryMaterialRelation_20= rulenAryMaterialRelation
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getNAryMaterialRelationParserRuleCall_20());
                    		
                    pushFollow(FOLLOW_2);
                    this_nAryMaterialRelation_20=rulenAryMaterialRelation();

                    state._fsp--;


                    			current = this_nAryMaterialRelation_20;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 22 :
                    // InternalDsl.g:313:3: this_nAryFormalRelation_21= rulenAryFormalRelation
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getNAryFormalRelationParserRuleCall_21());
                    		
                    pushFollow(FOLLOW_2);
                    this_nAryFormalRelation_21=rulenAryFormalRelation();

                    state._fsp--;


                    			current = this_nAryFormalRelation_21;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRulePackage"
    // InternalDsl.g:325:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // InternalDsl.g:325:48: (iv_rulePackage= rulePackage EOF )
            // InternalDsl.g:326:2: iv_rulePackage= rulePackage EOF
            {
             newCompositeNode(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackage=rulePackage();

            state._fsp--;

             current =iv_rulePackage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // InternalDsl.g:332:1: rulePackage returns [EObject current=null] : ( () otherlv_1= 'package' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleElement ) )+ otherlv_5= '}' ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:338:2: ( ( () otherlv_1= 'package' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleElement ) )+ otherlv_5= '}' ) )
            // InternalDsl.g:339:2: ( () otherlv_1= 'package' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleElement ) )+ otherlv_5= '}' )
            {
            // InternalDsl.g:339:2: ( () otherlv_1= 'package' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleElement ) )+ otherlv_5= '}' )
            // InternalDsl.g:340:3: () otherlv_1= 'package' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleElement ) )+ otherlv_5= '}'
            {
            // InternalDsl.g:340:3: ()
            // InternalDsl.g:341:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPackageAccess().getPackageAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getPackageAccess().getPackageKeyword_1());
            		
            // InternalDsl.g:351:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDsl.g:352:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDsl.g:352:4: (lv_name_2_0= RULE_ID )
            // InternalDsl.g:353:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_2_0, grammarAccess.getPackageAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPackageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDsl.g:373:3: ( (lv_elements_4_0= ruleElement ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID||LA3_0==11||(LA3_0>=14 && LA3_0<=15)||LA3_0==22||(LA3_0>=25 && LA3_0<=30)||(LA3_0>=39 && LA3_0<=50)||(LA3_0>=52 && LA3_0<=54)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDsl.g:374:4: (lv_elements_4_0= ruleElement )
            	    {
            	    // InternalDsl.g:374:4: (lv_elements_4_0= ruleElement )
            	    // InternalDsl.g:375:5: lv_elements_4_0= ruleElement
            	    {

            	    					newCompositeNode(grammarAccess.getPackageAccess().getElementsElementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_elements_4_0=ruleElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPackageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_4_0,
            	    						"br.ufes.inf.ontouml.ontoumlprime.Dsl.Element");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleGeneralizationSet"
    // InternalDsl.g:400:1: entryRuleGeneralizationSet returns [EObject current=null] : iv_ruleGeneralizationSet= ruleGeneralizationSet EOF ;
    public final EObject entryRuleGeneralizationSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralizationSet = null;


        try {
            // InternalDsl.g:400:58: (iv_ruleGeneralizationSet= ruleGeneralizationSet EOF )
            // InternalDsl.g:401:2: iv_ruleGeneralizationSet= ruleGeneralizationSet EOF
            {
             newCompositeNode(grammarAccess.getGeneralizationSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGeneralizationSet=ruleGeneralizationSet();

            state._fsp--;

             current =iv_ruleGeneralizationSet; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGeneralizationSet"


    // $ANTLR start "ruleGeneralizationSet"
    // InternalDsl.g:407:1: ruleGeneralizationSet returns [EObject current=null] : (this_CompleteGeneralizationSet_0= ruleCompleteGeneralizationSet | this_AnonymousGeneralizationSet_1= ruleAnonymousGeneralizationSet ) ;
    public final EObject ruleGeneralizationSet() throws RecognitionException {
        EObject current = null;

        EObject this_CompleteGeneralizationSet_0 = null;

        EObject this_AnonymousGeneralizationSet_1 = null;



        	enterRule();

        try {
            // InternalDsl.g:413:2: ( (this_CompleteGeneralizationSet_0= ruleCompleteGeneralizationSet | this_AnonymousGeneralizationSet_1= ruleAnonymousGeneralizationSet ) )
            // InternalDsl.g:414:2: (this_CompleteGeneralizationSet_0= ruleCompleteGeneralizationSet | this_AnonymousGeneralizationSet_1= ruleAnonymousGeneralizationSet )
            {
            // InternalDsl.g:414:2: (this_CompleteGeneralizationSet_0= ruleCompleteGeneralizationSet | this_AnonymousGeneralizationSet_1= ruleAnonymousGeneralizationSet )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=14 && LA4_0<=15)) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDsl.g:415:3: this_CompleteGeneralizationSet_0= ruleCompleteGeneralizationSet
                    {

                    			newCompositeNode(grammarAccess.getGeneralizationSetAccess().getCompleteGeneralizationSetParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CompleteGeneralizationSet_0=ruleCompleteGeneralizationSet();

                    state._fsp--;


                    			current = this_CompleteGeneralizationSet_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:424:3: this_AnonymousGeneralizationSet_1= ruleAnonymousGeneralizationSet
                    {

                    			newCompositeNode(grammarAccess.getGeneralizationSetAccess().getAnonymousGeneralizationSetParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AnonymousGeneralizationSet_1=ruleAnonymousGeneralizationSet();

                    state._fsp--;


                    			current = this_AnonymousGeneralizationSet_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGeneralizationSet"


    // $ANTLR start "entryRuleCompleteGeneralizationSet"
    // InternalDsl.g:436:1: entryRuleCompleteGeneralizationSet returns [EObject current=null] : iv_ruleCompleteGeneralizationSet= ruleCompleteGeneralizationSet EOF ;
    public final EObject entryRuleCompleteGeneralizationSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompleteGeneralizationSet = null;


        try {
            // InternalDsl.g:436:66: (iv_ruleCompleteGeneralizationSet= ruleCompleteGeneralizationSet EOF )
            // InternalDsl.g:437:2: iv_ruleCompleteGeneralizationSet= ruleCompleteGeneralizationSet EOF
            {
             newCompositeNode(grammarAccess.getCompleteGeneralizationSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompleteGeneralizationSet=ruleCompleteGeneralizationSet();

            state._fsp--;

             current =iv_ruleCompleteGeneralizationSet; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompleteGeneralizationSet"


    // $ANTLR start "ruleCompleteGeneralizationSet"
    // InternalDsl.g:443:1: ruleCompleteGeneralizationSet returns [EObject current=null] : ( ( (lv_isCovering_0_0= 'complete' ) )? otherlv_1= 'GeneralizationSet' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'specializes' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'into' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ';' ) ;
    public final EObject ruleCompleteGeneralizationSet() throws RecognitionException {
        EObject current = null;

        Token lv_isCovering_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalDsl.g:449:2: ( ( ( (lv_isCovering_0_0= 'complete' ) )? otherlv_1= 'GeneralizationSet' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'specializes' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'into' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ';' ) )
            // InternalDsl.g:450:2: ( ( (lv_isCovering_0_0= 'complete' ) )? otherlv_1= 'GeneralizationSet' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'specializes' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'into' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ';' )
            {
            // InternalDsl.g:450:2: ( ( (lv_isCovering_0_0= 'complete' ) )? otherlv_1= 'GeneralizationSet' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'specializes' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'into' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ';' )
            // InternalDsl.g:451:3: ( (lv_isCovering_0_0= 'complete' ) )? otherlv_1= 'GeneralizationSet' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'specializes' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'into' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ';'
            {
            // InternalDsl.g:451:3: ( (lv_isCovering_0_0= 'complete' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDsl.g:452:4: (lv_isCovering_0_0= 'complete' )
                    {
                    // InternalDsl.g:452:4: (lv_isCovering_0_0= 'complete' )
                    // InternalDsl.g:453:5: lv_isCovering_0_0= 'complete'
                    {
                    lv_isCovering_0_0=(Token)match(input,14,FOLLOW_7); 

                    					newLeafNode(lv_isCovering_0_0, grammarAccess.getCompleteGeneralizationSetAccess().getIsCoveringCompleteKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCompleteGeneralizationSetRule());
                    					}
                    					setWithLastConsumed(current, "isCovering", true, "complete");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getCompleteGeneralizationSetAccess().getGeneralizationSetKeyword_1());
            		
            // InternalDsl.g:469:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDsl.g:470:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDsl.g:470:4: (lv_name_2_0= RULE_ID )
            // InternalDsl.g:471:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_2_0, grammarAccess.getCompleteGeneralizationSetAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompleteGeneralizationSetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getCompleteGeneralizationSetAccess().getSpecializesKeyword_3());
            		
            // InternalDsl.g:491:3: ( (otherlv_4= RULE_ID ) )
            // InternalDsl.g:492:4: (otherlv_4= RULE_ID )
            {
            // InternalDsl.g:492:4: (otherlv_4= RULE_ID )
            // InternalDsl.g:493:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompleteGeneralizationSetRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_4, grammarAccess.getCompleteGeneralizationSetAccess().getSpecializedUniversalUniversalCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getCompleteGeneralizationSetAccess().getIntoKeyword_5());
            		
            // InternalDsl.g:508:3: ( (otherlv_6= RULE_ID ) )
            // InternalDsl.g:509:4: (otherlv_6= RULE_ID )
            {
            // InternalDsl.g:509:4: (otherlv_6= RULE_ID )
            // InternalDsl.g:510:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompleteGeneralizationSetRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_6, grammarAccess.getCompleteGeneralizationSetAccess().getSpecializingUniversalsUniversalCrossReference_6_0());
            				

            }


            }

            // InternalDsl.g:521:3: (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDsl.g:522:4: otherlv_7= ',' ( (otherlv_8= RULE_ID ) )
            	    {
            	    otherlv_7=(Token)match(input,18,FOLLOW_4); 

            	    				newLeafNode(otherlv_7, grammarAccess.getCompleteGeneralizationSetAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalDsl.g:526:4: ( (otherlv_8= RULE_ID ) )
            	    // InternalDsl.g:527:5: (otherlv_8= RULE_ID )
            	    {
            	    // InternalDsl.g:527:5: (otherlv_8= RULE_ID )
            	    // InternalDsl.g:528:6: otherlv_8= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getCompleteGeneralizationSetRule());
            	    						}
            	    					
            	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    						newLeafNode(otherlv_8, grammarAccess.getCompleteGeneralizationSetAccess().getSpecializingUniversalsUniversalCrossReference_7_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_9=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getCompleteGeneralizationSetAccess().getSemicolonKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompleteGeneralizationSet"


    // $ANTLR start "entryRuleAnonymousGeneralizationSet"
    // InternalDsl.g:548:1: entryRuleAnonymousGeneralizationSet returns [EObject current=null] : iv_ruleAnonymousGeneralizationSet= ruleAnonymousGeneralizationSet EOF ;
    public final EObject entryRuleAnonymousGeneralizationSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnonymousGeneralizationSet = null;


        try {
            // InternalDsl.g:548:67: (iv_ruleAnonymousGeneralizationSet= ruleAnonymousGeneralizationSet EOF )
            // InternalDsl.g:549:2: iv_ruleAnonymousGeneralizationSet= ruleAnonymousGeneralizationSet EOF
            {
             newCompositeNode(grammarAccess.getAnonymousGeneralizationSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnonymousGeneralizationSet=ruleAnonymousGeneralizationSet();

            state._fsp--;

             current =iv_ruleAnonymousGeneralizationSet; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnonymousGeneralizationSet"


    // $ANTLR start "ruleAnonymousGeneralizationSet"
    // InternalDsl.g:555:1: ruleAnonymousGeneralizationSet returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( ( (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )+ (otherlv_3= 'specialize' | otherlv_4= '=>' ) ) | (otherlv_5= 'specializes' | otherlv_6= '=>' ) ) ( (otherlv_7= RULE_ID ) ) otherlv_8= ';' ) ;
    public final EObject ruleAnonymousGeneralizationSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalDsl.g:561:2: ( ( ( (otherlv_0= RULE_ID ) ) ( ( (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )+ (otherlv_3= 'specialize' | otherlv_4= '=>' ) ) | (otherlv_5= 'specializes' | otherlv_6= '=>' ) ) ( (otherlv_7= RULE_ID ) ) otherlv_8= ';' ) )
            // InternalDsl.g:562:2: ( ( (otherlv_0= RULE_ID ) ) ( ( (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )+ (otherlv_3= 'specialize' | otherlv_4= '=>' ) ) | (otherlv_5= 'specializes' | otherlv_6= '=>' ) ) ( (otherlv_7= RULE_ID ) ) otherlv_8= ';' )
            {
            // InternalDsl.g:562:2: ( ( (otherlv_0= RULE_ID ) ) ( ( (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )+ (otherlv_3= 'specialize' | otherlv_4= '=>' ) ) | (otherlv_5= 'specializes' | otherlv_6= '=>' ) ) ( (otherlv_7= RULE_ID ) ) otherlv_8= ';' )
            // InternalDsl.g:563:3: ( (otherlv_0= RULE_ID ) ) ( ( (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )+ (otherlv_3= 'specialize' | otherlv_4= '=>' ) ) | (otherlv_5= 'specializes' | otherlv_6= '=>' ) ) ( (otherlv_7= RULE_ID ) ) otherlv_8= ';'
            {
            // InternalDsl.g:563:3: ( (otherlv_0= RULE_ID ) )
            // InternalDsl.g:564:4: (otherlv_0= RULE_ID )
            {
            // InternalDsl.g:564:4: (otherlv_0= RULE_ID )
            // InternalDsl.g:565:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAnonymousGeneralizationSetRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_0, grammarAccess.getAnonymousGeneralizationSetAccess().getSpecializingUniversalsUniversalCrossReference_0_0());
            				

            }


            }

            // InternalDsl.g:576:3: ( ( (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )+ (otherlv_3= 'specialize' | otherlv_4= '=>' ) ) | (otherlv_5= 'specializes' | otherlv_6= '=>' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            else if ( (LA10_0==16||LA10_0==21) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalDsl.g:577:4: ( (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )+ (otherlv_3= 'specialize' | otherlv_4= '=>' ) )
                    {
                    // InternalDsl.g:577:4: ( (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )+ (otherlv_3= 'specialize' | otherlv_4= '=>' ) )
                    // InternalDsl.g:578:5: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )+ (otherlv_3= 'specialize' | otherlv_4= '=>' )
                    {
                    // InternalDsl.g:578:5: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==18) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalDsl.g:579:6: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
                    	    {
                    	    otherlv_1=(Token)match(input,18,FOLLOW_4); 

                    	    						newLeafNode(otherlv_1, grammarAccess.getAnonymousGeneralizationSetAccess().getCommaKeyword_1_0_0_0());
                    	    					
                    	    // InternalDsl.g:583:6: ( (otherlv_2= RULE_ID ) )
                    	    // InternalDsl.g:584:7: (otherlv_2= RULE_ID )
                    	    {
                    	    // InternalDsl.g:584:7: (otherlv_2= RULE_ID )
                    	    // InternalDsl.g:585:8: otherlv_2= RULE_ID
                    	    {

                    	    								if (current==null) {
                    	    									current = createModelElement(grammarAccess.getAnonymousGeneralizationSetRule());
                    	    								}
                    	    							
                    	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_12); 

                    	    								newLeafNode(otherlv_2, grammarAccess.getAnonymousGeneralizationSetAccess().getSpecializingUniversalsUniversalCrossReference_1_0_0_1_0());
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);

                    // InternalDsl.g:597:5: (otherlv_3= 'specialize' | otherlv_4= '=>' )
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==20) ) {
                        alt8=1;
                    }
                    else if ( (LA8_0==21) ) {
                        alt8=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 0, input);

                        throw nvae;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalDsl.g:598:6: otherlv_3= 'specialize'
                            {
                            otherlv_3=(Token)match(input,20,FOLLOW_4); 

                            						newLeafNode(otherlv_3, grammarAccess.getAnonymousGeneralizationSetAccess().getSpecializeKeyword_1_0_1_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalDsl.g:603:6: otherlv_4= '=>'
                            {
                            otherlv_4=(Token)match(input,21,FOLLOW_4); 

                            						newLeafNode(otherlv_4, grammarAccess.getAnonymousGeneralizationSetAccess().getEqualsSignGreaterThanSignKeyword_1_0_1_1());
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:610:4: (otherlv_5= 'specializes' | otherlv_6= '=>' )
                    {
                    // InternalDsl.g:610:4: (otherlv_5= 'specializes' | otherlv_6= '=>' )
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==16) ) {
                        alt9=1;
                    }
                    else if ( (LA9_0==21) ) {
                        alt9=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalDsl.g:611:5: otherlv_5= 'specializes'
                            {
                            otherlv_5=(Token)match(input,16,FOLLOW_4); 

                            					newLeafNode(otherlv_5, grammarAccess.getAnonymousGeneralizationSetAccess().getSpecializesKeyword_1_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalDsl.g:616:5: otherlv_6= '=>'
                            {
                            otherlv_6=(Token)match(input,21,FOLLOW_4); 

                            					newLeafNode(otherlv_6, grammarAccess.getAnonymousGeneralizationSetAccess().getEqualsSignGreaterThanSignKeyword_1_1_1());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalDsl.g:622:3: ( (otherlv_7= RULE_ID ) )
            // InternalDsl.g:623:4: (otherlv_7= RULE_ID )
            {
            // InternalDsl.g:623:4: (otherlv_7= RULE_ID )
            // InternalDsl.g:624:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAnonymousGeneralizationSetRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_7, grammarAccess.getAnonymousGeneralizationSetAccess().getSpecializedUniversalUniversalCrossReference_2_0());
            				

            }


            }

            otherlv_8=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getAnonymousGeneralizationSetAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnonymousGeneralizationSet"


    // $ANTLR start "entryRulePrimitiveDataType"
    // InternalDsl.g:643:1: entryRulePrimitiveDataType returns [EObject current=null] : iv_rulePrimitiveDataType= rulePrimitiveDataType EOF ;
    public final EObject entryRulePrimitiveDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveDataType = null;


        try {
            // InternalDsl.g:643:58: (iv_rulePrimitiveDataType= rulePrimitiveDataType EOF )
            // InternalDsl.g:644:2: iv_rulePrimitiveDataType= rulePrimitiveDataType EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveDataTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimitiveDataType=rulePrimitiveDataType();

            state._fsp--;

             current =iv_rulePrimitiveDataType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitiveDataType"


    // $ANTLR start "rulePrimitiveDataType"
    // InternalDsl.g:650:1: rulePrimitiveDataType returns [EObject current=null] : (otherlv_0= 'PrimitiveDataType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv__type_3_0= rulePrimitiveDataTypeType ) ) otherlv_4= ')' otherlv_5= ';' ) ;
    public final EObject rulePrimitiveDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv__type_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:656:2: ( (otherlv_0= 'PrimitiveDataType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv__type_3_0= rulePrimitiveDataTypeType ) ) otherlv_4= ')' otherlv_5= ';' ) )
            // InternalDsl.g:657:2: (otherlv_0= 'PrimitiveDataType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv__type_3_0= rulePrimitiveDataTypeType ) ) otherlv_4= ')' otherlv_5= ';' )
            {
            // InternalDsl.g:657:2: (otherlv_0= 'PrimitiveDataType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv__type_3_0= rulePrimitiveDataTypeType ) ) otherlv_4= ')' otherlv_5= ';' )
            // InternalDsl.g:658:3: otherlv_0= 'PrimitiveDataType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv__type_3_0= rulePrimitiveDataTypeType ) ) otherlv_4= ')' otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPrimitiveDataTypeAccess().getPrimitiveDataTypeKeyword_0());
            		
            // InternalDsl.g:662:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:663:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:663:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:664:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPrimitiveDataTypeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPrimitiveDataTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getPrimitiveDataTypeAccess().getLeftParenthesisKeyword_2());
            		
            // InternalDsl.g:684:3: ( (lv__type_3_0= rulePrimitiveDataTypeType ) )
            // InternalDsl.g:685:4: (lv__type_3_0= rulePrimitiveDataTypeType )
            {
            // InternalDsl.g:685:4: (lv__type_3_0= rulePrimitiveDataTypeType )
            // InternalDsl.g:686:5: lv__type_3_0= rulePrimitiveDataTypeType
            {

            					newCompositeNode(grammarAccess.getPrimitiveDataTypeAccess().get_typePrimitiveDataTypeTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_16);
            lv__type_3_0=rulePrimitiveDataTypeType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPrimitiveDataTypeRule());
            					}
            					set(
            						current,
            						"_type",
            						lv__type_3_0,
            						"br.ufes.inf.ontouml.ontoumlprime.Dsl.PrimitiveDataTypeType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getPrimitiveDataTypeAccess().getRightParenthesisKeyword_4());
            		
            otherlv_5=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPrimitiveDataTypeAccess().getSemicolonKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimitiveDataType"


    // $ANTLR start "entryRuleComplexDataType"
    // InternalDsl.g:715:1: entryRuleComplexDataType returns [EObject current=null] : iv_ruleComplexDataType= ruleComplexDataType EOF ;
    public final EObject entryRuleComplexDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexDataType = null;


        try {
            // InternalDsl.g:715:56: (iv_ruleComplexDataType= ruleComplexDataType EOF )
            // InternalDsl.g:716:2: iv_ruleComplexDataType= ruleComplexDataType EOF
            {
             newCompositeNode(grammarAccess.getComplexDataTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComplexDataType=ruleComplexDataType();

            state._fsp--;

             current =iv_ruleComplexDataType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComplexDataType"


    // $ANTLR start "ruleComplexDataType"
    // InternalDsl.g:722:1: ruleComplexDataType returns [EObject current=null] : (otherlv_0= 'ComplexDataType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleDataTypeAttribute ) ) (otherlv_4= ';' ( (lv_attributes_5_0= ruleDataTypeAttribute ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleComplexDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_attributes_3_0 = null;

        EObject lv_attributes_5_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:728:2: ( (otherlv_0= 'ComplexDataType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleDataTypeAttribute ) ) (otherlv_4= ';' ( (lv_attributes_5_0= ruleDataTypeAttribute ) ) )* otherlv_6= '}' ) )
            // InternalDsl.g:729:2: (otherlv_0= 'ComplexDataType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleDataTypeAttribute ) ) (otherlv_4= ';' ( (lv_attributes_5_0= ruleDataTypeAttribute ) ) )* otherlv_6= '}' )
            {
            // InternalDsl.g:729:2: (otherlv_0= 'ComplexDataType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleDataTypeAttribute ) ) (otherlv_4= ';' ( (lv_attributes_5_0= ruleDataTypeAttribute ) ) )* otherlv_6= '}' )
            // InternalDsl.g:730:3: otherlv_0= 'ComplexDataType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleDataTypeAttribute ) ) (otherlv_4= ';' ( (lv_attributes_5_0= ruleDataTypeAttribute ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getComplexDataTypeAccess().getComplexDataTypeKeyword_0());
            		
            // InternalDsl.g:734:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:735:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:735:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:736:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getComplexDataTypeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComplexDataTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getComplexDataTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:756:3: ( (lv_attributes_3_0= ruleDataTypeAttribute ) )
            // InternalDsl.g:757:4: (lv_attributes_3_0= ruleDataTypeAttribute )
            {
            // InternalDsl.g:757:4: (lv_attributes_3_0= ruleDataTypeAttribute )
            // InternalDsl.g:758:5: lv_attributes_3_0= ruleDataTypeAttribute
            {

            					newCompositeNode(grammarAccess.getComplexDataTypeAccess().getAttributesDataTypeAttributeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_17);
            lv_attributes_3_0=ruleDataTypeAttribute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComplexDataTypeRule());
            					}
            					add(
            						current,
            						"attributes",
            						lv_attributes_3_0,
            						"br.ufes.inf.ontouml.ontoumlprime.Dsl.DataTypeAttribute");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:775:3: (otherlv_4= ';' ( (lv_attributes_5_0= ruleDataTypeAttribute ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==19) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDsl.g:776:4: otherlv_4= ';' ( (lv_attributes_5_0= ruleDataTypeAttribute ) )
            	    {
            	    otherlv_4=(Token)match(input,19,FOLLOW_4); 

            	    				newLeafNode(otherlv_4, grammarAccess.getComplexDataTypeAccess().getSemicolonKeyword_4_0());
            	    			
            	    // InternalDsl.g:780:4: ( (lv_attributes_5_0= ruleDataTypeAttribute ) )
            	    // InternalDsl.g:781:5: (lv_attributes_5_0= ruleDataTypeAttribute )
            	    {
            	    // InternalDsl.g:781:5: (lv_attributes_5_0= ruleDataTypeAttribute )
            	    // InternalDsl.g:782:6: lv_attributes_5_0= ruleDataTypeAttribute
            	    {

            	    						newCompositeNode(grammarAccess.getComplexDataTypeAccess().getAttributesDataTypeAttributeParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_attributes_5_0=ruleDataTypeAttribute();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComplexDataTypeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"attributes",
            	    							lv_attributes_5_0,
            	    							"br.ufes.inf.ontouml.ontoumlprime.Dsl.DataTypeAttribute");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getComplexDataTypeAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComplexDataType"


    // $ANTLR start "entryRuleEnumeration"
    // InternalDsl.g:808:1: entryRuleEnumeration returns [EObject current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final EObject entryRuleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeration = null;


        try {
            // InternalDsl.g:808:52: (iv_ruleEnumeration= ruleEnumeration EOF )
            // InternalDsl.g:809:2: iv_ruleEnumeration= ruleEnumeration EOF
            {
             newCompositeNode(grammarAccess.getEnumerationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumeration=ruleEnumeration();

            state._fsp--;

             current =iv_ruleEnumeration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumeration"


    // $ANTLR start "ruleEnumeration"
    // InternalDsl.g:815:1: ruleEnumeration returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_enumerationLiterals_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_enumerationLiterals_5_0= ruleEString ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleEnumeration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_enumerationLiterals_3_0 = null;

        AntlrDatatypeRuleToken lv_enumerationLiterals_5_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:821:2: ( (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_enumerationLiterals_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_enumerationLiterals_5_0= ruleEString ) ) )* otherlv_6= '}' ) )
            // InternalDsl.g:822:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_enumerationLiterals_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_enumerationLiterals_5_0= ruleEString ) ) )* otherlv_6= '}' )
            {
            // InternalDsl.g:822:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_enumerationLiterals_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_enumerationLiterals_5_0= ruleEString ) ) )* otherlv_6= '}' )
            // InternalDsl.g:823:3: otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_enumerationLiterals_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_enumerationLiterals_5_0= ruleEString ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumerationAccess().getEnumKeyword_0());
            		
            // InternalDsl.g:827:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:828:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:828:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:829:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnumerationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:849:3: ( (lv_enumerationLiterals_3_0= ruleEString ) )
            // InternalDsl.g:850:4: (lv_enumerationLiterals_3_0= ruleEString )
            {
            // InternalDsl.g:850:4: (lv_enumerationLiterals_3_0= ruleEString )
            // InternalDsl.g:851:5: lv_enumerationLiterals_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEnumerationAccess().getEnumerationLiteralsEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_19);
            lv_enumerationLiterals_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnumerationRule());
            					}
            					add(
            						current,
            						"enumerationLiterals",
            						lv_enumerationLiterals_3_0,
            						"br.ufes.inf.ontouml.ontoumlprime.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:868:3: (otherlv_4= ',' ( (lv_enumerationLiterals_5_0= ruleEString ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==18) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDsl.g:869:4: otherlv_4= ',' ( (lv_enumerationLiterals_5_0= ruleEString ) )
            	    {
            	    otherlv_4=(Token)match(input,18,FOLLOW_18); 

            	    				newLeafNode(otherlv_4, grammarAccess.getEnumerationAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalDsl.g:873:4: ( (lv_enumerationLiterals_5_0= ruleEString ) )
            	    // InternalDsl.g:874:5: (lv_enumerationLiterals_5_0= ruleEString )
            	    {
            	    // InternalDsl.g:874:5: (lv_enumerationLiterals_5_0= ruleEString )
            	    // InternalDsl.g:875:6: lv_enumerationLiterals_5_0= ruleEString
            	    {

            	    						newCompositeNode(grammarAccess.getEnumerationAccess().getEnumerationLiteralsEStringParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_enumerationLiterals_5_0=ruleEString();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEnumerationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"enumerationLiterals",
            	    							lv_enumerationLiterals_5_0,
            	    							"br.ufes.inf.ontouml.ontoumlprime.Dsl.EString");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumeration"


    // $ANTLR start "entryRuleMeronymicRelation"
    // InternalDsl.g:901:1: entryRuleMeronymicRelation returns [EObject current=null] : iv_ruleMeronymicRelation= ruleMeronymicRelation EOF ;
    public final EObject entryRuleMeronymicRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeronymicRelation = null;


        try {
            // InternalDsl.g:901:58: (iv_ruleMeronymicRelation= ruleMeronymicRelation EOF )
            // InternalDsl.g:902:2: iv_ruleMeronymicRelation= ruleMeronymicRelation EOF
            {
             newCompositeNode(grammarAccess.getMeronymicRelationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMeronymicRelation=ruleMeronymicRelation();

            state._fsp--;

             current =iv_ruleMeronymicRelation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMeronymicRelation"


    // $ANTLR start "ruleMeronymicRelation"
    // InternalDsl.g:908:1: ruleMeronymicRelation returns [EObject current=null] : (this_ComponentOfRelation_0= ruleComponentOfRelation | this_MembershipRelation_1= ruleMembershipRelation | this_SubCollectionRelation_2= ruleSubCollectionRelation | this_SubQuantityRelation_3= ruleSubQuantityRelation ) ;
    public final EObject ruleMeronymicRelation() throws RecognitionException {
        EObject current = null;

        EObject this_ComponentOfRelation_0 = null;

        EObject this_MembershipRelation_1 = null;

        EObject this_SubCollectionRelation_2 = null;

        EObject this_SubQuantityRelation_3 = null;



        	enterRule();

        try {
            // InternalDsl.g:914:2: ( (this_ComponentOfRelation_0= ruleComponentOfRelation | this_MembershipRelation_1= ruleMembershipRelation | this_SubCollectionRelation_2= ruleSubCollectionRelation | this_SubQuantityRelation_3= ruleSubQuantityRelation ) )
            // InternalDsl.g:915:2: (this_ComponentOfRelation_0= ruleComponentOfRelation | this_MembershipRelation_1= ruleMembershipRelation | this_SubCollectionRelation_2= ruleSubCollectionRelation | this_SubQuantityRelation_3= ruleSubQuantityRelation )
            {
            // InternalDsl.g:915:2: (this_ComponentOfRelation_0= ruleComponentOfRelation | this_MembershipRelation_1= ruleMembershipRelation | this_SubCollectionRelation_2= ruleSubCollectionRelation | this_SubQuantityRelation_3= ruleSubQuantityRelation )
            int alt13=4;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // InternalDsl.g:916:3: this_ComponentOfRelation_0= ruleComponentOfRelation
                    {

                    			newCompositeNode(grammarAccess.getMeronymicRelationAccess().getComponentOfRelationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComponentOfRelation_0=ruleComponentOfRelation();

                    state._fsp--;


                    			current = this_ComponentOfRelation_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:925:3: this_MembershipRelation_1= ruleMembershipRelation
                    {

                    			newCompositeNode(grammarAccess.getMeronymicRelationAccess().getMembershipRelationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MembershipRelation_1=ruleMembershipRelation();

                    state._fsp--;


                    			current = this_MembershipRelation_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDsl.g:934:3: this_SubCollectionRelation_2= ruleSubCollectionRelation
                    {

                    			newCompositeNode(grammarAccess.getMeronymicRelationAccess().getSubCollectionRelationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_SubCollectionRelation_2=ruleSubCollectionRelation();

                    state._fsp--;


                    			current = this_SubCollectionRelation_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalDsl.g:943:3: this_SubQuantityRelation_3= ruleSubQuantityRelation
                    {

                    			newCompositeNode(grammarAccess.getMeronymicRelationAccess().getSubQuantityRelationParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_SubQuantityRelation_3=ruleSubQuantityRelation();

                    state._fsp--;


                    			current = this_SubQuantityRelation_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMeronymicRelation"


    // $ANTLR start "entryRuleComponentOfRelation"
    // InternalDsl.g:955:1: entryRuleComponentOfRelation returns [EObject current=null] : iv_ruleComponentOfRelation= ruleComponentOfRelation EOF ;
    public final EObject entryRuleComponentOfRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentOfRelation = null;


        try {
            // InternalDsl.g:955:60: (iv_ruleComponentOfRelation= ruleComponentOfRelation EOF )
            // InternalDsl.g:956:2: iv_ruleComponentOfRelation= ruleComponentOfRelation EOF
            {
             newCompositeNode(grammarAccess.getComponentOfRelationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentOfRelation=ruleComponentOfRelation();

            state._fsp--;

             current =iv_ruleComponentOfRelation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponentOfRelation"


    // $ANTLR start "ruleComponentOfRelation"
    // InternalDsl.g:962:1: ruleComponentOfRelation returns [EObject current=null] : ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?) ) ) otherlv_5= 'relation' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '[' ( (lv_sourceLowerBound_8_0= ruleCardinalityBound ) ) otherlv_9= '..' ( (lv_sourceUpperBound_10_0= ruleCardinalityUpperBound ) ) otherlv_11= ']' )? otherlv_12= 'isComponentOf' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetLowerBound_15_0= ruleCardinalityBound ) ) otherlv_16= '..' ( (lv_targetUpperBound_17_0= ruleCardinalityUpperBound ) ) otherlv_18= ']' )? otherlv_19= ';' ) ;
    public final EObject ruleComponentOfRelation() throws RecognitionException {
        EObject current = null;

        Token lv_partIsEssential_1_0=null;
        Token lv_partIsInseparable_2_0=null;
        Token lv_partIsShareable_3_0=null;
        Token lv_partIsImmutable_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_sourceLowerBound_8_0 = null;

        AntlrDatatypeRuleToken lv_sourceUpperBound_10_0 = null;

        AntlrDatatypeRuleToken lv_targetLowerBound_15_0 = null;

        AntlrDatatypeRuleToken lv_targetUpperBound_17_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:968:2: ( ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?) ) ) otherlv_5= 'relation' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '[' ( (lv_sourceLowerBound_8_0= ruleCardinalityBound ) ) otherlv_9= '..' ( (lv_sourceUpperBound_10_0= ruleCardinalityUpperBound ) ) otherlv_11= ']' )? otherlv_12= 'isComponentOf' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetLowerBound_15_0= ruleCardinalityBound ) ) otherlv_16= '..' ( (lv_targetUpperBound_17_0= ruleCardinalityUpperBound ) ) otherlv_18= ']' )? otherlv_19= ';' ) )
            // InternalDsl.g:969:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?) ) ) otherlv_5= 'relation' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '[' ( (lv_sourceLowerBound_8_0= ruleCardinalityBound ) ) otherlv_9= '..' ( (lv_sourceUpperBound_10_0= ruleCardinalityUpperBound ) ) otherlv_11= ']' )? otherlv_12= 'isComponentOf' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetLowerBound_15_0= ruleCardinalityBound ) ) otherlv_16= '..' ( (lv_targetUpperBound_17_0= ruleCardinalityUpperBound ) ) otherlv_18= ']' )? otherlv_19= ';' )
            {
            // InternalDsl.g:969:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?) ) ) otherlv_5= 'relation' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '[' ( (lv_sourceLowerBound_8_0= ruleCardinalityBound ) ) otherlv_9= '..' ( (lv_sourceUpperBound_10_0= ruleCardinalityUpperBound ) ) otherlv_11= ']' )? otherlv_12= 'isComponentOf' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetLowerBound_15_0= ruleCardinalityBound ) ) otherlv_16= '..' ( (lv_targetUpperBound_17_0= ruleCardinalityUpperBound ) ) otherlv_18= ']' )? otherlv_19= ';' )
            // InternalDsl.g:970:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?) ) ) otherlv_5= 'relation' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '[' ( (lv_sourceLowerBound_8_0= ruleCardinalityBound ) ) otherlv_9= '..' ( (lv_sourceUpperBound_10_0= ruleCardinalityUpperBound ) ) otherlv_11= ']' )? otherlv_12= 'isComponentOf' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetLowerBound_15_0= ruleCardinalityBound ) ) otherlv_16= '..' ( (lv_targetUpperBound_17_0= ruleCardinalityUpperBound ) ) otherlv_18= ']' )? otherlv_19= ';'
            {
            // InternalDsl.g:970:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?) ) )
            // InternalDsl.g:971:4: ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?) )
            {
            // InternalDsl.g:971:4: ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?) )
            // InternalDsl.g:972:5: ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getComponentOfRelationAccess().getUnorderedGroup_0());
            				
            // InternalDsl.g:975:5: ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?)
            // InternalDsl.g:976:6: ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?
            {
            // InternalDsl.g:976:6: ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=5;
                int LA14_0 = input.LA(1);

                if ( LA14_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentOfRelationAccess().getUnorderedGroup_0(), 0) ) {
                    alt14=1;
                }
                else if ( LA14_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentOfRelationAccess().getUnorderedGroup_0(), 1) ) {
                    alt14=2;
                }
                else if ( LA14_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentOfRelationAccess().getUnorderedGroup_0(), 2) ) {
                    alt14=3;
                }
                else if ( LA14_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentOfRelationAccess().getUnorderedGroup_0(), 3) ) {
                    alt14=4;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDsl.g:977:4: ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) )
            	    {
            	    // InternalDsl.g:977:4: ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) )
            	    // InternalDsl.g:978:5: {...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentOfRelationAccess().getUnorderedGroup_0(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleComponentOfRelation", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentOfRelationAccess().getUnorderedGroup_0(), 0)");
            	    }
            	    // InternalDsl.g:978:116: ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) )
            	    // InternalDsl.g:979:6: ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentOfRelationAccess().getUnorderedGroup_0(), 0);
            	    					
            	    // InternalDsl.g:982:9: ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) )
            	    // InternalDsl.g:982:10: {...}? => ( (lv_partIsEssential_1_0= 'essential' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentOfRelation", "true");
            	    }
            	    // InternalDsl.g:982:19: ( (lv_partIsEssential_1_0= 'essential' ) )
            	    // InternalDsl.g:982:20: (lv_partIsEssential_1_0= 'essential' )
            	    {
            	    // InternalDsl.g:982:20: (lv_partIsEssential_1_0= 'essential' )
            	    // InternalDsl.g:983:10: lv_partIsEssential_1_0= 'essential'
            	    {
            	    lv_partIsEssential_1_0=(Token)match(input,27,FOLLOW_20); 

            	    										newLeafNode(lv_partIsEssential_1_0, grammarAccess.getComponentOfRelationAccess().getPartIsEssentialEssentialKeyword_0_0_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getComponentOfRelationRule());
            	    										}
            	    										setWithLastConsumed(current, "partIsEssential", true, "essential");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentOfRelationAccess().getUnorderedGroup_0());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDsl.g:1000:4: ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) )
            	    {
            	    // InternalDsl.g:1000:4: ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) )
            	    // InternalDsl.g:1001:5: {...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentOfRelationAccess().getUnorderedGroup_0(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleComponentOfRelation", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentOfRelationAccess().getUnorderedGroup_0(), 1)");
            	    }
            	    // InternalDsl.g:1001:116: ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) )
            	    // InternalDsl.g:1002:6: ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentOfRelationAccess().getUnorderedGroup_0(), 1);
            	    					
            	    // InternalDsl.g:1005:9: ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) )
            	    // InternalDsl.g:1005:10: {...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentOfRelation", "true");
            	    }
            	    // InternalDsl.g:1005:19: ( (lv_partIsInseparable_2_0= 'inseparable' ) )
            	    // InternalDsl.g:1005:20: (lv_partIsInseparable_2_0= 'inseparable' )
            	    {
            	    // InternalDsl.g:1005:20: (lv_partIsInseparable_2_0= 'inseparable' )
            	    // InternalDsl.g:1006:10: lv_partIsInseparable_2_0= 'inseparable'
            	    {
            	    lv_partIsInseparable_2_0=(Token)match(input,28,FOLLOW_20); 

            	    										newLeafNode(lv_partIsInseparable_2_0, grammarAccess.getComponentOfRelationAccess().getPartIsInseparableInseparableKeyword_0_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getComponentOfRelationRule());
            	    										}
            	    										setWithLastConsumed(current, "partIsInseparable", true, "inseparable");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentOfRelationAccess().getUnorderedGroup_0());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalDsl.g:1023:4: ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) )
            	    {
            	    // InternalDsl.g:1023:4: ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) )
            	    // InternalDsl.g:1024:5: {...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentOfRelationAccess().getUnorderedGroup_0(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleComponentOfRelation", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentOfRelationAccess().getUnorderedGroup_0(), 2)");
            	    }
            	    // InternalDsl.g:1024:116: ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) )
            	    // InternalDsl.g:1025:6: ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentOfRelationAccess().getUnorderedGroup_0(), 2);
            	    					
            	    // InternalDsl.g:1028:9: ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) )
            	    // InternalDsl.g:1028:10: {...}? => ( (lv_partIsShareable_3_0= 'shareable' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentOfRelation", "true");
            	    }
            	    // InternalDsl.g:1028:19: ( (lv_partIsShareable_3_0= 'shareable' ) )
            	    // InternalDsl.g:1028:20: (lv_partIsShareable_3_0= 'shareable' )
            	    {
            	    // InternalDsl.g:1028:20: (lv_partIsShareable_3_0= 'shareable' )
            	    // InternalDsl.g:1029:10: lv_partIsShareable_3_0= 'shareable'
            	    {
            	    lv_partIsShareable_3_0=(Token)match(input,29,FOLLOW_20); 

            	    										newLeafNode(lv_partIsShareable_3_0, grammarAccess.getComponentOfRelationAccess().getPartIsShareableShareableKeyword_0_2_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getComponentOfRelationRule());
            	    										}
            	    										setWithLastConsumed(current, "partIsShareable", true, "shareable");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentOfRelationAccess().getUnorderedGroup_0());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalDsl.g:1046:4: ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) )
            	    {
            	    // InternalDsl.g:1046:4: ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) )
            	    // InternalDsl.g:1047:5: {...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentOfRelationAccess().getUnorderedGroup_0(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleComponentOfRelation", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentOfRelationAccess().getUnorderedGroup_0(), 3)");
            	    }
            	    // InternalDsl.g:1047:116: ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) )
            	    // InternalDsl.g:1048:6: ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentOfRelationAccess().getUnorderedGroup_0(), 3);
            	    					
            	    // InternalDsl.g:1051:9: ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) )
            	    // InternalDsl.g:1051:10: {...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentOfRelation", "true");
            	    }
            	    // InternalDsl.g:1051:19: ( (lv_partIsImmutable_4_0= 'immutable' ) )
            	    // InternalDsl.g:1051:20: (lv_partIsImmutable_4_0= 'immutable' )
            	    {
            	    // InternalDsl.g:1051:20: (lv_partIsImmutable_4_0= 'immutable' )
            	    // InternalDsl.g:1052:10: lv_partIsImmutable_4_0= 'immutable'
            	    {
            	    lv_partIsImmutable_4_0=(Token)match(input,30,FOLLOW_20); 

            	    										newLeafNode(lv_partIsImmutable_4_0, grammarAccess.getComponentOfRelationAccess().getPartIsImmutableImmutableKeyword_0_3_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getComponentOfRelationRule());
            	    										}
            	    										setWithLastConsumed(current, "partIsImmutable", true, "immutable");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentOfRelationAccess().getUnorderedGroup_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getComponentOfRelationAccess().getUnorderedGroup_0()) ) {
                throw new FailedPredicateException(input, "ruleComponentOfRelation", "getUnorderedGroupHelper().canLeave(grammarAccess.getComponentOfRelationAccess().getUnorderedGroup_0())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getComponentOfRelationAccess().getUnorderedGroup_0());
            				

            }

            otherlv_5=(Token)match(input,31,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getComponentOfRelationAccess().getRelationKeyword_1());
            		
            // InternalDsl.g:1081:3: ( (otherlv_6= RULE_ID ) )
            // InternalDsl.g:1082:4: (otherlv_6= RULE_ID )
            {
            // InternalDsl.g:1082:4: (otherlv_6= RULE_ID )
            // InternalDsl.g:1083:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentOfRelationRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(otherlv_6, grammarAccess.getComponentOfRelationAccess().getPartSubstantialUniversalCrossReference_2_0());
            				

            }


            }

            // InternalDsl.g:1094:3: (otherlv_7= '[' ( (lv_sourceLowerBound_8_0= ruleCardinalityBound ) ) otherlv_9= '..' ( (lv_sourceUpperBound_10_0= ruleCardinalityUpperBound ) ) otherlv_11= ']' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==32) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDsl.g:1095:4: otherlv_7= '[' ( (lv_sourceLowerBound_8_0= ruleCardinalityBound ) ) otherlv_9= '..' ( (lv_sourceUpperBound_10_0= ruleCardinalityUpperBound ) ) otherlv_11= ']'
                    {
                    otherlv_7=(Token)match(input,32,FOLLOW_22); 

                    				newLeafNode(otherlv_7, grammarAccess.getComponentOfRelationAccess().getLeftSquareBracketKeyword_3_0());
                    			
                    // InternalDsl.g:1099:4: ( (lv_sourceLowerBound_8_0= ruleCardinalityBound ) )
                    // InternalDsl.g:1100:5: (lv_sourceLowerBound_8_0= ruleCardinalityBound )
                    {
                    // InternalDsl.g:1100:5: (lv_sourceLowerBound_8_0= ruleCardinalityBound )
                    // InternalDsl.g:1101:6: lv_sourceLowerBound_8_0= ruleCardinalityBound
                    {

                    						newCompositeNode(grammarAccess.getComponentOfRelationAccess().getSourceLowerBoundCardinalityBoundParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_sourceLowerBound_8_0=ruleCardinalityBound();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentOfRelationRule());
                    						}
                    						set(
                    							current,
                    							"sourceLowerBound",
                    							lv_sourceLowerBound_8_0,
                    							"br.ufes.inf.ontouml.ontoumlprime.Dsl.CardinalityBound");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,33,FOLLOW_24); 

                    				newLeafNode(otherlv_9, grammarAccess.getComponentOfRelationAccess().getFullStopFullStopKeyword_3_2());
                    			
                    // InternalDsl.g:1122:4: ( (lv_sourceUpperBound_10_0= ruleCardinalityUpperBound ) )
                    // InternalDsl.g:1123:5: (lv_sourceUpperBound_10_0= ruleCardinalityUpperBound )
                    {
                    // InternalDsl.g:1123:5: (lv_sourceUpperBound_10_0= ruleCardinalityUpperBound )
                    // InternalDsl.g:1124:6: lv_sourceUpperBound_10_0= ruleCardinalityUpperBound
                    {

                    						newCompositeNode(grammarAccess.getComponentOfRelationAccess().getSourceUpperBoundCardinalityUpperBoundParserRuleCall_3_3_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_sourceUpperBound_10_0=ruleCardinalityUpperBound();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentOfRelationRule());
                    						}
                    						set(
                    							current,
                    							"sourceUpperBound",
                    							lv_sourceUpperBound_10_0,
                    							"br.ufes.inf.ontouml.ontoumlprime.Dsl.CardinalityUpperBound");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,34,FOLLOW_26); 

                    				newLeafNode(otherlv_11, grammarAccess.getComponentOfRelationAccess().getRightSquareBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,35,FOLLOW_4); 

            			newLeafNode(otherlv_12, grammarAccess.getComponentOfRelationAccess().getIsComponentOfKeyword_4());
            		
            // InternalDsl.g:1150:3: ( (otherlv_13= RULE_ID ) )
            // InternalDsl.g:1151:4: (otherlv_13= RULE_ID )
            {
            // InternalDsl.g:1151:4: (otherlv_13= RULE_ID )
            // InternalDsl.g:1152:5: otherlv_13= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentOfRelationRule());
            					}
            				
            otherlv_13=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(otherlv_13, grammarAccess.getComponentOfRelationAccess().getWholeSubstantialUniversalCrossReference_5_0());
            				

            }


            }

            // InternalDsl.g:1163:3: (otherlv_14= '[' ( (lv_targetLowerBound_15_0= ruleCardinalityBound ) ) otherlv_16= '..' ( (lv_targetUpperBound_17_0= ruleCardinalityUpperBound ) ) otherlv_18= ']' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==32) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDsl.g:1164:4: otherlv_14= '[' ( (lv_targetLowerBound_15_0= ruleCardinalityBound ) ) otherlv_16= '..' ( (lv_targetUpperBound_17_0= ruleCardinalityUpperBound ) ) otherlv_18= ']'
                    {
                    otherlv_14=(Token)match(input,32,FOLLOW_22); 

                    				newLeafNode(otherlv_14, grammarAccess.getComponentOfRelationAccess().getLeftSquareBracketKeyword_6_0());
                    			
                    // InternalDsl.g:1168:4: ( (lv_targetLowerBound_15_0= ruleCardinalityBound ) )
                    // InternalDsl.g:1169:5: (lv_targetLowerBound_15_0= ruleCardinalityBound )
                    {
                    // InternalDsl.g:1169:5: (lv_targetLowerBound_15_0= ruleCardinalityBound )
                    // InternalDsl.g:1170:6: lv_targetLowerBound_15_0= ruleCardinalityBound
                    {

                    						newCompositeNode(grammarAccess.getComponentOfRelationAccess().getTargetLowerBoundCardinalityBoundParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_targetLowerBound_15_0=ruleCardinalityBound();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentOfRelationRule());
                    						}
                    						set(
                    							current,
                    							"targetLowerBound",
                    							lv_targetLowerBound_15_0,
                    							"br.ufes.inf.ontouml.ontoumlprime.Dsl.CardinalityBound");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_16=(Token)match(input,33,FOLLOW_24); 

                    				newLeafNode(otherlv_16, grammarAccess.getComponentOfRelationAccess().getFullStopFullStopKeyword_6_2());
                    			
                    // InternalDsl.g:1191:4: ( (lv_targetUpperBound_17_0= ruleCardinalityUpperBound ) )
                    // InternalDsl.g:1192:5: (lv_targetUpperBound_17_0= ruleCardinalityUpperBound )
                    {
                    // InternalDsl.g:1192:5: (lv_targetUpperBound_17_0= ruleCardinalityUpperBound )
                    // InternalDsl.g:1193:6: lv_targetUpperBound_17_0= ruleCardinalityUpperBound
                    {

                    						newCompositeNode(grammarAccess.getComponentOfRelationAccess().getTargetUpperBoundCardinalityUpperBoundParserRuleCall_6_3_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_targetUpperBound_17_0=ruleCardinalityUpperBound();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentOfRelationRule());
                    						}
                    						set(
                    							current,
                    							"targetUpperBound",
                    							lv_targetUpperBound_17_0,
                    							"br.ufes.inf.ontouml.ontoumlprime.Dsl.CardinalityUpperBound");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_18=(Token)match(input,34,FOLLOW_13); 

                    				newLeafNode(otherlv_18, grammarAccess.getComponentOfRelationAccess().getRightSquareBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_19=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getComponentOfRelationAccess().getSemicolonKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponentOfRelation"


    // $ANTLR start "entryRuleMembershipRelation"
    // InternalDsl.g:1223:1: entryRuleMembershipRelation returns [EObject current=null] : iv_ruleMembershipRelation= ruleMembershipRelation EOF ;
    public final EObject entryRuleMembershipRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMembershipRelation = null;


        try {
            // InternalDsl.g:1223:59: (iv_ruleMembershipRelation= ruleMembershipRelation EOF )
            // InternalDsl.g:1224:2: iv_ruleMembershipRelation= ruleMembershipRelation EOF
            {
             newCompositeNode(grammarAccess.getMembershipRelationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMembershipRelation=ruleMembershipRelation();

            state._fsp--;

             current =iv_ruleMembershipRelation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMembershipRelation"


    // $ANTLR start "ruleMembershipRelation"
    // InternalDsl.g:1230:1: ruleMembershipRelation returns [EObject current=null] : ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?) ) ) otherlv_5= 'relation' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '[' ( (lv_sourceLowerBound_8_0= ruleCardinalityBound ) ) otherlv_9= '..' ( (lv_sourceUpperBound_10_0= ruleCardinalityUpperBound ) ) otherlv_11= ']' )? otherlv_12= 'isMemberOf' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetLowerBound_15_0= ruleCardinalityBound ) ) otherlv_16= '..' ( (lv_targetUpperBound_17_0= ruleCardinalityUpperBound ) ) otherlv_18= ']' )? otherlv_19= ';' ) ;
    public final EObject ruleMembershipRelation() throws RecognitionException {
        EObject current = null;

        Token lv_partIsEssential_1_0=null;
        Token lv_partIsInseparable_2_0=null;
        Token lv_partIsShareable_3_0=null;
        Token lv_partIsImmutable_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_sourceLowerBound_8_0 = null;

        AntlrDatatypeRuleToken lv_sourceUpperBound_10_0 = null;

        AntlrDatatypeRuleToken lv_targetLowerBound_15_0 = null;

        AntlrDatatypeRuleToken lv_targetUpperBound_17_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1236:2: ( ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?) ) ) otherlv_5= 'relation' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '[' ( (lv_sourceLowerBound_8_0= ruleCardinalityBound ) ) otherlv_9= '..' ( (lv_sourceUpperBound_10_0= ruleCardinalityUpperBound ) ) otherlv_11= ']' )? otherlv_12= 'isMemberOf' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetLowerBound_15_0= ruleCardinalityBound ) ) otherlv_16= '..' ( (lv_targetUpperBound_17_0= ruleCardinalityUpperBound ) ) otherlv_18= ']' )? otherlv_19= ';' ) )
            // InternalDsl.g:1237:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?) ) ) otherlv_5= 'relation' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '[' ( (lv_sourceLowerBound_8_0= ruleCardinalityBound ) ) otherlv_9= '..' ( (lv_sourceUpperBound_10_0= ruleCardinalityUpperBound ) ) otherlv_11= ']' )? otherlv_12= 'isMemberOf' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetLowerBound_15_0= ruleCardinalityBound ) ) otherlv_16= '..' ( (lv_targetUpperBound_17_0= ruleCardinalityUpperBound ) ) otherlv_18= ']' )? otherlv_19= ';' )
            {
            // InternalDsl.g:1237:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?) ) ) otherlv_5= 'relation' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '[' ( (lv_sourceLowerBound_8_0= ruleCardinalityBound ) ) otherlv_9= '..' ( (lv_sourceUpperBound_10_0= ruleCardinalityUpperBound ) ) otherlv_11= ']' )? otherlv_12= 'isMemberOf' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetLowerBound_15_0= ruleCardinalityBound ) ) otherlv_16= '..' ( (lv_targetUpperBound_17_0= ruleCardinalityUpperBound ) ) otherlv_18= ']' )? otherlv_19= ';' )
            // InternalDsl.g:1238:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?) ) ) otherlv_5= 'relation' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '[' ( (lv_sourceLowerBound_8_0= ruleCardinalityBound ) ) otherlv_9= '..' ( (lv_sourceUpperBound_10_0= ruleCardinalityUpperBound ) ) otherlv_11= ']' )? otherlv_12= 'isMemberOf' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetLowerBound_15_0= ruleCardinalityBound ) ) otherlv_16= '..' ( (lv_targetUpperBound_17_0= ruleCardinalityUpperBound ) ) otherlv_18= ']' )? otherlv_19= ';'
            {
            // InternalDsl.g:1238:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?) ) )
            // InternalDsl.g:1239:4: ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?) )
            {
            // InternalDsl.g:1239:4: ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?) )
            // InternalDsl.g:1240:5: ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getMembershipRelationAccess().getUnorderedGroup_0());
            				
            // InternalDsl.g:1243:5: ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?)
            // InternalDsl.g:1244:6: ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?
            {
            // InternalDsl.g:1244:6: ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=5;
                int LA17_0 = input.LA(1);

                if ( LA17_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getMembershipRelationAccess().getUnorderedGroup_0(), 0) ) {
                    alt17=1;
                }
                else if ( LA17_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getMembershipRelationAccess().getUnorderedGroup_0(), 1) ) {
                    alt17=2;
                }
                else if ( LA17_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getMembershipRelationAccess().getUnorderedGroup_0(), 2) ) {
                    alt17=3;
                }
                else if ( LA17_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getMembershipRelationAccess().getUnorderedGroup_0(), 3) ) {
                    alt17=4;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalDsl.g:1245:4: ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) )
            	    {
            	    // InternalDsl.g:1245:4: ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) )
            	    // InternalDsl.g:1246:5: {...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMembershipRelationAccess().getUnorderedGroup_0(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMembershipRelation", "getUnorderedGroupHelper().canSelect(grammarAccess.getMembershipRelationAccess().getUnorderedGroup_0(), 0)");
            	    }
            	    // InternalDsl.g:1246:115: ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) )
            	    // InternalDsl.g:1247:6: ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMembershipRelationAccess().getUnorderedGroup_0(), 0);
            	    					
            	    // InternalDsl.g:1250:9: ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) )
            	    // InternalDsl.g:1250:10: {...}? => ( (lv_partIsEssential_1_0= 'essential' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMembershipRelation", "true");
            	    }
            	    // InternalDsl.g:1250:19: ( (lv_partIsEssential_1_0= 'essential' ) )
            	    // InternalDsl.g:1250:20: (lv_partIsEssential_1_0= 'essential' )
            	    {
            	    // InternalDsl.g:1250:20: (lv_partIsEssential_1_0= 'essential' )
            	    // InternalDsl.g:1251:10: lv_partIsEssential_1_0= 'essential'
            	    {
            	    lv_partIsEssential_1_0=(Token)match(input,27,FOLLOW_20); 

            	    										newLeafNode(lv_partIsEssential_1_0, grammarAccess.getMembershipRelationAccess().getPartIsEssentialEssentialKeyword_0_0_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getMembershipRelationRule());
            	    										}
            	    										setWithLastConsumed(current, "partIsEssential", true, "essential");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMembershipRelationAccess().getUnorderedGroup_0());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDsl.g:1268:4: ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) )
            	    {
            	    // InternalDsl.g:1268:4: ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) )
            	    // InternalDsl.g:1269:5: {...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMembershipRelationAccess().getUnorderedGroup_0(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMembershipRelation", "getUnorderedGroupHelper().canSelect(grammarAccess.getMembershipRelationAccess().getUnorderedGroup_0(), 1)");
            	    }
            	    // InternalDsl.g:1269:115: ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) )
            	    // InternalDsl.g:1270:6: ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMembershipRelationAccess().getUnorderedGroup_0(), 1);
            	    					
            	    // InternalDsl.g:1273:9: ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) )
            	    // InternalDsl.g:1273:10: {...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMembershipRelation", "true");
            	    }
            	    // InternalDsl.g:1273:19: ( (lv_partIsInseparable_2_0= 'inseparable' ) )
            	    // InternalDsl.g:1273:20: (lv_partIsInseparable_2_0= 'inseparable' )
            	    {
            	    // InternalDsl.g:1273:20: (lv_partIsInseparable_2_0= 'inseparable' )
            	    // InternalDsl.g:1274:10: lv_partIsInseparable_2_0= 'inseparable'
            	    {
            	    lv_partIsInseparable_2_0=(Token)match(input,28,FOLLOW_20); 

            	    										newLeafNode(lv_partIsInseparable_2_0, grammarAccess.getMembershipRelationAccess().getPartIsInseparableInseparableKeyword_0_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getMembershipRelationRule());
            	    										}
            	    										setWithLastConsumed(current, "partIsInseparable", true, "inseparable");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMembershipRelationAccess().getUnorderedGroup_0());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalDsl.g:1291:4: ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) )
            	    {
            	    // InternalDsl.g:1291:4: ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) )
            	    // InternalDsl.g:1292:5: {...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMembershipRelationAccess().getUnorderedGroup_0(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMembershipRelation", "getUnorderedGroupHelper().canSelect(grammarAccess.getMembershipRelationAccess().getUnorderedGroup_0(), 2)");
            	    }
            	    // InternalDsl.g:1292:115: ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) )
            	    // InternalDsl.g:1293:6: ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMembershipRelationAccess().getUnorderedGroup_0(), 2);
            	    					
            	    // InternalDsl.g:1296:9: ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) )
            	    // InternalDsl.g:1296:10: {...}? => ( (lv_partIsShareable_3_0= 'shareable' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMembershipRelation", "true");
            	    }
            	    // InternalDsl.g:1296:19: ( (lv_partIsShareable_3_0= 'shareable' ) )
            	    // InternalDsl.g:1296:20: (lv_partIsShareable_3_0= 'shareable' )
            	    {
            	    // InternalDsl.g:1296:20: (lv_partIsShareable_3_0= 'shareable' )
            	    // InternalDsl.g:1297:10: lv_partIsShareable_3_0= 'shareable'
            	    {
            	    lv_partIsShareable_3_0=(Token)match(input,29,FOLLOW_20); 

            	    										newLeafNode(lv_partIsShareable_3_0, grammarAccess.getMembershipRelationAccess().getPartIsShareableShareableKeyword_0_2_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getMembershipRelationRule());
            	    										}
            	    										setWithLastConsumed(current, "partIsShareable", true, "shareable");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMembershipRelationAccess().getUnorderedGroup_0());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalDsl.g:1314:4: ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) )
            	    {
            	    // InternalDsl.g:1314:4: ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) )
            	    // InternalDsl.g:1315:5: {...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMembershipRelationAccess().getUnorderedGroup_0(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleMembershipRelation", "getUnorderedGroupHelper().canSelect(grammarAccess.getMembershipRelationAccess().getUnorderedGroup_0(), 3)");
            	    }
            	    // InternalDsl.g:1315:115: ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) )
            	    // InternalDsl.g:1316:6: ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMembershipRelationAccess().getUnorderedGroup_0(), 3);
            	    					
            	    // InternalDsl.g:1319:9: ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) )
            	    // InternalDsl.g:1319:10: {...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMembershipRelation", "true");
            	    }
            	    // InternalDsl.g:1319:19: ( (lv_partIsImmutable_4_0= 'immutable' ) )
            	    // InternalDsl.g:1319:20: (lv_partIsImmutable_4_0= 'immutable' )
            	    {
            	    // InternalDsl.g:1319:20: (lv_partIsImmutable_4_0= 'immutable' )
            	    // InternalDsl.g:1320:10: lv_partIsImmutable_4_0= 'immutable'
            	    {
            	    lv_partIsImmutable_4_0=(Token)match(input,30,FOLLOW_20); 

            	    										newLeafNode(lv_partIsImmutable_4_0, grammarAccess.getMembershipRelationAccess().getPartIsImmutableImmutableKeyword_0_3_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getMembershipRelationRule());
            	    										}
            	    										setWithLastConsumed(current, "partIsImmutable", true, "immutable");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMembershipRelationAccess().getUnorderedGroup_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getMembershipRelationAccess().getUnorderedGroup_0()) ) {
                throw new FailedPredicateException(input, "ruleMembershipRelation", "getUnorderedGroupHelper().canLeave(grammarAccess.getMembershipRelationAccess().getUnorderedGroup_0())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getMembershipRelationAccess().getUnorderedGroup_0());
            				

            }

            otherlv_5=(Token)match(input,31,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getMembershipRelationAccess().getRelationKeyword_1());
            		
            // InternalDsl.g:1349:3: ( (otherlv_6= RULE_ID ) )
            // InternalDsl.g:1350:4: (otherlv_6= RULE_ID )
            {
            // InternalDsl.g:1350:4: (otherlv_6= RULE_ID )
            // InternalDsl.g:1351:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMembershipRelationRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(otherlv_6, grammarAccess.getMembershipRelationAccess().getPartSubstantialUniversalCrossReference_2_0());
            				

            }


            }

            // InternalDsl.g:1362:3: (otherlv_7= '[' ( (lv_sourceLowerBound_8_0= ruleCardinalityBound ) ) otherlv_9= '..' ( (lv_sourceUpperBound_10_0= ruleCardinalityUpperBound ) ) otherlv_11= ']' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==32) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalDsl.g:1363:4: otherlv_7= '[' ( (lv_sourceLowerBound_8_0= ruleCardinalityBound ) ) otherlv_9= '..' ( (lv_sourceUpperBound_10_0= ruleCardinalityUpperBound ) ) otherlv_11= ']'
                    {
                    otherlv_7=(Token)match(input,32,FOLLOW_22); 

                    				newLeafNode(otherlv_7, grammarAccess.getMembershipRelationAccess().getLeftSquareBracketKeyword_3_0());
                    			
                    // InternalDsl.g:1367:4: ( (lv_sourceLowerBound_8_0= ruleCardinalityBound ) )
                    // InternalDsl.g:1368:5: (lv_sourceLowerBound_8_0= ruleCardinalityBound )
                    {
                    // InternalDsl.g:1368:5: (lv_sourceLowerBound_8_0= ruleCardinalityBound )
                    // InternalDsl.g:1369:6: lv_sourceLowerBound_8_0= ruleCardinalityBound
                    {

                    						newCompositeNode(grammarAccess.getMembershipRelationAccess().getSourceLowerBoundCardinalityBoundParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_sourceLowerBound_8_0=ruleCardinalityBound();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMembershipRelationRule());
                    						}
                    						set(
                    							current,
                    							"sourceLowerBound",
                    							lv_sourceLowerBound_8_0,
                    							"br.ufes.inf.ontouml.ontoumlprime.Dsl.CardinalityBound");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,33,FOLLOW_24); 

                    				newLeafNode(otherlv_9, grammarAccess.getMembershipRelationAccess().getFullStopFullStopKeyword_3_2());
                    			
                    // InternalDsl.g:1390:4: ( (lv_sourceUpperBound_10_0= ruleCardinalityUpperBound ) )
                    // InternalDsl.g:1391:5: (lv_sourceUpperBound_10_0= ruleCardinalityUpperBound )
                    {
                    // InternalDsl.g:1391:5: (lv_sourceUpperBound_10_0= ruleCardinalityUpperBound )
                    // InternalDsl.g:1392:6: lv_sourceUpperBound_10_0= ruleCardinalityUpperBound
                    {

                    						newCompositeNode(grammarAccess.getMembershipRelationAccess().getSourceUpperBoundCardinalityUpperBoundParserRuleCall_3_3_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_sourceUpperBound_10_0=ruleCardinalityUpperBound();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMembershipRelationRule());
                    						}
                    						set(
                    							current,
                    							"sourceUpperBound",
                    							lv_sourceUpperBound_10_0,
                    							"br.ufes.inf.ontouml.ontoumlprime.Dsl.CardinalityUpperBound");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,34,FOLLOW_29); 

                    				newLeafNode(otherlv_11, grammarAccess.getMembershipRelationAccess().getRightSquareBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,36,FOLLOW_4); 

            			newLeafNode(otherlv_12, grammarAccess.getMembershipRelationAccess().getIsMemberOfKeyword_4());
            		
            // InternalDsl.g:1418:3: ( (otherlv_13= RULE_ID ) )
            // InternalDsl.g:1419:4: (otherlv_13= RULE_ID )
            {
            // InternalDsl.g:1419:4: (otherlv_13= RULE_ID )
            // InternalDsl.g:1420:5: otherlv_13= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMembershipRelationRule());
            					}
            				
            otherlv_13=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(otherlv_13, grammarAccess.getMembershipRelationAccess().getWholeSubstantialUniversalCrossReference_5_0());
            				

            }


            }

            // InternalDsl.g:1431:3: (otherlv_14= '[' ( (lv_targetLowerBound_15_0= ruleCardinalityBound ) ) otherlv_16= '..' ( (lv_targetUpperBound_17_0= ruleCardinalityUpperBound ) ) otherlv_18= ']' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==32) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalDsl.g:1432:4: otherlv_14= '[' ( (lv_targetLowerBound_15_0= ruleCardinalityBound ) ) otherlv_16= '..' ( (lv_targetUpperBound_17_0= ruleCardinalityUpperBound ) ) otherlv_18= ']'
                    {
                    otherlv_14=(Token)match(input,32,FOLLOW_22); 

                    				newLeafNode(otherlv_14, grammarAccess.getMembershipRelationAccess().getLeftSquareBracketKeyword_6_0());
                    			
                    // InternalDsl.g:1436:4: ( (lv_targetLowerBound_15_0= ruleCardinalityBound ) )
                    // InternalDsl.g:1437:5: (lv_targetLowerBound_15_0= ruleCardinalityBound )
                    {
                    // InternalDsl.g:1437:5: (lv_targetLowerBound_15_0= ruleCardinalityBound )
                    // InternalDsl.g:1438:6: lv_targetLowerBound_15_0= ruleCardinalityBound
                    {

                    						newCompositeNode(grammarAccess.getMembershipRelationAccess().getTargetLowerBoundCardinalityBoundParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_targetLowerBound_15_0=ruleCardinalityBound();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMembershipRelationRule());
                    						}
                    						set(
                    							current,
                    							"targetLowerBound",
                    							lv_targetLowerBound_15_0,
                    							"br.ufes.inf.ontouml.ontoumlprime.Dsl.CardinalityBound");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_16=(Token)match(input,33,FOLLOW_24); 

                    				newLeafNode(otherlv_16, grammarAccess.getMembershipRelationAccess().getFullStopFullStopKeyword_6_2());
                    			
                    // InternalDsl.g:1459:4: ( (lv_targetUpperBound_17_0= ruleCardinalityUpperBound ) )
                    // InternalDsl.g:1460:5: (lv_targetUpperBound_17_0= ruleCardinalityUpperBound )
                    {
                    // InternalDsl.g:1460:5: (lv_targetUpperBound_17_0= ruleCardinalityUpperBound )
                    // InternalDsl.g:1461:6: lv_targetUpperBound_17_0= ruleCardinalityUpperBound
                    {

                    						newCompositeNode(grammarAccess.getMembershipRelationAccess().getTargetUpperBoundCardinalityUpperBoundParserRuleCall_6_3_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_targetUpperBound_17_0=ruleCardinalityUpperBound();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMembershipRelationRule());
                    						}
                    						set(
                    							current,
                    							"targetUpperBound",
                    							lv_targetUpperBound_17_0,
                    							"br.ufes.inf.ontouml.ontoumlprime.Dsl.CardinalityUpperBound");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_18=(Token)match(input,34,FOLLOW_13); 

                    				newLeafNode(otherlv_18, grammarAccess.getMembershipRelationAccess().getRightSquareBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_19=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getMembershipRelationAccess().getSemicolonKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMembershipRelation"


    // $ANTLR start "entryRuleSubCollectionRelation"
    // InternalDsl.g:1491:1: entryRuleSubCollectionRelation returns [EObject current=null] : iv_ruleSubCollectionRelation= ruleSubCollectionRelation EOF ;
    public final EObject entryRuleSubCollectionRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubCollectionRelation = null;


        try {
            // InternalDsl.g:1491:62: (iv_ruleSubCollectionRelation= ruleSubCollectionRelation EOF )
            // InternalDsl.g:1492:2: iv_ruleSubCollectionRelation= ruleSubCollectionRelation EOF
            {
             newCompositeNode(grammarAccess.getSubCollectionRelationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubCollectionRelation=ruleSubCollectionRelation();

            state._fsp--;

             current =iv_ruleSubCollectionRelation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubCollectionRelation"


    // $ANTLR start "ruleSubCollectionRelation"
    // InternalDsl.g:1498:1: ruleSubCollectionRelation returns [EObject current=null] : ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?) ) ) otherlv_5= 'relation' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '[' ( (lv_sourceLowerBound_8_0= ruleCardinalityBound ) ) otherlv_9= '..' ( (lv_sourceUpperBound_10_0= ruleCardinalityUpperBound ) ) otherlv_11= ']' )? otherlv_12= 'isSubCollectionOf' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetLowerBound_15_0= ruleCardinalityBound ) ) otherlv_16= '..' ( (lv_targetUpperBound_17_0= ruleCardinalityUpperBound ) ) otherlv_18= ']' )? otherlv_19= ';' ) ;
    public final EObject ruleSubCollectionRelation() throws RecognitionException {
        EObject current = null;

        Token lv_partIsEssential_1_0=null;
        Token lv_partIsInseparable_2_0=null;
        Token lv_partIsShareable_3_0=null;
        Token lv_partIsImmutable_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_sourceLowerBound_8_0 = null;

        AntlrDatatypeRuleToken lv_sourceUpperBound_10_0 = null;

        AntlrDatatypeRuleToken lv_targetLowerBound_15_0 = null;

        AntlrDatatypeRuleToken lv_targetUpperBound_17_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1504:2: ( ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?) ) ) otherlv_5= 'relation' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '[' ( (lv_sourceLowerBound_8_0= ruleCardinalityBound ) ) otherlv_9= '..' ( (lv_sourceUpperBound_10_0= ruleCardinalityUpperBound ) ) otherlv_11= ']' )? otherlv_12= 'isSubCollectionOf' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetLowerBound_15_0= ruleCardinalityBound ) ) otherlv_16= '..' ( (lv_targetUpperBound_17_0= ruleCardinalityUpperBound ) ) otherlv_18= ']' )? otherlv_19= ';' ) )
            // InternalDsl.g:1505:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?) ) ) otherlv_5= 'relation' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '[' ( (lv_sourceLowerBound_8_0= ruleCardinalityBound ) ) otherlv_9= '..' ( (lv_sourceUpperBound_10_0= ruleCardinalityUpperBound ) ) otherlv_11= ']' )? otherlv_12= 'isSubCollectionOf' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetLowerBound_15_0= ruleCardinalityBound ) ) otherlv_16= '..' ( (lv_targetUpperBound_17_0= ruleCardinalityUpperBound ) ) otherlv_18= ']' )? otherlv_19= ';' )
            {
            // InternalDsl.g:1505:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?) ) ) otherlv_5= 'relation' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '[' ( (lv_sourceLowerBound_8_0= ruleCardinalityBound ) ) otherlv_9= '..' ( (lv_sourceUpperBound_10_0= ruleCardinalityUpperBound ) ) otherlv_11= ']' )? otherlv_12= 'isSubCollectionOf' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetLowerBound_15_0= ruleCardinalityBound ) ) otherlv_16= '..' ( (lv_targetUpperBound_17_0= ruleCardinalityUpperBound ) ) otherlv_18= ']' )? otherlv_19= ';' )
            // InternalDsl.g:1506:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?) ) ) otherlv_5= 'relation' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '[' ( (lv_sourceLowerBound_8_0= ruleCardinalityBound ) ) otherlv_9= '..' ( (lv_sourceUpperBound_10_0= ruleCardinalityUpperBound ) ) otherlv_11= ']' )? otherlv_12= 'isSubCollectionOf' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetLowerBound_15_0= ruleCardinalityBound ) ) otherlv_16= '..' ( (lv_targetUpperBound_17_0= ruleCardinalityUpperBound ) ) otherlv_18= ']' )? otherlv_19= ';'
            {
            // InternalDsl.g:1506:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?) ) )
            // InternalDsl.g:1507:4: ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?) )
            {
            // InternalDsl.g:1507:4: ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?) )
            // InternalDsl.g:1508:5: ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getSubCollectionRelationAccess().getUnorderedGroup_0());
            				
            // InternalDsl.g:1511:5: ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?)
            // InternalDsl.g:1512:6: ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?
            {
            // InternalDsl.g:1512:6: ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=5;
                int LA20_0 = input.LA(1);

                if ( LA20_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getSubCollectionRelationAccess().getUnorderedGroup_0(), 0) ) {
                    alt20=1;
                }
                else if ( LA20_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getSubCollectionRelationAccess().getUnorderedGroup_0(), 1) ) {
                    alt20=2;
                }
                else if ( LA20_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getSubCollectionRelationAccess().getUnorderedGroup_0(), 2) ) {
                    alt20=3;
                }
                else if ( LA20_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getSubCollectionRelationAccess().getUnorderedGroup_0(), 3) ) {
                    alt20=4;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalDsl.g:1513:4: ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) )
            	    {
            	    // InternalDsl.g:1513:4: ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) )
            	    // InternalDsl.g:1514:5: {...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSubCollectionRelationAccess().getUnorderedGroup_0(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleSubCollectionRelation", "getUnorderedGroupHelper().canSelect(grammarAccess.getSubCollectionRelationAccess().getUnorderedGroup_0(), 0)");
            	    }
            	    // InternalDsl.g:1514:118: ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) )
            	    // InternalDsl.g:1515:6: ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSubCollectionRelationAccess().getUnorderedGroup_0(), 0);
            	    					
            	    // InternalDsl.g:1518:9: ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) )
            	    // InternalDsl.g:1518:10: {...}? => ( (lv_partIsEssential_1_0= 'essential' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSubCollectionRelation", "true");
            	    }
            	    // InternalDsl.g:1518:19: ( (lv_partIsEssential_1_0= 'essential' ) )
            	    // InternalDsl.g:1518:20: (lv_partIsEssential_1_0= 'essential' )
            	    {
            	    // InternalDsl.g:1518:20: (lv_partIsEssential_1_0= 'essential' )
            	    // InternalDsl.g:1519:10: lv_partIsEssential_1_0= 'essential'
            	    {
            	    lv_partIsEssential_1_0=(Token)match(input,27,FOLLOW_20); 

            	    										newLeafNode(lv_partIsEssential_1_0, grammarAccess.getSubCollectionRelationAccess().getPartIsEssentialEssentialKeyword_0_0_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getSubCollectionRelationRule());
            	    										}
            	    										setWithLastConsumed(current, "partIsEssential", true, "essential");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSubCollectionRelationAccess().getUnorderedGroup_0());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDsl.g:1536:4: ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) )
            	    {
            	    // InternalDsl.g:1536:4: ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) )
            	    // InternalDsl.g:1537:5: {...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSubCollectionRelationAccess().getUnorderedGroup_0(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleSubCollectionRelation", "getUnorderedGroupHelper().canSelect(grammarAccess.getSubCollectionRelationAccess().getUnorderedGroup_0(), 1)");
            	    }
            	    // InternalDsl.g:1537:118: ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) )
            	    // InternalDsl.g:1538:6: ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSubCollectionRelationAccess().getUnorderedGroup_0(), 1);
            	    					
            	    // InternalDsl.g:1541:9: ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) )
            	    // InternalDsl.g:1541:10: {...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSubCollectionRelation", "true");
            	    }
            	    // InternalDsl.g:1541:19: ( (lv_partIsInseparable_2_0= 'inseparable' ) )
            	    // InternalDsl.g:1541:20: (lv_partIsInseparable_2_0= 'inseparable' )
            	    {
            	    // InternalDsl.g:1541:20: (lv_partIsInseparable_2_0= 'inseparable' )
            	    // InternalDsl.g:1542:10: lv_partIsInseparable_2_0= 'inseparable'
            	    {
            	    lv_partIsInseparable_2_0=(Token)match(input,28,FOLLOW_20); 

            	    										newLeafNode(lv_partIsInseparable_2_0, grammarAccess.getSubCollectionRelationAccess().getPartIsInseparableInseparableKeyword_0_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getSubCollectionRelationRule());
            	    										}
            	    										setWithLastConsumed(current, "partIsInseparable", true, "inseparable");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSubCollectionRelationAccess().getUnorderedGroup_0());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalDsl.g:1559:4: ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) )
            	    {
            	    // InternalDsl.g:1559:4: ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) )
            	    // InternalDsl.g:1560:5: {...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSubCollectionRelationAccess().getUnorderedGroup_0(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleSubCollectionRelation", "getUnorderedGroupHelper().canSelect(grammarAccess.getSubCollectionRelationAccess().getUnorderedGroup_0(), 2)");
            	    }
            	    // InternalDsl.g:1560:118: ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) )
            	    // InternalDsl.g:1561:6: ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSubCollectionRelationAccess().getUnorderedGroup_0(), 2);
            	    					
            	    // InternalDsl.g:1564:9: ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) )
            	    // InternalDsl.g:1564:10: {...}? => ( (lv_partIsShareable_3_0= 'shareable' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSubCollectionRelation", "true");
            	    }
            	    // InternalDsl.g:1564:19: ( (lv_partIsShareable_3_0= 'shareable' ) )
            	    // InternalDsl.g:1564:20: (lv_partIsShareable_3_0= 'shareable' )
            	    {
            	    // InternalDsl.g:1564:20: (lv_partIsShareable_3_0= 'shareable' )
            	    // InternalDsl.g:1565:10: lv_partIsShareable_3_0= 'shareable'
            	    {
            	    lv_partIsShareable_3_0=(Token)match(input,29,FOLLOW_20); 

            	    										newLeafNode(lv_partIsShareable_3_0, grammarAccess.getSubCollectionRelationAccess().getPartIsShareableShareableKeyword_0_2_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getSubCollectionRelationRule());
            	    										}
            	    										setWithLastConsumed(current, "partIsShareable", true, "shareable");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSubCollectionRelationAccess().getUnorderedGroup_0());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalDsl.g:1582:4: ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) )
            	    {
            	    // InternalDsl.g:1582:4: ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) )
            	    // InternalDsl.g:1583:5: {...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSubCollectionRelationAccess().getUnorderedGroup_0(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleSubCollectionRelation", "getUnorderedGroupHelper().canSelect(grammarAccess.getSubCollectionRelationAccess().getUnorderedGroup_0(), 3)");
            	    }
            	    // InternalDsl.g:1583:118: ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) )
            	    // InternalDsl.g:1584:6: ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSubCollectionRelationAccess().getUnorderedGroup_0(), 3);
            	    					
            	    // InternalDsl.g:1587:9: ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) )
            	    // InternalDsl.g:1587:10: {...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSubCollectionRelation", "true");
            	    }
            	    // InternalDsl.g:1587:19: ( (lv_partIsImmutable_4_0= 'immutable' ) )
            	    // InternalDsl.g:1587:20: (lv_partIsImmutable_4_0= 'immutable' )
            	    {
            	    // InternalDsl.g:1587:20: (lv_partIsImmutable_4_0= 'immutable' )
            	    // InternalDsl.g:1588:10: lv_partIsImmutable_4_0= 'immutable'
            	    {
            	    lv_partIsImmutable_4_0=(Token)match(input,30,FOLLOW_20); 

            	    										newLeafNode(lv_partIsImmutable_4_0, grammarAccess.getSubCollectionRelationAccess().getPartIsImmutableImmutableKeyword_0_3_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getSubCollectionRelationRule());
            	    										}
            	    										setWithLastConsumed(current, "partIsImmutable", true, "immutable");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSubCollectionRelationAccess().getUnorderedGroup_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getSubCollectionRelationAccess().getUnorderedGroup_0()) ) {
                throw new FailedPredicateException(input, "ruleSubCollectionRelation", "getUnorderedGroupHelper().canLeave(grammarAccess.getSubCollectionRelationAccess().getUnorderedGroup_0())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getSubCollectionRelationAccess().getUnorderedGroup_0());
            				

            }

            otherlv_5=(Token)match(input,31,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getSubCollectionRelationAccess().getRelationKeyword_1());
            		
            // InternalDsl.g:1617:3: ( (otherlv_6= RULE_ID ) )
            // InternalDsl.g:1618:4: (otherlv_6= RULE_ID )
            {
            // InternalDsl.g:1618:4: (otherlv_6= RULE_ID )
            // InternalDsl.g:1619:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubCollectionRelationRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_30); 

            					newLeafNode(otherlv_6, grammarAccess.getSubCollectionRelationAccess().getPartSubstantialUniversalCrossReference_2_0());
            				

            }


            }

            // InternalDsl.g:1630:3: (otherlv_7= '[' ( (lv_sourceLowerBound_8_0= ruleCardinalityBound ) ) otherlv_9= '..' ( (lv_sourceUpperBound_10_0= ruleCardinalityUpperBound ) ) otherlv_11= ']' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==32) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalDsl.g:1631:4: otherlv_7= '[' ( (lv_sourceLowerBound_8_0= ruleCardinalityBound ) ) otherlv_9= '..' ( (lv_sourceUpperBound_10_0= ruleCardinalityUpperBound ) ) otherlv_11= ']'
                    {
                    otherlv_7=(Token)match(input,32,FOLLOW_22); 

                    				newLeafNode(otherlv_7, grammarAccess.getSubCollectionRelationAccess().getLeftSquareBracketKeyword_3_0());
                    			
                    // InternalDsl.g:1635:4: ( (lv_sourceLowerBound_8_0= ruleCardinalityBound ) )
                    // InternalDsl.g:1636:5: (lv_sourceLowerBound_8_0= ruleCardinalityBound )
                    {
                    // InternalDsl.g:1636:5: (lv_sourceLowerBound_8_0= ruleCardinalityBound )
                    // InternalDsl.g:1637:6: lv_sourceLowerBound_8_0= ruleCardinalityBound
                    {

                    						newCompositeNode(grammarAccess.getSubCollectionRelationAccess().getSourceLowerBoundCardinalityBoundParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_sourceLowerBound_8_0=ruleCardinalityBound();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubCollectionRelationRule());
                    						}
                    						set(
                    							current,
                    							"sourceLowerBound",
                    							lv_sourceLowerBound_8_0,
                    							"br.ufes.inf.ontouml.ontoumlprime.Dsl.CardinalityBound");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,33,FOLLOW_24); 

                    				newLeafNode(otherlv_9, grammarAccess.getSubCollectionRelationAccess().getFullStopFullStopKeyword_3_2());
                    			
                    // InternalDsl.g:1658:4: ( (lv_sourceUpperBound_10_0= ruleCardinalityUpperBound ) )
                    // InternalDsl.g:1659:5: (lv_sourceUpperBound_10_0= ruleCardinalityUpperBound )
                    {
                    // InternalDsl.g:1659:5: (lv_sourceUpperBound_10_0= ruleCardinalityUpperBound )
                    // InternalDsl.g:1660:6: lv_sourceUpperBound_10_0= ruleCardinalityUpperBound
                    {

                    						newCompositeNode(grammarAccess.getSubCollectionRelationAccess().getSourceUpperBoundCardinalityUpperBoundParserRuleCall_3_3_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_sourceUpperBound_10_0=ruleCardinalityUpperBound();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubCollectionRelationRule());
                    						}
                    						set(
                    							current,
                    							"sourceUpperBound",
                    							lv_sourceUpperBound_10_0,
                    							"br.ufes.inf.ontouml.ontoumlprime.Dsl.CardinalityUpperBound");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,34,FOLLOW_31); 

                    				newLeafNode(otherlv_11, grammarAccess.getSubCollectionRelationAccess().getRightSquareBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,37,FOLLOW_4); 

            			newLeafNode(otherlv_12, grammarAccess.getSubCollectionRelationAccess().getIsSubCollectionOfKeyword_4());
            		
            // InternalDsl.g:1686:3: ( (otherlv_13= RULE_ID ) )
            // InternalDsl.g:1687:4: (otherlv_13= RULE_ID )
            {
            // InternalDsl.g:1687:4: (otherlv_13= RULE_ID )
            // InternalDsl.g:1688:5: otherlv_13= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubCollectionRelationRule());
            					}
            				
            otherlv_13=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(otherlv_13, grammarAccess.getSubCollectionRelationAccess().getWholeSubstantialUniversalCrossReference_5_0());
            				

            }


            }

            // InternalDsl.g:1699:3: (otherlv_14= '[' ( (lv_targetLowerBound_15_0= ruleCardinalityBound ) ) otherlv_16= '..' ( (lv_targetUpperBound_17_0= ruleCardinalityUpperBound ) ) otherlv_18= ']' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==32) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalDsl.g:1700:4: otherlv_14= '[' ( (lv_targetLowerBound_15_0= ruleCardinalityBound ) ) otherlv_16= '..' ( (lv_targetUpperBound_17_0= ruleCardinalityUpperBound ) ) otherlv_18= ']'
                    {
                    otherlv_14=(Token)match(input,32,FOLLOW_22); 

                    				newLeafNode(otherlv_14, grammarAccess.getSubCollectionRelationAccess().getLeftSquareBracketKeyword_6_0());
                    			
                    // InternalDsl.g:1704:4: ( (lv_targetLowerBound_15_0= ruleCardinalityBound ) )
                    // InternalDsl.g:1705:5: (lv_targetLowerBound_15_0= ruleCardinalityBound )
                    {
                    // InternalDsl.g:1705:5: (lv_targetLowerBound_15_0= ruleCardinalityBound )
                    // InternalDsl.g:1706:6: lv_targetLowerBound_15_0= ruleCardinalityBound
                    {

                    						newCompositeNode(grammarAccess.getSubCollectionRelationAccess().getTargetLowerBoundCardinalityBoundParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_targetLowerBound_15_0=ruleCardinalityBound();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubCollectionRelationRule());
                    						}
                    						set(
                    							current,
                    							"targetLowerBound",
                    							lv_targetLowerBound_15_0,
                    							"br.ufes.inf.ontouml.ontoumlprime.Dsl.CardinalityBound");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_16=(Token)match(input,33,FOLLOW_24); 

                    				newLeafNode(otherlv_16, grammarAccess.getSubCollectionRelationAccess().getFullStopFullStopKeyword_6_2());
                    			
                    // InternalDsl.g:1727:4: ( (lv_targetUpperBound_17_0= ruleCardinalityUpperBound ) )
                    // InternalDsl.g:1728:5: (lv_targetUpperBound_17_0= ruleCardinalityUpperBound )
                    {
                    // InternalDsl.g:1728:5: (lv_targetUpperBound_17_0= ruleCardinalityUpperBound )
                    // InternalDsl.g:1729:6: lv_targetUpperBound_17_0= ruleCardinalityUpperBound
                    {

                    						newCompositeNode(grammarAccess.getSubCollectionRelationAccess().getTargetUpperBoundCardinalityUpperBoundParserRuleCall_6_3_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_targetUpperBound_17_0=ruleCardinalityUpperBound();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubCollectionRelationRule());
                    						}
                    						set(
                    							current,
                    							"targetUpperBound",
                    							lv_targetUpperBound_17_0,
                    							"br.ufes.inf.ontouml.ontoumlprime.Dsl.CardinalityUpperBound");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_18=(Token)match(input,34,FOLLOW_13); 

                    				newLeafNode(otherlv_18, grammarAccess.getSubCollectionRelationAccess().getRightSquareBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_19=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getSubCollectionRelationAccess().getSemicolonKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubCollectionRelation"


    // $ANTLR start "entryRuleSubQuantityRelation"
    // InternalDsl.g:1759:1: entryRuleSubQuantityRelation returns [EObject current=null] : iv_ruleSubQuantityRelation= ruleSubQuantityRelation EOF ;
    public final EObject entryRuleSubQuantityRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubQuantityRelation = null;


        try {
            // InternalDsl.g:1759:60: (iv_ruleSubQuantityRelation= ruleSubQuantityRelation EOF )
            // InternalDsl.g:1760:2: iv_ruleSubQuantityRelation= ruleSubQuantityRelation EOF
            {
             newCompositeNode(grammarAccess.getSubQuantityRelationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubQuantityRelation=ruleSubQuantityRelation();

            state._fsp--;

             current =iv_ruleSubQuantityRelation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubQuantityRelation"


    // $ANTLR start "ruleSubQuantityRelation"
    // InternalDsl.g:1766:1: ruleSubQuantityRelation returns [EObject current=null] : ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_3_0= 'immutable' ) ) ) ) ) )+ {...}?) ) ) otherlv_4= 'relation' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '[' ( (lv_sourceLowerBound_7_0= ruleCardinalityBound ) ) otherlv_8= '..' ( (lv_sourceUpperBound_9_0= ruleCardinalityUpperBound ) ) otherlv_10= ']' )? otherlv_11= 'isSubQuantityOf' ( (otherlv_12= RULE_ID ) ) (otherlv_13= '[' ( (lv_targetLowerBound_14_0= ruleCardinalityBound ) ) otherlv_15= '..' ( (lv_targetUpperBound_16_0= ruleCardinalityUpperBound ) ) otherlv_17= ']' )? otherlv_18= ';' ) ;
    public final EObject ruleSubQuantityRelation() throws RecognitionException {
        EObject current = null;

        Token lv_partIsEssential_1_0=null;
        Token lv_partIsInseparable_2_0=null;
        Token lv_partIsImmutable_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_sourceLowerBound_7_0 = null;

        AntlrDatatypeRuleToken lv_sourceUpperBound_9_0 = null;

        AntlrDatatypeRuleToken lv_targetLowerBound_14_0 = null;

        AntlrDatatypeRuleToken lv_targetUpperBound_16_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1772:2: ( ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_3_0= 'immutable' ) ) ) ) ) )+ {...}?) ) ) otherlv_4= 'relation' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '[' ( (lv_sourceLowerBound_7_0= ruleCardinalityBound ) ) otherlv_8= '..' ( (lv_sourceUpperBound_9_0= ruleCardinalityUpperBound ) ) otherlv_10= ']' )? otherlv_11= 'isSubQuantityOf' ( (otherlv_12= RULE_ID ) ) (otherlv_13= '[' ( (lv_targetLowerBound_14_0= ruleCardinalityBound ) ) otherlv_15= '..' ( (lv_targetUpperBound_16_0= ruleCardinalityUpperBound ) ) otherlv_17= ']' )? otherlv_18= ';' ) )
            // InternalDsl.g:1773:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_3_0= 'immutable' ) ) ) ) ) )+ {...}?) ) ) otherlv_4= 'relation' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '[' ( (lv_sourceLowerBound_7_0= ruleCardinalityBound ) ) otherlv_8= '..' ( (lv_sourceUpperBound_9_0= ruleCardinalityUpperBound ) ) otherlv_10= ']' )? otherlv_11= 'isSubQuantityOf' ( (otherlv_12= RULE_ID ) ) (otherlv_13= '[' ( (lv_targetLowerBound_14_0= ruleCardinalityBound ) ) otherlv_15= '..' ( (lv_targetUpperBound_16_0= ruleCardinalityUpperBound ) ) otherlv_17= ']' )? otherlv_18= ';' )
            {
            // InternalDsl.g:1773:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_3_0= 'immutable' ) ) ) ) ) )+ {...}?) ) ) otherlv_4= 'relation' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '[' ( (lv_sourceLowerBound_7_0= ruleCardinalityBound ) ) otherlv_8= '..' ( (lv_sourceUpperBound_9_0= ruleCardinalityUpperBound ) ) otherlv_10= ']' )? otherlv_11= 'isSubQuantityOf' ( (otherlv_12= RULE_ID ) ) (otherlv_13= '[' ( (lv_targetLowerBound_14_0= ruleCardinalityBound ) ) otherlv_15= '..' ( (lv_targetUpperBound_16_0= ruleCardinalityUpperBound ) ) otherlv_17= ']' )? otherlv_18= ';' )
            // InternalDsl.g:1774:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_3_0= 'immutable' ) ) ) ) ) )+ {...}?) ) ) otherlv_4= 'relation' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '[' ( (lv_sourceLowerBound_7_0= ruleCardinalityBound ) ) otherlv_8= '..' ( (lv_sourceUpperBound_9_0= ruleCardinalityUpperBound ) ) otherlv_10= ']' )? otherlv_11= 'isSubQuantityOf' ( (otherlv_12= RULE_ID ) ) (otherlv_13= '[' ( (lv_targetLowerBound_14_0= ruleCardinalityBound ) ) otherlv_15= '..' ( (lv_targetUpperBound_16_0= ruleCardinalityUpperBound ) ) otherlv_17= ']' )? otherlv_18= ';'
            {
            // InternalDsl.g:1774:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_3_0= 'immutable' ) ) ) ) ) )+ {...}?) ) )
            // InternalDsl.g:1775:4: ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_3_0= 'immutable' ) ) ) ) ) )+ {...}?) )
            {
            // InternalDsl.g:1775:4: ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_3_0= 'immutable' ) ) ) ) ) )+ {...}?) )
            // InternalDsl.g:1776:5: ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_3_0= 'immutable' ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getSubQuantityRelationAccess().getUnorderedGroup_0());
            				
            // InternalDsl.g:1779:5: ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_3_0= 'immutable' ) ) ) ) ) )+ {...}?)
            // InternalDsl.g:1780:6: ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_3_0= 'immutable' ) ) ) ) ) )+ {...}?
            {
            // InternalDsl.g:1780:6: ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_3_0= 'immutable' ) ) ) ) ) )+
            int cnt23=0;
            loop23:
            do {
                int alt23=4;
                int LA23_0 = input.LA(1);

                if ( LA23_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getSubQuantityRelationAccess().getUnorderedGroup_0(), 0) ) {
                    alt23=1;
                }
                else if ( LA23_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getSubQuantityRelationAccess().getUnorderedGroup_0(), 1) ) {
                    alt23=2;
                }
                else if ( LA23_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getSubQuantityRelationAccess().getUnorderedGroup_0(), 2) ) {
                    alt23=3;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalDsl.g:1781:4: ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) )
            	    {
            	    // InternalDsl.g:1781:4: ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) )
            	    // InternalDsl.g:1782:5: {...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSubQuantityRelationAccess().getUnorderedGroup_0(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleSubQuantityRelation", "getUnorderedGroupHelper().canSelect(grammarAccess.getSubQuantityRelationAccess().getUnorderedGroup_0(), 0)");
            	    }
            	    // InternalDsl.g:1782:116: ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) )
            	    // InternalDsl.g:1783:6: ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSubQuantityRelationAccess().getUnorderedGroup_0(), 0);
            	    					
            	    // InternalDsl.g:1786:9: ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) )
            	    // InternalDsl.g:1786:10: {...}? => ( (lv_partIsEssential_1_0= 'essential' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSubQuantityRelation", "true");
            	    }
            	    // InternalDsl.g:1786:19: ( (lv_partIsEssential_1_0= 'essential' ) )
            	    // InternalDsl.g:1786:20: (lv_partIsEssential_1_0= 'essential' )
            	    {
            	    // InternalDsl.g:1786:20: (lv_partIsEssential_1_0= 'essential' )
            	    // InternalDsl.g:1787:10: lv_partIsEssential_1_0= 'essential'
            	    {
            	    lv_partIsEssential_1_0=(Token)match(input,27,FOLLOW_32); 

            	    										newLeafNode(lv_partIsEssential_1_0, grammarAccess.getSubQuantityRelationAccess().getPartIsEssentialEssentialKeyword_0_0_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getSubQuantityRelationRule());
            	    										}
            	    										setWithLastConsumed(current, "partIsEssential", true, "essential");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSubQuantityRelationAccess().getUnorderedGroup_0());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDsl.g:1804:4: ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) )
            	    {
            	    // InternalDsl.g:1804:4: ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) )
            	    // InternalDsl.g:1805:5: {...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSubQuantityRelationAccess().getUnorderedGroup_0(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleSubQuantityRelation", "getUnorderedGroupHelper().canSelect(grammarAccess.getSubQuantityRelationAccess().getUnorderedGroup_0(), 1)");
            	    }
            	    // InternalDsl.g:1805:116: ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) )
            	    // InternalDsl.g:1806:6: ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSubQuantityRelationAccess().getUnorderedGroup_0(), 1);
            	    					
            	    // InternalDsl.g:1809:9: ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) )
            	    // InternalDsl.g:1809:10: {...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSubQuantityRelation", "true");
            	    }
            	    // InternalDsl.g:1809:19: ( (lv_partIsInseparable_2_0= 'inseparable' ) )
            	    // InternalDsl.g:1809:20: (lv_partIsInseparable_2_0= 'inseparable' )
            	    {
            	    // InternalDsl.g:1809:20: (lv_partIsInseparable_2_0= 'inseparable' )
            	    // InternalDsl.g:1810:10: lv_partIsInseparable_2_0= 'inseparable'
            	    {
            	    lv_partIsInseparable_2_0=(Token)match(input,28,FOLLOW_32); 

            	    										newLeafNode(lv_partIsInseparable_2_0, grammarAccess.getSubQuantityRelationAccess().getPartIsInseparableInseparableKeyword_0_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getSubQuantityRelationRule());
            	    										}
            	    										setWithLastConsumed(current, "partIsInseparable", true, "inseparable");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSubQuantityRelationAccess().getUnorderedGroup_0());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalDsl.g:1827:4: ({...}? => ( ({...}? => ( (lv_partIsImmutable_3_0= 'immutable' ) ) ) ) )
            	    {
            	    // InternalDsl.g:1827:4: ({...}? => ( ({...}? => ( (lv_partIsImmutable_3_0= 'immutable' ) ) ) ) )
            	    // InternalDsl.g:1828:5: {...}? => ( ({...}? => ( (lv_partIsImmutable_3_0= 'immutable' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSubQuantityRelationAccess().getUnorderedGroup_0(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleSubQuantityRelation", "getUnorderedGroupHelper().canSelect(grammarAccess.getSubQuantityRelationAccess().getUnorderedGroup_0(), 2)");
            	    }
            	    // InternalDsl.g:1828:116: ( ({...}? => ( (lv_partIsImmutable_3_0= 'immutable' ) ) ) )
            	    // InternalDsl.g:1829:6: ({...}? => ( (lv_partIsImmutable_3_0= 'immutable' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSubQuantityRelationAccess().getUnorderedGroup_0(), 2);
            	    					
            	    // InternalDsl.g:1832:9: ({...}? => ( (lv_partIsImmutable_3_0= 'immutable' ) ) )
            	    // InternalDsl.g:1832:10: {...}? => ( (lv_partIsImmutable_3_0= 'immutable' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSubQuantityRelation", "true");
            	    }
            	    // InternalDsl.g:1832:19: ( (lv_partIsImmutable_3_0= 'immutable' ) )
            	    // InternalDsl.g:1832:20: (lv_partIsImmutable_3_0= 'immutable' )
            	    {
            	    // InternalDsl.g:1832:20: (lv_partIsImmutable_3_0= 'immutable' )
            	    // InternalDsl.g:1833:10: lv_partIsImmutable_3_0= 'immutable'
            	    {
            	    lv_partIsImmutable_3_0=(Token)match(input,30,FOLLOW_32); 

            	    										newLeafNode(lv_partIsImmutable_3_0, grammarAccess.getSubQuantityRelationAccess().getPartIsImmutableImmutableKeyword_0_2_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getSubQuantityRelationRule());
            	    										}
            	    										setWithLastConsumed(current, "partIsImmutable", true, "immutable");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSubQuantityRelationAccess().getUnorderedGroup_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getSubQuantityRelationAccess().getUnorderedGroup_0()) ) {
                throw new FailedPredicateException(input, "ruleSubQuantityRelation", "getUnorderedGroupHelper().canLeave(grammarAccess.getSubQuantityRelationAccess().getUnorderedGroup_0())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getSubQuantityRelationAccess().getUnorderedGroup_0());
            				

            }

            otherlv_4=(Token)match(input,31,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getSubQuantityRelationAccess().getRelationKeyword_1());
            		
            // InternalDsl.g:1862:3: ( (otherlv_5= RULE_ID ) )
            // InternalDsl.g:1863:4: (otherlv_5= RULE_ID )
            {
            // InternalDsl.g:1863:4: (otherlv_5= RULE_ID )
            // InternalDsl.g:1864:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubQuantityRelationRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_33); 

            					newLeafNode(otherlv_5, grammarAccess.getSubQuantityRelationAccess().getPartSubstantialUniversalCrossReference_2_0());
            				

            }


            }

            // InternalDsl.g:1875:3: (otherlv_6= '[' ( (lv_sourceLowerBound_7_0= ruleCardinalityBound ) ) otherlv_8= '..' ( (lv_sourceUpperBound_9_0= ruleCardinalityUpperBound ) ) otherlv_10= ']' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==32) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalDsl.g:1876:4: otherlv_6= '[' ( (lv_sourceLowerBound_7_0= ruleCardinalityBound ) ) otherlv_8= '..' ( (lv_sourceUpperBound_9_0= ruleCardinalityUpperBound ) ) otherlv_10= ']'
                    {
                    otherlv_6=(Token)match(input,32,FOLLOW_22); 

                    				newLeafNode(otherlv_6, grammarAccess.getSubQuantityRelationAccess().getLeftSquareBracketKeyword_3_0());
                    			
                    // InternalDsl.g:1880:4: ( (lv_sourceLowerBound_7_0= ruleCardinalityBound ) )
                    // InternalDsl.g:1881:5: (lv_sourceLowerBound_7_0= ruleCardinalityBound )
                    {
                    // InternalDsl.g:1881:5: (lv_sourceLowerBound_7_0= ruleCardinalityBound )
                    // InternalDsl.g:1882:6: lv_sourceLowerBound_7_0= ruleCardinalityBound
                    {

                    						newCompositeNode(grammarAccess.getSubQuantityRelationAccess().getSourceLowerBoundCardinalityBoundParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_sourceLowerBound_7_0=ruleCardinalityBound();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubQuantityRelationRule());
                    						}
                    						set(
                    							current,
                    							"sourceLowerBound",
                    							lv_sourceLowerBound_7_0,
                    							"br.ufes.inf.ontouml.ontoumlprime.Dsl.CardinalityBound");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,33,FOLLOW_24); 

                    				newLeafNode(otherlv_8, grammarAccess.getSubQuantityRelationAccess().getFullStopFullStopKeyword_3_2());
                    			
                    // InternalDsl.g:1903:4: ( (lv_sourceUpperBound_9_0= ruleCardinalityUpperBound ) )
                    // InternalDsl.g:1904:5: (lv_sourceUpperBound_9_0= ruleCardinalityUpperBound )
                    {
                    // InternalDsl.g:1904:5: (lv_sourceUpperBound_9_0= ruleCardinalityUpperBound )
                    // InternalDsl.g:1905:6: lv_sourceUpperBound_9_0= ruleCardinalityUpperBound
                    {

                    						newCompositeNode(grammarAccess.getSubQuantityRelationAccess().getSourceUpperBoundCardinalityUpperBoundParserRuleCall_3_3_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_sourceUpperBound_9_0=ruleCardinalityUpperBound();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubQuantityRelationRule());
                    						}
                    						set(
                    							current,
                    							"sourceUpperBound",
                    							lv_sourceUpperBound_9_0,
                    							"br.ufes.inf.ontouml.ontoumlprime.Dsl.CardinalityUpperBound");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,34,FOLLOW_34); 

                    				newLeafNode(otherlv_10, grammarAccess.getSubQuantityRelationAccess().getRightSquareBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,38,FOLLOW_4); 

            			newLeafNode(otherlv_11, grammarAccess.getSubQuantityRelationAccess().getIsSubQuantityOfKeyword_4());
            		
            // InternalDsl.g:1931:3: ( (otherlv_12= RULE_ID ) )
            // InternalDsl.g:1932:4: (otherlv_12= RULE_ID )
            {
            // InternalDsl.g:1932:4: (otherlv_12= RULE_ID )
            // InternalDsl.g:1933:5: otherlv_12= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubQuantityRelationRule());
            					}
            				
            otherlv_12=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(otherlv_12, grammarAccess.getSubQuantityRelationAccess().getWholeSubstantialUniversalCrossReference_5_0());
            				

            }


            }

            // InternalDsl.g:1944:3: (otherlv_13= '[' ( (lv_targetLowerBound_14_0= ruleCardinalityBound ) ) otherlv_15= '..' ( (lv_targetUpperBound_16_0= ruleCardinalityUpperBound ) ) otherlv_17= ']' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==32) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalDsl.g:1945:4: otherlv_13= '[' ( (lv_targetLowerBound_14_0= ruleCardinalityBound ) ) otherlv_15= '..' ( (lv_targetUpperBound_16_0= ruleCardinalityUpperBound ) ) otherlv_17= ']'
                    {
                    otherlv_13=(Token)match(input,32,FOLLOW_22); 

                    				newLeafNode(otherlv_13, grammarAccess.getSubQuantityRelationAccess().getLeftSquareBracketKeyword_6_0());
                    			
                    // InternalDsl.g:1949:4: ( (lv_targetLowerBound_14_0= ruleCardinalityBound ) )
                    // InternalDsl.g:1950:5: (lv_targetLowerBound_14_0= ruleCardinalityBound )
                    {
                    // InternalDsl.g:1950:5: (lv_targetLowerBound_14_0= ruleCardinalityBound )
                    // InternalDsl.g:1951:6: lv_targetLowerBound_14_0= ruleCardinalityBound
                    {

                    						newCompositeNode(grammarAccess.getSubQuantityRelationAccess().getTargetLowerBoundCardinalityBoundParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_targetLowerBound_14_0=ruleCardinalityBound();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubQuantityRelationRule());
                    						}
                    						set(
                    							current,
                    							"targetLowerBound",
                    							lv_targetLowerBound_14_0,
                    							"br.ufes.inf.ontouml.ontoumlprime.Dsl.CardinalityBound");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_15=(Token)match(input,33,FOLLOW_24); 

                    				newLeafNode(otherlv_15, grammarAccess.getSubQuantityRelationAccess().getFullStopFullStopKeyword_6_2());
                    			
                    // InternalDsl.g:1972:4: ( (lv_targetUpperBound_16_0= ruleCardinalityUpperBound ) )
                    // InternalDsl.g:1973:5: (lv_targetUpperBound_16_0= ruleCardinalityUpperBound )
                    {
                    // InternalDsl.g:1973:5: (lv_targetUpperBound_16_0= ruleCardinalityUpperBound )
                    // InternalDsl.g:1974:6: lv_targetUpperBound_16_0= ruleCardinalityUpperBound
                    {

                    						newCompositeNode(grammarAccess.getSubQuantityRelationAccess().getTargetUpperBoundCardinalityUpperBoundParserRuleCall_6_3_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_targetUpperBound_16_0=ruleCardinalityUpperBound();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubQuantityRelationRule());
                    						}
                    						set(
                    							current,
                    							"targetUpperBound",
                    							lv_targetUpperBound_16_0,
                    							"br.ufes.inf.ontouml.ontoumlprime.Dsl.CardinalityUpperBound");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_17=(Token)match(input,34,FOLLOW_13); 

                    				newLeafNode(otherlv_17, grammarAccess.getSubQuantityRelationAccess().getRightSquareBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_18=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getSubQuantityRelationAccess().getSemicolonKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubQuantityRelation"


    // $ANTLR start "entryRuleKind"
    // InternalDsl.g:2004:1: entryRuleKind returns [EObject current=null] : iv_ruleKind= ruleKind EOF ;
    public final EObject entryRuleKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKind = null;


        try {
            // InternalDsl.g:2004:45: (iv_ruleKind= ruleKind EOF )
            // InternalDsl.g:2005:2: iv_ruleKind= ruleKind EOF
            {
             newCompositeNode(grammarAccess.getKindRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKind=ruleKind();

            state._fsp--;

             current =iv_ruleKind; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKind"


    // $ANTLR start "ruleKind"
    // InternalDsl.g:2011:1: ruleKind returns [EObject current=null] : ( () otherlv_1= 'Kind' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}' ) ;
    public final EObject ruleKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_characterizedBy_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2017:2: ( ( () otherlv_1= 'Kind' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}' ) )
            // InternalDsl.g:2018:2: ( () otherlv_1= 'Kind' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}' )
            {
            // InternalDsl.g:2018:2: ( () otherlv_1= 'Kind' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}' )
            // InternalDsl.g:2019:3: () otherlv_1= 'Kind' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}'
            {
            // InternalDsl.g:2019:3: ()
            // InternalDsl.g:2020:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getKindAccess().getKindAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getKindAccess().getKindKeyword_1());
            		
            // InternalDsl.g:2030:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDsl.g:2031:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDsl.g:2031:4: (lv_name_2_0= RULE_ID )
            // InternalDsl.g:2032:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_2_0, grammarAccess.getKindAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getKindRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_35); 

            			newLeafNode(otherlv_3, grammarAccess.getKindAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDsl.g:2052:3: ( (lv_characterizedBy_4_0= ruleCharacterization ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==32||LA26_0==58) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalDsl.g:2053:4: (lv_characterizedBy_4_0= ruleCharacterization )
            	    {
            	    // InternalDsl.g:2053:4: (lv_characterizedBy_4_0= ruleCharacterization )
            	    // InternalDsl.g:2054:5: lv_characterizedBy_4_0= ruleCharacterization
            	    {

            	    					newCompositeNode(grammarAccess.getKindAccess().getCharacterizedByCharacterizationParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_35);
            	    lv_characterizedBy_4_0=ruleCharacterization();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getKindRule());
            	    					}
            	    					add(
            	    						current,
            	    						"characterizedBy",
            	    						lv_characterizedBy_4_0,
            	    						"br.ufes.inf.ontouml.ontoumlprime.Dsl.Characterization");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getKindAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKind"


    // $ANTLR start "entryRuleQuantityUniversal"
    // InternalDsl.g:2079:1: entryRuleQuantityUniversal returns [EObject current=null] : iv_ruleQuantityUniversal= ruleQuantityUniversal EOF ;
    public final EObject entryRuleQuantityUniversal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantityUniversal = null;


        try {
            // InternalDsl.g:2079:58: (iv_ruleQuantityUniversal= ruleQuantityUniversal EOF )
            // InternalDsl.g:2080:2: iv_ruleQuantityUniversal= ruleQuantityUniversal EOF
            {
             newCompositeNode(grammarAccess.getQuantityUniversalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuantityUniversal=ruleQuantityUniversal();

            state._fsp--;

             current =iv_ruleQuantityUniversal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuantityUniversal"


    // $ANTLR start "ruleQuantityUniversal"
    // InternalDsl.g:2086:1: ruleQuantityUniversal returns [EObject current=null] : ( () otherlv_1= 'Quantity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}' ) ;
    public final EObject ruleQuantityUniversal() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_characterizedBy_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2092:2: ( ( () otherlv_1= 'Quantity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}' ) )
            // InternalDsl.g:2093:2: ( () otherlv_1= 'Quantity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}' )
            {
            // InternalDsl.g:2093:2: ( () otherlv_1= 'Quantity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}' )
            // InternalDsl.g:2094:3: () otherlv_1= 'Quantity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}'
            {
            // InternalDsl.g:2094:3: ()
            // InternalDsl.g:2095:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getQuantityUniversalAccess().getQuantityUniversalAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,40,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getQuantityUniversalAccess().getQuantityKeyword_1());
            		
            // InternalDsl.g:2105:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDsl.g:2106:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDsl.g:2106:4: (lv_name_2_0= RULE_ID )
            // InternalDsl.g:2107:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_2_0, grammarAccess.getQuantityUniversalAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQuantityUniversalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_35); 

            			newLeafNode(otherlv_3, grammarAccess.getQuantityUniversalAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDsl.g:2127:3: ( (lv_characterizedBy_4_0= ruleCharacterization ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==32||LA27_0==58) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalDsl.g:2128:4: (lv_characterizedBy_4_0= ruleCharacterization )
            	    {
            	    // InternalDsl.g:2128:4: (lv_characterizedBy_4_0= ruleCharacterization )
            	    // InternalDsl.g:2129:5: lv_characterizedBy_4_0= ruleCharacterization
            	    {

            	    					newCompositeNode(grammarAccess.getQuantityUniversalAccess().getCharacterizedByCharacterizationParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_35);
            	    lv_characterizedBy_4_0=ruleCharacterization();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getQuantityUniversalRule());
            	    					}
            	    					add(
            	    						current,
            	    						"characterizedBy",
            	    						lv_characterizedBy_4_0,
            	    						"br.ufes.inf.ontouml.ontoumlprime.Dsl.Characterization");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getQuantityUniversalAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuantityUniversal"


    // $ANTLR start "entryRuleCollectiveUniversal"
    // InternalDsl.g:2154:1: entryRuleCollectiveUniversal returns [EObject current=null] : iv_ruleCollectiveUniversal= ruleCollectiveUniversal EOF ;
    public final EObject entryRuleCollectiveUniversal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectiveUniversal = null;


        try {
            // InternalDsl.g:2154:60: (iv_ruleCollectiveUniversal= ruleCollectiveUniversal EOF )
            // InternalDsl.g:2155:2: iv_ruleCollectiveUniversal= ruleCollectiveUniversal EOF
            {
             newCompositeNode(grammarAccess.getCollectiveUniversalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCollectiveUniversal=ruleCollectiveUniversal();

            state._fsp--;

             current =iv_ruleCollectiveUniversal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCollectiveUniversal"


    // $ANTLR start "ruleCollectiveUniversal"
    // InternalDsl.g:2161:1: ruleCollectiveUniversal returns [EObject current=null] : ( ( (lv_isExtensional_0_0= 'extensional' ) )? otherlv_1= 'CollectiveUniversal' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}' ) ;
    public final EObject ruleCollectiveUniversal() throws RecognitionException {
        EObject current = null;

        Token lv_isExtensional_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_characterizedBy_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2167:2: ( ( ( (lv_isExtensional_0_0= 'extensional' ) )? otherlv_1= 'CollectiveUniversal' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}' ) )
            // InternalDsl.g:2168:2: ( ( (lv_isExtensional_0_0= 'extensional' ) )? otherlv_1= 'CollectiveUniversal' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}' )
            {
            // InternalDsl.g:2168:2: ( ( (lv_isExtensional_0_0= 'extensional' ) )? otherlv_1= 'CollectiveUniversal' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}' )
            // InternalDsl.g:2169:3: ( (lv_isExtensional_0_0= 'extensional' ) )? otherlv_1= 'CollectiveUniversal' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}'
            {
            // InternalDsl.g:2169:3: ( (lv_isExtensional_0_0= 'extensional' ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==41) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalDsl.g:2170:4: (lv_isExtensional_0_0= 'extensional' )
                    {
                    // InternalDsl.g:2170:4: (lv_isExtensional_0_0= 'extensional' )
                    // InternalDsl.g:2171:5: lv_isExtensional_0_0= 'extensional'
                    {
                    lv_isExtensional_0_0=(Token)match(input,41,FOLLOW_36); 

                    					newLeafNode(lv_isExtensional_0_0, grammarAccess.getCollectiveUniversalAccess().getIsExtensionalExtensionalKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCollectiveUniversalRule());
                    					}
                    					setWithLastConsumed(current, "isExtensional", true, "extensional");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,42,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getCollectiveUniversalAccess().getCollectiveUniversalKeyword_1());
            		
            // InternalDsl.g:2187:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDsl.g:2188:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDsl.g:2188:4: (lv_name_2_0= RULE_ID )
            // InternalDsl.g:2189:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_2_0, grammarAccess.getCollectiveUniversalAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCollectiveUniversalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_35); 

            			newLeafNode(otherlv_3, grammarAccess.getCollectiveUniversalAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDsl.g:2209:3: ( (lv_characterizedBy_4_0= ruleCharacterization ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==32||LA29_0==58) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalDsl.g:2210:4: (lv_characterizedBy_4_0= ruleCharacterization )
            	    {
            	    // InternalDsl.g:2210:4: (lv_characterizedBy_4_0= ruleCharacterization )
            	    // InternalDsl.g:2211:5: lv_characterizedBy_4_0= ruleCharacterization
            	    {

            	    					newCompositeNode(grammarAccess.getCollectiveUniversalAccess().getCharacterizedByCharacterizationParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_35);
            	    lv_characterizedBy_4_0=ruleCharacterization();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCollectiveUniversalRule());
            	    					}
            	    					add(
            	    						current,
            	    						"characterizedBy",
            	    						lv_characterizedBy_4_0,
            	    						"br.ufes.inf.ontouml.ontoumlprime.Dsl.Characterization");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getCollectiveUniversalAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCollectiveUniversal"


    // $ANTLR start "entryRuleSubKind"
    // InternalDsl.g:2236:1: entryRuleSubKind returns [EObject current=null] : iv_ruleSubKind= ruleSubKind EOF ;
    public final EObject entryRuleSubKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubKind = null;


        try {
            // InternalDsl.g:2236:48: (iv_ruleSubKind= ruleSubKind EOF )
            // InternalDsl.g:2237:2: iv_ruleSubKind= ruleSubKind EOF
            {
             newCompositeNode(grammarAccess.getSubKindRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubKind=ruleSubKind();

            state._fsp--;

             current =iv_ruleSubKind; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubKind"


    // $ANTLR start "ruleSubKind"
    // InternalDsl.g:2243:1: ruleSubKind returns [EObject current=null] : ( () otherlv_1= 'SubKind' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}' ) ;
    public final EObject ruleSubKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_characterizedBy_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2249:2: ( ( () otherlv_1= 'SubKind' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}' ) )
            // InternalDsl.g:2250:2: ( () otherlv_1= 'SubKind' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}' )
            {
            // InternalDsl.g:2250:2: ( () otherlv_1= 'SubKind' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}' )
            // InternalDsl.g:2251:3: () otherlv_1= 'SubKind' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}'
            {
            // InternalDsl.g:2251:3: ()
            // InternalDsl.g:2252:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSubKindAccess().getSubKindAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,43,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSubKindAccess().getSubKindKeyword_1());
            		
            // InternalDsl.g:2262:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDsl.g:2263:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDsl.g:2263:4: (lv_name_2_0= RULE_ID )
            // InternalDsl.g:2264:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_2_0, grammarAccess.getSubKindAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubKindRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_35); 

            			newLeafNode(otherlv_3, grammarAccess.getSubKindAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDsl.g:2284:3: ( (lv_characterizedBy_4_0= ruleCharacterization ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==32||LA30_0==58) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalDsl.g:2285:4: (lv_characterizedBy_4_0= ruleCharacterization )
            	    {
            	    // InternalDsl.g:2285:4: (lv_characterizedBy_4_0= ruleCharacterization )
            	    // InternalDsl.g:2286:5: lv_characterizedBy_4_0= ruleCharacterization
            	    {

            	    					newCompositeNode(grammarAccess.getSubKindAccess().getCharacterizedByCharacterizationParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_35);
            	    lv_characterizedBy_4_0=ruleCharacterization();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSubKindRule());
            	    					}
            	    					add(
            	    						current,
            	    						"characterizedBy",
            	    						lv_characterizedBy_4_0,
            	    						"br.ufes.inf.ontouml.ontoumlprime.Dsl.Characterization");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSubKindAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubKind"


    // $ANTLR start "entryRuleRole"
    // InternalDsl.g:2311:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // InternalDsl.g:2311:45: (iv_ruleRole= ruleRole EOF )
            // InternalDsl.g:2312:2: iv_ruleRole= ruleRole EOF
            {
             newCompositeNode(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRole=ruleRole();

            state._fsp--;

             current =iv_ruleRole; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRole"


    // $ANTLR start "ruleRole"
    // InternalDsl.g:2318:1: ruleRole returns [EObject current=null] : (otherlv_0= 'Role' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_characterizedBy_3_0= ruleCharacterization ) )* otherlv_4= '}' ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_characterizedBy_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2324:2: ( (otherlv_0= 'Role' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_characterizedBy_3_0= ruleCharacterization ) )* otherlv_4= '}' ) )
            // InternalDsl.g:2325:2: (otherlv_0= 'Role' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_characterizedBy_3_0= ruleCharacterization ) )* otherlv_4= '}' )
            {
            // InternalDsl.g:2325:2: (otherlv_0= 'Role' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_characterizedBy_3_0= ruleCharacterization ) )* otherlv_4= '}' )
            // InternalDsl.g:2326:3: otherlv_0= 'Role' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_characterizedBy_3_0= ruleCharacterization ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRoleAccess().getRoleKeyword_0());
            		
            // InternalDsl.g:2330:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:2331:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:2331:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:2332:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRoleAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_35); 

            			newLeafNode(otherlv_2, grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:2352:3: ( (lv_characterizedBy_3_0= ruleCharacterization ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==32||LA31_0==58) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalDsl.g:2353:4: (lv_characterizedBy_3_0= ruleCharacterization )
            	    {
            	    // InternalDsl.g:2353:4: (lv_characterizedBy_3_0= ruleCharacterization )
            	    // InternalDsl.g:2354:5: lv_characterizedBy_3_0= ruleCharacterization
            	    {

            	    					newCompositeNode(grammarAccess.getRoleAccess().getCharacterizedByCharacterizationParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_35);
            	    lv_characterizedBy_3_0=ruleCharacterization();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRoleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"characterizedBy",
            	    						lv_characterizedBy_3_0,
            	    						"br.ufes.inf.ontouml.ontoumlprime.Dsl.Characterization");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRole"


    // $ANTLR start "entryRulePhase"
    // InternalDsl.g:2379:1: entryRulePhase returns [EObject current=null] : iv_rulePhase= rulePhase EOF ;
    public final EObject entryRulePhase() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhase = null;


        try {
            // InternalDsl.g:2379:46: (iv_rulePhase= rulePhase EOF )
            // InternalDsl.g:2380:2: iv_rulePhase= rulePhase EOF
            {
             newCompositeNode(grammarAccess.getPhaseRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePhase=rulePhase();

            state._fsp--;

             current =iv_rulePhase; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePhase"


    // $ANTLR start "rulePhase"
    // InternalDsl.g:2386:1: rulePhase returns [EObject current=null] : ( () otherlv_1= 'Phase' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}' ) ;
    public final EObject rulePhase() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_characterizedBy_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2392:2: ( ( () otherlv_1= 'Phase' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}' ) )
            // InternalDsl.g:2393:2: ( () otherlv_1= 'Phase' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}' )
            {
            // InternalDsl.g:2393:2: ( () otherlv_1= 'Phase' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}' )
            // InternalDsl.g:2394:3: () otherlv_1= 'Phase' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}'
            {
            // InternalDsl.g:2394:3: ()
            // InternalDsl.g:2395:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPhaseAccess().getPhaseAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,45,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getPhaseAccess().getPhaseKeyword_1());
            		
            // InternalDsl.g:2405:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDsl.g:2406:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDsl.g:2406:4: (lv_name_2_0= RULE_ID )
            // InternalDsl.g:2407:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_2_0, grammarAccess.getPhaseAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPhaseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_35); 

            			newLeafNode(otherlv_3, grammarAccess.getPhaseAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDsl.g:2427:3: ( (lv_characterizedBy_4_0= ruleCharacterization ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==32||LA32_0==58) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalDsl.g:2428:4: (lv_characterizedBy_4_0= ruleCharacterization )
            	    {
            	    // InternalDsl.g:2428:4: (lv_characterizedBy_4_0= ruleCharacterization )
            	    // InternalDsl.g:2429:5: lv_characterizedBy_4_0= ruleCharacterization
            	    {

            	    					newCompositeNode(grammarAccess.getPhaseAccess().getCharacterizedByCharacterizationParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_35);
            	    lv_characterizedBy_4_0=ruleCharacterization();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPhaseRule());
            	    					}
            	    					add(
            	    						current,
            	    						"characterizedBy",
            	    						lv_characterizedBy_4_0,
            	    						"br.ufes.inf.ontouml.ontoumlprime.Dsl.Characterization");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPhaseAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePhase"


    // $ANTLR start "entryRuleCategory"
    // InternalDsl.g:2454:1: entryRuleCategory returns [EObject current=null] : iv_ruleCategory= ruleCategory EOF ;
    public final EObject entryRuleCategory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCategory = null;


        try {
            // InternalDsl.g:2454:49: (iv_ruleCategory= ruleCategory EOF )
            // InternalDsl.g:2455:2: iv_ruleCategory= ruleCategory EOF
            {
             newCompositeNode(grammarAccess.getCategoryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCategory=ruleCategory();

            state._fsp--;

             current =iv_ruleCategory; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCategory"


    // $ANTLR start "ruleCategory"
    // InternalDsl.g:2461:1: ruleCategory returns [EObject current=null] : ( () otherlv_1= 'Category' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}' ) ;
    public final EObject ruleCategory() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalDsl.g:2467:2: ( ( () otherlv_1= 'Category' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}' ) )
            // InternalDsl.g:2468:2: ( () otherlv_1= 'Category' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}' )
            {
            // InternalDsl.g:2468:2: ( () otherlv_1= 'Category' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}' )
            // InternalDsl.g:2469:3: () otherlv_1= 'Category' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}'
            {
            // InternalDsl.g:2469:3: ()
            // InternalDsl.g:2470:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCategoryAccess().getCategoryAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,46,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getCategoryAccess().getCategoryKeyword_1());
            		
            // InternalDsl.g:2480:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDsl.g:2481:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDsl.g:2481:4: (lv_name_2_0= RULE_ID )
            // InternalDsl.g:2482:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_2_0, grammarAccess.getCategoryAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCategoryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_37); 

            			newLeafNode(otherlv_3, grammarAccess.getCategoryAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getCategoryAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCategory"


    // $ANTLR start "entryRuleMixin"
    // InternalDsl.g:2510:1: entryRuleMixin returns [EObject current=null] : iv_ruleMixin= ruleMixin EOF ;
    public final EObject entryRuleMixin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMixin = null;


        try {
            // InternalDsl.g:2510:46: (iv_ruleMixin= ruleMixin EOF )
            // InternalDsl.g:2511:2: iv_ruleMixin= ruleMixin EOF
            {
             newCompositeNode(grammarAccess.getMixinRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMixin=ruleMixin();

            state._fsp--;

             current =iv_ruleMixin; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMixin"


    // $ANTLR start "ruleMixin"
    // InternalDsl.g:2517:1: ruleMixin returns [EObject current=null] : ( () otherlv_1= 'Mixin' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}' ) ;
    public final EObject ruleMixin() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalDsl.g:2523:2: ( ( () otherlv_1= 'Mixin' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}' ) )
            // InternalDsl.g:2524:2: ( () otherlv_1= 'Mixin' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}' )
            {
            // InternalDsl.g:2524:2: ( () otherlv_1= 'Mixin' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}' )
            // InternalDsl.g:2525:3: () otherlv_1= 'Mixin' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}'
            {
            // InternalDsl.g:2525:3: ()
            // InternalDsl.g:2526:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMixinAccess().getMixinAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,47,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getMixinAccess().getMixinKeyword_1());
            		
            // InternalDsl.g:2536:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDsl.g:2537:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDsl.g:2537:4: (lv_name_2_0= RULE_ID )
            // InternalDsl.g:2538:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_2_0, grammarAccess.getMixinAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMixinRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_37); 

            			newLeafNode(otherlv_3, grammarAccess.getMixinAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getMixinAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMixin"


    // $ANTLR start "entryRuleRoleMixin"
    // InternalDsl.g:2566:1: entryRuleRoleMixin returns [EObject current=null] : iv_ruleRoleMixin= ruleRoleMixin EOF ;
    public final EObject entryRuleRoleMixin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoleMixin = null;


        try {
            // InternalDsl.g:2566:50: (iv_ruleRoleMixin= ruleRoleMixin EOF )
            // InternalDsl.g:2567:2: iv_ruleRoleMixin= ruleRoleMixin EOF
            {
             newCompositeNode(grammarAccess.getRoleMixinRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoleMixin=ruleRoleMixin();

            state._fsp--;

             current =iv_ruleRoleMixin; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRoleMixin"


    // $ANTLR start "ruleRoleMixin"
    // InternalDsl.g:2573:1: ruleRoleMixin returns [EObject current=null] : (otherlv_0= 'RoleMixin' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) ;
    public final EObject ruleRoleMixin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalDsl.g:2579:2: ( (otherlv_0= 'RoleMixin' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) )
            // InternalDsl.g:2580:2: (otherlv_0= 'RoleMixin' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            {
            // InternalDsl.g:2580:2: (otherlv_0= 'RoleMixin' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            // InternalDsl.g:2581:3: otherlv_0= 'RoleMixin' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRoleMixinAccess().getRoleMixinKeyword_0());
            		
            // InternalDsl.g:2585:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:2586:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:2586:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:2587:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRoleMixinAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoleMixinRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_37); 

            			newLeafNode(otherlv_2, grammarAccess.getRoleMixinAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getRoleMixinAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRoleMixin"


    // $ANTLR start "entryRuleRelatorUniversal"
    // InternalDsl.g:2615:1: entryRuleRelatorUniversal returns [EObject current=null] : iv_ruleRelatorUniversal= ruleRelatorUniversal EOF ;
    public final EObject entryRuleRelatorUniversal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelatorUniversal = null;


        try {
            // InternalDsl.g:2615:57: (iv_ruleRelatorUniversal= ruleRelatorUniversal EOF )
            // InternalDsl.g:2616:2: iv_ruleRelatorUniversal= ruleRelatorUniversal EOF
            {
             newCompositeNode(grammarAccess.getRelatorUniversalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelatorUniversal=ruleRelatorUniversal();

            state._fsp--;

             current =iv_ruleRelatorUniversal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelatorUniversal"


    // $ANTLR start "ruleRelatorUniversal"
    // InternalDsl.g:2622:1: ruleRelatorUniversal returns [EObject current=null] : (otherlv_0= 'RelatorUniversal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_characterizedBy_3_0= ruleCharacterization ) )* ( (lv_mediations_4_0= ruleMediation ) )* otherlv_5= '}' ) ;
    public final EObject ruleRelatorUniversal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_characterizedBy_3_0 = null;

        EObject lv_mediations_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2628:2: ( (otherlv_0= 'RelatorUniversal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_characterizedBy_3_0= ruleCharacterization ) )* ( (lv_mediations_4_0= ruleMediation ) )* otherlv_5= '}' ) )
            // InternalDsl.g:2629:2: (otherlv_0= 'RelatorUniversal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_characterizedBy_3_0= ruleCharacterization ) )* ( (lv_mediations_4_0= ruleMediation ) )* otherlv_5= '}' )
            {
            // InternalDsl.g:2629:2: (otherlv_0= 'RelatorUniversal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_characterizedBy_3_0= ruleCharacterization ) )* ( (lv_mediations_4_0= ruleMediation ) )* otherlv_5= '}' )
            // InternalDsl.g:2630:3: otherlv_0= 'RelatorUniversal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_characterizedBy_3_0= ruleCharacterization ) )* ( (lv_mediations_4_0= ruleMediation ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRelatorUniversalAccess().getRelatorUniversalKeyword_0());
            		
            // InternalDsl.g:2634:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:2635:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:2635:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:2636:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRelatorUniversalAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelatorUniversalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_38); 

            			newLeafNode(otherlv_2, grammarAccess.getRelatorUniversalAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:2656:3: ( (lv_characterizedBy_3_0= ruleCharacterization ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==32||LA33_0==58) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalDsl.g:2657:4: (lv_characterizedBy_3_0= ruleCharacterization )
            	    {
            	    // InternalDsl.g:2657:4: (lv_characterizedBy_3_0= ruleCharacterization )
            	    // InternalDsl.g:2658:5: lv_characterizedBy_3_0= ruleCharacterization
            	    {

            	    					newCompositeNode(grammarAccess.getRelatorUniversalAccess().getCharacterizedByCharacterizationParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_38);
            	    lv_characterizedBy_3_0=ruleCharacterization();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRelatorUniversalRule());
            	    					}
            	    					add(
            	    						current,
            	    						"characterizedBy",
            	    						lv_characterizedBy_3_0,
            	    						"br.ufes.inf.ontouml.ontoumlprime.Dsl.Characterization");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            // InternalDsl.g:2675:3: ( (lv_mediations_4_0= ruleMediation ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==59) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalDsl.g:2676:4: (lv_mediations_4_0= ruleMediation )
            	    {
            	    // InternalDsl.g:2676:4: (lv_mediations_4_0= ruleMediation )
            	    // InternalDsl.g:2677:5: lv_mediations_4_0= ruleMediation
            	    {

            	    					newCompositeNode(grammarAccess.getRelatorUniversalAccess().getMediationsMediationParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_39);
            	    lv_mediations_4_0=ruleMediation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRelatorUniversalRule());
            	    					}
            	    					add(
            	    						current,
            	    						"mediations",
            	    						lv_mediations_4_0,
            	    						"br.ufes.inf.ontouml.ontoumlprime.Dsl.Mediation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getRelatorUniversalAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelatorUniversal"


    // $ANTLR start "entryRuleBinaryMaterialRelation"
    // InternalDsl.g:2702:1: entryRuleBinaryMaterialRelation returns [EObject current=null] : iv_ruleBinaryMaterialRelation= ruleBinaryMaterialRelation EOF ;
    public final EObject entryRuleBinaryMaterialRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryMaterialRelation = null;


        try {
            // InternalDsl.g:2702:63: (iv_ruleBinaryMaterialRelation= ruleBinaryMaterialRelation EOF )
            // InternalDsl.g:2703:2: iv_ruleBinaryMaterialRelation= ruleBinaryMaterialRelation EOF
            {
             newCompositeNode(grammarAccess.getBinaryMaterialRelationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBinaryMaterialRelation=ruleBinaryMaterialRelation();

            state._fsp--;

             current =iv_ruleBinaryMaterialRelation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBinaryMaterialRelation"


    // $ANTLR start "ruleBinaryMaterialRelation"
    // InternalDsl.g:2709:1: ruleBinaryMaterialRelation returns [EObject current=null] : (otherlv_0= 'material' otherlv_1= 'rel' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '[' ( (lv_sourceLowerBound_4_0= ruleCardinalityBound ) ) otherlv_5= '..' ( (lv_sourceUpperBound_6_0= ruleCardinalityUpperBound ) ) otherlv_7= ']' )? ( (lv_name_8_0= RULE_ID ) ) (otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) otherlv_11= ')' )? ( (otherlv_12= RULE_ID ) ) (otherlv_13= '[' ( (lv_targetLowerBound_14_0= ruleCardinalityBound ) ) otherlv_15= '..' ( (lv_targetUpperBound_16_0= ruleCardinalityUpperBound ) ) otherlv_17= ']' )? otherlv_18= ';' ) ;
    public final EObject ruleBinaryMaterialRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_name_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_sourceLowerBound_4_0 = null;

        AntlrDatatypeRuleToken lv_sourceUpperBound_6_0 = null;

        AntlrDatatypeRuleToken lv_targetLowerBound_14_0 = null;

        AntlrDatatypeRuleToken lv_targetUpperBound_16_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2715:2: ( (otherlv_0= 'material' otherlv_1= 'rel' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '[' ( (lv_sourceLowerBound_4_0= ruleCardinalityBound ) ) otherlv_5= '..' ( (lv_sourceUpperBound_6_0= ruleCardinalityUpperBound ) ) otherlv_7= ']' )? ( (lv_name_8_0= RULE_ID ) ) (otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) otherlv_11= ')' )? ( (otherlv_12= RULE_ID ) ) (otherlv_13= '[' ( (lv_targetLowerBound_14_0= ruleCardinalityBound ) ) otherlv_15= '..' ( (lv_targetUpperBound_16_0= ruleCardinalityUpperBound ) ) otherlv_17= ']' )? otherlv_18= ';' ) )
            // InternalDsl.g:2716:2: (otherlv_0= 'material' otherlv_1= 'rel' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '[' ( (lv_sourceLowerBound_4_0= ruleCardinalityBound ) ) otherlv_5= '..' ( (lv_sourceUpperBound_6_0= ruleCardinalityUpperBound ) ) otherlv_7= ']' )? ( (lv_name_8_0= RULE_ID ) ) (otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) otherlv_11= ')' )? ( (otherlv_12= RULE_ID ) ) (otherlv_13= '[' ( (lv_targetLowerBound_14_0= ruleCardinalityBound ) ) otherlv_15= '..' ( (lv_targetUpperBound_16_0= ruleCardinalityUpperBound ) ) otherlv_17= ']' )? otherlv_18= ';' )
            {
            // InternalDsl.g:2716:2: (otherlv_0= 'material' otherlv_1= 'rel' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '[' ( (lv_sourceLowerBound_4_0= ruleCardinalityBound ) ) otherlv_5= '..' ( (lv_sourceUpperBound_6_0= ruleCardinalityUpperBound ) ) otherlv_7= ']' )? ( (lv_name_8_0= RULE_ID ) ) (otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) otherlv_11= ')' )? ( (otherlv_12= RULE_ID ) ) (otherlv_13= '[' ( (lv_targetLowerBound_14_0= ruleCardinalityBound ) ) otherlv_15= '..' ( (lv_targetUpperBound_16_0= ruleCardinalityUpperBound ) ) otherlv_17= ']' )? otherlv_18= ';' )
            // InternalDsl.g:2717:3: otherlv_0= 'material' otherlv_1= 'rel' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '[' ( (lv_sourceLowerBound_4_0= ruleCardinalityBound ) ) otherlv_5= '..' ( (lv_sourceUpperBound_6_0= ruleCardinalityUpperBound ) ) otherlv_7= ']' )? ( (lv_name_8_0= RULE_ID ) ) (otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) otherlv_11= ')' )? ( (otherlv_12= RULE_ID ) ) (otherlv_13= '[' ( (lv_targetLowerBound_14_0= ruleCardinalityBound ) ) otherlv_15= '..' ( (lv_targetUpperBound_16_0= ruleCardinalityUpperBound ) ) otherlv_17= ']' )? otherlv_18= ';'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_40); 

            			newLeafNode(otherlv_0, grammarAccess.getBinaryMaterialRelationAccess().getMaterialKeyword_0());
            		
            otherlv_1=(Token)match(input,51,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getBinaryMaterialRelationAccess().getRelKeyword_1());
            		
            // InternalDsl.g:2725:3: ( (otherlv_2= RULE_ID ) )
            // InternalDsl.g:2726:4: (otherlv_2= RULE_ID )
            {
            // InternalDsl.g:2726:4: (otherlv_2= RULE_ID )
            // InternalDsl.g:2727:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBinaryMaterialRelationRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_41); 

            					newLeafNode(otherlv_2, grammarAccess.getBinaryMaterialRelationAccess().getSourceExternallyDependentUniversalCrossReference_2_0());
            				

            }


            }

            // InternalDsl.g:2738:3: (otherlv_3= '[' ( (lv_sourceLowerBound_4_0= ruleCardinalityBound ) ) otherlv_5= '..' ( (lv_sourceUpperBound_6_0= ruleCardinalityUpperBound ) ) otherlv_7= ']' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==32) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalDsl.g:2739:4: otherlv_3= '[' ( (lv_sourceLowerBound_4_0= ruleCardinalityBound ) ) otherlv_5= '..' ( (lv_sourceUpperBound_6_0= ruleCardinalityUpperBound ) ) otherlv_7= ']'
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_22); 

                    				newLeafNode(otherlv_3, grammarAccess.getBinaryMaterialRelationAccess().getLeftSquareBracketKeyword_3_0());
                    			
                    // InternalDsl.g:2743:4: ( (lv_sourceLowerBound_4_0= ruleCardinalityBound ) )
                    // InternalDsl.g:2744:5: (lv_sourceLowerBound_4_0= ruleCardinalityBound )
                    {
                    // InternalDsl.g:2744:5: (lv_sourceLowerBound_4_0= ruleCardinalityBound )
                    // InternalDsl.g:2745:6: lv_sourceLowerBound_4_0= ruleCardinalityBound
                    {

                    						newCompositeNode(grammarAccess.getBinaryMaterialRelationAccess().getSourceLowerBoundCardinalityBoundParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_sourceLowerBound_4_0=ruleCardinalityBound();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBinaryMaterialRelationRule());
                    						}
                    						set(
                    							current,
                    							"sourceLowerBound",
                    							lv_sourceLowerBound_4_0,
                    							"br.ufes.inf.ontouml.ontoumlprime.Dsl.CardinalityBound");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,33,FOLLOW_24); 

                    				newLeafNode(otherlv_5, grammarAccess.getBinaryMaterialRelationAccess().getFullStopFullStopKeyword_3_2());
                    			
                    // InternalDsl.g:2766:4: ( (lv_sourceUpperBound_6_0= ruleCardinalityUpperBound ) )
                    // InternalDsl.g:2767:5: (lv_sourceUpperBound_6_0= ruleCardinalityUpperBound )
                    {
                    // InternalDsl.g:2767:5: (lv_sourceUpperBound_6_0= ruleCardinalityUpperBound )
                    // InternalDsl.g:2768:6: lv_sourceUpperBound_6_0= ruleCardinalityUpperBound
                    {

                    						newCompositeNode(grammarAccess.getBinaryMaterialRelationAccess().getSourceUpperBoundCardinalityUpperBoundParserRuleCall_3_3_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_sourceUpperBound_6_0=ruleCardinalityUpperBound();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBinaryMaterialRelationRule());
                    						}
                    						set(
                    							current,
                    							"sourceUpperBound",
                    							lv_sourceUpperBound_6_0,
                    							"br.ufes.inf.ontouml.ontoumlprime.Dsl.CardinalityUpperBound");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,34,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getBinaryMaterialRelationAccess().getRightSquareBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalDsl.g:2790:3: ( (lv_name_8_0= RULE_ID ) )
            // InternalDsl.g:2791:4: (lv_name_8_0= RULE_ID )
            {
            // InternalDsl.g:2791:4: (lv_name_8_0= RULE_ID )
            // InternalDsl.g:2792:5: lv_name_8_0= RULE_ID
            {
            lv_name_8_0=(Token)match(input,RULE_ID,FOLLOW_42); 

            					newLeafNode(lv_name_8_0, grammarAccess.getBinaryMaterialRelationAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBinaryMaterialRelationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_8_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDsl.g:2808:3: (otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) otherlv_11= ')' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==23) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalDsl.g:2809:4: otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) otherlv_11= ')'
                    {
                    otherlv_9=(Token)match(input,23,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getBinaryMaterialRelationAccess().getLeftParenthesisKeyword_5_0());
                    			
                    // InternalDsl.g:2813:4: ( (otherlv_10= RULE_ID ) )
                    // InternalDsl.g:2814:5: (otherlv_10= RULE_ID )
                    {
                    // InternalDsl.g:2814:5: (otherlv_10= RULE_ID )
                    // InternalDsl.g:2815:6: otherlv_10= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBinaryMaterialRelationRule());
                    						}
                    					
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_16); 

                    						newLeafNode(otherlv_10, grammarAccess.getBinaryMaterialRelationAccess().getDerivedFromRelatorUniversalCrossReference_5_1_0());
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,24,FOLLOW_4); 

                    				newLeafNode(otherlv_11, grammarAccess.getBinaryMaterialRelationAccess().getRightParenthesisKeyword_5_2());
                    			

                    }
                    break;

            }

            // InternalDsl.g:2831:3: ( (otherlv_12= RULE_ID ) )
            // InternalDsl.g:2832:4: (otherlv_12= RULE_ID )
            {
            // InternalDsl.g:2832:4: (otherlv_12= RULE_ID )
            // InternalDsl.g:2833:5: otherlv_12= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBinaryMaterialRelationRule());
            					}
            				
            otherlv_12=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(otherlv_12, grammarAccess.getBinaryMaterialRelationAccess().getTargetExternallyDependentUniversalCrossReference_6_0());
            				

            }


            }

            // InternalDsl.g:2844:3: (otherlv_13= '[' ( (lv_targetLowerBound_14_0= ruleCardinalityBound ) ) otherlv_15= '..' ( (lv_targetUpperBound_16_0= ruleCardinalityUpperBound ) ) otherlv_17= ']' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==32) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalDsl.g:2845:4: otherlv_13= '[' ( (lv_targetLowerBound_14_0= ruleCardinalityBound ) ) otherlv_15= '..' ( (lv_targetUpperBound_16_0= ruleCardinalityUpperBound ) ) otherlv_17= ']'
                    {
                    otherlv_13=(Token)match(input,32,FOLLOW_22); 

                    				newLeafNode(otherlv_13, grammarAccess.getBinaryMaterialRelationAccess().getLeftSquareBracketKeyword_7_0());
                    			
                    // InternalDsl.g:2849:4: ( (lv_targetLowerBound_14_0= ruleCardinalityBound ) )
                    // InternalDsl.g:2850:5: (lv_targetLowerBound_14_0= ruleCardinalityBound )
                    {
                    // InternalDsl.g:2850:5: (lv_targetLowerBound_14_0= ruleCardinalityBound )
                    // InternalDsl.g:2851:6: lv_targetLowerBound_14_0= ruleCardinalityBound
                    {

                    						newCompositeNode(grammarAccess.getBinaryMaterialRelationAccess().getTargetLowerBoundCardinalityBoundParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_targetLowerBound_14_0=ruleCardinalityBound();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBinaryMaterialRelationRule());
                    						}
                    						set(
                    							current,
                    							"targetLowerBound",
                    							lv_targetLowerBound_14_0,
                    							"br.ufes.inf.ontouml.ontoumlprime.Dsl.CardinalityBound");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_15=(Token)match(input,33,FOLLOW_24); 

                    				newLeafNode(otherlv_15, grammarAccess.getBinaryMaterialRelationAccess().getFullStopFullStopKeyword_7_2());
                    			
                    // InternalDsl.g:2872:4: ( (lv_targetUpperBound_16_0= ruleCardinalityUpperBound ) )
                    // InternalDsl.g:2873:5: (lv_targetUpperBound_16_0= ruleCardinalityUpperBound )
                    {
                    // InternalDsl.g:2873:5: (lv_targetUpperBound_16_0= ruleCardinalityUpperBound )
                    // InternalDsl.g:2874:6: lv_targetUpperBound_16_0= ruleCardinalityUpperBound
                    {

                    						newCompositeNode(grammarAccess.getBinaryMaterialRelationAccess().getTargetUpperBoundCardinalityUpperBoundParserRuleCall_7_3_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_targetUpperBound_16_0=ruleCardinalityUpperBound();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBinaryMaterialRelationRule());
                    						}
                    						set(
                    							current,
                    							"targetUpperBound",
                    							lv_targetUpperBound_16_0,
                    							"br.ufes.inf.ontouml.ontoumlprime.Dsl.CardinalityUpperBound");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_17=(Token)match(input,34,FOLLOW_13); 

                    				newLeafNode(otherlv_17, grammarAccess.getBinaryMaterialRelationAccess().getRightSquareBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_18=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getBinaryMaterialRelationAccess().getSemicolonKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinaryMaterialRelation"


    // $ANTLR start "entryRuleBinaryFormalRelation"
    // InternalDsl.g:2904:1: entryRuleBinaryFormalRelation returns [EObject current=null] : iv_ruleBinaryFormalRelation= ruleBinaryFormalRelation EOF ;
    public final EObject entryRuleBinaryFormalRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryFormalRelation = null;


        try {
            // InternalDsl.g:2904:61: (iv_ruleBinaryFormalRelation= ruleBinaryFormalRelation EOF )
            // InternalDsl.g:2905:2: iv_ruleBinaryFormalRelation= ruleBinaryFormalRelation EOF
            {
             newCompositeNode(grammarAccess.getBinaryFormalRelationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBinaryFormalRelation=ruleBinaryFormalRelation();

            state._fsp--;

             current =iv_ruleBinaryFormalRelation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBinaryFormalRelation"


    // $ANTLR start "ruleBinaryFormalRelation"
    // InternalDsl.g:2911:1: ruleBinaryFormalRelation returns [EObject current=null] : (otherlv_0= 'formal' otherlv_1= 'rel' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '[' ( (lv_sourceLowerBound_4_0= ruleCardinalityBound ) ) otherlv_5= '..' ( (lv_sourceUpperBound_6_0= ruleCardinalityUpperBound ) ) otherlv_7= ']' )? ( (lv_name_8_0= RULE_ID ) ) ( (otherlv_9= RULE_ID ) ) (otherlv_10= '[' ( (lv_targetLowerBound_11_0= ruleCardinalityBound ) ) otherlv_12= '..' ( (lv_targetUpperBound_13_0= ruleCardinalityUpperBound ) ) otherlv_14= ']' )? otherlv_15= ';' ) ;
    public final EObject ruleBinaryFormalRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_name_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_sourceLowerBound_4_0 = null;

        AntlrDatatypeRuleToken lv_sourceUpperBound_6_0 = null;

        AntlrDatatypeRuleToken lv_targetLowerBound_11_0 = null;

        AntlrDatatypeRuleToken lv_targetUpperBound_13_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2917:2: ( (otherlv_0= 'formal' otherlv_1= 'rel' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '[' ( (lv_sourceLowerBound_4_0= ruleCardinalityBound ) ) otherlv_5= '..' ( (lv_sourceUpperBound_6_0= ruleCardinalityUpperBound ) ) otherlv_7= ']' )? ( (lv_name_8_0= RULE_ID ) ) ( (otherlv_9= RULE_ID ) ) (otherlv_10= '[' ( (lv_targetLowerBound_11_0= ruleCardinalityBound ) ) otherlv_12= '..' ( (lv_targetUpperBound_13_0= ruleCardinalityUpperBound ) ) otherlv_14= ']' )? otherlv_15= ';' ) )
            // InternalDsl.g:2918:2: (otherlv_0= 'formal' otherlv_1= 'rel' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '[' ( (lv_sourceLowerBound_4_0= ruleCardinalityBound ) ) otherlv_5= '..' ( (lv_sourceUpperBound_6_0= ruleCardinalityUpperBound ) ) otherlv_7= ']' )? ( (lv_name_8_0= RULE_ID ) ) ( (otherlv_9= RULE_ID ) ) (otherlv_10= '[' ( (lv_targetLowerBound_11_0= ruleCardinalityBound ) ) otherlv_12= '..' ( (lv_targetUpperBound_13_0= ruleCardinalityUpperBound ) ) otherlv_14= ']' )? otherlv_15= ';' )
            {
            // InternalDsl.g:2918:2: (otherlv_0= 'formal' otherlv_1= 'rel' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '[' ( (lv_sourceLowerBound_4_0= ruleCardinalityBound ) ) otherlv_5= '..' ( (lv_sourceUpperBound_6_0= ruleCardinalityUpperBound ) ) otherlv_7= ']' )? ( (lv_name_8_0= RULE_ID ) ) ( (otherlv_9= RULE_ID ) ) (otherlv_10= '[' ( (lv_targetLowerBound_11_0= ruleCardinalityBound ) ) otherlv_12= '..' ( (lv_targetUpperBound_13_0= ruleCardinalityUpperBound ) ) otherlv_14= ']' )? otherlv_15= ';' )
            // InternalDsl.g:2919:3: otherlv_0= 'formal' otherlv_1= 'rel' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '[' ( (lv_sourceLowerBound_4_0= ruleCardinalityBound ) ) otherlv_5= '..' ( (lv_sourceUpperBound_6_0= ruleCardinalityUpperBound ) ) otherlv_7= ']' )? ( (lv_name_8_0= RULE_ID ) ) ( (otherlv_9= RULE_ID ) ) (otherlv_10= '[' ( (lv_targetLowerBound_11_0= ruleCardinalityBound ) ) otherlv_12= '..' ( (lv_targetUpperBound_13_0= ruleCardinalityUpperBound ) ) otherlv_14= ']' )? otherlv_15= ';'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_40); 

            			newLeafNode(otherlv_0, grammarAccess.getBinaryFormalRelationAccess().getFormalKeyword_0());
            		
            otherlv_1=(Token)match(input,51,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getBinaryFormalRelationAccess().getRelKeyword_1());
            		
            // InternalDsl.g:2927:3: ( (otherlv_2= RULE_ID ) )
            // InternalDsl.g:2928:4: (otherlv_2= RULE_ID )
            {
            // InternalDsl.g:2928:4: (otherlv_2= RULE_ID )
            // InternalDsl.g:2929:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBinaryFormalRelationRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_41); 

            					newLeafNode(otherlv_2, grammarAccess.getBinaryFormalRelationAccess().getSourceUniversalCrossReference_2_0());
            				

            }


            }

            // InternalDsl.g:2940:3: (otherlv_3= '[' ( (lv_sourceLowerBound_4_0= ruleCardinalityBound ) ) otherlv_5= '..' ( (lv_sourceUpperBound_6_0= ruleCardinalityUpperBound ) ) otherlv_7= ']' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==32) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalDsl.g:2941:4: otherlv_3= '[' ( (lv_sourceLowerBound_4_0= ruleCardinalityBound ) ) otherlv_5= '..' ( (lv_sourceUpperBound_6_0= ruleCardinalityUpperBound ) ) otherlv_7= ']'
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_22); 

                    				newLeafNode(otherlv_3, grammarAccess.getBinaryFormalRelationAccess().getLeftSquareBracketKeyword_3_0());
                    			
                    // InternalDsl.g:2945:4: ( (lv_sourceLowerBound_4_0= ruleCardinalityBound ) )
                    // InternalDsl.g:2946:5: (lv_sourceLowerBound_4_0= ruleCardinalityBound )
                    {
                    // InternalDsl.g:2946:5: (lv_sourceLowerBound_4_0= ruleCardinalityBound )
                    // InternalDsl.g:2947:6: lv_sourceLowerBound_4_0= ruleCardinalityBound
                    {

                    						newCompositeNode(grammarAccess.getBinaryFormalRelationAccess().getSourceLowerBoundCardinalityBoundParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_sourceLowerBound_4_0=ruleCardinalityBound();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBinaryFormalRelationRule());
                    						}
                    						set(
                    							current,
                    							"sourceLowerBound",
                    							lv_sourceLowerBound_4_0,
                    							"br.ufes.inf.ontouml.ontoumlprime.Dsl.CardinalityBound");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,33,FOLLOW_24); 

                    				newLeafNode(otherlv_5, grammarAccess.getBinaryFormalRelationAccess().getFullStopFullStopKeyword_3_2());
                    			
                    // InternalDsl.g:2968:4: ( (lv_sourceUpperBound_6_0= ruleCardinalityUpperBound ) )
                    // InternalDsl.g:2969:5: (lv_sourceUpperBound_6_0= ruleCardinalityUpperBound )
                    {
                    // InternalDsl.g:2969:5: (lv_sourceUpperBound_6_0= ruleCardinalityUpperBound )
                    // InternalDsl.g:2970:6: lv_sourceUpperBound_6_0= ruleCardinalityUpperBound
                    {

                    						newCompositeNode(grammarAccess.getBinaryFormalRelationAccess().getSourceUpperBoundCardinalityUpperBoundParserRuleCall_3_3_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_sourceUpperBound_6_0=ruleCardinalityUpperBound();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBinaryFormalRelationRule());
                    						}
                    						set(
                    							current,
                    							"sourceUpperBound",
                    							lv_sourceUpperBound_6_0,
                    							"br.ufes.inf.ontouml.ontoumlprime.Dsl.CardinalityUpperBound");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,34,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getBinaryFormalRelationAccess().getRightSquareBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalDsl.g:2992:3: ( (lv_name_8_0= RULE_ID ) )
            // InternalDsl.g:2993:4: (lv_name_8_0= RULE_ID )
            {
            // InternalDsl.g:2993:4: (lv_name_8_0= RULE_ID )
            // InternalDsl.g:2994:5: lv_name_8_0= RULE_ID
            {
            lv_name_8_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_8_0, grammarAccess.getBinaryFormalRelationAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBinaryFormalRelationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_8_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDsl.g:3010:3: ( (otherlv_9= RULE_ID ) )
            // InternalDsl.g:3011:4: (otherlv_9= RULE_ID )
            {
            // InternalDsl.g:3011:4: (otherlv_9= RULE_ID )
            // InternalDsl.g:3012:5: otherlv_9= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBinaryFormalRelationRule());
            					}
            				
            otherlv_9=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(otherlv_9, grammarAccess.getBinaryFormalRelationAccess().getTargetUniversalCrossReference_5_0());
            				

            }


            }

            // InternalDsl.g:3023:3: (otherlv_10= '[' ( (lv_targetLowerBound_11_0= ruleCardinalityBound ) ) otherlv_12= '..' ( (lv_targetUpperBound_13_0= ruleCardinalityUpperBound ) ) otherlv_14= ']' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==32) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalDsl.g:3024:4: otherlv_10= '[' ( (lv_targetLowerBound_11_0= ruleCardinalityBound ) ) otherlv_12= '..' ( (lv_targetUpperBound_13_0= ruleCardinalityUpperBound ) ) otherlv_14= ']'
                    {
                    otherlv_10=(Token)match(input,32,FOLLOW_22); 

                    				newLeafNode(otherlv_10, grammarAccess.getBinaryFormalRelationAccess().getLeftSquareBracketKeyword_6_0());
                    			
                    // InternalDsl.g:3028:4: ( (lv_targetLowerBound_11_0= ruleCardinalityBound ) )
                    // InternalDsl.g:3029:5: (lv_targetLowerBound_11_0= ruleCardinalityBound )
                    {
                    // InternalDsl.g:3029:5: (lv_targetLowerBound_11_0= ruleCardinalityBound )
                    // InternalDsl.g:3030:6: lv_targetLowerBound_11_0= ruleCardinalityBound
                    {

                    						newCompositeNode(grammarAccess.getBinaryFormalRelationAccess().getTargetLowerBoundCardinalityBoundParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_targetLowerBound_11_0=ruleCardinalityBound();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBinaryFormalRelationRule());
                    						}
                    						set(
                    							current,
                    							"targetLowerBound",
                    							lv_targetLowerBound_11_0,
                    							"br.ufes.inf.ontouml.ontoumlprime.Dsl.CardinalityBound");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_12=(Token)match(input,33,FOLLOW_24); 

                    				newLeafNode(otherlv_12, grammarAccess.getBinaryFormalRelationAccess().getFullStopFullStopKeyword_6_2());
                    			
                    // InternalDsl.g:3051:4: ( (lv_targetUpperBound_13_0= ruleCardinalityUpperBound ) )
                    // InternalDsl.g:3052:5: (lv_targetUpperBound_13_0= ruleCardinalityUpperBound )
                    {
                    // InternalDsl.g:3052:5: (lv_targetUpperBound_13_0= ruleCardinalityUpperBound )
                    // InternalDsl.g:3053:6: lv_targetUpperBound_13_0= ruleCardinalityUpperBound
                    {

                    						newCompositeNode(grammarAccess.getBinaryFormalRelationAccess().getTargetUpperBoundCardinalityUpperBoundParserRuleCall_6_3_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_targetUpperBound_13_0=ruleCardinalityUpperBound();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBinaryFormalRelationRule());
                    						}
                    						set(
                    							current,
                    							"targetUpperBound",
                    							lv_targetUpperBound_13_0,
                    							"br.ufes.inf.ontouml.ontoumlprime.Dsl.CardinalityUpperBound");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_14=(Token)match(input,34,FOLLOW_13); 

                    				newLeafNode(otherlv_14, grammarAccess.getBinaryFormalRelationAccess().getRightSquareBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getBinaryFormalRelationAccess().getSemicolonKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinaryFormalRelation"


    // $ANTLR start "entryRuleModeUniversal"
    // InternalDsl.g:3083:1: entryRuleModeUniversal returns [EObject current=null] : iv_ruleModeUniversal= ruleModeUniversal EOF ;
    public final EObject entryRuleModeUniversal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModeUniversal = null;


        try {
            // InternalDsl.g:3083:54: (iv_ruleModeUniversal= ruleModeUniversal EOF )
            // InternalDsl.g:3084:2: iv_ruleModeUniversal= ruleModeUniversal EOF
            {
             newCompositeNode(grammarAccess.getModeUniversalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModeUniversal=ruleModeUniversal();

            state._fsp--;

             current =iv_ruleModeUniversal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModeUniversal"


    // $ANTLR start "ruleModeUniversal"
    // InternalDsl.g:3090:1: ruleModeUniversal returns [EObject current=null] : (otherlv_0= 'ModeUniversal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_characterizedBy_3_0= ruleCharacterization ) )* otherlv_4= '}' ) ;
    public final EObject ruleModeUniversal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_characterizedBy_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:3096:2: ( (otherlv_0= 'ModeUniversal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_characterizedBy_3_0= ruleCharacterization ) )* otherlv_4= '}' ) )
            // InternalDsl.g:3097:2: (otherlv_0= 'ModeUniversal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_characterizedBy_3_0= ruleCharacterization ) )* otherlv_4= '}' )
            {
            // InternalDsl.g:3097:2: (otherlv_0= 'ModeUniversal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_characterizedBy_3_0= ruleCharacterization ) )* otherlv_4= '}' )
            // InternalDsl.g:3098:3: otherlv_0= 'ModeUniversal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_characterizedBy_3_0= ruleCharacterization ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getModeUniversalAccess().getModeUniversalKeyword_0());
            		
            // InternalDsl.g:3102:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:3103:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:3103:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:3104:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getModeUniversalAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModeUniversalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_35); 

            			newLeafNode(otherlv_2, grammarAccess.getModeUniversalAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:3124:3: ( (lv_characterizedBy_3_0= ruleCharacterization ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==32||LA40_0==58) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalDsl.g:3125:4: (lv_characterizedBy_3_0= ruleCharacterization )
            	    {
            	    // InternalDsl.g:3125:4: (lv_characterizedBy_3_0= ruleCharacterization )
            	    // InternalDsl.g:3126:5: lv_characterizedBy_3_0= ruleCharacterization
            	    {

            	    					newCompositeNode(grammarAccess.getModeUniversalAccess().getCharacterizedByCharacterizationParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_35);
            	    lv_characterizedBy_3_0=ruleCharacterization();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModeUniversalRule());
            	    					}
            	    					add(
            	    						current,
            	    						"characterizedBy",
            	    						lv_characterizedBy_3_0,
            	    						"br.ufes.inf.ontouml.ontoumlprime.Dsl.Characterization");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getModeUniversalAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModeUniversal"


    // $ANTLR start "entryRuleQualityUniversal"
    // InternalDsl.g:3151:1: entryRuleQualityUniversal returns [EObject current=null] : iv_ruleQualityUniversal= ruleQualityUniversal EOF ;
    public final EObject entryRuleQualityUniversal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualityUniversal = null;


        try {
            // InternalDsl.g:3151:57: (iv_ruleQualityUniversal= ruleQualityUniversal EOF )
            // InternalDsl.g:3152:2: iv_ruleQualityUniversal= ruleQualityUniversal EOF
            {
             newCompositeNode(grammarAccess.getQualityUniversalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualityUniversal=ruleQualityUniversal();

            state._fsp--;

             current =iv_ruleQualityUniversal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualityUniversal"


    // $ANTLR start "ruleQualityUniversal"
    // InternalDsl.g:3158:1: ruleQualityUniversal returns [EObject current=null] : (otherlv_0= 'QualityUniversal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'characterizes' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'datatypes' otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ( (lv_characterizedBy_11_0= ruleCharacterization ) )* otherlv_12= '}' ) ;
    public final EObject ruleQualityUniversal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_characterizedBy_11_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:3164:2: ( (otherlv_0= 'QualityUniversal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'characterizes' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'datatypes' otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ( (lv_characterizedBy_11_0= ruleCharacterization ) )* otherlv_12= '}' ) )
            // InternalDsl.g:3165:2: (otherlv_0= 'QualityUniversal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'characterizes' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'datatypes' otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ( (lv_characterizedBy_11_0= ruleCharacterization ) )* otherlv_12= '}' )
            {
            // InternalDsl.g:3165:2: (otherlv_0= 'QualityUniversal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'characterizes' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'datatypes' otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ( (lv_characterizedBy_11_0= ruleCharacterization ) )* otherlv_12= '}' )
            // InternalDsl.g:3166:3: otherlv_0= 'QualityUniversal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'characterizes' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'datatypes' otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ( (lv_characterizedBy_11_0= ruleCharacterization ) )* otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getQualityUniversalAccess().getQualityUniversalKeyword_0());
            		
            // InternalDsl.g:3170:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:3171:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:3171:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:3172:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_43); 

            					newLeafNode(lv_name_1_0, grammarAccess.getQualityUniversalAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQualityUniversalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,55,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getQualityUniversalAccess().getCharacterizesKeyword_2());
            		
            // InternalDsl.g:3192:3: ( (otherlv_3= RULE_ID ) )
            // InternalDsl.g:3193:4: (otherlv_3= RULE_ID )
            {
            // InternalDsl.g:3193:4: (otherlv_3= RULE_ID )
            // InternalDsl.g:3194:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQualityUniversalRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(otherlv_3, grammarAccess.getQualityUniversalAccess().getCharacterizationCharacterizationCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_44); 

            			newLeafNode(otherlv_4, grammarAccess.getQualityUniversalAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalDsl.g:3209:3: (otherlv_5= 'datatypes' otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==56) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalDsl.g:3210:4: otherlv_5= 'datatypes' otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,56,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getQualityUniversalAccess().getDatatypesKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,23,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getQualityUniversalAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalDsl.g:3218:4: ( (otherlv_7= RULE_ID ) )
                    // InternalDsl.g:3219:5: (otherlv_7= RULE_ID )
                    {
                    // InternalDsl.g:3219:5: (otherlv_7= RULE_ID )
                    // InternalDsl.g:3220:6: otherlv_7= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getQualityUniversalRule());
                    						}
                    					
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_45); 

                    						newLeafNode(otherlv_7, grammarAccess.getQualityUniversalAccess().getDatatypesDataTypeCrossReference_5_2_0());
                    					

                    }


                    }

                    // InternalDsl.g:3231:4: (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==18) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalDsl.g:3232:5: otherlv_8= ',' ( (otherlv_9= RULE_ID ) )
                    	    {
                    	    otherlv_8=(Token)match(input,18,FOLLOW_4); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getQualityUniversalAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalDsl.g:3236:5: ( (otherlv_9= RULE_ID ) )
                    	    // InternalDsl.g:3237:6: (otherlv_9= RULE_ID )
                    	    {
                    	    // InternalDsl.g:3237:6: (otherlv_9= RULE_ID )
                    	    // InternalDsl.g:3238:7: otherlv_9= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getQualityUniversalRule());
                    	    							}
                    	    						
                    	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_45); 

                    	    							newLeafNode(otherlv_9, grammarAccess.getQualityUniversalAccess().getDatatypesDataTypeCrossReference_5_3_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,24,FOLLOW_35); 

                    				newLeafNode(otherlv_10, grammarAccess.getQualityUniversalAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalDsl.g:3255:3: ( (lv_characterizedBy_11_0= ruleCharacterization ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==32||LA43_0==58) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalDsl.g:3256:4: (lv_characterizedBy_11_0= ruleCharacterization )
            	    {
            	    // InternalDsl.g:3256:4: (lv_characterizedBy_11_0= ruleCharacterization )
            	    // InternalDsl.g:3257:5: lv_characterizedBy_11_0= ruleCharacterization
            	    {

            	    					newCompositeNode(grammarAccess.getQualityUniversalAccess().getCharacterizedByCharacterizationParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_35);
            	    lv_characterizedBy_11_0=ruleCharacterization();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getQualityUniversalRule());
            	    					}
            	    					add(
            	    						current,
            	    						"characterizedBy",
            	    						lv_characterizedBy_11_0,
            	    						"br.ufes.inf.ontouml.ontoumlprime.Dsl.Characterization");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            otherlv_12=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getQualityUniversalAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualityUniversal"


    // $ANTLR start "entryRulenAryMaterialRelation"
    // InternalDsl.g:3282:1: entryRulenAryMaterialRelation returns [EObject current=null] : iv_rulenAryMaterialRelation= rulenAryMaterialRelation EOF ;
    public final EObject entryRulenAryMaterialRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenAryMaterialRelation = null;


        try {
            // InternalDsl.g:3282:61: (iv_rulenAryMaterialRelation= rulenAryMaterialRelation EOF )
            // InternalDsl.g:3283:2: iv_rulenAryMaterialRelation= rulenAryMaterialRelation EOF
            {
             newCompositeNode(grammarAccess.getNAryMaterialRelationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulenAryMaterialRelation=rulenAryMaterialRelation();

            state._fsp--;

             current =iv_rulenAryMaterialRelation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulenAryMaterialRelation"


    // $ANTLR start "rulenAryMaterialRelation"
    // InternalDsl.g:3289:1: rulenAryMaterialRelation returns [EObject current=null] : (otherlv_0= 'material' otherlv_1= 'assoc' ( (otherlv_2= RULE_ID ) ) ( (lv_name_3_0= RULE_ID ) ) ( ( (otherlv_4= RULE_ID ) ) (otherlv_5= '[' ( (lv_sourceLowerBound_6_0= ruleCardinalityBound ) ) otherlv_7= '..' ( (lv_sourceUpperBound_8_0= ruleCardinalityUpperBound ) ) otherlv_9= ']' ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* (otherlv_12= '[' ( (lv_sourceLowerBound_13_0= ruleCardinalityBound ) ) otherlv_14= '..' ( (lv_sourceUpperBound_15_0= ruleCardinalityUpperBound ) ) otherlv_16= ']' ) )? otherlv_17= ';' ) ;
    public final EObject rulenAryMaterialRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_sourceLowerBound_6_0 = null;

        AntlrDatatypeRuleToken lv_sourceUpperBound_8_0 = null;

        AntlrDatatypeRuleToken lv_sourceLowerBound_13_0 = null;

        AntlrDatatypeRuleToken lv_sourceUpperBound_15_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:3295:2: ( (otherlv_0= 'material' otherlv_1= 'assoc' ( (otherlv_2= RULE_ID ) ) ( (lv_name_3_0= RULE_ID ) ) ( ( (otherlv_4= RULE_ID ) ) (otherlv_5= '[' ( (lv_sourceLowerBound_6_0= ruleCardinalityBound ) ) otherlv_7= '..' ( (lv_sourceUpperBound_8_0= ruleCardinalityUpperBound ) ) otherlv_9= ']' ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* (otherlv_12= '[' ( (lv_sourceLowerBound_13_0= ruleCardinalityBound ) ) otherlv_14= '..' ( (lv_sourceUpperBound_15_0= ruleCardinalityUpperBound ) ) otherlv_16= ']' ) )? otherlv_17= ';' ) )
            // InternalDsl.g:3296:2: (otherlv_0= 'material' otherlv_1= 'assoc' ( (otherlv_2= RULE_ID ) ) ( (lv_name_3_0= RULE_ID ) ) ( ( (otherlv_4= RULE_ID ) ) (otherlv_5= '[' ( (lv_sourceLowerBound_6_0= ruleCardinalityBound ) ) otherlv_7= '..' ( (lv_sourceUpperBound_8_0= ruleCardinalityUpperBound ) ) otherlv_9= ']' ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* (otherlv_12= '[' ( (lv_sourceLowerBound_13_0= ruleCardinalityBound ) ) otherlv_14= '..' ( (lv_sourceUpperBound_15_0= ruleCardinalityUpperBound ) ) otherlv_16= ']' ) )? otherlv_17= ';' )
            {
            // InternalDsl.g:3296:2: (otherlv_0= 'material' otherlv_1= 'assoc' ( (otherlv_2= RULE_ID ) ) ( (lv_name_3_0= RULE_ID ) ) ( ( (otherlv_4= RULE_ID ) ) (otherlv_5= '[' ( (lv_sourceLowerBound_6_0= ruleCardinalityBound ) ) otherlv_7= '..' ( (lv_sourceUpperBound_8_0= ruleCardinalityUpperBound ) ) otherlv_9= ']' ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* (otherlv_12= '[' ( (lv_sourceLowerBound_13_0= ruleCardinalityBound ) ) otherlv_14= '..' ( (lv_sourceUpperBound_15_0= ruleCardinalityUpperBound ) ) otherlv_16= ']' ) )? otherlv_17= ';' )
            // InternalDsl.g:3297:3: otherlv_0= 'material' otherlv_1= 'assoc' ( (otherlv_2= RULE_ID ) ) ( (lv_name_3_0= RULE_ID ) ) ( ( (otherlv_4= RULE_ID ) ) (otherlv_5= '[' ( (lv_sourceLowerBound_6_0= ruleCardinalityBound ) ) otherlv_7= '..' ( (lv_sourceUpperBound_8_0= ruleCardinalityUpperBound ) ) otherlv_9= ']' ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* (otherlv_12= '[' ( (lv_sourceLowerBound_13_0= ruleCardinalityBound ) ) otherlv_14= '..' ( (lv_sourceUpperBound_15_0= ruleCardinalityUpperBound ) ) otherlv_16= ']' ) )? otherlv_17= ';'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_46); 

            			newLeafNode(otherlv_0, grammarAccess.getNAryMaterialRelationAccess().getMaterialKeyword_0());
            		
            otherlv_1=(Token)match(input,57,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getNAryMaterialRelationAccess().getAssocKeyword_1());
            		
            // InternalDsl.g:3305:3: ( (otherlv_2= RULE_ID ) )
            // InternalDsl.g:3306:4: (otherlv_2= RULE_ID )
            {
            // InternalDsl.g:3306:4: (otherlv_2= RULE_ID )
            // InternalDsl.g:3307:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNAryMaterialRelationRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(otherlv_2, grammarAccess.getNAryMaterialRelationAccess().getDerivedFromRelatorUniversalCrossReference_2_0());
            				

            }


            }

            // InternalDsl.g:3318:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalDsl.g:3319:4: (lv_name_3_0= RULE_ID )
            {
            // InternalDsl.g:3319:4: (lv_name_3_0= RULE_ID )
            // InternalDsl.g:3320:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_47); 

            					newLeafNode(lv_name_3_0, grammarAccess.getNAryMaterialRelationAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNAryMaterialRelationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDsl.g:3336:3: ( ( (otherlv_4= RULE_ID ) ) (otherlv_5= '[' ( (lv_sourceLowerBound_6_0= ruleCardinalityBound ) ) otherlv_7= '..' ( (lv_sourceUpperBound_8_0= ruleCardinalityUpperBound ) ) otherlv_9= ']' ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* (otherlv_12= '[' ( (lv_sourceLowerBound_13_0= ruleCardinalityBound ) ) otherlv_14= '..' ( (lv_sourceUpperBound_15_0= ruleCardinalityUpperBound ) ) otherlv_16= ']' ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_ID) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalDsl.g:3337:4: ( (otherlv_4= RULE_ID ) ) (otherlv_5= '[' ( (lv_sourceLowerBound_6_0= ruleCardinalityBound ) ) otherlv_7= '..' ( (lv_sourceUpperBound_8_0= ruleCardinalityUpperBound ) ) otherlv_9= ']' ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* (otherlv_12= '[' ( (lv_sourceLowerBound_13_0= ruleCardinalityBound ) ) otherlv_14= '..' ( (lv_sourceUpperBound_15_0= ruleCardinalityUpperBound ) ) otherlv_16= ']' )
                    {
                    // InternalDsl.g:3337:4: ( (otherlv_4= RULE_ID ) )
                    // InternalDsl.g:3338:5: (otherlv_4= RULE_ID )
                    {
                    // InternalDsl.g:3338:5: (otherlv_4= RULE_ID )
                    // InternalDsl.g:3339:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNAryMaterialRelationRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_48); 

                    						newLeafNode(otherlv_4, grammarAccess.getNAryMaterialRelationAccess().getTargetRelataExternallyDependentUniversalCrossReference_4_0_0());
                    					

                    }


                    }

                    // InternalDsl.g:3350:4: (otherlv_5= '[' ( (lv_sourceLowerBound_6_0= ruleCardinalityBound ) ) otherlv_7= '..' ( (lv_sourceUpperBound_8_0= ruleCardinalityUpperBound ) ) otherlv_9= ']' )
                    // InternalDsl.g:3351:5: otherlv_5= '[' ( (lv_sourceLowerBound_6_0= ruleCardinalityBound ) ) otherlv_7= '..' ( (lv_sourceUpperBound_8_0= ruleCardinalityUpperBound ) ) otherlv_9= ']'
                    {
                    otherlv_5=(Token)match(input,32,FOLLOW_22); 

                    					newLeafNode(otherlv_5, grammarAccess.getNAryMaterialRelationAccess().getLeftSquareBracketKeyword_4_1_0());
                    				
                    // InternalDsl.g:3355:5: ( (lv_sourceLowerBound_6_0= ruleCardinalityBound ) )
                    // InternalDsl.g:3356:6: (lv_sourceLowerBound_6_0= ruleCardinalityBound )
                    {
                    // InternalDsl.g:3356:6: (lv_sourceLowerBound_6_0= ruleCardinalityBound )
                    // InternalDsl.g:3357:7: lv_sourceLowerBound_6_0= ruleCardinalityBound
                    {

                    							newCompositeNode(grammarAccess.getNAryMaterialRelationAccess().getSourceLowerBoundCardinalityBoundParserRuleCall_4_1_1_0());
                    						
                    pushFollow(FOLLOW_23);
                    lv_sourceLowerBound_6_0=ruleCardinalityBound();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getNAryMaterialRelationRule());
                    							}
                    							add(
                    								current,
                    								"sourceLowerBound",
                    								lv_sourceLowerBound_6_0,
                    								"br.ufes.inf.ontouml.ontoumlprime.Dsl.CardinalityBound");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_7=(Token)match(input,33,FOLLOW_24); 

                    					newLeafNode(otherlv_7, grammarAccess.getNAryMaterialRelationAccess().getFullStopFullStopKeyword_4_1_2());
                    				
                    // InternalDsl.g:3378:5: ( (lv_sourceUpperBound_8_0= ruleCardinalityUpperBound ) )
                    // InternalDsl.g:3379:6: (lv_sourceUpperBound_8_0= ruleCardinalityUpperBound )
                    {
                    // InternalDsl.g:3379:6: (lv_sourceUpperBound_8_0= ruleCardinalityUpperBound )
                    // InternalDsl.g:3380:7: lv_sourceUpperBound_8_0= ruleCardinalityUpperBound
                    {

                    							newCompositeNode(grammarAccess.getNAryMaterialRelationAccess().getSourceUpperBoundCardinalityUpperBoundParserRuleCall_4_1_3_0());
                    						
                    pushFollow(FOLLOW_25);
                    lv_sourceUpperBound_8_0=ruleCardinalityUpperBound();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getNAryMaterialRelationRule());
                    							}
                    							add(
                    								current,
                    								"sourceUpperBound",
                    								lv_sourceUpperBound_8_0,
                    								"br.ufes.inf.ontouml.ontoumlprime.Dsl.CardinalityUpperBound");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_9=(Token)match(input,34,FOLLOW_49); 

                    					newLeafNode(otherlv_9, grammarAccess.getNAryMaterialRelationAccess().getRightSquareBracketKeyword_4_1_4());
                    				

                    }

                    // InternalDsl.g:3402:4: (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==18) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // InternalDsl.g:3403:5: otherlv_10= ',' ( (otherlv_11= RULE_ID ) )
                    	    {
                    	    otherlv_10=(Token)match(input,18,FOLLOW_4); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getNAryMaterialRelationAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalDsl.g:3407:5: ( (otherlv_11= RULE_ID ) )
                    	    // InternalDsl.g:3408:6: (otherlv_11= RULE_ID )
                    	    {
                    	    // InternalDsl.g:3408:6: (otherlv_11= RULE_ID )
                    	    // InternalDsl.g:3409:7: otherlv_11= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getNAryMaterialRelationRule());
                    	    							}
                    	    						
                    	    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_49); 

                    	    							newLeafNode(otherlv_11, grammarAccess.getNAryMaterialRelationAccess().getTargetRelataExternallyDependentUniversalCrossReference_4_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);

                    // InternalDsl.g:3421:4: (otherlv_12= '[' ( (lv_sourceLowerBound_13_0= ruleCardinalityBound ) ) otherlv_14= '..' ( (lv_sourceUpperBound_15_0= ruleCardinalityUpperBound ) ) otherlv_16= ']' )
                    // InternalDsl.g:3422:5: otherlv_12= '[' ( (lv_sourceLowerBound_13_0= ruleCardinalityBound ) ) otherlv_14= '..' ( (lv_sourceUpperBound_15_0= ruleCardinalityUpperBound ) ) otherlv_16= ']'
                    {
                    otherlv_12=(Token)match(input,32,FOLLOW_22); 

                    					newLeafNode(otherlv_12, grammarAccess.getNAryMaterialRelationAccess().getLeftSquareBracketKeyword_4_3_0());
                    				
                    // InternalDsl.g:3426:5: ( (lv_sourceLowerBound_13_0= ruleCardinalityBound ) )
                    // InternalDsl.g:3427:6: (lv_sourceLowerBound_13_0= ruleCardinalityBound )
                    {
                    // InternalDsl.g:3427:6: (lv_sourceLowerBound_13_0= ruleCardinalityBound )
                    // InternalDsl.g:3428:7: lv_sourceLowerBound_13_0= ruleCardinalityBound
                    {

                    							newCompositeNode(grammarAccess.getNAryMaterialRelationAccess().getSourceLowerBoundCardinalityBoundParserRuleCall_4_3_1_0());
                    						
                    pushFollow(FOLLOW_23);
                    lv_sourceLowerBound_13_0=ruleCardinalityBound();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getNAryMaterialRelationRule());
                    							}
                    							add(
                    								current,
                    								"sourceLowerBound",
                    								lv_sourceLowerBound_13_0,
                    								"br.ufes.inf.ontouml.ontoumlprime.Dsl.CardinalityBound");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_14=(Token)match(input,33,FOLLOW_24); 

                    					newLeafNode(otherlv_14, grammarAccess.getNAryMaterialRelationAccess().getFullStopFullStopKeyword_4_3_2());
                    				
                    // InternalDsl.g:3449:5: ( (lv_sourceUpperBound_15_0= ruleCardinalityUpperBound ) )
                    // InternalDsl.g:3450:6: (lv_sourceUpperBound_15_0= ruleCardinalityUpperBound )
                    {
                    // InternalDsl.g:3450:6: (lv_sourceUpperBound_15_0= ruleCardinalityUpperBound )
                    // InternalDsl.g:3451:7: lv_sourceUpperBound_15_0= ruleCardinalityUpperBound
                    {

                    							newCompositeNode(grammarAccess.getNAryMaterialRelationAccess().getSourceUpperBoundCardinalityUpperBoundParserRuleCall_4_3_3_0());
                    						
                    pushFollow(FOLLOW_25);
                    lv_sourceUpperBound_15_0=ruleCardinalityUpperBound();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getNAryMaterialRelationRule());
                    							}
                    							add(
                    								current,
                    								"sourceUpperBound",
                    								lv_sourceUpperBound_15_0,
                    								"br.ufes.inf.ontouml.ontoumlprime.Dsl.CardinalityUpperBound");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_16=(Token)match(input,34,FOLLOW_13); 

                    					newLeafNode(otherlv_16, grammarAccess.getNAryMaterialRelationAccess().getRightSquareBracketKeyword_4_3_4());
                    				

                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getNAryMaterialRelationAccess().getSemicolonKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulenAryMaterialRelation"


    // $ANTLR start "entryRulenAryFormalRelation"
    // InternalDsl.g:3482:1: entryRulenAryFormalRelation returns [EObject current=null] : iv_rulenAryFormalRelation= rulenAryFormalRelation EOF ;
    public final EObject entryRulenAryFormalRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenAryFormalRelation = null;


        try {
            // InternalDsl.g:3482:59: (iv_rulenAryFormalRelation= rulenAryFormalRelation EOF )
            // InternalDsl.g:3483:2: iv_rulenAryFormalRelation= rulenAryFormalRelation EOF
            {
             newCompositeNode(grammarAccess.getNAryFormalRelationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulenAryFormalRelation=rulenAryFormalRelation();

            state._fsp--;

             current =iv_rulenAryFormalRelation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulenAryFormalRelation"


    // $ANTLR start "rulenAryFormalRelation"
    // InternalDsl.g:3489:1: rulenAryFormalRelation returns [EObject current=null] : (otherlv_0= 'formal' otherlv_1= 'assoc' ( (lv_name_2_0= RULE_ID ) ) ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '[' ( (lv_sourceLowerBound_5_0= ruleCardinalityBound ) ) otherlv_6= '..' ( (lv_sourceUpperBound_7_0= ruleCardinalityUpperBound ) ) otherlv_8= ']' ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* (otherlv_11= '[' ( (lv_sourceLowerBound_12_0= ruleCardinalityBound ) ) otherlv_13= '..' ( (lv_sourceUpperBound_14_0= ruleCardinalityUpperBound ) ) otherlv_15= ']' ) )? otherlv_16= ';' ) ;
    public final EObject rulenAryFormalRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_sourceLowerBound_5_0 = null;

        AntlrDatatypeRuleToken lv_sourceUpperBound_7_0 = null;

        AntlrDatatypeRuleToken lv_sourceLowerBound_12_0 = null;

        AntlrDatatypeRuleToken lv_sourceUpperBound_14_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:3495:2: ( (otherlv_0= 'formal' otherlv_1= 'assoc' ( (lv_name_2_0= RULE_ID ) ) ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '[' ( (lv_sourceLowerBound_5_0= ruleCardinalityBound ) ) otherlv_6= '..' ( (lv_sourceUpperBound_7_0= ruleCardinalityUpperBound ) ) otherlv_8= ']' ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* (otherlv_11= '[' ( (lv_sourceLowerBound_12_0= ruleCardinalityBound ) ) otherlv_13= '..' ( (lv_sourceUpperBound_14_0= ruleCardinalityUpperBound ) ) otherlv_15= ']' ) )? otherlv_16= ';' ) )
            // InternalDsl.g:3496:2: (otherlv_0= 'formal' otherlv_1= 'assoc' ( (lv_name_2_0= RULE_ID ) ) ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '[' ( (lv_sourceLowerBound_5_0= ruleCardinalityBound ) ) otherlv_6= '..' ( (lv_sourceUpperBound_7_0= ruleCardinalityUpperBound ) ) otherlv_8= ']' ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* (otherlv_11= '[' ( (lv_sourceLowerBound_12_0= ruleCardinalityBound ) ) otherlv_13= '..' ( (lv_sourceUpperBound_14_0= ruleCardinalityUpperBound ) ) otherlv_15= ']' ) )? otherlv_16= ';' )
            {
            // InternalDsl.g:3496:2: (otherlv_0= 'formal' otherlv_1= 'assoc' ( (lv_name_2_0= RULE_ID ) ) ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '[' ( (lv_sourceLowerBound_5_0= ruleCardinalityBound ) ) otherlv_6= '..' ( (lv_sourceUpperBound_7_0= ruleCardinalityUpperBound ) ) otherlv_8= ']' ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* (otherlv_11= '[' ( (lv_sourceLowerBound_12_0= ruleCardinalityBound ) ) otherlv_13= '..' ( (lv_sourceUpperBound_14_0= ruleCardinalityUpperBound ) ) otherlv_15= ']' ) )? otherlv_16= ';' )
            // InternalDsl.g:3497:3: otherlv_0= 'formal' otherlv_1= 'assoc' ( (lv_name_2_0= RULE_ID ) ) ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '[' ( (lv_sourceLowerBound_5_0= ruleCardinalityBound ) ) otherlv_6= '..' ( (lv_sourceUpperBound_7_0= ruleCardinalityUpperBound ) ) otherlv_8= ']' ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* (otherlv_11= '[' ( (lv_sourceLowerBound_12_0= ruleCardinalityBound ) ) otherlv_13= '..' ( (lv_sourceUpperBound_14_0= ruleCardinalityUpperBound ) ) otherlv_15= ']' ) )? otherlv_16= ';'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_46); 

            			newLeafNode(otherlv_0, grammarAccess.getNAryFormalRelationAccess().getFormalKeyword_0());
            		
            otherlv_1=(Token)match(input,57,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getNAryFormalRelationAccess().getAssocKeyword_1());
            		
            // InternalDsl.g:3505:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDsl.g:3506:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDsl.g:3506:4: (lv_name_2_0= RULE_ID )
            // InternalDsl.g:3507:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_47); 

            					newLeafNode(lv_name_2_0, grammarAccess.getNAryFormalRelationAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNAryFormalRelationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDsl.g:3523:3: ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '[' ( (lv_sourceLowerBound_5_0= ruleCardinalityBound ) ) otherlv_6= '..' ( (lv_sourceUpperBound_7_0= ruleCardinalityUpperBound ) ) otherlv_8= ']' ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* (otherlv_11= '[' ( (lv_sourceLowerBound_12_0= ruleCardinalityBound ) ) otherlv_13= '..' ( (lv_sourceUpperBound_14_0= ruleCardinalityUpperBound ) ) otherlv_15= ']' ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_ID) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalDsl.g:3524:4: ( (otherlv_3= RULE_ID ) ) (otherlv_4= '[' ( (lv_sourceLowerBound_5_0= ruleCardinalityBound ) ) otherlv_6= '..' ( (lv_sourceUpperBound_7_0= ruleCardinalityUpperBound ) ) otherlv_8= ']' ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* (otherlv_11= '[' ( (lv_sourceLowerBound_12_0= ruleCardinalityBound ) ) otherlv_13= '..' ( (lv_sourceUpperBound_14_0= ruleCardinalityUpperBound ) ) otherlv_15= ']' )
                    {
                    // InternalDsl.g:3524:4: ( (otherlv_3= RULE_ID ) )
                    // InternalDsl.g:3525:5: (otherlv_3= RULE_ID )
                    {
                    // InternalDsl.g:3525:5: (otherlv_3= RULE_ID )
                    // InternalDsl.g:3526:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNAryFormalRelationRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_48); 

                    						newLeafNode(otherlv_3, grammarAccess.getNAryFormalRelationAccess().getTargetRelataUniversalCrossReference_3_0_0());
                    					

                    }


                    }

                    // InternalDsl.g:3537:4: (otherlv_4= '[' ( (lv_sourceLowerBound_5_0= ruleCardinalityBound ) ) otherlv_6= '..' ( (lv_sourceUpperBound_7_0= ruleCardinalityUpperBound ) ) otherlv_8= ']' )
                    // InternalDsl.g:3538:5: otherlv_4= '[' ( (lv_sourceLowerBound_5_0= ruleCardinalityBound ) ) otherlv_6= '..' ( (lv_sourceUpperBound_7_0= ruleCardinalityUpperBound ) ) otherlv_8= ']'
                    {
                    otherlv_4=(Token)match(input,32,FOLLOW_22); 

                    					newLeafNode(otherlv_4, grammarAccess.getNAryFormalRelationAccess().getLeftSquareBracketKeyword_3_1_0());
                    				
                    // InternalDsl.g:3542:5: ( (lv_sourceLowerBound_5_0= ruleCardinalityBound ) )
                    // InternalDsl.g:3543:6: (lv_sourceLowerBound_5_0= ruleCardinalityBound )
                    {
                    // InternalDsl.g:3543:6: (lv_sourceLowerBound_5_0= ruleCardinalityBound )
                    // InternalDsl.g:3544:7: lv_sourceLowerBound_5_0= ruleCardinalityBound
                    {

                    							newCompositeNode(grammarAccess.getNAryFormalRelationAccess().getSourceLowerBoundCardinalityBoundParserRuleCall_3_1_1_0());
                    						
                    pushFollow(FOLLOW_23);
                    lv_sourceLowerBound_5_0=ruleCardinalityBound();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getNAryFormalRelationRule());
                    							}
                    							add(
                    								current,
                    								"sourceLowerBound",
                    								lv_sourceLowerBound_5_0,
                    								"br.ufes.inf.ontouml.ontoumlprime.Dsl.CardinalityBound");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_6=(Token)match(input,33,FOLLOW_24); 

                    					newLeafNode(otherlv_6, grammarAccess.getNAryFormalRelationAccess().getFullStopFullStopKeyword_3_1_2());
                    				
                    // InternalDsl.g:3565:5: ( (lv_sourceUpperBound_7_0= ruleCardinalityUpperBound ) )
                    // InternalDsl.g:3566:6: (lv_sourceUpperBound_7_0= ruleCardinalityUpperBound )
                    {
                    // InternalDsl.g:3566:6: (lv_sourceUpperBound_7_0= ruleCardinalityUpperBound )
                    // InternalDsl.g:3567:7: lv_sourceUpperBound_7_0= ruleCardinalityUpperBound
                    {

                    							newCompositeNode(grammarAccess.getNAryFormalRelationAccess().getSourceUpperBoundCardinalityUpperBoundParserRuleCall_3_1_3_0());
                    						
                    pushFollow(FOLLOW_25);
                    lv_sourceUpperBound_7_0=ruleCardinalityUpperBound();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getNAryFormalRelationRule());
                    							}
                    							add(
                    								current,
                    								"sourceUpperBound",
                    								lv_sourceUpperBound_7_0,
                    								"br.ufes.inf.ontouml.ontoumlprime.Dsl.CardinalityUpperBound");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_8=(Token)match(input,34,FOLLOW_49); 

                    					newLeafNode(otherlv_8, grammarAccess.getNAryFormalRelationAccess().getRightSquareBracketKeyword_3_1_4());
                    				

                    }

                    // InternalDsl.g:3589:4: (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==18) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // InternalDsl.g:3590:5: otherlv_9= ',' ( (otherlv_10= RULE_ID ) )
                    	    {
                    	    otherlv_9=(Token)match(input,18,FOLLOW_4); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getNAryFormalRelationAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalDsl.g:3594:5: ( (otherlv_10= RULE_ID ) )
                    	    // InternalDsl.g:3595:6: (otherlv_10= RULE_ID )
                    	    {
                    	    // InternalDsl.g:3595:6: (otherlv_10= RULE_ID )
                    	    // InternalDsl.g:3596:7: otherlv_10= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getNAryFormalRelationRule());
                    	    							}
                    	    						
                    	    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_49); 

                    	    							newLeafNode(otherlv_10, grammarAccess.getNAryFormalRelationAccess().getTargetRelataUniversalCrossReference_3_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);

                    // InternalDsl.g:3608:4: (otherlv_11= '[' ( (lv_sourceLowerBound_12_0= ruleCardinalityBound ) ) otherlv_13= '..' ( (lv_sourceUpperBound_14_0= ruleCardinalityUpperBound ) ) otherlv_15= ']' )
                    // InternalDsl.g:3609:5: otherlv_11= '[' ( (lv_sourceLowerBound_12_0= ruleCardinalityBound ) ) otherlv_13= '..' ( (lv_sourceUpperBound_14_0= ruleCardinalityUpperBound ) ) otherlv_15= ']'
                    {
                    otherlv_11=(Token)match(input,32,FOLLOW_22); 

                    					newLeafNode(otherlv_11, grammarAccess.getNAryFormalRelationAccess().getLeftSquareBracketKeyword_3_3_0());
                    				
                    // InternalDsl.g:3613:5: ( (lv_sourceLowerBound_12_0= ruleCardinalityBound ) )
                    // InternalDsl.g:3614:6: (lv_sourceLowerBound_12_0= ruleCardinalityBound )
                    {
                    // InternalDsl.g:3614:6: (lv_sourceLowerBound_12_0= ruleCardinalityBound )
                    // InternalDsl.g:3615:7: lv_sourceLowerBound_12_0= ruleCardinalityBound
                    {

                    							newCompositeNode(grammarAccess.getNAryFormalRelationAccess().getSourceLowerBoundCardinalityBoundParserRuleCall_3_3_1_0());
                    						
                    pushFollow(FOLLOW_23);
                    lv_sourceLowerBound_12_0=ruleCardinalityBound();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getNAryFormalRelationRule());
                    							}
                    							add(
                    								current,
                    								"sourceLowerBound",
                    								lv_sourceLowerBound_12_0,
                    								"br.ufes.inf.ontouml.ontoumlprime.Dsl.CardinalityBound");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_13=(Token)match(input,33,FOLLOW_24); 

                    					newLeafNode(otherlv_13, grammarAccess.getNAryFormalRelationAccess().getFullStopFullStopKeyword_3_3_2());
                    				
                    // InternalDsl.g:3636:5: ( (lv_sourceUpperBound_14_0= ruleCardinalityUpperBound ) )
                    // InternalDsl.g:3637:6: (lv_sourceUpperBound_14_0= ruleCardinalityUpperBound )
                    {
                    // InternalDsl.g:3637:6: (lv_sourceUpperBound_14_0= ruleCardinalityUpperBound )
                    // InternalDsl.g:3638:7: lv_sourceUpperBound_14_0= ruleCardinalityUpperBound
                    {

                    							newCompositeNode(grammarAccess.getNAryFormalRelationAccess().getSourceUpperBoundCardinalityUpperBoundParserRuleCall_3_3_3_0());
                    						
                    pushFollow(FOLLOW_25);
                    lv_sourceUpperBound_14_0=ruleCardinalityUpperBound();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getNAryFormalRelationRule());
                    							}
                    							add(
                    								current,
                    								"sourceUpperBound",
                    								lv_sourceUpperBound_14_0,
                    								"br.ufes.inf.ontouml.ontoumlprime.Dsl.CardinalityUpperBound");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_15=(Token)match(input,34,FOLLOW_13); 

                    					newLeafNode(otherlv_15, grammarAccess.getNAryFormalRelationAccess().getRightSquareBracketKeyword_3_3_4());
                    				

                    }


                    }
                    break;

            }

            otherlv_16=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getNAryFormalRelationAccess().getSemicolonKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulenAryFormalRelation"


    // $ANTLR start "entryRuleCharacterization"
    // InternalDsl.g:3669:1: entryRuleCharacterization returns [EObject current=null] : iv_ruleCharacterization= ruleCharacterization EOF ;
    public final EObject entryRuleCharacterization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacterization = null;


        try {
            // InternalDsl.g:3669:57: (iv_ruleCharacterization= ruleCharacterization EOF )
            // InternalDsl.g:3670:2: iv_ruleCharacterization= ruleCharacterization EOF
            {
             newCompositeNode(grammarAccess.getCharacterizationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCharacterization=ruleCharacterization();

            state._fsp--;

             current =iv_ruleCharacterization; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCharacterization"


    // $ANTLR start "ruleCharacterization"
    // InternalDsl.g:3676:1: ruleCharacterization returns [EObject current=null] : ( () (otherlv_1= '[' ( (lv_sourceLowerBound_2_0= ruleCardinalityBound ) ) otherlv_3= '..' ( (lv_sourceUpperBound_4_0= ruleCardinalityUpperBound ) ) otherlv_5= ']' )? otherlv_6= 'characterizedBy' ( (otherlv_7= RULE_ID ) ) (otherlv_8= '[' ( (lv_targetLowerBound_9_0= ruleCardinalityBound ) ) otherlv_10= '..' ( (lv_targetUpperBound_11_0= ruleCardinalityUpperBound ) ) otherlv_12= ']' )? otherlv_13= ';' ) ;
    public final EObject ruleCharacterization() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_sourceLowerBound_2_0 = null;

        AntlrDatatypeRuleToken lv_sourceUpperBound_4_0 = null;

        AntlrDatatypeRuleToken lv_targetLowerBound_9_0 = null;

        AntlrDatatypeRuleToken lv_targetUpperBound_11_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:3682:2: ( ( () (otherlv_1= '[' ( (lv_sourceLowerBound_2_0= ruleCardinalityBound ) ) otherlv_3= '..' ( (lv_sourceUpperBound_4_0= ruleCardinalityUpperBound ) ) otherlv_5= ']' )? otherlv_6= 'characterizedBy' ( (otherlv_7= RULE_ID ) ) (otherlv_8= '[' ( (lv_targetLowerBound_9_0= ruleCardinalityBound ) ) otherlv_10= '..' ( (lv_targetUpperBound_11_0= ruleCardinalityUpperBound ) ) otherlv_12= ']' )? otherlv_13= ';' ) )
            // InternalDsl.g:3683:2: ( () (otherlv_1= '[' ( (lv_sourceLowerBound_2_0= ruleCardinalityBound ) ) otherlv_3= '..' ( (lv_sourceUpperBound_4_0= ruleCardinalityUpperBound ) ) otherlv_5= ']' )? otherlv_6= 'characterizedBy' ( (otherlv_7= RULE_ID ) ) (otherlv_8= '[' ( (lv_targetLowerBound_9_0= ruleCardinalityBound ) ) otherlv_10= '..' ( (lv_targetUpperBound_11_0= ruleCardinalityUpperBound ) ) otherlv_12= ']' )? otherlv_13= ';' )
            {
            // InternalDsl.g:3683:2: ( () (otherlv_1= '[' ( (lv_sourceLowerBound_2_0= ruleCardinalityBound ) ) otherlv_3= '..' ( (lv_sourceUpperBound_4_0= ruleCardinalityUpperBound ) ) otherlv_5= ']' )? otherlv_6= 'characterizedBy' ( (otherlv_7= RULE_ID ) ) (otherlv_8= '[' ( (lv_targetLowerBound_9_0= ruleCardinalityBound ) ) otherlv_10= '..' ( (lv_targetUpperBound_11_0= ruleCardinalityUpperBound ) ) otherlv_12= ']' )? otherlv_13= ';' )
            // InternalDsl.g:3684:3: () (otherlv_1= '[' ( (lv_sourceLowerBound_2_0= ruleCardinalityBound ) ) otherlv_3= '..' ( (lv_sourceUpperBound_4_0= ruleCardinalityUpperBound ) ) otherlv_5= ']' )? otherlv_6= 'characterizedBy' ( (otherlv_7= RULE_ID ) ) (otherlv_8= '[' ( (lv_targetLowerBound_9_0= ruleCardinalityBound ) ) otherlv_10= '..' ( (lv_targetUpperBound_11_0= ruleCardinalityUpperBound ) ) otherlv_12= ']' )? otherlv_13= ';'
            {
            // InternalDsl.g:3684:3: ()
            // InternalDsl.g:3685:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCharacterizationAccess().getCharacterizationAction_0(),
            					current);
            			

            }

            // InternalDsl.g:3691:3: (otherlv_1= '[' ( (lv_sourceLowerBound_2_0= ruleCardinalityBound ) ) otherlv_3= '..' ( (lv_sourceUpperBound_4_0= ruleCardinalityUpperBound ) ) otherlv_5= ']' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==32) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalDsl.g:3692:4: otherlv_1= '[' ( (lv_sourceLowerBound_2_0= ruleCardinalityBound ) ) otherlv_3= '..' ( (lv_sourceUpperBound_4_0= ruleCardinalityUpperBound ) ) otherlv_5= ']'
                    {
                    otherlv_1=(Token)match(input,32,FOLLOW_22); 

                    				newLeafNode(otherlv_1, grammarAccess.getCharacterizationAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalDsl.g:3696:4: ( (lv_sourceLowerBound_2_0= ruleCardinalityBound ) )
                    // InternalDsl.g:3697:5: (lv_sourceLowerBound_2_0= ruleCardinalityBound )
                    {
                    // InternalDsl.g:3697:5: (lv_sourceLowerBound_2_0= ruleCardinalityBound )
                    // InternalDsl.g:3698:6: lv_sourceLowerBound_2_0= ruleCardinalityBound
                    {

                    						newCompositeNode(grammarAccess.getCharacterizationAccess().getSourceLowerBoundCardinalityBoundParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_sourceLowerBound_2_0=ruleCardinalityBound();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCharacterizationRule());
                    						}
                    						set(
                    							current,
                    							"sourceLowerBound",
                    							lv_sourceLowerBound_2_0,
                    							"br.ufes.inf.ontouml.ontoumlprime.Dsl.CardinalityBound");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,33,FOLLOW_24); 

                    				newLeafNode(otherlv_3, grammarAccess.getCharacterizationAccess().getFullStopFullStopKeyword_1_2());
                    			
                    // InternalDsl.g:3719:4: ( (lv_sourceUpperBound_4_0= ruleCardinalityUpperBound ) )
                    // InternalDsl.g:3720:5: (lv_sourceUpperBound_4_0= ruleCardinalityUpperBound )
                    {
                    // InternalDsl.g:3720:5: (lv_sourceUpperBound_4_0= ruleCardinalityUpperBound )
                    // InternalDsl.g:3721:6: lv_sourceUpperBound_4_0= ruleCardinalityUpperBound
                    {

                    						newCompositeNode(grammarAccess.getCharacterizationAccess().getSourceUpperBoundCardinalityUpperBoundParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_sourceUpperBound_4_0=ruleCardinalityUpperBound();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCharacterizationRule());
                    						}
                    						set(
                    							current,
                    							"sourceUpperBound",
                    							lv_sourceUpperBound_4_0,
                    							"br.ufes.inf.ontouml.ontoumlprime.Dsl.CardinalityUpperBound");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,34,FOLLOW_50); 

                    				newLeafNode(otherlv_5, grammarAccess.getCharacterizationAccess().getRightSquareBracketKeyword_1_4());
                    			

                    }
                    break;

            }

            otherlv_6=(Token)match(input,58,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getCharacterizationAccess().getCharacterizedByKeyword_2());
            		
            // InternalDsl.g:3747:3: ( (otherlv_7= RULE_ID ) )
            // InternalDsl.g:3748:4: (otherlv_7= RULE_ID )
            {
            // InternalDsl.g:3748:4: (otherlv_7= RULE_ID )
            // InternalDsl.g:3749:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCharacterizationRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(otherlv_7, grammarAccess.getCharacterizationAccess().getTargetIntrinsicMomentUniversalCrossReference_3_0());
            				

            }


            }

            // InternalDsl.g:3760:3: (otherlv_8= '[' ( (lv_targetLowerBound_9_0= ruleCardinalityBound ) ) otherlv_10= '..' ( (lv_targetUpperBound_11_0= ruleCardinalityUpperBound ) ) otherlv_12= ']' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==32) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalDsl.g:3761:4: otherlv_8= '[' ( (lv_targetLowerBound_9_0= ruleCardinalityBound ) ) otherlv_10= '..' ( (lv_targetUpperBound_11_0= ruleCardinalityUpperBound ) ) otherlv_12= ']'
                    {
                    otherlv_8=(Token)match(input,32,FOLLOW_22); 

                    				newLeafNode(otherlv_8, grammarAccess.getCharacterizationAccess().getLeftSquareBracketKeyword_4_0());
                    			
                    // InternalDsl.g:3765:4: ( (lv_targetLowerBound_9_0= ruleCardinalityBound ) )
                    // InternalDsl.g:3766:5: (lv_targetLowerBound_9_0= ruleCardinalityBound )
                    {
                    // InternalDsl.g:3766:5: (lv_targetLowerBound_9_0= ruleCardinalityBound )
                    // InternalDsl.g:3767:6: lv_targetLowerBound_9_0= ruleCardinalityBound
                    {

                    						newCompositeNode(grammarAccess.getCharacterizationAccess().getTargetLowerBoundCardinalityBoundParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_targetLowerBound_9_0=ruleCardinalityBound();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCharacterizationRule());
                    						}
                    						set(
                    							current,
                    							"targetLowerBound",
                    							lv_targetLowerBound_9_0,
                    							"br.ufes.inf.ontouml.ontoumlprime.Dsl.CardinalityBound");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,33,FOLLOW_24); 

                    				newLeafNode(otherlv_10, grammarAccess.getCharacterizationAccess().getFullStopFullStopKeyword_4_2());
                    			
                    // InternalDsl.g:3788:4: ( (lv_targetUpperBound_11_0= ruleCardinalityUpperBound ) )
                    // InternalDsl.g:3789:5: (lv_targetUpperBound_11_0= ruleCardinalityUpperBound )
                    {
                    // InternalDsl.g:3789:5: (lv_targetUpperBound_11_0= ruleCardinalityUpperBound )
                    // InternalDsl.g:3790:6: lv_targetUpperBound_11_0= ruleCardinalityUpperBound
                    {

                    						newCompositeNode(grammarAccess.getCharacterizationAccess().getTargetUpperBoundCardinalityUpperBoundParserRuleCall_4_3_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_targetUpperBound_11_0=ruleCardinalityUpperBound();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCharacterizationRule());
                    						}
                    						set(
                    							current,
                    							"targetUpperBound",
                    							lv_targetUpperBound_11_0,
                    							"br.ufes.inf.ontouml.ontoumlprime.Dsl.CardinalityUpperBound");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_12=(Token)match(input,34,FOLLOW_13); 

                    				newLeafNode(otherlv_12, grammarAccess.getCharacterizationAccess().getRightSquareBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_13=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getCharacterizationAccess().getSemicolonKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCharacterization"


    // $ANTLR start "entryRuleMediation"
    // InternalDsl.g:3820:1: entryRuleMediation returns [EObject current=null] : iv_ruleMediation= ruleMediation EOF ;
    public final EObject entryRuleMediation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMediation = null;


        try {
            // InternalDsl.g:3820:50: (iv_ruleMediation= ruleMediation EOF )
            // InternalDsl.g:3821:2: iv_ruleMediation= ruleMediation EOF
            {
             newCompositeNode(grammarAccess.getMediationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMediation=ruleMediation();

            state._fsp--;

             current =iv_ruleMediation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMediation"


    // $ANTLR start "ruleMediation"
    // InternalDsl.g:3827:1: ruleMediation returns [EObject current=null] : ( () otherlv_1= 'mediates' (otherlv_2= '[' ( (lv_sourceLowerBound_3_0= ruleCardinalityBound ) ) otherlv_4= '..' ( (lv_sourceUpperBound_5_0= ruleCardinalityUpperBound ) ) otherlv_6= ']' )? ( (otherlv_7= RULE_ID ) ) (otherlv_8= '[' ( (lv_targetLowerBound_9_0= ruleCardinalityBound ) ) otherlv_10= '..' ( (lv_targetUpperBound_11_0= ruleCardinalityUpperBound ) ) otherlv_12= ']' )? otherlv_13= ';' ) ;
    public final EObject ruleMediation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_sourceLowerBound_3_0 = null;

        AntlrDatatypeRuleToken lv_sourceUpperBound_5_0 = null;

        AntlrDatatypeRuleToken lv_targetLowerBound_9_0 = null;

        AntlrDatatypeRuleToken lv_targetUpperBound_11_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:3833:2: ( ( () otherlv_1= 'mediates' (otherlv_2= '[' ( (lv_sourceLowerBound_3_0= ruleCardinalityBound ) ) otherlv_4= '..' ( (lv_sourceUpperBound_5_0= ruleCardinalityUpperBound ) ) otherlv_6= ']' )? ( (otherlv_7= RULE_ID ) ) (otherlv_8= '[' ( (lv_targetLowerBound_9_0= ruleCardinalityBound ) ) otherlv_10= '..' ( (lv_targetUpperBound_11_0= ruleCardinalityUpperBound ) ) otherlv_12= ']' )? otherlv_13= ';' ) )
            // InternalDsl.g:3834:2: ( () otherlv_1= 'mediates' (otherlv_2= '[' ( (lv_sourceLowerBound_3_0= ruleCardinalityBound ) ) otherlv_4= '..' ( (lv_sourceUpperBound_5_0= ruleCardinalityUpperBound ) ) otherlv_6= ']' )? ( (otherlv_7= RULE_ID ) ) (otherlv_8= '[' ( (lv_targetLowerBound_9_0= ruleCardinalityBound ) ) otherlv_10= '..' ( (lv_targetUpperBound_11_0= ruleCardinalityUpperBound ) ) otherlv_12= ']' )? otherlv_13= ';' )
            {
            // InternalDsl.g:3834:2: ( () otherlv_1= 'mediates' (otherlv_2= '[' ( (lv_sourceLowerBound_3_0= ruleCardinalityBound ) ) otherlv_4= '..' ( (lv_sourceUpperBound_5_0= ruleCardinalityUpperBound ) ) otherlv_6= ']' )? ( (otherlv_7= RULE_ID ) ) (otherlv_8= '[' ( (lv_targetLowerBound_9_0= ruleCardinalityBound ) ) otherlv_10= '..' ( (lv_targetUpperBound_11_0= ruleCardinalityUpperBound ) ) otherlv_12= ']' )? otherlv_13= ';' )
            // InternalDsl.g:3835:3: () otherlv_1= 'mediates' (otherlv_2= '[' ( (lv_sourceLowerBound_3_0= ruleCardinalityBound ) ) otherlv_4= '..' ( (lv_sourceUpperBound_5_0= ruleCardinalityUpperBound ) ) otherlv_6= ']' )? ( (otherlv_7= RULE_ID ) ) (otherlv_8= '[' ( (lv_targetLowerBound_9_0= ruleCardinalityBound ) ) otherlv_10= '..' ( (lv_targetUpperBound_11_0= ruleCardinalityUpperBound ) ) otherlv_12= ']' )? otherlv_13= ';'
            {
            // InternalDsl.g:3835:3: ()
            // InternalDsl.g:3836:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMediationAccess().getMediationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,59,FOLLOW_41); 

            			newLeafNode(otherlv_1, grammarAccess.getMediationAccess().getMediatesKeyword_1());
            		
            // InternalDsl.g:3846:3: (otherlv_2= '[' ( (lv_sourceLowerBound_3_0= ruleCardinalityBound ) ) otherlv_4= '..' ( (lv_sourceUpperBound_5_0= ruleCardinalityUpperBound ) ) otherlv_6= ']' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==32) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalDsl.g:3847:4: otherlv_2= '[' ( (lv_sourceLowerBound_3_0= ruleCardinalityBound ) ) otherlv_4= '..' ( (lv_sourceUpperBound_5_0= ruleCardinalityUpperBound ) ) otherlv_6= ']'
                    {
                    otherlv_2=(Token)match(input,32,FOLLOW_22); 

                    				newLeafNode(otherlv_2, grammarAccess.getMediationAccess().getLeftSquareBracketKeyword_2_0());
                    			
                    // InternalDsl.g:3851:4: ( (lv_sourceLowerBound_3_0= ruleCardinalityBound ) )
                    // InternalDsl.g:3852:5: (lv_sourceLowerBound_3_0= ruleCardinalityBound )
                    {
                    // InternalDsl.g:3852:5: (lv_sourceLowerBound_3_0= ruleCardinalityBound )
                    // InternalDsl.g:3853:6: lv_sourceLowerBound_3_0= ruleCardinalityBound
                    {

                    						newCompositeNode(grammarAccess.getMediationAccess().getSourceLowerBoundCardinalityBoundParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_sourceLowerBound_3_0=ruleCardinalityBound();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMediationRule());
                    						}
                    						set(
                    							current,
                    							"sourceLowerBound",
                    							lv_sourceLowerBound_3_0,
                    							"br.ufes.inf.ontouml.ontoumlprime.Dsl.CardinalityBound");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,33,FOLLOW_24); 

                    				newLeafNode(otherlv_4, grammarAccess.getMediationAccess().getFullStopFullStopKeyword_2_2());
                    			
                    // InternalDsl.g:3874:4: ( (lv_sourceUpperBound_5_0= ruleCardinalityUpperBound ) )
                    // InternalDsl.g:3875:5: (lv_sourceUpperBound_5_0= ruleCardinalityUpperBound )
                    {
                    // InternalDsl.g:3875:5: (lv_sourceUpperBound_5_0= ruleCardinalityUpperBound )
                    // InternalDsl.g:3876:6: lv_sourceUpperBound_5_0= ruleCardinalityUpperBound
                    {

                    						newCompositeNode(grammarAccess.getMediationAccess().getSourceUpperBoundCardinalityUpperBoundParserRuleCall_2_3_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_sourceUpperBound_5_0=ruleCardinalityUpperBound();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMediationRule());
                    						}
                    						set(
                    							current,
                    							"sourceUpperBound",
                    							lv_sourceUpperBound_5_0,
                    							"br.ufes.inf.ontouml.ontoumlprime.Dsl.CardinalityUpperBound");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,34,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getMediationAccess().getRightSquareBracketKeyword_2_4());
                    			

                    }
                    break;

            }

            // InternalDsl.g:3898:3: ( (otherlv_7= RULE_ID ) )
            // InternalDsl.g:3899:4: (otherlv_7= RULE_ID )
            {
            // InternalDsl.g:3899:4: (otherlv_7= RULE_ID )
            // InternalDsl.g:3900:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMediationRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(otherlv_7, grammarAccess.getMediationAccess().getTargetExternallyDependentUniversalCrossReference_3_0());
            				

            }


            }

            // InternalDsl.g:3911:3: (otherlv_8= '[' ( (lv_targetLowerBound_9_0= ruleCardinalityBound ) ) otherlv_10= '..' ( (lv_targetUpperBound_11_0= ruleCardinalityUpperBound ) ) otherlv_12= ']' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==32) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalDsl.g:3912:4: otherlv_8= '[' ( (lv_targetLowerBound_9_0= ruleCardinalityBound ) ) otherlv_10= '..' ( (lv_targetUpperBound_11_0= ruleCardinalityUpperBound ) ) otherlv_12= ']'
                    {
                    otherlv_8=(Token)match(input,32,FOLLOW_22); 

                    				newLeafNode(otherlv_8, grammarAccess.getMediationAccess().getLeftSquareBracketKeyword_4_0());
                    			
                    // InternalDsl.g:3916:4: ( (lv_targetLowerBound_9_0= ruleCardinalityBound ) )
                    // InternalDsl.g:3917:5: (lv_targetLowerBound_9_0= ruleCardinalityBound )
                    {
                    // InternalDsl.g:3917:5: (lv_targetLowerBound_9_0= ruleCardinalityBound )
                    // InternalDsl.g:3918:6: lv_targetLowerBound_9_0= ruleCardinalityBound
                    {

                    						newCompositeNode(grammarAccess.getMediationAccess().getTargetLowerBoundCardinalityBoundParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_targetLowerBound_9_0=ruleCardinalityBound();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMediationRule());
                    						}
                    						set(
                    							current,
                    							"targetLowerBound",
                    							lv_targetLowerBound_9_0,
                    							"br.ufes.inf.ontouml.ontoumlprime.Dsl.CardinalityBound");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,33,FOLLOW_24); 

                    				newLeafNode(otherlv_10, grammarAccess.getMediationAccess().getFullStopFullStopKeyword_4_2());
                    			
                    // InternalDsl.g:3939:4: ( (lv_targetUpperBound_11_0= ruleCardinalityUpperBound ) )
                    // InternalDsl.g:3940:5: (lv_targetUpperBound_11_0= ruleCardinalityUpperBound )
                    {
                    // InternalDsl.g:3940:5: (lv_targetUpperBound_11_0= ruleCardinalityUpperBound )
                    // InternalDsl.g:3941:6: lv_targetUpperBound_11_0= ruleCardinalityUpperBound
                    {

                    						newCompositeNode(grammarAccess.getMediationAccess().getTargetUpperBoundCardinalityUpperBoundParserRuleCall_4_3_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_targetUpperBound_11_0=ruleCardinalityUpperBound();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMediationRule());
                    						}
                    						set(
                    							current,
                    							"targetUpperBound",
                    							lv_targetUpperBound_11_0,
                    							"br.ufes.inf.ontouml.ontoumlprime.Dsl.CardinalityUpperBound");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_12=(Token)match(input,34,FOLLOW_13); 

                    				newLeafNode(otherlv_12, grammarAccess.getMediationAccess().getRightSquareBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_13=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getMediationAccess().getSemicolonKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMediation"


    // $ANTLR start "entryRuleEString"
    // InternalDsl.g:3971:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalDsl.g:3971:47: (iv_ruleEString= ruleEString EOF )
            // InternalDsl.g:3972:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalDsl.g:3978:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalDsl.g:3984:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalDsl.g:3985:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalDsl.g:3985:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_STRING) ) {
                alt52=1;
            }
            else if ( (LA52_0==RULE_ID) ) {
                alt52=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // InternalDsl.g:3986:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:3994:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRulePrimitiveDataTypeType"
    // InternalDsl.g:4005:1: entryRulePrimitiveDataTypeType returns [EObject current=null] : iv_rulePrimitiveDataTypeType= rulePrimitiveDataTypeType EOF ;
    public final EObject entryRulePrimitiveDataTypeType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveDataTypeType = null;


        try {
            // InternalDsl.g:4005:62: (iv_rulePrimitiveDataTypeType= rulePrimitiveDataTypeType EOF )
            // InternalDsl.g:4006:2: iv_rulePrimitiveDataTypeType= rulePrimitiveDataTypeType EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveDataTypeTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimitiveDataTypeType=rulePrimitiveDataTypeType();

            state._fsp--;

             current =iv_rulePrimitiveDataTypeType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitiveDataTypeType"


    // $ANTLR start "rulePrimitiveDataTypeType"
    // InternalDsl.g:4012:1: rulePrimitiveDataTypeType returns [EObject current=null] : otherlv_0= 'PrimitiveDataTypeType' ;
    public final EObject rulePrimitiveDataTypeType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalDsl.g:4018:2: (otherlv_0= 'PrimitiveDataTypeType' )
            // InternalDsl.g:4019:2: otherlv_0= 'PrimitiveDataTypeType'
            {
            otherlv_0=(Token)match(input,60,FOLLOW_2); 

            		newLeafNode(otherlv_0, grammarAccess.getPrimitiveDataTypeTypeAccess().getPrimitiveDataTypeTypeKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimitiveDataTypeType"


    // $ANTLR start "entryRuleDataTypeAttribute"
    // InternalDsl.g:4026:1: entryRuleDataTypeAttribute returns [EObject current=null] : iv_ruleDataTypeAttribute= ruleDataTypeAttribute EOF ;
    public final EObject entryRuleDataTypeAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataTypeAttribute = null;


        try {
            // InternalDsl.g:4026:58: (iv_ruleDataTypeAttribute= ruleDataTypeAttribute EOF )
            // InternalDsl.g:4027:2: iv_ruleDataTypeAttribute= ruleDataTypeAttribute EOF
            {
             newCompositeNode(grammarAccess.getDataTypeAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataTypeAttribute=ruleDataTypeAttribute();

            state._fsp--;

             current =iv_ruleDataTypeAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataTypeAttribute"


    // $ANTLR start "ruleDataTypeAttribute"
    // InternalDsl.g:4033:1: ruleDataTypeAttribute returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDataTypeAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalDsl.g:4039:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalDsl.g:4040:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalDsl.g:4040:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalDsl.g:4041:3: ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalDsl.g:4041:3: ( (otherlv_0= RULE_ID ) )
            // InternalDsl.g:4042:4: (otherlv_0= RULE_ID )
            {
            // InternalDsl.g:4042:4: (otherlv_0= RULE_ID )
            // InternalDsl.g:4043:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataTypeAttributeRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(otherlv_0, grammarAccess.getDataTypeAttributeAccess().getIsOfTypeDataTypeCrossReference_0_0());
            				

            }


            }

            // InternalDsl.g:4054:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:4055:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:4055:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:4056:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDataTypeAttributeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataTypeAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataTypeAttribute"


    // $ANTLR start "entryRuleCardinalityUpperBound"
    // InternalDsl.g:4076:1: entryRuleCardinalityUpperBound returns [String current=null] : iv_ruleCardinalityUpperBound= ruleCardinalityUpperBound EOF ;
    public final String entryRuleCardinalityUpperBound() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCardinalityUpperBound = null;


        try {
            // InternalDsl.g:4076:61: (iv_ruleCardinalityUpperBound= ruleCardinalityUpperBound EOF )
            // InternalDsl.g:4077:2: iv_ruleCardinalityUpperBound= ruleCardinalityUpperBound EOF
            {
             newCompositeNode(grammarAccess.getCardinalityUpperBoundRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCardinalityUpperBound=ruleCardinalityUpperBound();

            state._fsp--;

             current =iv_ruleCardinalityUpperBound.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCardinalityUpperBound"


    // $ANTLR start "ruleCardinalityUpperBound"
    // InternalDsl.g:4083:1: ruleCardinalityUpperBound returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_CardinalityBound_0= ruleCardinalityBound | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleCardinalityUpperBound() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_CardinalityBound_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:4089:2: ( (this_CardinalityBound_0= ruleCardinalityBound | kw= '*' ) )
            // InternalDsl.g:4090:2: (this_CardinalityBound_0= ruleCardinalityBound | kw= '*' )
            {
            // InternalDsl.g:4090:2: (this_CardinalityBound_0= ruleCardinalityBound | kw= '*' )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_INT) ) {
                alt53=1;
            }
            else if ( (LA53_0==61) ) {
                alt53=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // InternalDsl.g:4091:3: this_CardinalityBound_0= ruleCardinalityBound
                    {

                    			newCompositeNode(grammarAccess.getCardinalityUpperBoundAccess().getCardinalityBoundParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CardinalityBound_0=ruleCardinalityBound();

                    state._fsp--;


                    			current.merge(this_CardinalityBound_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:4102:3: kw= '*'
                    {
                    kw=(Token)match(input,61,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCardinalityUpperBoundAccess().getAsteriskKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCardinalityUpperBound"


    // $ANTLR start "entryRuleCardinalityBound"
    // InternalDsl.g:4111:1: entryRuleCardinalityBound returns [String current=null] : iv_ruleCardinalityBound= ruleCardinalityBound EOF ;
    public final String entryRuleCardinalityBound() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCardinalityBound = null;


        try {
            // InternalDsl.g:4111:56: (iv_ruleCardinalityBound= ruleCardinalityBound EOF )
            // InternalDsl.g:4112:2: iv_ruleCardinalityBound= ruleCardinalityBound EOF
            {
             newCompositeNode(grammarAccess.getCardinalityBoundRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCardinalityBound=ruleCardinalityBound();

            state._fsp--;

             current =iv_ruleCardinalityBound.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCardinalityBound"


    // $ANTLR start "ruleCardinalityBound"
    // InternalDsl.g:4118:1: ruleCardinalityBound returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleCardinalityBound() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalDsl.g:4124:2: (this_INT_0= RULE_INT )
            // InternalDsl.g:4125:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            		current.merge(this_INT_0);
            	

            		newLeafNode(this_INT_0, grammarAccess.getCardinalityBoundAccess().getINTTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCardinalityBound"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA13 dfa13 = new DFA13(this);
    static final String dfa_1s = "\31\uffff";
    static final String dfa_2s = "\1\4\20\uffff\2\63\6\uffff";
    static final String dfa_3s = "\1\66\20\uffff\2\71\6\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\2\uffff\1\23\1\24\1\25\1\21\1\22\1\26";
    static final String dfa_5s = "\31\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\6\uffff\1\1\2\uffff\2\2\6\uffff\1\3\2\uffff\1\4\1\5\4\6\10\uffff\1\7\1\10\2\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\uffff\1\22\1\23\1\24",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\26\5\uffff\1\25",
            "\1\27\5\uffff\1\30",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "123:2: (this_Package_0= rulePackage | this_GeneralizationSet_1= ruleGeneralizationSet | this_PrimitiveDataType_2= rulePrimitiveDataType | this_ComplexDataType_3= ruleComplexDataType | this_Enumeration_4= ruleEnumeration | this_MeronymicRelation_5= ruleMeronymicRelation | this_Kind_6= ruleKind | this_QuantityUniversal_7= ruleQuantityUniversal | this_CollectiveUniversal_8= ruleCollectiveUniversal | this_SubKind_9= ruleSubKind | this_Role_10= ruleRole | this_Phase_11= rulePhase | this_Category_12= ruleCategory | this_Mixin_13= ruleMixin | this_RoleMixin_14= ruleRoleMixin | this_RelatorUniversal_15= ruleRelatorUniversal | this_BinaryMaterialRelation_16= ruleBinaryMaterialRelation | this_BinaryFormalRelation_17= ruleBinaryFormalRelation | this_ModeUniversal_18= ruleModeUniversal | this_QualityUniversal_19= ruleQualityUniversal | this_nAryMaterialRelation_20= rulenAryMaterialRelation | this_nAryFormalRelation_21= rulenAryFormalRelation )";
        }
    }
    static final String dfa_7s = "\34\uffff";
    static final String dfa_8s = "\5\33\2\4\3\33\2\40\1\6\4\uffff\1\6\2\41\2\6\4\42\2\43";
    static final String dfa_9s = "\1\36\4\37\2\4\3\37\1\46\1\45\1\6\4\uffff\1\6\2\41\2\75\4\42\1\46\1\45";
    static final String dfa_10s = "\15\uffff\1\1\1\4\1\3\1\2\13\uffff";
    static final String dfa_11s = "\34\uffff}>";
    static final String[] dfa_12s = {
            "\1\1\1\2\1\3\1\4",
            "\1\1\1\2\1\3\1\4\1\5",
            "\1\1\1\2\1\3\1\4\1\5",
            "\1\7\1\10\1\3\1\11\1\6",
            "\1\1\1\2\1\3\1\4\1\5",
            "\1\12",
            "\1\13",
            "\1\7\1\10\1\3\1\11\1\6",
            "\1\7\1\10\1\3\1\11\1\6",
            "\1\7\1\10\1\3\1\11\1\6",
            "\1\14\2\uffff\1\15\1\20\1\17\1\16",
            "\1\21\2\uffff\1\15\1\20\1\17",
            "\1\22",
            "",
            "",
            "",
            "",
            "\1\23",
            "\1\24",
            "\1\25",
            "\1\26\66\uffff\1\27",
            "\1\30\66\uffff\1\31",
            "\1\32",
            "\1\32",
            "\1\33",
            "\1\33",
            "\1\15\1\20\1\17\1\16",
            "\1\15\1\20\1\17"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "915:2: (this_ComponentOfRelation_0= ruleComponentOfRelation | this_MembershipRelation_1= ruleMembershipRelation | this_SubCollectionRelation_2= ruleSubCollectionRelation | this_SubQuantityRelation_3= ruleSubQuantityRelation )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0077FF807E40C812L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0077FF807E40E810L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000250000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000340000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000000F8000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000900000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x2000000000000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100080000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001100000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000002100000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00000000D8000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000004100000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0400000100002000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0C00000100002000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0800000000002000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0500000100002000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000001040000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000100040000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0400000000000000L});

}
