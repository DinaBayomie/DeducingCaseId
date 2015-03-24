'''
This code is copyrighted to Dina Bayomie and Iman Helal @2015 Research work
Information System Department, Faculty of computers and Information System
Cairo University, Egypt
'''
class Node:
    def __init__(self,percentage,casePercentage, identifier = 0 ,activity = 'start', caseId= 0 ,parent=0):
        self.__timestamp = int(identifier)
        self.__identifier =''.join((str(caseId),' ',str(identifier)))#"{0} {1}".format(caseId,identifier) # CaseId:timestamp
        self.__children = []
        self.__parent=parent            
        self.__caseId=caseId
        self.__activity=activity
        self.__percentage=percentage # p(x|y= parent)
        self.__casePercentage=casePercentage
        
        
    @property
    def identifier(self):
        return self.__identifier
   
    @property
    def children(self):
        return self.__children

    def add_child(self, node):
        self.__children.append(node)
    
    @property
    def parent(self):
        return self.__parent

    @property
    def caseId(self):
        return self.__caseId
    
    @property
    def activity(self):
        return self.__activity
    
    @property
    def percentage(self):
        return self.__percentage
    
    @property
    def timestamp(self):
        return self.__timestamp
    @property
    def casePercentage(self):
        return self.__casePercentage
    
    def print_node(self):
        return str(str(self.__caseId)+' '+str(self.__timestamp)+''+self.__activity+'')
      
    