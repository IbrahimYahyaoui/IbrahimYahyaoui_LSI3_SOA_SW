<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
		<html>
			<head>
			
			</head>
			<body>
			<h1>Liste des comptes</h1>
				<table>
					<tr>
						<th>Code</th>
						<th>Date de création</th>
						<th>Solde</th>
					</tr>
					<xsl:for-each select="tns:BanqueService/tns:getComptes">
						<tr>
							<td><xsl:value-of select="@code" /></td>
							<td><xsl:value-of select="@date" /></td>
							<td><xsl:value-of select="@solde" /></td>
						</tr>
					</xsl:for-each>
				</table>
			</body>
		</html>
	</xsl:template>
</xsl:stylesheet>
