'''
This code is copyrighted to Dina Bayomie and Iman Helal @2015 Research work
Information System Department, Faculty of computers and Information System
Cairo University, Egypt
'''


class Branch:
    '''
    classdocs
    '''
    def __init__(self, identifier,caseId,nodes):
        self.__identifier=identifier
        self.__caseId=caseId
        self.__nodes=nodes
        self.__timestampList=self.__setTimestamp()
            
    @property
    def identifier(self):
        return self.__identifier
    
    @property
    def caseId(self):
        return self.__caseId
    
    @property
    def nodes(self):
        return self.__nodes
    
    
    @property
    def timestampList(self):
        return self.__timestampList

    def __setTimestamp(self):
        timestampL=[]
        for n in self.__nodes:
            timestampL.append(n.timestamp)
        timestampL=list(sorted(timestampL))
        return timestampL
    
    def display(self):   
        print 'branch # ',self.__identifier,' ',self.__caseId , ' ' , self.__confidenceLevel
        print 'branch Nodes :',''.join(str(i.timestamp+":"+i.activity+" ") for i in self.__nodes)
        
    def display_nodes(self):   
        print 'branch id :',self.identifier,' cid: ',self.__caseId,'    ',"nodes : ",' '.join(str(i.timestamp+":"+i.activity+" ") for i in self.__nodes)#,' Confidence :', self.__confidenceLevel
    