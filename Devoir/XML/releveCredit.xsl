<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:xs="http://www.w3.org/2001/XMLSchema"
    exclude-result-prefixes="xs"
    version="2.0">
    <xsl:template match="/">
        <html>
            <head></head>
            <body>
                <h2>Releve</h2>
                <h3> RIB = <xsl:value-of select="releve/@RIB"></xsl:value-of></h3>
                <h4>Date du releve <xsl:value-of select="releve/dateReleve"></xsl:value-of></h4>
                <h4>Solde <xsl:value-of select="releve/solde"></xsl:value-of></h4>
                <h4>Operations date debut:<xsl:value-of select="releve/operations/@dateDebut"></xsl:value-of> et date fin:<xsl:value-of select="releve/operations/@dateFin"></xsl:value-of></h4>
                
                <table border='2'>
                    <tr>
                        <th>Type</th>
                        <th>Date</th>
                        <th>Montant</th>
                        <th>Description</th>
                    </tr>
                    <xsl:for-each select="releve/operations/operation[@type='CREDIT']">
                        
                        <tr>
                            <td><xsl:value-of select="@type"></xsl:value-of></td>
                            <td><xsl:value-of select="@date"></xsl:value-of></td>
                            <td><xsl:value-of select="@montant"></xsl:value-of></td>
                            <td><xsl:value-of select="@decription"></xsl:value-of></td>
                        </tr>
                    </xsl:for-each>
                    <xsl:for-each select="releve/operations">
                        <tr>
                            <td colspan="3">Totale de credit</td>
                            <td ><xsl:value-of select="sum(operation[@type='CREDIT']/@montant)"></xsl:value-of></td>
                        </tr>
                        
                    </xsl:for-each>
                    
                    
                </table>
                
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>