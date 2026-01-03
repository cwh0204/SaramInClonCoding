import JobSummary from "../JobSummary";
import JobInfoGrid from "../JobInfoGrid";
import JobDescription from "../JobDescription";
import JobBenefitSection from "../JobBenefitSection"
import JobDeadlineSection from "../JobDeadlineSection"
import JobLocationSection from "../JobLocationSection"
import { useEffect, useState } from "react";

function JobDetailPage() {
    const [data, setData] = useState(null);

    useEffect(() => {
        fetch("/board/select?jobId=1")
        .then(res => res.json())
        .then(result => {
            setData(result);
        });
    },[]);

    if (!data) return <div>로딩중....</div>

  return (
    <>
        <main className="w-[1200px] mx-auto py-[40px]">
            <JobSummary company={data.compName} title={data.jobTitle} meta={[`조회수 ${data.viewCount}`, `등록일 ${data.regDate?.slice(0,10)}`]}/>
            <div className="mt-[32px] border-y border-[#e5e7eb] py-[24px]">
                <JobInfoGrid  left={[
            { label: "경력", value: data.careerText, highlight: true },
            { label: "학력", value: data.educationText },
            { label: "근무형태", value: data.workTypeText },
            { label: "급여", value: data.salaryTxt },
          ]}
          right={[
            { label: "근무지역", value: data.locationText, suffix: "지도" },
          ]}/>
            </div>

            <JobDescription/>

            <JobBenefitSection html={data.contentHtml}/>
            <JobLocationSection/>
            <JobDeadlineSection deadline={data.deadlineDate}/>
        </main>
    </>
  )
}

export default JobDetailPage