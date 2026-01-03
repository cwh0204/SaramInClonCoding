import JobSection from "./JobSection"
import Card from "../ui/Card"
function JobBenefitSection() {
  return (
    <>
        <JobSection title="복리후생">
            <Card className="p-[20px]">
                <div className="grid grid-cols-3 gap-x-[40px] gap-y-[16px] text-[13px] text-[#444]">
                    <div>
                        <p className="font-medium mb-[4px]">지원금/보험</p>
                        <p>건강검진</p>
                    </div>
                    <div>
                        <p className="font-medium mb-[4px]">급여제도</p>
                        <p>인센티브, 퇴직금</p>
                    </div>
                    <div>
                        <p className="font-medium mb-[4px]">선물</p>
                        <p>명절선물</p>
                    </div>
                </div>
            </Card>
        </JobSection>
    </>
  )
}

export default JobBenefitSection