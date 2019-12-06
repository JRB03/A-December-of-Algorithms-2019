import math

def convert_csv(csvFile):
    csv = open(csvFile)

    fileLines = csv.readlines()
    lines = []
    for line in fileLines:
        lines.append([i.strip().replace("\"","") for i in line.split(",")])
    csv.close()

    html = open("html_from_csv.html","w")
    html.write("<html>\n\t<body>\n\t\t<table>\n")

    html.write("\t\t\t<tr>")
    for header in lines[0]:
        html.write(f"<th>{header}</th>")
    html.write("</tr>\n")

    for line in lines[1:]:
        html.write("\t\t\t<tr>")
        for cell in line:
            html.write(f"<td>{cell}</td>")
        html.write("</tr>\n")

    html.write("\t\t</table>\n\t</body>\n</html>")

    html.close()

convert_csv("csv_to_html.csv")
