//
// Note - This file was automatically generated
// Generation spawned by 'class me.alanfoster.camelry.codegen.ScalateGenerator$'
// Creation Date - 16 August 2013
// Please do not manually modify this class.
//
package me.alanfoster.camelry.camel.dom;

import com.intellij.psi.CommonClassNames;
import com.intellij.psi.PsiClass;
import com.intellij.util.xml.*;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * @author Alan
 */
//@SubTag("onException")
public interface OnExceptionDefinition extends ProcessorDefinition, DomElement  {
                    @NotNull
        @Attribute("redeliveryPolicyRef")
        GenericAttributeValue<String> getRedeliveryPolicyRef();
                    @NotNull
        @Attribute("onRedeliveryRef")
        GenericAttributeValue<String> getOnRedeliveryRef();
                    @NotNull
        @Attribute("useOriginalMessagePolicy")
        GenericAttributeValue<Boolean> getUseOriginalMessagePolicy();

    @ExtendClass(value = CommonClassNames.JAVA_LANG_THROWABLE, allowAbstract = true)
    @SubTagList("exception")
    @NameValue(unique = true, referencable = false)
    List<GenericDomValue<PsiClass>> getExceptions();

                WhenDefinition getOnWhen();

        
                
        
                ExpressionSubElementDefinition getRetryWhile();

        
                
        
                RedeliveryPolicyDefinition getRedeliveryPolicy();

        
                
        
                ExpressionSubElementDefinition getHandled();

        
                
        
                ExpressionSubElementDefinition getContinued();

        
                
        
        
        @SubTagsList({"setOutHeader", "bean", "log", "interceptToEndpoint", "choice",
						"interceptFrom", "transacted", "onCompletion", "setBody", "rollback",
						"throwException", "doTry", "setExchangePattern", "stop", "throttle",
						"loop", "removeHeader", "threads", "intercept", "split",
						"delay", "setProperty", "dynamicRouter", "doCatch", "enrich",
						"when", "idempotentConsumer", "loadBalance", "setHeader", "filter",
						"resequence", "setFaultBody", "routingSlip", "unmarshal", "aggregate",
						"wireTap", "marshal", "aop", "pipeline", "pollEnrich",
						"inOut", "removeProperty", "policy", "transform", "sample",
						"process", "validate", "multicast", "otherwise", "sort",
						"convertBodyTo", "inOnly", "recipientList", "onException", "to",
						"removeHeaders", "doFinally", "route"})
                List<ProcessDefinition> getOutputs();

        
        
                                            @SubTagList("transform")
                List<TransformDefinition> getTransforms();
                                            @SubTagList("dynamicRouter")
                List<DynamicRouterDefinition> getDynamicRouters();
                                            @SubTagList("setHeader")
                List<SetHeaderDefinition> getSetHeaders();
                                            @SubTagList("stop")
                List<StopDefinition> getStops();
                                            @SubTagList("onCompletion")
                List<OnCompletionDefinition> getOnCompletions();
                                            @SubTagList("aop")
                List<AOPDefinition> getAops();
                                            @SubTagList("pipeline")
                List<PipelineDefinition> getPipelines();
                                            @SubTagList("inOut")
                List<InOutDefinition> getInOuts();
                                            @SubTagList("split")
                List<SplitDefinition> getSplits();
                                            @SubTagList("wireTap")
                List<WireTapDefinition> getWireTaps();
                                            @SubTagList("interceptToEndpoint")
                List<InterceptSendToEndpointDefinition> getInterceptToEndpoints();
                                            @SubTagList("setProperty")
                List<SetPropertyDefinition> getSetPropertys();
                                            @SubTagList("route")
                List<RouteDefinition> getRoutes();
                                            @SubTagList("removeHeader")
                List<RemoveHeaderDefinition> getRemoveHeaders();
                                            @SubTagList("setBody")
                List<SetBodyDefinition> getSetBodys();
                                            @SubTagList("delay")
                List<DelayDefinition> getDelays();
                                            @SubTagList("removeHeaders")
                List<RemoveHeadersDefinition> getRemoveHeaderss();
                                            @SubTagList("resequence")
                List<ResequenceDefinition> getResequences();
                                            @SubTagList("setExchangePattern")
                List<SetExchangePatternDefinition> getSetExchangePatterns();
                                            @SubTagList("to")
                List<ToDefinition> getTos();
                                            @SubTagList("doCatch")
                List<CatchDefinition> getDoCatchs();
                                            @SubTagList("recipientList")
                List<RecipientListDefinition> getRecipientLists();
                                            @SubTagList("idempotentConsumer")
                List<IdempotentConsumerDefinition> getIdempotentConsumers();
                                            @SubTagList("log")
                List<LogDefinition> getLogs();
                                            @SubTagList("routingSlip")
                List<RoutingSlipDefinition> getRoutingSlips();
                                            @SubTagList("multicast")
                List<MulticastDefinition> getMulticasts();
                                            @SubTagList("doTry")
                List<TryDefinition> getDoTrys();
                                            @SubTagList("interceptFrom")
                List<InterceptFromDefinition> getInterceptFroms();
                                            @SubTagList("throwException")
                List<ThrowExceptionDefinition> getThrowExceptions();
                                            @SubTagList("loadBalance")
                List<LoadBalanceDefinition> getLoadBalances();
                                            @SubTagList("intercept")
                List<InterceptDefinition> getIntercepts();
                                            @SubTagList("removeProperty")
                List<RemovePropertyDefinition> getRemovePropertys();
                                            @SubTagList("onException")
                List<OnExceptionDefinition> getOnExceptions();
                                            @SubTagList("convertBodyTo")
                List<ConvertBodyDefinition> getConvertBodyTos();
                                            @SubTagList("policy")
                List<PolicyDefinition> getPolicys();
                                            @SubTagList("enrich")
                List<EnrichDefinition> getEnrichs();
                                            @SubTagList("aggregate")
                List<AggregateDefinition> getAggregates();
                                            @SubTagList("loop")
                List<LoopDefinition> getLoops();
                                            @SubTagList("inOnly")
                List<InOnlyDefinition> getInOnlys();
                                            @SubTagList("filter")
                List<FilterDefinition> getFilters();
                                            @SubTagList("process")
                List<ProcessDefinition> getProcesss();
                                            @SubTagList("throttle")
                List<ThrottleDefinition> getThrottles();
                                            @SubTagList("marshal")
                List<MarshalDefinition> getMarshals();
                                            @SubTagList("otherwise")
                List<OtherwiseDefinition> getOtherwises();
                                            @SubTagList("threads")
                List<ThreadsDefinition> getThreadss();
                                            @SubTagList("sort")
                List<SortDefinition> getSorts();
                                            @SubTagList("doFinally")
                List<FinallyDefinition> getDoFinallys();
                                            @SubTagList("sample")
                List<SamplingDefinition> getSamples();
                                            @SubTagList("choice")
                List<ChoiceDefinition> getChoices();
                                            @SubTagList("pollEnrich")
                List<PollEnrichDefinition> getPollEnrichs();
                                            @SubTagList("unmarshal")
                List<UnmarshalDefinition> getUnmarshals();
                                            @SubTagList("rollback")
                List<RollbackDefinition> getRollbacks();
                                            @SubTagList("bean")
                List<BeanDefinition> getBeans();
                                            @SubTagList("setOutHeader")
                List<SetOutHeaderDefinition> getSetOutHeaders();
                                            @SubTagList("transacted")
                List<TransactedDefinition> getTransacteds();
                                            @SubTagList("setFaultBody")
                List<SetFaultBodyDefinition> getSetFaultBodys();
                                            @SubTagList("when")
                List<WhenDefinition> getWhens();
                                            @SubTagList("validate")
                List<ValidateDefinition> getValidates();
                        
    }